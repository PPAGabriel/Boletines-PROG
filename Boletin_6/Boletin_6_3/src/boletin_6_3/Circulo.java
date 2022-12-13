/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_6_3;

/**
 *
 * @author dam1
 */
public class Circulo {
    
    //Declaracion de atributos y constante
    
    private double radio;
    final static double PI=3.14;
    
    //Constructores
    public Circulo(){
    }
    
    public Circulo(double r){
    radio=r;
    }
    
    //Setter y Getters
    public void setRadio(double r){
    radio=r;
    }
    public double getRadio(){
    return radio;
    }
    
    //Métodos
    
    public double calcularArea(){
    double area=PI*Math.pow(radio, 2);
    return area;
    }
    
    public double calcularLongitud(){
    double longitud=2*PI*radio;
    return longitud;
    }
    
}
