/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaypolimorfismo;

/**
 *
 * @author dam1
 */
public class Fillo extends Nai{
    public Fillo(){};
    
    public int m1(){
        int m1=super.m1();
        return m1;
    }
    
    public void m2(){
        super.m2();
        System.out.println("fillo m2");
    }
    
    public void m3(){
        this.m2();
        System.out.println("fillo m3");
    }
}
