/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dto;

import java.io.Serializable;

/**
 *
 * @author elcua
 */
public class ultimaAlertaDTO implements Serializable{

     public ClsUsuarioDTO paciente;
    public String fecha;
    public String  hora;
    public String mensaje ;
    
    public int puntuacion;	   

    public ultimaAlertaDTO() {
        this.puntuacion=0;
    }

    public ultimaAlertaDTO(ClsUsuarioDTO paciente, String fecha, String hora, int puntuacion) {
        this.paciente = paciente;
        this.fecha = fecha;
        this.hora = hora;
        this.puntuacion = puntuacion;
    }


    public ClsUsuarioDTO getPaciente() {
        return paciente;
    }

    public void setPaciente(ClsUsuarioDTO paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        
        this.puntuacion = puntuacion;
    }
    public int obtenerPuntucion() {
        return puntuacion;
    }
    @Override
    public String toString() {
        return "ultimaAlertaDTO{" + "fecha=" + fecha + ", hora=" + hora + ", puntuacion=" + puntuacion + '}';
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
