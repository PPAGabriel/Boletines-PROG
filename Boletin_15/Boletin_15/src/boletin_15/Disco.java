/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_15;

/**
 *
 * @author dam1
 */
public class Disco extends Multimedia{
    private String genero;
    
    public Disco(){}
    
    public Disco(String t, String a, String f, String d, String gen){
    super(t,a,f,d);
    genero=gen;
    }
    
    //Setters y Getters
    
    public void setGenero(String gen){
    genero=gen;
    }
    
    public String getGenero(){
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() +", genero: " + genero;
    }
    
    
}
