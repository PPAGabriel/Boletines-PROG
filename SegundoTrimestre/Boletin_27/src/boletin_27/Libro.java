/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_27;

/**
 *
 * @author dam1
 */
public class Libro {
    
    private String nombreLibro;
    private String autor;
    private float precio;
    private int unidades;
    
    public Libro(){};
    
    public Libro(String nl,String aut,float pr, int ud){
        this.nombreLibro=nl;
        this.autor=aut;
        this.precio=pr;
        this.unidades=ud;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return nombreLibro + "," + autor + "," + precio + "," + unidades;
    }
    
    
    
}
