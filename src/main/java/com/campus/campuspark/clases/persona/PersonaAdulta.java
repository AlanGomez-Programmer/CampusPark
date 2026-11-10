package com.campus.campuspark.clases.persona;

public class PersonaAdulta extends Persona{
    
    public PersonaAdulta(String nombre, int edad, double altura, boolean sabeNadar, TipoPersona tipoPersona) {
        super(nombre, edad, altura, sabeNadar, TipoPersona.ADULTO);
    }
    
}
