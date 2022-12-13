/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_15;

/**
 *
 * @author dam1
 */
public class Multimedia {
    private String titulo;
    private String autor;
    private  String formato;
    private String duracion;
    
    public Multimedia(){};
    public Multimedia(String t, String a, String f, String d){
    titulo=t;
    autor=a;
    formato=f;
    duracion=d;
    }
    
    //Setters y Getters
    
    public void setTitulo(String t){
    titulo=t;
    }
    public void setAutor(String a){
    autor=a;
    }
    public void setFormato(String f){
    formato=f;
    }
    public void setDuracion(String d){
    duracion=d;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getFormato(){
        return formato;
    }
    public String getDuracion(){
        return duracion;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + ", autor: " + autor + ", formato: " + formato + ", duracion: " + duracion;
    }
}
