package com.campus.campuspark.clases.persona;

public class PersonaNino extends Persona{
    
    public PersonaNino(String nombre, int edad, double altura, boolean sabeNadar, TipoPersona tipoPersona) {
        super(nombre, edad, altura, sabeNadar, TipoPersona.NINO);
    }
    
}
