/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_6;

/**
 *
 * @author dam1
 */
public class Coche {
    private int velocidade ; //atributos

    public Coche(){ //constructor predeterminado
    velocidade =0 ;
    }
    
    //metodos, setters, y getters
    public int getVelocidade(){
    return velocidade;
    }
    
    public void acelerar (int valor){
    velocidade+=valor;
    }
    
    public void frenar (int menos){
    velocidade-=menos;
    }
    }
