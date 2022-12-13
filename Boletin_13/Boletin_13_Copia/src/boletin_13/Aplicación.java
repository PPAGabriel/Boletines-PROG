/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_13;

/**
 *
 * @author dam1
 */
public class Aplicación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Academica obx= new Academica("Gabriel",10,"657224585","gapp2709@gmail.com");
        System.out.println(obx.toString());
        Academica obx2= new Academica("Pepeto",2,"653997283","pepi123@hotmail.com");
        System.out.println(obx2.toString());
        Academica obx3= new Academica("Nico",-2,"662200815","nico_stroncio@outlook.com");
        System.out.println(obx3.toString());
        Academica obx4= new Academica("Alicia",13,"651097731","als.1995@yahoo.com");
        System.out.println(obx4.toString());
        
        System.out.println(obx.getNombre());
        System.out.println(obx.getAlum().getTelefono());
    }
    
}
