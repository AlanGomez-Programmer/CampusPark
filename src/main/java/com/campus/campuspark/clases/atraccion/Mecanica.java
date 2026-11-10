package com.campus.campuspark.clases.atraccion;

public class Mecanica extends Atraccion{
    
    private double alturaMinima;

    public Mecanica(String nombre, TipoAtraccion tipoAtraccion, int capacidadPorTurno, double precioBase, Estado estado, Riesgo riesgo) {
        super(nombre, tipoAtraccion, capacidadPorTurno, precioBase, estado, riesgo);
    }
    
    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }
    
    
}
