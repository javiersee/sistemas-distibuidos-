/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dto;

import java.io.Serializable;


public class alertaGeneradaDTO implements Serializable {
    public ultimaAlertaDTO ultAlerta;
    public String  mensaje;	
    public String  mensaje_frecuencias;
   
    public alertaGeneradaDTO() {
    }

    public alertaGeneradaDTO(ultimaAlertaDTO ultAlerta, String mensaje) {
        this.ultAlerta = ultAlerta;
        this.mensaje = mensaje;
    }

    public ultimaAlertaDTO getUltAlerta() {
        return ultAlerta;
    }

    public void setUltAlerta(ultimaAlertaDTO ultAlerta) {
        this.ultAlerta = ultAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }



    public String getMensaje_frecuencias() {
        return mensaje_frecuencias;
    }

    public void setMensaje_frecuencias(String mensaje_frecuencias) {
        this.mensaje_frecuencias = mensaje_frecuencias;
    }

   

       
    
}
