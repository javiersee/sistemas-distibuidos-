/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dao;

import java.rmi.server.UnicastRemoteObject;
import servidorAlertas.dto.*;
/**
 *
 * @author Usuario
 */
public class nodo_indicadoresDAO {

    public int funFrecuenciaCardiaca(ClsUsuarioDTO objPaciente){
        System.out.println("\ncalculando la frecuencia cardiaca...");
	int suma=0;
	if(objPaciente.getEdad() >= 0 && objPaciente.getEdad() <= 0.125 && 
          (objPaciente.getIndicadores().getFrecuenciaCardiaca()< 120 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 140)){		
		suma += 1;	
                 System.out.println("\ncalculando la frecuencia cardiaca 1 ");
		
	}else if(objPaciente.getEdad() > 0.125 && objPaciente.getEdad() <= 1 && 
                (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 100 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 130)){		
		suma += 1;			
                 System.out.println("\ncalculando la frecuencia cardiaca 2 ");
	
	}else if(objPaciente.getEdad() > 1 && objPaciente.getEdad() <= 2 && 
                (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 100 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 120)){
		suma += 1;					
                 System.out.println("\ncalculando la frecuencia cardiaca 3");
	
	}else if(objPaciente.getEdad() > 2 && objPaciente.getEdad() <= 6 && 
                (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 80 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 120)){
		suma += 1;	
                System.out.println("\ncalculando la frecuencia cardiaca 4");
	
	}else if(objPaciente.getEdad() > 6 && objPaciente.getEdad() <= 13 && 
                (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 80 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 100)){
		suma += 1;	
                System.out.println("\ncalculando la frecuencia cardiaca 5");
	
	}else if(objPaciente.getEdad() > 13 && objPaciente.getEdad() <= 16 && 
                (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 70 || objPaciente.getIndicadores().getFrecuenciaCardiaca() > 80)){
		suma += 1;	
                System.out.println("\ncalculando la frecuencia cardiaca 6");
	
	}else if(objPaciente.getEdad() > 16 && (objPaciente.getIndicadores().getFrecuenciaCardiaca() < 60 || 
                objPaciente.getIndicadores().getFrecuenciaCardiaca() > 80)){
		suma += 1;					
                System.out.println("\ncalculando la frecuencia cardiaca 7");

	}
        System.out.println("suma de la frecuencia cardiaca la funcion. "+suma);
	return suma;
       
    }
    
    public int funTensionArterial(ClsUsuarioDTO objPaciente){
	       System.out.println("\ncalculando la tension arterial...");
	int suma=0;
	if(objPaciente.getEdad() >= 0 && objPaciente.getEdad() <= 0.125 && 
          (objPaciente.getIndicadores().getPresionArterialSistolica() < 70 || objPaciente.getIndicadores().getPresionArterialSistolica() > 100) || 
          (objPaciente.getIndicadores().getPresionArterialDiastolica() < 50 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 68)){		
			suma += 1;					

	}else if(objPaciente.getEdad() > 0.125 && objPaciente.getEdad() <= 1 && 
                (objPaciente.getIndicadores().getPresionArterialSistolica() < 84 || objPaciente.getIndicadores().getPresionArterialSistolica() > 106) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 56 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 70)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 1 && objPaciente.getEdad() <= 2 && 
                (objPaciente.getIndicadores().getPresionArterialSistolica() < 98 || objPaciente.getIndicadores().getPresionArterialSistolica() > 106) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 58 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 70)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 2 && objPaciente.getEdad() <= 6 && 
                (objPaciente.getIndicadores().getPresionArterialSistolica() < 99 || objPaciente.getIndicadores().getPresionArterialSistolica() > 112) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 64 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 70)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 6 && objPaciente.getEdad() <= 13 && 
                (objPaciente.getIndicadores().getPresionArterialSistolica() < 104 || objPaciente.getIndicadores().getPresionArterialSistolica() > 124) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 64 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 86)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 13 && objPaciente.getEdad() <= 16 && 
                (objPaciente.getIndicadores().getPresionArterialSistolica() < 118 || objPaciente.getIndicadores().getPresionArterialSistolica() > 132) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 70 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 82)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 16 && (objPaciente.getIndicadores().getPresionArterialSistolica() < 110 || objPaciente.getIndicadores().getPresionArterialSistolica() > 140) || 
                (objPaciente.getIndicadores().getPresionArterialDiastolica() < 70 || objPaciente.getIndicadores().getPresionArterialDiastolica() > 90)){
			suma += 1;					
		
	}
	return suma;
    }
    
    public int funFrecuenciaRespiratoria(ClsUsuarioDTO objPaciente){
	System.out.println("\ncalculando la frecuencia respiratoria...");
	int suma=0;
	if(objPaciente.getEdad() >= 0 && objPaciente.getEdad() <= 0.125 && 
          (objPaciente.getIndicadores().getFrecuenciaRespiratoria() < 40 || objPaciente.getIndicadores().getFrecuenciaRespiratoria() > 45)){		
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 0.125 && objPaciente.getEdad() <= 6 && 
                (objPaciente.getIndicadores().getFrecuenciaRespiratoria() < 20 || objPaciente.getIndicadores().getFrecuenciaRespiratoria() > 30)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 6 && (objPaciente.getIndicadores().getFrecuenciaRespiratoria() < 12 || objPaciente.getIndicadores().getFrecuenciaRespiratoria() > 20)){
			suma += 1;							
	}
	return suma;
    }
    
    public int funTemperatura(ClsUsuarioDTO objPaciente){
	System.out.println("\ncalculando la temperatura...");
	int suma=0;
	if(objPaciente.getEdad() >= 0 && objPaciente.getEdad() <= 0.125 && (objPaciente.getIndicadores().getTemperatura() != 38)){		
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 0.125 && objPaciente.getEdad() <= 6 && (objPaciente.getIndicadores().getTemperatura() < 37.5 || objPaciente.getIndicadores().getTemperatura() > 37.8)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 6 && objPaciente.getEdad() < 13 && (objPaciente.getIndicadores().getTemperatura() < 37 || objPaciente.getIndicadores().getTemperatura() > 37.5)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 13 && objPaciente.getEdad() < 16 && (objPaciente.getIndicadores().getTemperatura() != 37)){
			suma += 1;					
		
	}else if(objPaciente.getEdad() > 16 && (objPaciente.getIndicadores().getTemperatura() < 36.2 || objPaciente.getIndicadores().getTemperatura() > 37.2)){
			suma += 1;							
	}
	return suma;
    }

    
    public int funSaturacionOxigeno(ClsUsuarioDTO objPaciente){
	System.out.println("\ncalculando la saturacion de oxigeno...\n");
	int suma=0;
	if (objPaciente.getIndicadores().getSaturacionOxigeno() < 90){
		suma += 1;
	}
	return suma;
}

    


}
