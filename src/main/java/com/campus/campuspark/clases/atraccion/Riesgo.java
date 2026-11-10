package com.campus.campuspark.clases.atraccion;

public enum Riesgo {

    BAJO("Bajo"),
    MEDIO("Medio"),
    ALTO("Alto");
    
    private String tipoRiesgo;
    
    private Riesgo(String tipoRiesgo){
        this.tipoRiesgo = tipoRiesgo;
    }
    
    public String getTipoRiesgo(){
        return tipoRiesgo;
    }
}
