/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_20;

/**
 *
 * @author dam1
 */
public class Papagaio extends Aves implements IPodeVoar{

    @Override
    public void camiñar() {
        System.out.println("El papagaido camina");
    }

    @Override
    public void voar() {
        System.out.println("El papagaio vuela");
    }
    
}
