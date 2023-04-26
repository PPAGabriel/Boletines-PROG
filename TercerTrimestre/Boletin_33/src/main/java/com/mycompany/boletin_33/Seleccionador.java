/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin_33;

/**
 *
 * @author dam1
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
    }
    
    public void SeleccionXogador(){
        System.out.println("Jugador seleccionado");
    }

    @Override
    public void concentrarse() {
        System.out.println("Seleccionador concentrado...");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja seleccionador...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena seleccionador...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Seleccionador está en el partido...");
    }
    
    

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
