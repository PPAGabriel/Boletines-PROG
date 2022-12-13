/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocondicionais;

/**
 *
 * @author dam1
 */
public class CondicionalDoble {
             public void consultarEdad(int edad){
             if(edad>=18){
                 System.out.println("Es mayor de edad");
             }
             else{
                 System.out.println("Es menor de edad");
             }
             }
             
             public void operarEdad(int edad){
             String res= (edad>=18)?"mayor":"menor";
                 System.out.println(res);
             }
}
