/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploobxectos;

/**
 *
 * @author dam1
 */
public class Rectangulo {
   //declaro atributos
    public float base;
   private float altura;
   
   //constructores
   
   public Rectangulo(float ba, float al){ //constructor parametrizado
   base=ba;
   altura=al;
   }
   public Rectangulo(){ //constructor por defecto
   
   }
   
   //metodos de acceso (getters y setters)
   
   public void darValorAltura(float al){//corresponde a setAltura
   altura=al;
   }
   
   public float devolverValorAltura(){//corresponde a getAltura
   return altura;
   }
   
   public void setBase(float ba){//corresponde a setBase
   base=ba;
   }
   
   public float getBase(){//corresponde a getBase
   return base;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   //defino metodos
   
   public float calcularArea(float b, float h){
       float area= b*h;
       return area;
   }
   
   public void calcularPerimetro(float b, float h){
       float p=2*b+2*h;
       System.out.println("Perímetro: "+p);
   }
    
}
