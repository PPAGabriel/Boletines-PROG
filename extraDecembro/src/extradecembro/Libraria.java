/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extradecembro;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Libraria {
    //Atributos
    private Libro lib;
    private String nome;
    
    //Consturctores
    public Libraria(){};
    
    public Libraria(Libro l, String n){
    this.lib=l;
    this.nome=n;
    }
    
    //Metodos
    public void mudarPrezo(){
    lib.setPrezo(Float.parseFloat(JOptionPane.showInputDialog("Introduce el nuevo precio del libro:")));
    }

    @Override
    public String toString() {
        return "Libros Disponibles: "+ lib.toString() +"\n"+ 
                "Nombre de la Libreria: " + nome;
    }
    
    
    
}
