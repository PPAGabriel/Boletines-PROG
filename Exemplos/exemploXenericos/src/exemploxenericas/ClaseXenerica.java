/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploxenericas;

/**
 *
 * @author dam1
 */
public class ClaseXenerica <T>{
    
    private T dato;
    
    public ClaseXenerica(){};
    
    public void setDato(T valor){
        dato=valor;
        }
    
    public T getDato(){
        return dato;
        }
    
}
