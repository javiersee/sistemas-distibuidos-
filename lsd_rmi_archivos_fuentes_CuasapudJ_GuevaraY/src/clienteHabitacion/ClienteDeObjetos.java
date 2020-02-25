package clienteHabitacion;


import static java.lang.Thread.sleep;
import java.rmi.RemoteException;
import servidorAlertas.sop_rmi.*;
import servidorAlertas.utilidades.*;
import servidorAlertas.dto.*;
import clienteHabitacion.vistas.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClienteDeObjetos extends Thread
{

	private static GestionUsuariosInt objRemoto;
        private int contador=0;
        private static int var_registro=-1;
        private static ClsUsuarioDTO objusuario =new ClsUsuarioDTO();
	public static void main(String[] args) throws InterruptedException, RemoteException 
	{
            
            int numPuertoNS=2020;
            String direccionIpNS = "localhost";        
               /*
            System.out.println("Cual es el la dirección ip donde se encuentra  el n_s de alertas ");
            direccionIpNS = UtilidadesConsola.leerCadena();
            System.out.println("Cual es el número de puerto por el cual escucha el n_s de alertas ");
            numPuertoNS = UtilidadesConsola.leerEntero(); 
            */
            objRemoto = (GestionUsuariosInt) UtilidadesRegistroC.obtenerObjRemoto(direccionIpNS,numPuertoNS, "ObjetoAlmacenarUsuario");
            gui_datos_paciente paciente = new gui_datos_paciente(objRemoto);
            paciente.setVisible(true);
            objusuario=paciente.retornar_usuario();
            var_registro=0;
//mimenu.setVisible(true);
            //MenuPrincipal();
		
	}
	public void run(){
            try {
                Opcion2();
            } catch (InterruptedException ex) {
                Logger.getLogger(ClienteDeObjetos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	
	public  void Opcion2() throws InterruptedException 
	{	 gui_indicadoresGenerados indicadores= new gui_indicadoresGenerados();
            if (var_registro!=-1) {
                while(true){
                    nodo_indicadoresDTO nuevo_nodo=new nodo_indicadoresDTO();
                    nuevo_nodo.setFrecuenciaCardiaca((int)aleatorio(0, 168));
                    nuevo_nodo.setPresionArterialSistolica((int)aleatorio(0,168));
                    nuevo_nodo.setPresionArterialDiastolica((int)aleatorio(0,108));
                    nuevo_nodo.setFrecuenciaRespiratoria((int)aleatorio(0,54));
		    nuevo_nodo.setTemperatura(Math.round(aleatorio(0,45)*100)/100f);
		    nuevo_nodo.setSaturacionOxigeno((int)aleatorio(0,100));
                    objusuario.setIndicadores(nuevo_nodo);
                     try {                    
                          objRemoto.enviar_indicadores(objusuario);
                     } catch (Exception e) {
                          System.out.println(e);
                         System.out.println("probelmasalenviar los indicadores ");
                     }
                   // objRemoto.enviar_indicadores(nuevo_nodo);
                   indicadores.setVisible(true);
                   indicadores.enviar_indicadores(nuevo_nodo);
                   // mostrar_indicadores(nuevo_nodo);
                     try {
                    //Ponemos a "Dormir" el programa durante los ms que queremos
                        Thread.sleep(8*1000);
                     } catch (Exception e) {
                        System.out.println(e);
                     }
                    // indicadores.setVisible(true);
                    }   
            } else {
                System.out.println(" no  hay pacientes registrados");
            }
            //mimenu.setVisible(true);
	}
        private static float aleatorio(float minimo, float maximo){
           float num;
           num = (float)(Math.random()*(maximo-minimo+1)+minimo);
           return num;
       }
       
}

