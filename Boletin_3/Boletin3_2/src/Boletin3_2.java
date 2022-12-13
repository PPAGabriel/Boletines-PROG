//PROGRAMA DE CONVERSIÓN DE TEMPERATURA//

import java.util.Scanner;

public class Boletin3_2 {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner (System.in);

        System.out.println("Introduzca la temperatura en Celsius (ºC):");
        float c= obxScanner.nextFloat();

        float f= (float) (1.8*c+32);
        float k= (float) (c+273.15);

        System.out.println(c+"ºC equivalen a: "+f+"ºF y a "+k+"K.");
    }
}