/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin_33;

/**
 *
 * @author dam1
 */
public class Futbolista extends SeleccionFutbol{
    
    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad,Integer d, String dem) {
        super(id, nombre, apellidos, edad);
        this.dorsal=d;
        this.demarcacion=dem;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    
    
    
    public void entrevista(){
        System.out.println("Entrevistando...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Futbolista concentrado...");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja futbolista...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena futbolista...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega futbolista...");
    }
    
    

    @Override
    public String toString() {
        return super.toString() + " dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    
    
    
    
}
