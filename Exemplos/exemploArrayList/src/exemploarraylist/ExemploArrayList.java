/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploarraylist;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ExemploArrayList {

    
    public static void main(String[] args) {
        /* Metodos obx1=new Metodos();
        obx1.crear();
        obx1.ver();*/
        
        /* ListaEnteiros obx2=new ListaEnteiros();
        
        int opcion;
        
        do{
        
        opcion=PedirDatos.PedirInt("Teclee la opción deseada:"+"\n"+
                                                                   "1: Crear la colección"+"\n"+
                                                                   "2: Mostrar la colección"+"\n"+
                                                                   "3: Añadir un número"+"\n"+
                                                                   "4: Borrar un número por su posición"+"\n"+
                                                                   "5: Borrar número(s) por su valor"+"\n"+
                                                                   "6: Buscar un número"+"\n"+
                                                                   "7: Añadir varios números"+"\n"+
                                                                   "8: Ordenar colección");
        switch (opcion){
            case 1:
                obx2.engadir();
                break;
            case 2:
                obx2.amosar();
                break;
            case 3:
                obx2.engadirNum();
                break;
            case 4:
                obx2.borrarNumPos();
                break;
            case 5:
                obx2.borrarNumValor();
                break;
            case 6: 
                obx2.buscarNum();
                break;
            case 7:
                obx2.añadirVariosNums();
                break;
            case 8:
                obx2.ordenar();
                break;
            default: JOptionPane.showMessageDialog(null, "Orden no encontrada");
        }}while(opcion<=8);
    
    */
        
        ArrayList<Xogador> listXog = new ArrayList<>();
        Metodos obx = new Metodos();
        int opcion;
        do {
             opcion = PedirDatos.pedirInt("\"***MENU***:\n1--> "
                + "Engadir xogador\n2--> Amosar\n3--> Buscar\n4--> Eliminar"
                     + "\n5--> Ordenar por dorsal\n6--> Ordenar por nome\nTeclar una opcion");
            switch (opcion) {
                case 1:
                    obx.engadir(listXog);
                    break;
                case 2:
                    obx.amosar1(listXog);
                    break;
                case 3:
                    obx.buscar(listXog, "Introduce dorsal a buscar");
                    break;
                case 4: 
                    // metodo un poco absurdo porque tienes que introducir dorsal y nombre
                    obx.eliminar(listXog, "Dorsal do xogador a eliminar");
                    break;
                case 5:
                    obx.ordenar(listXog);
                    break;
                case 6:
                    
                default: System.out.println("Opcion incorrecta");
                
                
            }
        } while (opcion != 0);
    }
       
}
