/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplomath;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ExemploMath {
    
    public static final double PI=3.14;  //Declaración de una consante
    
    public static void main(String[] args) {
        //Programa que calcula la longitud y el área de una circunferencia
        
        Scanner obxScanner= new Scanner(System.in); //Instanciamos un objeto tipo Scanner
        
        System.out.println("Introduzca el radio de la circunferencia:");
        float radio= obxScanner.nextFloat();
        
        double longitud=2*PI*radio;
        System.out.println("Su longitud es: "+longitud);
        
       /*Tambien se puede hacer con un cambio a float
        float lon=(float) (2*Math.PI*radio);*/
       
       float area=(float) (PI*Math.pow(radio,2));
       System.out.println("El área es: "+area);
    }
}
