/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_26;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operaciones<Integer> obx1=new Operaciones<>();
        ArrayList<Integer> lista1=new ArrayList();
        int opc=0;
        
       
        do{
            opc=PedirDatos.pedirInt("Teclee la opción deseada:"+"\n"+
                                                                   "1: Añadir número(s) a la lista"+"\n"+
                                                                   "2: Mostrar la lista"+"\n"+
                                                                   "3: Buscar el mínimo"+"\n"+
                                                                   "4: Buscar el máximo"+"\n"+
                                                                   "5: Buscar un número"+"\n"+
                                                                   "6: Eliminar un número");
        
        switch(opc){
            case 1:
                int cn=PedirDatos.pedirInt("Cuantos números deseas añadir?");
                for(int i=0;i<cn;i++){
                    obx1.engadir(PedirDatos.pedirInt("Introduce el número a añadir:"), lista1);
                }
                break;
            case 2:
                obx1.mostrar(lista1);
                break;
            case 3:
                obx1.elementoMin(lista1);
                break;
            case 4:
                obx1.elementoMax(lista1);
                break;
            case 5:
                obx1.buscarElemento(PedirDatos.pedirInt("Que número deseas buscar?"), lista1);
                break;
            case 6:
                obx1.eliminar(PedirDatos.pedirInt("Introduce el número a eliminar:"), lista1);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Orden no encontrada");
                break;
            }
        }while(opc<=6);
        
    }
    
}
