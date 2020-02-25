/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorAlertas.dto;

import java.io.Serializable;

public class nodo_indicadoresDTO  implements Serializable{
    
     
    public float frecuenciaCardiaca;
    public float presionArterialSistolica;
    public float presionArterialDiastolica;
    public float frecuenciaRespiratoria;
    public float temperatura;
    public float saturacionOxigeno;

    public nodo_indicadoresDTO() {
    }

    public nodo_indicadoresDTO(float frecuenciaCardiaca, float presionArterialSistolica, float presionArterialDiastolica, float frecuenciaRespiratoria, float temperatura, float saturacionOxigeno) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionArterialSistolica = presionArterialSistolica;
        this.presionArterialDiastolica = presionArterialDiastolica;
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
        this.temperatura = temperatura;
        this.saturacionOxigeno = saturacionOxigeno;
    }

    public float getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(float frecuenciaCardiaca) {
        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }

    public float getPresionArterialSistolica() {
        return presionArterialSistolica;
    }

    public void setPresionArterialSistolica(float presionArterialSistolica) {
        this.presionArterialSistolica = presionArterialSistolica;
    }

    public float getPresionArterialDiastolica() {
        return presionArterialDiastolica;
    }

    public void setPresionArterialDiastolica(float presionArterialDiastolica) {
        this.presionArterialDiastolica = presionArterialDiastolica;
    }

    public float getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    public void setFrecuenciaRespiratoria(float frecuenciaRespiratoria) {
        this.frecuenciaRespiratoria = frecuenciaRespiratoria;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getSaturacionOxigeno() {
        return saturacionOxigeno;
    }

    public void setSaturacionOxigeno(float saturacionOxigeno) {
        this.saturacionOxigeno = saturacionOxigeno;
    }
    
    }
