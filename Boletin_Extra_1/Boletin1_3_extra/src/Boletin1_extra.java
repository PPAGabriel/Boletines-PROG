//PROGRAMA QUE RESUELVE ECUACIONES DE 2DO GRADO//

import java.util.Scanner;

public class Boletin1_extra {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca los valores de a:");
        float a= obxScanner.nextFloat();
        System.out.println("Introduzca los valores de b:");
        float b= obxScanner.nextFloat();
        System.out.println("Introduzca los valores de c:");
        float c= obxScanner.nextFloat();

        float x1= (float) ((-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));
        float x2= (float) ((-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a));

        System.out.println("X1= "+x1+"\n"+
                "X2= "+x2);
    }
}
