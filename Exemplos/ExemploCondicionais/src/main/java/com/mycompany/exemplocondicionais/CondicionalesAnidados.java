/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplocondicionais;

/**
 *
 * @author dam1
 */
public class CondicionalesAnidados {
    
    public void verEdade(int edade){
        
        if(edade>18){
            System.out.println("E maior de 18");
        }
        else if(edade==18){
            System.out.println("ten 18");
        }
        else{
            System.out.println("E menor de 18");
        }
    }
    
    public void verDia(int dia){
        if(dia==1)
            System.out.println("lunes");
        else if(dia==2)
            System.out.println("Martes");
        else if(dia==3)
            System.out.println("Miércoles");
        else if(dia==4)
            System.out.println("Jueves");
        else if(dia==5)
            System.out.println("Viernes");
        else if(dia==6)
            System.out.println("Sábado");
        else if(dia==7)
            System.out.println("Domingo");
        else 
            System.out.println("ERROR");
    }
    
    
    
    public void verDiaSwitchCase(int dia){
    switch(dia){
        case 1: System.out.println("Lunes");
        break;
        case 2: System.out.println("Martes");
        break;
        case 3: System.out.println("Miércoles");
        break;
        case 4: System.out.println("Jueves");
        break;
        case 5: System.out.println("Viernes");
        break;
        case 6: System.out.println("Sábado");
        break;
        case 7: System.out.println("Domingo");
        break;
        default: System.out.println("ERROR");
        }
    }
    
}
