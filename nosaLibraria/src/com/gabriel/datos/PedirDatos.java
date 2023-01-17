/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabriel.datos;

import javax.swing.JOptionPane;


public class PedirDatos {

public static String pedirString(String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
        } 

public static float pedirFLoat(String mensaxe){
        return Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        } 

public static int PedirInt(String mensaxe){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        }
    
}
