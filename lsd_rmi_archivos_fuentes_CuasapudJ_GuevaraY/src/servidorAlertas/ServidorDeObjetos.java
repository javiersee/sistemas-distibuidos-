
package servidorAlertas;
import servidorAlertas.sop_rmi.ClsGestionUsuariosImpl;
import java.rmi.RemoteException;
import servidorAlertas.sop_rmi.*;
import servidorAlertas.utilidades.*;


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
     
        ClsGestionUsuariosImpl objRemoto = new ClsGestionUsuariosImpl();
        objRemoto.consultarReferenciaRemotaDeNotificacion(direccionIpNS, numPuertoNS);
        try
        {
          
           UtilidadesRegistroS.RegistrarObjetoRemoto(objRemoto, direccionIpNS, numPuertoNS, "ObjetoAlmacenarUsuario");            
           
        } catch (Exception e)
        {
            System.err.println("No fue posible Arrancar el NS o Registrar el objeto remoto" +  e.getMessage());
        } 
    }
}
