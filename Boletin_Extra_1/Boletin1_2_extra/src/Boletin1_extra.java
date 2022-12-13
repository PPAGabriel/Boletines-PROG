//PROGRAMA QUE CALCULA EL VALOR DE Y//

import java.util.Scanner;

public class Boletin1_extra {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca el valor de a:");
        float a= obxScanner.nextFloat();
        System.out.println("Introduzca el valor de b:");
        float b= obxScanner.nextFloat();
        System.out.println("Introduzca el valor de c:");
        float c= obxScanner.nextFloat();
        System.out.println("Introduzca el valor de X:");
        float x= obxScanner.nextFloat();

        float y= (float) (a*Math.pow(x,2)+b*x+c);

        System.out.println("Y= "+y);
    }
}
