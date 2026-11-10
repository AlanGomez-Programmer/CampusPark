package com.campus.campuspark.clases.atraccion;

public abstract class Atraccion {
    
    private String nombre;
    private TipoAtraccion tipoAtraccion;
    private int capacidadPorTurno;
    private double precioBase;
    private Estado estado;
    private Riesgo riesgo;
    
    public Atraccion(String nombre, TipoAtraccion tipoAtraccion, int capacidadPorTurno, double precioBase, Estado estado, Riesgo riesgo){
        this.nombre = nombre;
        this.tipoAtraccion = tipoAtraccion;
        this.capacidadPorTurno = capacidadPorTurno;
        this.precioBase = precioBase;
        this.estado = estado;
        this.riesgo = riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAtraccion getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoAtraccion(TipoAtraccion tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }
    
    
}
