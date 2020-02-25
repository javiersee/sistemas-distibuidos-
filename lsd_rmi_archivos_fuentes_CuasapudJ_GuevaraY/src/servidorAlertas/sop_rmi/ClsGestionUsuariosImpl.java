
package servidorAlertas.sop_rmi;
import clienteHabitacion.PacienteCllbckInt;
import java.util.GregorianCalendar; 
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import  servidorNotificaciones.sop_rmi.*;
import  servidorAlertas.dao.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import servidorAlertas.dto.ClsUsuarioDTO;
import servidorAlertas.dto.alertaGeneradaDTO;
import servidorAlertas.dto.nodo_indicadoresDTO;
import servidorAlertas.dto.ultimaAlertaDTO;
import servidorAlertas.sop_rmi.GestionUsuariosInt;
import servidorAlertas.utilidades.*;
import servidorNotificaciones.dto.*;
public class ClsGestionUsuariosImpl extends UnicastRemoteObject implements GestionUsuariosInt
{  
    private ClsUsuarioDTO unico_usuario;
    private NotificacionInt objreferenciaRemotaNotificacion;
    private static Hashtable<Integer,PacienteCllbckInt> pacientes = new   Hashtable<Integer,PacienteCllbckInt>();
    public ClsGestionUsuariosImpl() throws RemoteException
    {
        super(); //invoca al constructor de la clase base
        
    }

    @Override
    public boolean registrarUsuario(ClsUsuarioDTO objUsuario) throws RemoteException {
        
        System.out.println("registrando usuario ...");
        boolean bandera;
        this.unico_usuario=objUsuario;
        bandera=true;        
        return bandera;
    }

     @Override
    public void enviar_indicadores( ClsUsuarioDTO objUsuario) throws RemoteException {
        System.out.println("recibiendoindicadores  ");
        //System.out.println("creo la persistencia ");
        PersistenciaDAO per =new PersistenciaDAO();
        ultimaAlertaDTO objetoAlerta= new ultimaAlertaDTO();
        //System.out.println("generar puntuacion ");
        GenerarPuntuacionDAO generaralertas =new GenerarPuntuacionDAO();
        objetoAlerta=generaralertas.genear(objetoAlerta, objUsuario);
        
       
        System.out.println("puntuacion "+objetoAlerta.obtenerPuntucion());
        System.out.println("mensaje "+objetoAlerta.getMensaje());
        if(objetoAlerta.obtenerPuntucion() >1){
            per.Guardaralerta(objetoAlerta);
            
            alertaGeneradaDTO alertaNotificacones =new alertaGeneradaDTO();
            String alertaaa=per.ultimas5alertas();
            System.out.println(""+alertaaa);
             
            alertaNotificacones.setUltAlerta(objetoAlerta);
            alertaNotificacones.setMensaje_frecuencias(objetoAlerta.getMensaje());
            if(objetoAlerta.obtenerPuntucion()==2){
                alertaNotificacones.setMensaje("Llamara la Enfermera para Revision");
            }else{
                alertaNotificacones.setMensaje("Llamara la Enfermera y al Medico para la Revision ");
            }
            PacienteCllbckInt objPaciente =pacientes.get(objetoAlerta.getPaciente().getNumHabitacion());
            objPaciente.notificar("El Paciente a Generando una Alerta");
            ClsNotificacionMensajeDTO objNotificacion= new ClsNotificacionMensajeDTO();
            
            objNotificacion.setMensaje_frecuencias(alertaNotificacones.getMensaje_frecuencias());
            objNotificacion.setUltAlerta(alertaNotificacones.getUltAlerta());
            objNotificacion.setUltimas5Alertas(per.ultimas5alertas());
            objNotificacion.setMensaje(alertaNotificacones.getMensaje());       
                      
            this.objreferenciaRemotaNotificacion.notificarRegristro(objNotificacion);
         }
         else{
            System.out.println("nogenero mas dedos alertas");
         }
       
    }

    public void consultarReferenciaRemotaDeNotificacion(String direccionIpRMIRegistry, int numPuertoRMIRegistry)
    {
               
        this.objreferenciaRemotaNotificacion=(NotificacionInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpRMIRegistry,
            numPuertoRMIRegistry,"ObjetoNotificacion"); 
      
    }

    @Override
    public void registrarReferenciaCallBack(PacienteCllbckInt objReferencia, int numHabitacion) throws RemoteException {
       pacientes.put(numHabitacion, objReferencia);
    }

}
 