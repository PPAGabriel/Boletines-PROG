/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin_33;

/**
 *
 * @author dam1
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private Integer anosExperiencia;

    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String tit, Integer aE) {
        super(id, nombre, apellidos, edad);
        this.titulacion=tit;
        this.anosExperiencia=aE;
    }
    
    public void darMasaje(){
        System.out.println("Masajeando...");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Masajista concentrado...");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja masajista...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena masajista...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Masajea en el partido...");
    }

   
    

    @Override
    public String toString() {
        return super.toString() + " titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
    }
    
    
}
