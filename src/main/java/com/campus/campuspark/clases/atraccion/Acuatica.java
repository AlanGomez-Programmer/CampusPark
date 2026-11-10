package com.campus.campuspark.clases.atraccion;

public class Acuatica extends Atraccion{
    
    private boolean saberNadar;

    public Acuatica(String nombre, TipoAtraccion tipoAtraccion, int capacidadPorTurno, double precioBase, Estado estado, Riesgo riesgo) {
        super(nombre, tipoAtraccion, capacidadPorTurno, precioBase, estado, riesgo);
    }
    
    public boolean isSaberNadar() {
        return saberNadar;
    }

    public void setSaberNadar(boolean saberNadar) {
        this.saberNadar = saberNadar;
    }
     
}
