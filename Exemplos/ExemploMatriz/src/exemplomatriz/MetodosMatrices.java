/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplomatriz;

import com.gabriel.datos.PedirDatos;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class MetodosMatrices {
    
    int f,c;
    
    Random num=new Random();
    
    public int[][] crearMatriz(){
        f=PedirDatos.PedirInt("Introduzca el nro. de filas:");
        c=PedirDatos.PedirInt("Introduzca el nro. de columnas:");
        
    int [][] matriz=new int[f][c];
    for(int i=0;i<f;i++){
        for(int j=0;j<c;j++){
          matriz[i][j]=PedirDatos.PedirInt("Introduzca un valor para la posición f:"+(i+1)+" c:"+(j+1));
          
          //con numeros aleatorios
          //matriz[i][j]=num.nextInt(11);
        }
    }
    return matriz;
    }
    
    public void verMatriz(int [][]matriz,float array1[], float array2[]){
        
        int acum=0;
        
        System.out.println("                PRO      BD         MEDIA ALUMNO");
        
        for (int i=0;i<matriz.length;i++){
            System.out.print("Alumno nro."+(i+1)+": | ");
            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"       ");
            }
            System.out.print("|  ");
            System.out.println(array2[acum]);
            acum++;
            
        }
        System.out.print("Media Modulo   ");
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+"    ");
        }
        System.out.println("");
        
    }
    
    public float[] notaMediaAlumno(int [][]matriz){
        float nm=0;
        float array[]=new float[matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
               nm+=matriz[i][j];
          
          //con numeros aleatorios
          //matriz[i][j]=num.nextInt(11);
                }
            
            array[i]=(float) (nm/matriz[i].length);
            nm=0;
            }
        return array;
        }
    
    public float[] notaMediaModulo(int [][]matriz){
        float nm=0;
        float array[]=new float[c];
        for(int j=0;j<c;j++){
            for(int i=0;i<f;i++){
               nm+=matriz[i][j];
          
          //con numeros aleatorios
          //matriz[i][j]=num.nextInt(11);
                }
            
            array[j]=(float) (nm/f);
            nm=0;
            }
        return array;
        }
    
    public void verNotaMedia(float array[]){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
   
    
}
