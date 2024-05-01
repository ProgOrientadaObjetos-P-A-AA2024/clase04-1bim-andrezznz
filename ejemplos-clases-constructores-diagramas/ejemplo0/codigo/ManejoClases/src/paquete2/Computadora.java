/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

public class Computadora {
    private String tipoProcesador;
    private double memoria;
    
    public Computadora(double m){
        memoria = m;
                
    }
    
    public Computadora(String tipo ){
        tipoProcesador = tipo;
                
    }

    public Computadora(String tipo, double mem ){
        memoria = mem;
        tipoProcesador = tipo;
                
    }
    
    
    // métodos establecer para cada atributo
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
}
