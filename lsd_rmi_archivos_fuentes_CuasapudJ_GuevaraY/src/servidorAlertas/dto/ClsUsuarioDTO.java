package servidorAlertas.dto;

import java.io.Serializable;

public class ClsUsuarioDTO implements Serializable
{	
	public int numHabitacion;
	public String nombres;
        public float edad;
        public nodo_indicadoresDTO indicadores;

    public ClsUsuarioDTO() {
    }

    public ClsUsuarioDTO(int numHabitacion, String nombres, int edad) {
        this.numHabitacion = numHabitacion;
        this.nombres = nombres;
        this.edad = edad;
       
    }

    public nodo_indicadoresDTO getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(nodo_indicadoresDTO indicadores) {
        this.indicadores = indicadores;
    }

    
    public int getNumHabitacion() {
        return numHabitacion;
    }

    public void setNumHabitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }
	
    
        
}
