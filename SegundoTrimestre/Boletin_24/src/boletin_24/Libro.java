/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_24;

/**
 *
 * @author dam1
 */
public class Libro implements Comparable{
    
    private String titulo;
    private String autor;
    private String ISBN;
    private float prezo;
    private int nUds;
    
    public Libro (String tit, String aut, String ISBN, float p,int nu){
        this.titulo=tit;
        this.autor=aut;
        this.ISBN=ISBN;
        this.prezo=p;
        this.nUds=nu;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getnUds() {
        return nUds;
    }

    public void setnUds(int nUds) {
        this.nUds = nUds;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + prezo + ", nUds=" + nUds + '}';
    }
    
    public int compareTo(Object o) {
        Libro x = (Libro)o;
        if(this.titulo.compareToIgnoreCase(x.titulo)>0)
            return 1;
        else if (this.titulo.compareToIgnoreCase(x.titulo)<0)
            return -1;
        else
            return 0;
    }
    
}
