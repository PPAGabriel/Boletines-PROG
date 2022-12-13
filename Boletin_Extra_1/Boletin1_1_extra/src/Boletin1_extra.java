//PROGRAMA PARA HACER CÁLCULOS CON IVA//

import java.util.Scanner;

public class Boletin1_extra {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca la base imponible:");
        float base= obxScanner.nextFloat();

        System.out.println("Introduzca el porcentaje de IVA:");
        float iva= obxScanner.nextFloat();

        float importeIva= base*iva/100;
        float total=base+importeIva;

        System.out.println("Importe correspondiente a IVA: "+importeIva+"€."+"\n"+
                "Total: "+total+"€.");
    }
}
