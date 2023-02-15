/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploxenericas;

import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class ExemploXenericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*  ClaseXenerica <Double> obx=new ClaseXenerica<>();
        Xogador x=new Xogador("Aspas",9);
        System.out.println(obx.getDato());  */
      
      ColeccionsXenericas<Integer>obxLis=new ColeccionsXenericas<>();
      ArrayList<Integer>lista=new ArrayList<>();
      obxLis.engadir(1,lista);
      obxLis.engadir(2,lista);
      obxLis.engadir(3,lista);
      ColeccionsXenericas.amosar(lista);
      
        System.out.println("");
      
      ColeccionsXenericas<Float> obxLis2=new ColeccionsXenericas<>();
      ArrayList<Float> lista2=new ArrayList<>();
      obxLis2.engadir(1.6f,lista2);
      obxLis2.engadir(2f,lista2);
      obxLis2.engadir(3f,lista2);
      ColeccionsXenericas.amosar(lista2);
      
        System.out.println("");
      
      Xogador x1=new Xogador("Araujo",4);
      Xogador x2=new Xogador("Messi",10);
      Xogador x3=new Xogador("Balde",22);
      
      ColeccionsXenericas<Xogador>obxLis3=new ColeccionsXenericas<>();
      ArrayList<Xogador>lista3=new ArrayList<>();
      obxLis3.engadir(x1,lista3);
      obxLis3.engadir(x2,lista3);
      obxLis3.engadir(x3,lista3);
      ColeccionsXenericas.amosar(lista3);
      
        System.out.println("");
      
      obxLis3.ordenar(lista3);
    }
    
}
