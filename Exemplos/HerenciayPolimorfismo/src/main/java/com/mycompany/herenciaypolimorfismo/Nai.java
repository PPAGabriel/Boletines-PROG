/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author dam1
 */
public class Nai extends Avo{
    
    public Nai(){};
    
    public int m1(){
        return 1;
    }
    
    public void m2(){
        super.m2();
        System.out.println("nai m2");
    }
    
    public void m4(){
        super.m4();
        System.out.println("nai m4");
    }
    
}
