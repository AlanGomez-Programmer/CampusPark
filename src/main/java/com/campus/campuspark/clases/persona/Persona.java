package com.campus.campuspark.clases.persona;

public abstract class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private boolean sabeNadar;
    private TipoPersona tipoPersona;
    
    public Persona(String nombre, int edad, double altura, boolean sabeNadar, TipoPersona tipoPersona){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.sabeNadar = sabeNadar;
        this.tipoPersona = tipoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public boolean isSabeNadar() {
        return sabeNadar;
    }

    public TipoPersona getTipoPersona() {
        return tipoPersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setSabeNadar(boolean sabeNadar) {
        this.sabeNadar = sabeNadar;
    }

    public void setTipoPersona(TipoPersona tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
    
    
}
