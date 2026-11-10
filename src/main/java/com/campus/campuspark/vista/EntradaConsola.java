package com.campus.campuspark.vista;

import java.util.Objects;
import java.util.Scanner;

public class EntradaConsola {
   
    private static final Scanner entrada = new Scanner(System.in);
    
    public static String ingresarTexto(TipoTexto tipoTexto, String mensaje){
        Objects.requireNonNull(tipoTexto, "El tipo de texto no puede ser nulo");
        while (true) {            
            System.out.print(mensaje + ": ");
            String texto = entrada.nextLine().trim();
            if (texto.isEmpty()){
                System.out.println("Error: El texto no puede estar vacio");
            } else if (!tipoTexto.esValido(texto)){
                System.out.printf("Error: %s %n", tipoTexto.getMensajeError());
            } else {
                return texto;
            }
        }
    }
    
    public static String formatearNombre(String nombreCompleto){
        String[] nombrePorNombre = nombreCompleto.split(" ");
        StringBuilder nombreFormateado = new StringBuilder();
        
        for (String nombre : nombrePorNombre){
            if (!nombre.isEmpty()){
                nombreFormateado.append(Character.toUpperCase(nombre.charAt(0)))
                                .append(nombre.substring(1).toLowerCase())
                                .append(" ");
            }   
        }
        
        return String.valueOf(nombreFormateado);
    }
    
    public static String pedirNombre(){       
        String nombre = ingresarTexto(TipoTexto.SOLO_LETRAS, "Nombre");
        String nombreFormateado = formatearNombre(nombre);
        return nombreFormateado;
    }
    
    public static int pedirEdad(){
        while(true){
            try {
                int edad = Integer.parseInt(ingresarTexto(TipoTexto.SOLO_NUMEROS, "Edad"));
                if (edad < 0){
                    System.out.println("No se aceptan edades menores a 0");
                } else {
                    return edad;
                }
            } catch (NumberFormatException e) {
                System.out.println(TipoTexto.SOLO_NUMEROS.getMensajeError());
            }
        }
    }
    
    public static double pedirEstatura(){
        while(true){
            try {
                double estatura = Double.parseDouble(ingresarTexto(TipoTexto.SOLO_NUMEROS, "Estatura"));
                if (estatura < 0){
                    System.out.println("No se permite altura menor a 0");
                } else {
                    return estatura;
                }
            } catch (NumberFormatException e) {
                System.out.println(TipoTexto.SOLO_NUMEROS.getMensajeError());
            }
        }
    }

    public static boolean confirmar(String mensaje){
        while(true){
            String respuesta = ingresarTexto(TipoTexto.SOLO_LETRAS, mensaje + " (S/N)");
            if (respuesta.equalsIgnoreCase("S")){
                return true;
            }else if (respuesta.equalsIgnoreCase("N")){
                return false;
            }
            System.out.println("Error: Responda S o N");
        }
    }
    
    public static boolean sabeNadar(){
        return confirmar("¿Sabe nadar?");
    }
    
}
