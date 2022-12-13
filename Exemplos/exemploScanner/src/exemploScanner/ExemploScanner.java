/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploScanner;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ExemploScanner {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Proyecto que calcula el area de un rectangulo de base 2 y altura 5
        float base, altura; //son variables locales
        
        Scanner obxScanner= new Scanner(System.in); //instanciamos un objeto tipo Scanner
        
       System.out.println("Teclee base:");
        base=obxScanner.nextFloat();
       System.out.println("Teclee altura:");
        altura=obxScanner.nextFloat();
        float area=base*altura;
        System.out.println("el área es: "+area);
        
        
    }
    
}
