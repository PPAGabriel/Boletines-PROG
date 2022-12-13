/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_13;

import com.gabriel.paquete2.Personal;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Academica {
    static int numReferencia = 2018;
    private String nombre;
    private int nota;
    private Personal alum=new Personal();
    
    public Academica(){
    numReferencia++;
    }
    
    public Academica(String nom, int not,String tlf, String mail){
    Academica.numReferencia++;
    nombre=nom;
    nota=not;
    nota = validarNota();
    alum.setTelefono(tlf);
    alum.setCorreo(mail);
    }

    @Override
    public String toString() {
        return "Academica{" + "nombre: " + nombre + ", nota: " + nota + ", " + alum.toString() +", numReferencia: "+numReferencia+ '}';
    }
    
    public int validarNota(){
        while (nota>10 || nota<0){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Introduzca una nota válida para "+ nombre));
        }
    
        return nota;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public Personal getAlum(){
    return alum;
    }
    
}
