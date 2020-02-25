
package servidorNotificaciones.sop_rmi;

import servidorAlertas.sop_rmi.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import servidorAlertas.dto.alertaGeneradaDTO;
import servidorNotificaciones.dto.ClsNotificacionMensajeDTO;
import servidorNotificaciones.sop_rmi.*;
import servidorNotificaciones.presentacion.*;
public class ClsNotificacion extends UnicastRemoteObject implements NotificacionInt
{  
    private static int aux =0;
    private static generacionAlerta alerta_ventana = new generacionAlerta();
    
    public ClsNotificacion() throws RemoteException
    {
        super(); //invoca al constructor de la clase base        
    }
   

    @Override
    public void notificarRegristro(ClsNotificacionMensajeDTO objNotificacion) throws RemoteException {
        alerta_ventana.setVisible(true);
        System.out.println("generando notificacion....");
      
        alerta_ventana.imprimirNotificacion(objNotificacion.getUltAlerta().getPaciente().getNumHabitacion(),objNotificacion.getUltAlerta().getPaciente().getNombres(),
            objNotificacion.getUltAlerta().getPaciente().getEdad(),objNotificacion.getUltAlerta().getHora(),objNotificacion.getUltAlerta().getFecha(),
            objNotificacion.getUltAlerta().getMensaje(),objNotificacion.getUltAlerta().obtenerPuntucion(),objNotificacion.getMensaje(),
            objNotificacion.getUltimas5Alertas());
              
    }

    

  
 
   
       
}
