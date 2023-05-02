/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.GregorianCalendar;

/**
 *
 * @author dam1
 */
public class EContratado extends Empregado{
    
    private float sueldoBasico;
    private int anosT;
    
    
    public EContratado() {
    }

    public EContratado(String id, String n, String ap, GregorianCalendar d,float sb,int at) {
        super(id, n, ap, d);
        this.sueldoBasico=sb;
        this.anosT=at;
    }
    
    public float sueldoFinal(float s,int a){
        float sf=0;
        
        if (a>15){
            sf=(float) (s+s*0.2);
            }
              else{
               if (a<=15 && a>=8){
                   sf=(float) (s+s*0.15);
                }else{
                   if(a<=7 && a>=4){
                       sf=(float) (s+s*0.1);
                        }else{
                            sf=(float) (s+s*0.05);
                            }
                     }
                  }
        
        return sf;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAnosT() {
        return anosT;
    }

    public void setAnosT(int anosT) {
        this.anosT = anosT;
    }

    @Override
    public String toString() {
        return super.toString() + " sueldoFinal:" + sueldoFinal(sueldoBasico,anosT) + ", anosT:" + anosT;
    }
    
    
    
}
