/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_6;

/**
 *
 * @author dam1
 */
public class Boletin_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche obxCoche1= new Coche();
        
        float va=obxCoche1.getVelocidade();
        System.out.println("Velocidad actual: "+va);
        
        obxCoche1.acelerar(120);
        va=obxCoche1.getVelocidade();
        System.out.println("Velocidad actual: "+va);
        
        obxCoche1.frenar(40);
        va=obxCoche1.getVelocidade();
        System.out.println("Velocidad actual: "+va);
        
    }
    
}
