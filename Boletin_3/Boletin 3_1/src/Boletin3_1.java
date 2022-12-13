//PROGRAMA QUE CALCULA EL PORCENTAJE DE DESCUENTO//

import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
        Scanner obxScanner= new Scanner (System.in);

        System.out.println("Introduzca el precio de tarifa del producto:");
        float precioTarifa= obxScanner.nextFloat();

        System.out.println("Introduzca el precio pagado por el producto:");
        float precioPagado= obxScanner.nextFloat();

        float porcentaje= 100- precioPagado/precioTarifa*100;
        System.out.println("El porcentaje de descuento es de un:"+porcentaje+"%.");
    }
}
