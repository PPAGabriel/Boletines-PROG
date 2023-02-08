/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_24;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
    
    public ArrayList<Libro> añadir(ArrayList<Libro>lista){
        lista.add(new Libro(PedirDatos.pedirString("Título:"),
                            PedirDatos.pedirString("Autor:"),
                            PedirDatos.pedirString("ISBN:"),
                            PedirDatos.pedirFLoat("Precio:"),
                            PedirDatos.pedirInt("Unidades:")));
                            
        return lista;              
    }
    
    public void mostrar(ArrayList<Libro>lista) throws Exception{
        for(Libro elemento: lista){
            System.out.println(elemento);
         
        }
        
         throw new Exception("Libreria nula");
       
    }
    
    public int consultar(ArrayList<Libro> lista, String mensaje) throws Exception {
        String titulo = PedirDatos.pedirString(mensaje);
        int flag=0;
        
        for(Libro elemento:lista){
            if(elemento.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Libro encontrado:"+"\n"+
                         elemento.toString());
                flag=1;
            }
        }
        
        if (flag == 0) {
               throw new Exception("Libro no encontrado");
          }
        
        
        //OTRA MANERA DE HACERLO:
        
//        Iterator it = lista.iterator();
//        Libro aux = null;
//        int flag = 0;
//        while (it.hasNext()) {
//            aux = (Libro) it.next();
//            if (aux.getTitulo().equalsIgnoreCase(titulo)) {
//                System.out.println("Libro encontrado:"+"\n"+
//                        aux.toString());
//                flag = 1;
//            }
//        }
//        if (flag == 0) {
//            System.out.println("Libro no encontrado");
//        }
           return flag;
    }
    
    public void darBaja(ArrayList<Libro> lista, String mensaje) throws Exception{
        String titulo = PedirDatos.pedirString(mensaje);
        int flag=0;
        for(Libro elemento:lista){
            if(elemento.getTitulo().equalsIgnoreCase(titulo)){
                elemento.setnUds(0);
                JOptionPane.showMessageDialog(null,"Libro dado de baja");
                flag=1;
            }
        }
        
        if (flag == 0) {
               throw new Exception("Libro no encontrado");
          }
        
    }
    
    public void vender(ArrayList<Libro> lista, String mensaje) throws Exception {
        String titulo = PedirDatos.pedirString(mensaje);
        int venta=PedirDatos.pedirInt("Introduzca la cantida de libros a comprar:");
        int flag=0;
        for(Libro elemento:lista){
            if(elemento.getTitulo().equalsIgnoreCase(titulo)){
                if(venta<=elemento.getnUds()){
                    int udActuales=elemento.getnUds();
                    elemento.setnUds(udActuales-venta);
                    JOptionPane.showMessageDialog(null,"Libros comprados");
                }else{
                    throw new Exception("La cantidad de libros a comprar es superior al stock");
                }
                 flag=1;
            }
        }
        
        if (flag==0){
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }
    
   public void ordenar(ArrayList<Libro>lista){
        Collections.sort(lista);
        JOptionPane.showMessageDialog(null, "Libros ordenados");
            }
    
}
