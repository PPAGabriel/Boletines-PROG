/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_14;

/**
 *
 * @author dam1
 */
public class Boletin_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ordenador obx1= new Ordenador((int)30.5,"Primux",17,1000);
        
        System.out.println(obx1.toString());
        System.out.println(obx1.getPrecio());
        System.out.println(obx1.getTeclado().getMarca());
        System.out.println(obx1.getCPU().getVelocidad());
    }
    
}
