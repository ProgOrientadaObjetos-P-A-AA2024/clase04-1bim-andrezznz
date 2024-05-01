package paquete2;

public class Ejecutable {

    public static void main(String[] args) {
        
        Computadora portatil = new Computadora("Intel-x19" , 6.1+4.2);
        
        System.out.printf("%s - %s", portatil.obtenerTipoProcesador(), 
                portatil.obtenerMemoria());
        
        
        
    }
}
