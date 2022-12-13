/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_7;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Apartado 1:
        
        Scanner obxScanner=new Scanner(System.in);
      
        System.out.println("Teclee un numero");
        float num=obxScanner.nextFloat();
        
        if (num>0){
            System.out.println("Es positivo");
        }
        
        */
        
        
        /* Apartado 2:
        
        float num1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer número:"));
        float num2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo número:"));
        
        if (num1>=num2){
            System.out.println("La resta es: "+(num1-num2)+"\n"
            +"La suma es: "+(num1+num2));
        }else{
            System.out.println("La suma es: "+(num1+num2));
        }
        */
        
        
        /*Apartado 3:
        
        float num=Float.parseFloat(JOptionPane.showInputDialog("Introduzca un número:"));
        if (num>0){
            System.out.println("+");
        }
        else {
            if(num<0){
            System.out.println("-");
               }else{
            System.out.println("0");
            }
          }
        */
        
  
        /*Apartado 4:
        
        String nom1=JOptionPane.showInputDialog("Introduzca el nombre de la primera persona:");
        float peso1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el peso de "+nom1+":"));
        String nom2=JOptionPane.showInputDialog("Introduzca el nombre de la segunda persona:");
        float peso2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el peso de "+nom2+":"));
       
        if(peso1>peso2){
            System.out.println("Entre los dos, "+nom1+" pesa más.");
            System.out.println("La diferencia de peso es de: "+(peso1-peso2));
        }else if(peso2>peso1){
            System.out.println("Entre los dos, "+nom2+" pesa más.");
            System.out.println("La diferencia de peso es de: "+(peso2-peso1));
        }
        else{
            System.out.println("Ambos pesan igual, por lo que no hay diferencia.");
        }
        */
        
        
        //Apartado 5:
        
        float n1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el primer numero:"));
        float n2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el segundo numero:"));
        float n3=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el tercero numero:"));
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+" es el número mayor.");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" es el número mayor.");
        }else if(n3>n1 && n3>n2){
            System.out.println(n3+" es el número mayor");
        }else{System.out.println("Todos los números son iguales.");}
        
    }
    
}
