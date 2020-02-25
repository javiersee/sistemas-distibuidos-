/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorNotificaciones.dto;

import servidorAlertas.dto.*;
import java.io.Serializable;


public class ClsNotificacionMensajeDTO implements Serializable {
    public ultimaAlertaDTO ultAlerta;
    public String  mensaje;	
    public String  mensaje_frecuencias;
    public  String ultimas5Alertas;
    private static int posiciones=0;
    public ClsNotificacionMensajeDTO() {
    }

    public ClsNotificacionMensajeDTO(ultimaAlertaDTO ultAlerta, String mensaje, String mensaje_frecuencias) {
        this.ultAlerta = ultAlerta;
        this.mensaje = mensaje;
        this.mensaje_frecuencias = mensaje_frecuencias;
    }
    
    public ClsNotificacionMensajeDTO(ultimaAlertaDTO ultAlerta, String mensaje) {
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

    public static int getPosiciones() {
        return posiciones;
    }

    public static void setPosiciones(int posiciones) {
        ClsNotificacionMensajeDTO.posiciones = posiciones;
    }

    public String getUltimas5Alertas() {
        return ultimas5Alertas;
    }

    public void setUltimas5Alertas(String ultimas5Alertas) {
        this.ultimas5Alertas = ultimas5Alertas;
    }

}
