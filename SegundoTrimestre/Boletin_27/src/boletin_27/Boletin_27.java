/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_27;

import com.gabriel.datos.PedirDatos;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Libro> libreria=new ArrayList();
        Metodos obx=new Metodos();
        File f= new File("libros.txt");
        int opc=0;
        
        do{
            opc=PedirDatos.pedirInt("Indique la opción a elegir:"+"\n"+
                    "1. Añadir libro"+"\n"+
                    "2. Consultar libro"+"\n"+
                    "3. Mostrar libreria"+"\n"+
                    "4. Borrar libros"+"\n"+
                    "5. Modificar precio"+"\n"+
                    "0. Para salir"
                    );
            
            switch(opc){
                case 1:
                    obx.añadirLibro(f,libreria);
                    break;
                case 2:
                    obx.consultarLibro(libreria);
                    break;
                case 3:
                    obx.mostrarLibreria(f);
                    break;
                case 4:
                    obx.borrarLibros(f,libreria);
                    break;
                case 5:
                    obx.modificarPrecio(f, libreria);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Adios!");
                    break;
                default:
                    System.out.println("Orden no Encontrada");
                    break;
            }
        }
        while(opc>0 && opc<=5);
        
        
        
    }
    
}
