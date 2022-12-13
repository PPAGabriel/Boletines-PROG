/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_6_2;

/**
 *
 * @author dam1
 */
public class Satelite {
    
    private double meridiano ;
    private double paralelo;
    private double distanciaTerra ;

 public Satelite(){

  meridiano=0;
  paralelo=0;
  distanciaTerra=0;
}

public Satelite ( double m, double p, double d ){

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}

//metodo

public void verPosicion ( ) {
System.out.println ("O satelite atopase  no paralelo: "+paralelo+"\n"+"Meridiano: "+meridiano+"\n"+"A unha distancia da terra: "+distanciaTerra+"\n");
}
}
