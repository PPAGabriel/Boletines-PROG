/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarrays;

import javax.swing.JOptionPane;

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
        float [] aux=null;
        int opcion=0;
        
        do{
       /* aux=obx.crearArrayFloat();
        obx.amosarArray(aux);
        obx.amosarPosicion(aux, 2);*/
       
        opcion=Integer.parseInt(JOptionPane.showInputDialog("***MENU***\n1-->CREAR ARRAY\n2-->AMOSAR\n3-->BUSQUEDA\n4-->ORDENAR"));
        
        switch(opcion){
            case 1:aux=obx.crearArrayFloat();
            break;
            case 2: obx.amosarArrayForEach(aux);
                System.out.println("\n");
            break;
            case 3: obx.buscarElemento(aux);
            break;
            case 4: obx.ordenarArray(aux);
        }
        }while(opcion<=4);
    }
    
}
