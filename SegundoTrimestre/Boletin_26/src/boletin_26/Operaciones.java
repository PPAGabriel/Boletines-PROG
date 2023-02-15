/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_26;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Operaciones <T>{
   
    
    public Operaciones(){};
    
    public <T> void engadir(T ele,ArrayList<T>lista){
            lista.add(ele);
    }
    
    public void mostrar(ArrayList<T>lista){
        for(T ele:lista){
            System.out.println(ele);
        }
    }
    
    public <T>  void elementoMax(ArrayList<T>lista){
        System.out.println("Elemento máximo: "+Collections.max(lista, null));
    }
    
    public <T>  void elementoMin(ArrayList<T>lista){
        System.out.println("Elemento mínimo: "+Collections.min(lista, null));
    }
    
    public <T> int buscarElemento(T ele,ArrayList<T>lista){
        if(lista.indexOf(ele)>=0){
            System.out.println("El elemento "+ele+" está en la posición "+(lista.indexOf(ele)+1));
            
            return lista.indexOf(ele);
        }else{
            System.out.println("El elemento no está en la lista");
            return -1;
        }
        
    }
    
    public <T> void eliminar(T ele, ArrayList<T>lista){
            int pos=buscarElemento(ele,lista);
            T elem;
            if(pos>-1){
                elem=lista.get(pos);
                lista.remove(pos);
                JOptionPane.showMessageDialog(null, elem+" fue eliminado");
            }
            
        }

  
}
