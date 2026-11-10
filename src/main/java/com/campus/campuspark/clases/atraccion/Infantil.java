package com.campus.campuspark.clases.atraccion;

public class Infantil extends Atraccion{
    
    private int edadMinima;

    public Infantil(String nombre, TipoAtraccion tipoAtraccion, int capacidadPorTurno, double precioBase, Estado estado, Riesgo riesgo) {
        super(nombre, tipoAtraccion, capacidadPorTurno, precioBase, estado, riesgo);
    }
    
    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }
        
}
