/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplomatriz;

/**
 *
 * @author dam1
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosMatrices obx1= new MetodosMatrices();
        
        int matriz1[][];
        float array1[];
        float array2[];
        
        matriz1=obx1.crearMatriz();
        array1=obx1.notaMediaModulo(matriz1);
        array2=obx1.notaMediaAlumno(matriz1);
        
        obx1.verMatriz(matriz1,array1,array2);
    }
    
}
