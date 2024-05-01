package paquete1;

public class Ejecutable2 {

    public static void main(String[] args) {

        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel 3th");

        System.out.printf("%s - @s",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());

    }
}
