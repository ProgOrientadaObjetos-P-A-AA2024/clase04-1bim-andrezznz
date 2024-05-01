/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;


public class Ejecutor2 {
    public static void main(String[] args) {
      
        FacturaTelefonica fac = new FacturaTelefonica();
      
        fac.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac);
        
        fac.establecerNumeroTelefono("90909090");
        
        System.out.printf("%s\n", fac);
        
    }
}
