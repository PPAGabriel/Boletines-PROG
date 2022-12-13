/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.partes;

/**
 *
 * @author dam1
 */
public class CPU {
    private int velocidad;
    
    public CPU(){}
    
    public void setVelocidad(int v){
    velocidad=v;
    }
    
    public float getVelocidad(){
    return velocidad;
    }

    @Override
    public String toString() {
        return "velocidad: " + velocidad;
    }
    
    
    
}
