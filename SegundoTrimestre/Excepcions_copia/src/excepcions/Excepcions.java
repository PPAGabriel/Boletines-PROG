/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcions;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Excepcions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos obxeto tipo DividirExcepciones
        DividirExcepcions obx= new DividirExcepcions();
        
        //obx.dividir(6,0);
        //obx.dividirTratandoExcepcion(6, 0);
        //obx.dividir3BloquesExcepcion(6, 0);
        
        /*try{
        obx.dividirPropagandoExcepcion(6, 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de programa");*/
        
        
        int n,d,r;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("introduzca el numerador:"));
        d=Integer.parseInt(JOptionPane.showInputDialog("introduzca el denominador:"));
        
      try{
          obx.dividirCaNosaExcepcion(n, d);
          r=n/d;
          System.out.println(n+"/"+d+" = "+r);
      }catch(NosaExcepcion e){
          System.out.println(e.getMessage());
      }
      
        System.out.println("fin de programa");
        
    }
    
}
