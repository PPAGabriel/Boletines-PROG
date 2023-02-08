/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarraylist;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class ListaEnteiros {
    ArrayList<Integer>listaEnteiros=new ArrayList();
    
    public void engadir(){
        listaEnteiros.add(2);
        listaEnteiros.add(3);
        listaEnteiros.add(5);
        JOptionPane.showMessageDialog(null,"Colección creada");
    }
    
    public void amosar(){
        System.out.println(listaEnteiros);
    }
    
    public void engadirNum(){
        int num=PedirDatos.pedirInt("Teclee el número a añadir");
        int pos=PedirDatos.pedirInt("Teclee la posición donde desea añadirlo");
        listaEnteiros.add(pos-1, 10); 
    }
    
    public void borrarNumPos(){
        int pos=PedirDatos.pedirInt("Teclee la posición del elemento a eliminar:");
        listaEnteiros.remove(pos-1);
    }
    
    public void borrarNumValor(){
        int valor=PedirDatos.pedirInt("Indique el número a borrar");
        for (int i=0;i<listaEnteiros.size();i++){
            if (listaEnteiros.get(i)==valor){
                listaEnteiros.remove(i);
            }
        }
    }
    
     /* OTRA MANERA:
            Iterator it=listaEnteiros.iterator();
                while (it.hasNext()){
                    if ((int) it.next()==3){
                        it.remove;
                         }
                }
    
        */
    
    public void buscarNum(){
        int num=PedirDatos.pedirInt("Teclee el número a buscar");
        
        if (listaEnteiros.contains(num)==true){
            JOptionPane.showMessageDialog(null, "El número "+num+" pertenece a la colección");
        }else{
            JOptionPane.showMessageDialog(null, "El número "+num+" no pertenece a la colección");
        }
    }
    
    public void añadirVariosNums(){
        int cantidad=PedirDatos.pedirInt("Ingrese la cantidad de números a añadir");
        for (int i=0;i<cantidad;i++){
            int nro=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número "+(i+1)+":"));
            listaEnteiros.add(nro);
        }
    }
    
    public void ordenar(){
        Collections.sort(listaEnteiros); //ordena de menor a mayor, o bien alfabéticamente
        
        /*
        Coleccions.sort(listaEnteiros,Collections.reverseOrder());  En caso de querer revertir el orden
        */
        }
    
}
