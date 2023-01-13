/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcions;

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
        
      try{
          obx.dividirCaNosaExcepcion(8, 0);
      }catch(NosaExcepcion e){
          System.out.println(e.getMessage());
      }
        System.out.println("fin de programa");
        
    }
    
}
