/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_21;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodo1 {
    public int[] crearArrayNumeros(){
    int [] array=new int[6];
    for(int i=0;i<array.length;i++){
    array[i]=(int)(Math.random()*50+1);
    }
    return array;
    }
    
    public void amosarArrayNumeros(int [] array){
    for(int i=array.length-1;i>=0;i--){
     System.out.println("Número (posicion "+i+"): "+array[i]);
        }
    
    }
    
}
