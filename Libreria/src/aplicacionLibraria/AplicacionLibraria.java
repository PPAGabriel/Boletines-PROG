/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionLibraria;

import com.gabriel.datos.PedirDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class AplicacionLibraria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       String valor=PedirDatos.pedirString("Teclea nome:");
        System.out.println(valor);
        
       int numero=PedirDatos.PedirInt("Teclea número:");
        System.out.println(numero);
      
    }
    
}
