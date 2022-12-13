/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Boletin_10_teorico;

import java.util.Scanner;


/**
 *
 * @author dam1
 */
public class Boletin_10_teorico {
    public static void main (String[] args){
        
Scanner resposta= new Scanner(System.in);
System.out.println("Introduce un número");
int numero=resposta.nextInt();
System.out.println("o numero = " + numero);

do{
 	  System.out.println("Introduce un número");
          numero=resposta.nextInt();
          System.out.println("o numero = " + numero);
}
while (numero>0);
}
}
