/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extradecembro;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro lib1= new Libro("100 años de soledad", (float)20);
        Libraria libraria1= new Libraria(lib1,"Tucusito");
        
        JOptionPane.showMessageDialog(null, libraria1.toString());
        
        //Modifico el precio del libro
        
        libraria1.mudarPrezo();
        
        JOptionPane.showMessageDialog(null, libraria1.toString());
    }
    
}
