/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.paqueteA;

import com.gabriel.paqueteB.ClaseD;

/**
 *
 * @author dam1
 */
public class ClaseA {
    private void amosarClaseA(){
        System.out.println("Amosamos clase A");
    }
   
    public void amosar(){
    ClaseB obx= new ClaseB();
    obx.amosarClaseB();
    }
    
    public void amosar2(){
    ClaseD obx= new ClaseD();
    obx.amosarClaseD();
    }
}
