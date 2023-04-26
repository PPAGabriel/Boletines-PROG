/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletin_33;

/**
 *
 * @author dam1
 */
public class Boletin_33 {

    public static void main(String[] args) {
        
        SeleccionFutbol obx;
        
        obx= new Futbolista(137436,"Lionel","Messi",30,10,"Delantero");
        llamadas(obx);
        System.out.println("***************");
        
        obx= new Entrenador(821632,"Pep","Guardiola",38,111);
        llamadas(obx);
        System.out.println("***************");
        
        obx=new Masajista(6374,"Pepina","Sanchez",56,"superior",25);
        llamadas(obx);
        System.out.println("***************");
        
        obx=new Seleccionador(8346754,"Lionel","Scaloni",38);
        llamadas(obx);

    }

    public static void llamadas(SeleccionFutbol obx){
        obx.concentrarse();
        obx.viajar();
        obx.entrenar();
        obx.jugarPartido();
        System.out.println(obx.toString());
    }
}
