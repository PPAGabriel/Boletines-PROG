/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarrays;

/**
 *
 * @author dam1
 */
public class ExemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Metodos obx=new Metodos();
        float [] aux;
        aux=obx.crearArrayFloat();
        obx.amosarArray(aux);
        obx.amosarPosicion(aux, 2);
    }
    
}
