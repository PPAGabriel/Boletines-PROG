/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_21;

import com.gabriel.datos.PedirDatos;

/**
 *
 * @author dam1
 */
public class Metodo4 {
    
    public void calcularLetraNIF(){
        long nro;
        nro=PedirDatos.PedirLong("Introduzca el número de su NIF:");
        while(nro<10000000 || nro>100000000){
        nro=PedirDatos.PedirLong("El nro debe tener 8 dígitos");
        }
        
        float div=nro%23;
        int resto=(int)div;
        char[] arrayLetras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        
        for (int i=0;i<arrayLetras.length;i++){
            if(resto==i){
                System.out.println("Letra asignada: "+arrayLetras[i]);
            }
        }
        
    }
   
    
}
