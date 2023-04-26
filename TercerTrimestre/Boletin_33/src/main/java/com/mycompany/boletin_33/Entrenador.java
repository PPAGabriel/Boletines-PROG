/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletin_33;

/**
 *
 * @author dam1
 */
public class Entrenador extends SeleccionFutbol{
    
    private Integer idFederacion;

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, Integer idF){
        super(id, nombre, apellidos, edad);
        this.idFederacion=idF;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
    public void planificarEntrenamiento(){
            System.out.println("Planificando...");
    }

    @Override
    public void concentrarse() {
        System.out.println("Entrenador concentrado...");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja entrenador...");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena entrenador...");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Entrenador dirige partido jugado...");
    }

    @Override
    public String toString() {
        return super.toString() + " idFederacion=" + idFederacion;
    }
    
    
}
