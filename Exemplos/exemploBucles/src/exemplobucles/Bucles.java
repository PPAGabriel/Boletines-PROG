/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplobucles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Bucles {
    
    //Escribe un programa que sume 5 numeros enteros
    
    public static int introducirEntero(){
    int num= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero:"));
    return num;
    }
    
    public static void leerSuma(int suma){
    JOptionPane.showMessageDialog(null,"La suma es: "+suma);
    }
    
    public void metodoWhile(){
        int num=0, n=0, suma=0;
        while(n<5){
            num=introducirEntero();
            suma=suma+num;
            n++;
        }
        leerSuma(suma);
        

    }
    
    public void metodoDoWhile(){
        int num=0, n=0, suma=0;
        do{
            num=introducirEntero();
            suma=suma+num;
            n++;
        }
        while(n<5);
        leerSuma(suma);
    
    }
    
    public void metodoFor(){
        int suma=0, num=0;
        for(int n=0;n<5;n++){
            num=introducirEntero();
            suma=suma+num;
        }
        leerSuma(suma);
    }
    
}
