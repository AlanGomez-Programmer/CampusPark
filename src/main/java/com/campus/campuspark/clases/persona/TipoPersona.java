package com.campus.campuspark.clases.persona;

public enum TipoPersona {

    ADULTO("Adulto"),
    NINO("Niño"),
    ADULTO_MAYOR("Adulto Mayor");
    
    String tipoPersona;
    
    private TipoPersona(String tipoPersona){
        this.tipoPersona = tipoPersona;
    }
    
    public String getTipoPersona(){
        return tipoPersona;
    }
}
