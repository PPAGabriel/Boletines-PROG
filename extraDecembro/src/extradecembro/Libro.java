/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extradecembro;

/**
 *
 * @author dam1
 */
public class Libro {
    //Atributos
    private String titulo;
    private float prezo;
    
    //Constructores
    public Libro(){};
    
    public Libro(String tit, float pr){
    this.titulo=tit;
    this.prezo=pr;
    }
    
    //Setters y Getters
    public void setTitulo(String t){
    titulo=t;
    }
    
    public void setPrezo(float p){
    prezo=p;
    }
    
    public String getTitulo(){
    return titulo;
    }
    
    public float getPrezo(){
    return prezo;
    }

    @Override
    public String toString() {
        return "Libro(" + "titulo: " + titulo + ", prezo: " + prezo + ')';
    }
    
    
}
