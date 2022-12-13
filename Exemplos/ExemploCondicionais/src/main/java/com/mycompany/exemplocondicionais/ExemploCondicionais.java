/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exemplocondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ExemploCondicionais {

    public static void main(String[] args) {
        
        
        //CondicionalSimple obx= new CondicionalSimple();
        
        //obx.mayorEdade(20);
        //obx.mayorEdade(16);
        
        //pedimos datos utilizando JOptionPane
        //String resStr= JOptionPane.showInputDialog("Teclea la edad:");
        //int resInt=Integer.parseInt(resStr);
        
        //obx.mayorEdade(resInt);
        
        //CondicionalDoble obx2= new CondicionalDoble();
        
        //String res=JOptionPane.showInputDialog("Teclea la edad:");
        //int edad=Integer.parseInt(res);
        
        //obx2.consultarEdad(edad);
        //obx2.operarEdad(edad);
        
        CondicionalesAnidados obx3= new CondicionalesAnidados();
       //int ed=pedirInt("Dame valor edade:");
        
       //obx3.verEdade(ed);
       
       int dia=pedirInt("Número del día:");
       //obx3.verDia(dia);
       obx3.verDiaSwitchCase(dia);
        
        }
        
        public static int pedirInt(String mensaje){
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        }

        public void ver(){
        int resposta=pedirInt("dame valor");
            System.out.println(resposta);
        }
        
        
    }
