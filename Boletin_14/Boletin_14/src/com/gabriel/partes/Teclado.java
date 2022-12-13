/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.partes;

/**
 *
 * @author dam1
 */
public class Teclado {
    private String marca;
    
    
    public void setMarca(String m){
    marca=m;
    }
    
    public String getMarca(){
    return marca;
    }

    @Override
    public String toString() {
        return "marca: " + marca;
    }
    
    
    
}
