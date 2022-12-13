/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_5;

/**
 *
 * @author dam1
 */
public class Boletin_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Consumo obxConsumo1= new Consumo(); //apartado "a" y "b"
        obxConsumo1.setLitros(50f);
        obxConsumo1.setpGas(1.57f);
        
       Consumo obxConsumo2= new Consumo(200f,12f,60f,1.57f) ; //apartado "c"
       float litrosC=obxConsumo2.getLitros();
       float kmC=obxConsumo2.getKms();
       
       float cm= obxConsumo2.consumoMedio(litrosC,kmC); //apartado "d"
        System.out.println("El consumo medio es de: "+cm+"L/km.");
        
       obxConsumo2.setLitros(10f); //apartado "e"
       
       float vm=obxConsumo2.getvMed(); //apartado "f"
        System.out.println("La velocidad media es: "+vm+"km/h.");
    }
    
}
