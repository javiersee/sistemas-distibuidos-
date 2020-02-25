/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dao;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import servidorAlertas.dto.ClsUsuarioDTO;
import servidorAlertas.dto.alertaGeneradaDTO;
import servidorAlertas.dto.ultimaAlertaDTO;

/**
 *
 * @author elcua
 */
public class PersistenciaDAO {
    
     public void Guardaralerta(ultimaAlertaDTO objetoAlerta) {
        try {
            File f = new File("HistorialDePacientes.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists() && f.length() != 0) {
                System.out.println("LLENE POR IF");
                fw = new FileWriter(f, true);//True para que no sobreescriba el objeto anterior, con el true va añadiendo en vez de sobreescribir
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(String.valueOf(objetoAlerta.getPaciente().getNumHabitacion()) +"%"+
                        objetoAlerta.getFecha()+"%"+objetoAlerta.getHora()+"%"
                        + objetoAlerta.getPuntuacion()
                        );
            } else {
                System.out.println("LLENE POR ELSE");
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(String.valueOf(objetoAlerta.getPaciente().getNumHabitacion()) +"%"+
                        objetoAlerta.getFecha()+"%"+objetoAlerta.getHora()+"%"
                        + objetoAlerta.getPuntuacion()
                        );

            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    


public String ultimas5alertas() {
        int contador=0;
        int axiliarUltimmos5=0;
      
        //ultimaAlertaDTO objetoAlerta= new ultimaAlertaDTO();
       
        String cadena="";
         
         
        try {
            File f = new File("HistorialDePacientes.txt");
            
            if (f.exists()) {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {
                    //Continue mientras tenga algo en la linea
                    String[] carro = linea.split("%");

                    int numeroHabitacion = Integer.parseInt(carro[0]);
                    String fecha = carro[1];
                    String hora = carro[2];
                    int puntuacion = Integer.parseInt(carro[3]); 
                   
                    contador++;
                }
                System.out.println("contador "+contador);
            } else {
                System.out.println("No hay carros gurdados");
            }
            if (f.exists()) {
               
               
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                 while ((linea = br.readLine()) != null) {
                    String[] carro = linea.split("%");
                    //for ( i=s ; i < (contador); i++) {
                    
                    if(axiliarUltimmos5 > ((contador-7))&& (axiliarUltimmos5 < (contador-1))){                    
                    
                        //int numeroHabitacion = Integer.parseInt(carro[0]);
                        String fecha = carro[1];
                        String hora = carro[2];
                        int puntuacion = Integer.parseInt(carro[3]);         
                        cadena+=fecha;
                        cadena+="\t\t";
                        cadena+=hora;
                        cadena+="\t\t";
                        cadena+=String.valueOf(puntuacion);
                        cadena+="\n";
                                        
                    }/*else{
                      //  System.out.println("no entro ");
                    }*/
                     
                   axiliarUltimmos5++;
                }
                
            } else {
                System.out.println("No hay carros gurdados");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
                
        return cadena;
    }
}