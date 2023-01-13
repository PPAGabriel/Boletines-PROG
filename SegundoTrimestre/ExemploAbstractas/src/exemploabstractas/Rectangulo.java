/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploabstractas;

/**
 *
 * @author dam1
 */
public class Rectangulo extends FigurasGeometricas{


    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    
    

    @Override
    public float calcularArea() {
        return super.getBase()*super.getAltura();
    }

    @Override
    public float calcularPerimetro() {
        return (2*super.getBase()+2*super.getAltura());
    }
    
}
