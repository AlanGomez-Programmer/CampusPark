package com.campus.campuspark.clases.atraccion;

public enum TipoAtraccion {

    MECANICA("Mecanica"),
    ACUATICA("Acuatica"),
    INFANTIL("Infantil");
    
    private String nombre;
            
    private TipoAtraccion(String nombre){
        this.nombre = nombre;
    }
    
}
