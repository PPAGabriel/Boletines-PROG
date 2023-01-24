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
public class Metodo3 {
    
        public int[] crearArrayNotas() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.println(array[i]);
        }
        return array;
    }
        
        public String[] crearArrayNombres() {
        String [] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = JOptionPane.showInputDialog("Introduzca el nombre del alumno correspondiente a la nota nro."+(i+1)+" :");
        }
        return array;
    }
        
        public void buscarNota(String nombres[],int notas[]){
            String alumElegido=JOptionPane.showInputDialog("Introduzca nombre del alumno que desea conocer su nota: ");
        
            int pos=0;
            int b1=0;
            int notaBuscada=0;
            for (int i=0;i<nombres.length;i++){
                if (nombres[i].equalsIgnoreCase(alumElegido)){
                    pos=i;
                    JOptionPane.showMessageDialog(null, "La nota correspondiente a "+alumElegido+": "+notas[i]);
                    b1=1;
                }
            
            }
            
            if (b1==0){
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }
            
            
        }
        
        public void listaAprobados(String nombres[],int notas[]){
            for(int i=0;i<notas.length;i++){
                if(notas[i]>=5){
                    System.out.println(nombres[i]+" aprobó.");
                }
            }
        }
        
        public void listaOrdenada(String nombres[],int notas[]){
            int aux;
            String aux2;
            for (int i=0;i<notas.length-1;i++){
                for(int j=i+1;j<notas.length;j++){
                    if(notas[i]>notas[j]){
                        aux=notas[i];
                        aux2=nombres[i];
                        notas[i]=notas[j];
                        nombres[i]=nombres[j];
                        notas[j]=aux;
                        nombres[j]=aux2;
                    }
                }
            }
            
            for(int i=0;i<notas.length;i++){
                 System.out.println(notas[i]+" -> "+nombres[i]);
        }
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
