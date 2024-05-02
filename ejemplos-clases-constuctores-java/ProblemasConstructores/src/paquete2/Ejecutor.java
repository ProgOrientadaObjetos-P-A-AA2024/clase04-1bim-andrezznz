/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);
        
        h1.establecerNombre("Hospital Militar Privado");
        
        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);
        
        System.out.printf("%s\nCiudad: %s\nDoctores: %s\n"
                + "Enfermeros: %s\n", h1.obtenerNombre(), h1.obtenerCiudad(), 
                h1.obtenerNumeroDoctores(), h1.obtenerNumeroEnfermeros());
        
        System.out.println("");
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("");
        
        System.out.printf("Hospital: %s\nCiudad: %s\nDoctores: %s\n"
                + "Enfermeros: %s\n", h2.obtenerNombre(), h2.obtenerCiudad(), 
                h2.obtenerNumeroDoctores(), h2.obtenerNumeroEnfermeros());
        
    }
}
