/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_4;

/**
 *
 * @author dam1
 */
public class Libro {
    //declaro atributos
    private String titulo, autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
   
    
    public Libro (){}; //constructor por defecto
    
    public Libro (String tit, String aut, int an, short numPag){
    titulo=tit;
    autor=aut; //constructor para inicializar atributos
    ano=an;
    numPaginas=numPag;
    };
    
    //metodos de acceso para todos los atributos
    public void setTitulo(String tit){
   titulo=tit;
   }
   public String getTitulo(){
   return titulo;
   }
   
   public void setAutor(String aut){
   autor=aut;
   }
   public String getAutor(){
   return autor;
   }
       
   public void setAno(int an){
   ano=an;
   }
   public int getAno(){
   return ano;
   }
   
   public void setNumPaginas(short np){
   numPaginas=np;
   }
   public short getNumPaginas(){
   return numPaginas;
   }
   
   public void setValoracion(float val){
   valoracion=val;
   }
   public float getValoracion(){
   return valoracion;
   }
   
   
   //defino el método amosar
   public void amosar(String tit, String aut, int ano, short npag,float valor){
       System.out.println("Titulo: "+tit+"\n"+
               "Autor: "+aut+"\n"+
               "Año: "+ano+"\n"+
               "Número de Páginas: "+npag+"\n"+
               "Valoración: "+valor);
   }
}
