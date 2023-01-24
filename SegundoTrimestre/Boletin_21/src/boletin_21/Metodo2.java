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
public class Metodo2 {

    public int[] crearArrayNotas() {
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }

    public void aprobados_Suspensos(int[] array) {
        int ap = 0;
        int susp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5) {
                ap++;
            } else {
                susp++;
            }
        }

        JOptionPane.showMessageDialog(null, "Nro. de aprobados: " + ap + "\n"
                + "Nro. de suspensos: " + susp
        );

    }

    public void notaMedia(int[] array){
        int acum = 0;
        float media;
        for (int i = 0; i < array.length; i++) {
            acum= acum + array[i];
        }
        media = (float) (acum / array.length);
        JOptionPane.showMessageDialog(null, "Nota media de la clase: " + media);

    }
    
    public void notaAlta(int [] array){
        int aux=0;
        for (int i = 0; i < array.length; i++) {
            if(aux<array[i]){
                aux=array[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Nota más alta de la clase: " + aux);
    }

}
