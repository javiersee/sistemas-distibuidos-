/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dao;

import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import servidorAlertas.dto.ClsUsuarioDTO;
import servidorAlertas.dto.alertaGeneradaDTO;
import servidorAlertas.dto.ultimaAlertaDTO;
import servidorNotificaciones.dto.ClsNotificacionMensajeDTO;
import servidorNotificaciones.sop_rmi.NotificacionInt;

/**
 *
 * @author elcua
 */
public class GenerarPuntuacionDAO {
    private NotificacionInt objreferenciaRemotaNotificacion;
     private Calendar fecha=new GregorianCalendar();
     private nodo_indicadoresDAO nodo_puntuacion =new nodo_indicadoresDAO();
     int diaHoy = fecha.get(Calendar.DAY_OF_MONTH);
     int mes=fecha.get(Calendar.MONTH);
     int anio =fecha.get(Calendar.YEAR);
     String fechaa=(""+diaHoy+"- "+(mes+1)+"-"+anio);
     int hora = fecha.get(Calendar.HOUR_OF_DAY);
     int minuto=fecha.get(Calendar.MINUTE);
     int segundo =fecha.get(Calendar.SECOND);
     String horaa=(""+hora+":"+minuto+":"+segundo);
    public GenerarPuntuacionDAO() {
        
    }
    public ultimaAlertaDTO  genear(ultimaAlertaDTO alerta ,ClsUsuarioDTO objusuario) throws RemoteException{
        ultimaAlertaDTO ultimaaAlerta=new ultimaAlertaDTO();
        int sumatot=0,result=0;
        String  mensaje_indicadores="";
        result=nodo_puntuacion.funFrecuenciaCardiaca(objusuario);    
        sumatot += result;
        if(result==1){          
            float freCar=objusuario.getIndicadores().getFrecuenciaCardiaca();          
            mensaje_indicadores+=("Frecuencia Cardiaca:\t           "+freCar+" \n");
        }
   
        result=nodo_puntuacion.funTensionArterial(objusuario);
        sumatot += result;
        if(result==1){
            float tenSis=objusuario.getIndicadores().getPresionArterialSistolica();           
            float tenDias=objusuario.getIndicadores().getPresionArterialDiastolica(); 
            mensaje_indicadores+=("Tencion Arterial:\t          "+tenSis+" / "+tenDias+" \n");
                    
        }       
        result=nodo_puntuacion.funFrecuenciaRespiratoria(objusuario);
        sumatot += result;
        if(result==1){
            float freRes=objusuario.getIndicadores().getFrecuenciaRespiratoria();
            mensaje_indicadores+=("Frecuencia Respiratoria:\t          "+freRes+" \n");         
        }
        result=nodo_puntuacion.funTemperatura(objusuario);
        sumatot += result;
        if(result==1){
            float temperatura=objusuario.getIndicadores().getTemperatura();
            mensaje_indicadores+=("Temperatura:\t\t           "+temperatura+" \n");
        }
        result=nodo_puntuacion.funSaturacionOxigeno(objusuario);
        sumatot += result;
        if(result==1){
            float SatOxige=objusuario.getIndicadores().getSaturacionOxigeno();
            mensaje_indicadores+=("Saturacion de Oxigeno:\t          "+SatOxige+" \n");
        }
        
        if(sumatot >= 2){
            ultimaaAlerta.setPuntuacion(sumatot);
            ultimaaAlerta.setFecha(fechaa);
            ultimaaAlerta.setHora(horaa);
            ultimaaAlerta.setPaciente(objusuario);
            ultimaaAlerta.setMensaje(mensaje_indicadores);
            
            
        }
        System.out.println("puntuacion: "+sumatot);
        System.out.println("puntuacion  ultima alerta "+ultimaaAlerta.obtenerPuntucion());
        System.out.println(""+ultimaaAlerta.getMensaje());
        return ultimaaAlerta;
        }
      
    
    
}
