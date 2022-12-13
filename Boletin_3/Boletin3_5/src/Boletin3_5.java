//PROGRAMA QUE CALCULA EL SUELDO BRUTO Y LIQUIDO//

import java.util.Scanner;

public class Boletin3_5 {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca el sueldo fijo:");
        float sf=obxScanner.nextFloat();

        System.out.println("Introduzca el total en ventas:");
        float tv=obxScanner.nextFloat();

        System.out.println("Introduzca los kilómetros desplazados:");
        float km=obxScanner.nextFloat();

        System.out.println("Introduzca los días de desplazamiento:");
        float dieta=obxScanner.nextFloat();

        float sueldo_bruto= (float) (sf+0.05*tv+2*km+30*dieta);

        float sueldo_liquido= (float) (0.82*sueldo_bruto-36);

        System.out.println("Sueldo bruto: "+sueldo_bruto+"€."+"\n"+
                "Sueldo líquido: "+sueldo_liquido+"€.");

    }
}
