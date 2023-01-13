/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public class ExemploAbstractas {

    
    public static void main(String[] args) {
      Rectangulo re= new Rectangulo(4,2);
        System.out.println("area rectangulo: "+re.calcularArea());
        System.out.println("perimetro rectangulo: "+re.calcularPerimetro());
        
     Triangulo tri= new Triangulo(3,5);
        System.out.println("area triangulo: "+tri.calcularArea());
        System.out.println("perimetro triangulo: "+tri.calcularPerimetro());
        
        
     /* FigurasGeometricas fi= new FigurasGeometricas(3,6);  No se puede instanciar por ser abstracto
        */
     
     FigurasGeometricas fi1= new Rectangulo(4,2);
        System.out.println("area rectangulo: "+fi1.calcularArea());
        System.out.println("perimetro rectangulo: "+fi1.calcularPerimetro());
        
     FigurasGeometricas fi2= new Triangulo(3,5);
        System.out.println("area rectangulo: "+fi2.calcularArea());
        System.out.println("perimetro rectangulo: "+fi2.calcularPerimetro());
    }
    
}
