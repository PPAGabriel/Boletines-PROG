/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploxenericas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author dam1
 */
public class ColeccionsXenericas<T> {
    public <T> void engadir(T elemento,ArrayList<T>lista){
        lista.add(elemento);
    }
    
    public static <T> void amosar(ArrayList<T>lista){
    for(T ele:lista){
        System.out.println(ele);
        }
    }
    
    public <T> void ordenar(ArrayList<T>lista){
        lista.sort((Comparator<? super T>) Comparator.naturalOrder());
        for(T ele:lista){
            System.out.println(ele);
        }
    }
}
