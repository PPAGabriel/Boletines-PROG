/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_15;

/**
 *
 * @author dam1
 */
public class Pelicula extends Multimedia{
    private String actorPrincipal;
    private String actrizPrincipal;
    
    public Pelicula(){}
    
    public Pelicula(String t, String a, String f, String d, String am, String af){
    super(t,a,f,d);
    actorPrincipal=am;
    actrizPrincipal=af;
    }
    
    //Setters y Getters
    
    public void setActor(String am){
    actorPrincipal=am;
    }
    
    public String getActor(){
        return actorPrincipal;
    }
        
    public void setActriz(String af){
    actrizPrincipal=af;
    }
    
    public String getActriz(){
        return actrizPrincipal;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", actorPrincipal: " + actorPrincipal + ", actrizPrincipal: " + actrizPrincipal;
    }
    
    
}
