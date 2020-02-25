
package clienteHabitacion;
import clienteHabitacion.vistas.gui_datos_paciente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class PacienteCllbckImpl extends UnicastRemoteObject implements PacienteCllbckInt{
     private gui_datos_paciente gui;
    public PacienteCllbckImpl(gui_datos_paciente gui) throws RemoteException
    {
        super();
        this.gui=gui;
    }
    @Override
    public void notificar(String mensaje)throws RemoteException{
        this.gui.jTextNotificarPaciente.setText(""+mensaje);
        
    }
    
}
