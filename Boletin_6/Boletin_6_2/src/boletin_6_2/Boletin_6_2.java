 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_6_2;

/**
 *
 * @author dam1
 */
public class Boletin_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Satelite obxSatelite1= new Satelite(32.73,25.55,8345896.6875);
        
        obxSatelite1.verPosicion();
        
        Satelite obxSatelite2= new Satelite();
        
        obxSatelite2.verPosicion();
        
    }
    
}
