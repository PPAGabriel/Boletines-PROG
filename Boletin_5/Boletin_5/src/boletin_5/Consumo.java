/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_5;

/**
 *
 * @author dam1
 */
public class Consumo {
    
    private float km, litros, vMed, pGas;//declaro atributos
    
    //constructores
    public Consumo(){};
    
    public Consumo(float kilom,float l,float vm,float gas){
    km=kilom;
    litros=l;
    vMed=vm;
    pGas=gas;
    };
    
    //Métodos
    public float getTempo(float vC,float kmC){
        float tempo= kmC/vC;
        return tempo;
    }
    
    public float consumoMedio(float litrosC, float kmC){
    float cm= litrosC/kmC*100;
    return cm;
    }
    
    public float consumoEuros(float litrosC, float kmC){
    float eurosC=consumoMedio(litrosC,kmC)*pGas;
    return eurosC;
    }
    
    //Setters y Getters
    
    public void setKms(float kms){
    km=kms;
    }
    
    public float getKms(){
    return km;
    }
    
    public void setLitros(float l){
    litros=l;
    }
    
    public float getLitros(){
    return litros;
    }
    
    public void setvMed(float vm){
    vMed=vm;
    }
    
    public float getvMed(){
    return vMed;
    }
    
    public void setpGas(float gas){
    pGas=gas;
    }
    
    public float getpGas(){
    return pGas;
    }
    
}
