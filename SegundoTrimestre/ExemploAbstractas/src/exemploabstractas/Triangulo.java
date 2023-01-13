/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public class Triangulo extends FigurasGeometricas{

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return (super.getBase()*super.getAltura()/2);
    }

    @Override
    public float calcularPerimetro() {
        return (3*super.getBase());
    }    
    
    
}
