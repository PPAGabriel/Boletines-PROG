/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploobxectos;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class ExemploObxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ValoresPedidos= new Scanner(System.in);
        
        Rectangulo obxRec1= new Rectangulo();
        float resultado= obxRec1.calcularArea(2, 3.0f);
        System.out.println("Area: "+resultado);
        
        obxRec1.calcularPerimetro(2, 3);
        
        //instancio obxecto tipo rectangulo co constructor parametrizado
        Rectangulo obxRec2= new Rectangulo(5, 8);
        
        
        
        float base=obxRec2.getBase();
        float altura=obxRec2.devolverValorAltura();
        
        float resultado2= obxRec2.calcularArea(base, altura);
        System.out.println("Area nueva: "+resultado2);
        
        
        //Pido valores
        System.out.println("Introduzca el valor de la base:");
        float basePedida=ValoresPedidos.nextFloat();
        
        System.out.println("Introduzca el valor de la altura:");
        float alturaPedida=ValoresPedidos.nextFloat();
        
        //Instancio un nuevo objeto
        Rectangulo obxRec3= new Rectangulo(basePedida,alturaPedida);
        float base3=obxRec3.getBase();
        float altura3=obxRec3.devolverValorAltura();
        
        obxRec3.calcularPerimetro(base3, altura3);
        
    
    }
        
        
}
