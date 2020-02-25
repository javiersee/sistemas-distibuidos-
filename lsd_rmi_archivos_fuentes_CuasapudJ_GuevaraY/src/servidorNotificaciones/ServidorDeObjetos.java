
package servidorNotificaciones;
import servidorNotificaciones.utilidades.*;
import java.rmi.RemoteException;
import servidorAlertas.sop_rmi.*;
import servidorNotificaciones.sop_rmi.*;

public class ServidorDeObjetos
{
    public static void main(String args[]) throws RemoteException
    {                
        int numPuertoNS=2020;
        String direccionIpNS="localhost";        
               /*
        System.out.println("Cual es el la dirección ip donde se encuentra  el n_s de alertas");
        direccionIpNS = UtilidadesConsola.leerCadena();
        System.out.println("Cual es el número de puerto por el cual escucha el n_s de alertas");
        numPuertoNS = UtilidadesConsola.leerEntero();         
       */
     
        ClsNotificacion objRemoto = new ClsNotificacion();
                
        try
        {
          
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpNS, numPuertoNS, "ObjetoNotificacion");            
           
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        } 
    }
}
