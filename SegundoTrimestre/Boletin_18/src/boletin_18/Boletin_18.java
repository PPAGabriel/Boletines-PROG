/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_18;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperaturas obx= new ConversorTemperaturas();
        
        float tc=0,tf=0,tr=0;
        tc=Float.parseFloat(JOptionPane.showInputDialog("Introduzca los grados centigrados:"));
   
        try{
        obx.centigradosAFharenheit(tc);
        tf=(float)(9.0/5.0*tc+32.4);
            System.out.println("ºF: "+tf);
        }
        catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de metodo.");
        
        
        try{
        obx.centigradosAReamur(tc);
        tr=(float)(4.0/5.0*tc);
            System.out.println("ºReamur: "+tr);
        }
        catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de metodo.");
    }
    
    
    
}
