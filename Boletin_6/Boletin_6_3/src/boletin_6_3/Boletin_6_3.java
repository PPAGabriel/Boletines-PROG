/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_6_3;

/**
 *
 * @author dam1
 */
public class Boletin_6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo obxCirculo1= new Circulo();
        
        obxCirculo1.setRadio(3.5);
        
        double area1=obxCirculo1.calcularArea();
        double longitud1=obxCirculo1.calcularLongitud();
        
        System.out.println("El área es: "+area1+"\n"+
                "La longitud es: "+longitud1+"\n");
        
        Circulo obxCirculo2= new Circulo(2.0);
       
        
        double area2=obxCirculo2.calcularArea();
        double longitud2=obxCirculo2.calcularLongitud();
        
        System.out.println("El área es: "+area2+"\n"+
                "La longitud es: "+longitud2+"\n");
                
        
    }
    
}
