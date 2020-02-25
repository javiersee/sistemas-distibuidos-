


package servidorNotificaciones.sop_rmi;

import servidorAlertas.sop_rmi.*;
import servidorNotificaciones.dto.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import servidorAlertas.dto.alertaGeneradaDTO;

//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface NotificacionInt extends Remote{
   
    public void notificarRegristro(ClsNotificacionMensajeDTO objNotificacion) throws RemoteException;
    
}

