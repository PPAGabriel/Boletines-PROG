/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public abstract class FigurasGeometricas {
    private float base;
    private float altura;
    

    //constructor para poder crear las figuras con los atributos
    public FigurasGeometricas(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    //metodos abstractos:
    
    public abstract float calcularArea();
    public abstract float calcularPerimetro();
    
}
