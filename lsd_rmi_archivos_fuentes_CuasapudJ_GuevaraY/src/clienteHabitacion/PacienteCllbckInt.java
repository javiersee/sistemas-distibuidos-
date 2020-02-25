/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteHabitacion;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PacienteCllbckInt extends Remote {
       
    public void notificar(String mensaje)throws RemoteException;
    
}
