/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_22;

/**
 *
 * @author dam1
 */
public class Boletin_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LaLiga obx= new LaLiga();
        int matriz[][];
        
        matriz=obx.crearTabla();
        obx.verTabla(matriz);
    }
    
    
}
