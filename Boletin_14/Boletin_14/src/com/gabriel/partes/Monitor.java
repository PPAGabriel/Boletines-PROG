/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.partes;

/**
 *
 * @author dam1
 */
public class Monitor {
    private float pulgadas;
    
    public void setPulgadas(float in){
    pulgadas=in;
    }
    
    public float getPulgadas(){
    return pulgadas;
    }

    @Override
    public String toString() {
        return "pulgadas: " + pulgadas;
    }
    
    
}
