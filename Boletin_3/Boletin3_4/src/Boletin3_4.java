//PROGRAMA QUE LEA UNA CANTIDAD Y DESGLOSE EN BILLETES//

import java.util.Scanner;

public class Boletin3_4 {
    public static void main(String[] args) {
        Scanner obxScanner= new Scanner(System.in);

        System.out.println("Introduzca el total en euros");
        int total= obxScanner.nextInt();

        int div1= total/100;
        int r_cien= total%100;

        int div2= r_cien/20;
        int r_veinte= (r_cien)%20;

        int div3= r_veinte/5;
        int r_cinco= (r_veinte)%5;

        int cantidad_cien=div1, cantidad_veinte= div2,
                cantidad_cinco= div3, cantidad_uno=r_cinco;

        System.out.println("La cantidad de cada billete y/o moneda es:"+"\n"+
                "100€: "+cantidad_cien+"\n"+
                "20€: "+cantidad_veinte+"\n"+
                "5€: "+cantidad_cinco+"\n"+
                "1€: "+cantidad_uno);
    }
}
