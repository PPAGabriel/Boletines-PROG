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
public class EDestajo extends Empregado{
    private int clientesC;
    private int complemento;

    public EDestajo() {
    }

    public EDestajo(String id, String n, String ap, GregorianCalendar d,int cc) {
        super(id, n, ap, d);
        this.clientesC=cc;
    }
    
    public int calcularComplemento(int cc){
       complemento=0;
        
        if (cc<=5){
            complemento=100;
        }else{
            complemento=250;
        }
        
        return complemento;
    }

    public int getClientesC() {
        return clientesC;
    }

    public void setClientesC(int clientesC) {
        this.clientesC = clientesC;
    }

    @Override
    public String toString() {
        return super.toString() + " clientesC:" + clientesC + ", complemento: " + calcularComplemento(clientesC);
    }
    
    
    
}
