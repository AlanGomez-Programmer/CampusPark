package com.campus.campuspark.clases.atraccion;

public enum Estado {
    
    OPERATIVA("OPERATIVA", "Se puede utilizar"),
    MANTENIMIENTO("MANTENIMIENTO", "Se encuentra en mantenimiento"),
    FUERA_SERVICIO("FUERA SERVICIO", "No se puede utlizar");
    
    private String nombre;
    private String descripcion;
    
    private Estado(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre(){
        return nombre;
    }
    
    public String getDescripcion(){
        return descripcion;
    }

}
