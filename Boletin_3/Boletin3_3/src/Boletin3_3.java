//CONVERSION DE CANTIDAD DE BILLETES A TOTAL NETO//

import java.util.Scanner;

public class Boletin3_3 {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner (System.in);

        System.out.println("Introduzca la cantidad de monedas de 1 €:");
        int m1= obxScanner.nextInt();

        System.out.println("Introduzca la cantidad de billetes de 5 €:");
        int b5= obxScanner.nextInt();

        System.out.println("Introduzca la cantidad de billetes de 20 €:");
        int b20= obxScanner.nextInt();

        System.out.println("Introduzca la cantidad de bileltes de 100 €:");
        int b100= obxScanner.nextInt();

        int total= m1+b5*5+b20*20+b100*100;

        System.out.println("El total neto es de: "+total+" €");

    }
}
