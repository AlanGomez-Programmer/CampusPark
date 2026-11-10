package com.campus.campuspark.clases.persona;

public class PersonaAdultoMayor extends Persona {
    
    public PersonaAdultoMayor(String nombre, int edad, double altura, boolean sabeNadar, TipoPersona tipoPersona) {
        super(nombre, edad, altura, sabeNadar, TipoPersona.ADULTO_MAYOR);
    }
    
}
