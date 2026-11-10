package com.campus.campuspark.vista;

import java.util.regex.Pattern;

public enum TipoTexto {
    
   SOLO_LETRAS("^[\\p{L} ]+$","Solo se aceptan letras"),
   SOLO_NUMEROS("^[0-9]+$","Solo se permiten números");
   
   
   private final Pattern PATRON;
   private final String MENSAJE_ERROR;
   
   private TipoTexto(String patron, String mensajeError){
       this.PATRON = Pattern.compile(patron);
       this.MENSAJE_ERROR = mensajeError;
   }
   
   
   public boolean esValido(String texto){
       return texto != null && PATRON.matcher(texto).matches();
   }
   
   public String getMensajeError(){
       return MENSAJE_ERROR;
   } 
    
}
