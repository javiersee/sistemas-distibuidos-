


package servidorAlertas.sop_rmi;
import clienteHabitacion.PacienteCllbckInt;
import servidorAlertas.dto.*;
import java.rmi.Remote;
import java.rmi.RemoteException;

//Hereda de la clase Remote, lo cual la convierte en interfaz remota
public interface GestionUsuariosInt extends Remote{
   
    public boolean registrarUsuario(ClsUsuarioDTO objUsuario) throws RemoteException;  
    public void enviar_indicadores(ClsUsuarioDTO objUsuario) throws RemoteException; 
    public void registrarReferenciaCallBack(PacienteCllbckInt objReferencia, int numHabitacion)throws RemoteException;
      
      
}

