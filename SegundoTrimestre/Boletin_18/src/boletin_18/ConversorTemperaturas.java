/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_18;

/**
 *
 * @author dam1
 */
public class ConversorTemperaturas {
    public final static int CTE=80;
    
    public float centigradosAFharenheit(float tc) throws TemperaturaErradaExcepcion{
        float tf=0;
        if(tc<CTE){ 
            throw new TemperaturaErradaExcepcion("No puede ser inferior a 80");
        }
    return tf;
    }
    
    public void centigradosAReamur(float tc)throws TemperaturaErradaExcepcion{
        float tr=0;
        if(tc<CTE){ 
            throw new TemperaturaErradaExcepcion("No puede ser inferior a 80");
        }
    }
    
}
