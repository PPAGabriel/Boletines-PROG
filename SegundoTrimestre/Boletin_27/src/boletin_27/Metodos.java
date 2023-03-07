/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_27;

import com.gabriel.datos.PedirDatos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Metodos {
    Scanner sc;
    FileWriter ow=null;
    PrintWriter pw=null;
    
    public void añadirLibro(File ficheiro, ArrayList<Libro>lista){

        try{
            ow=new FileWriter(ficheiro,true);
            pw= new PrintWriter(ow);
            
            String nl=PedirDatos.pedirString("Indique el nombre del libro nuevo:");
            String aut=PedirDatos.pedirString("Indique el nombre del autor:");
            float pr=PedirDatos.pedirFLoat("Indique el precio de este:");
            int ud=PedirDatos.pedirInt("Indique las unidades de este libro:");
            
            lista.add(new Libro(nl,aut,pr,ud));
            
            pw.println(lista.get((lista.size()-1)));
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            pw.close();
        }
    }
    
    public void consultarLibro(ArrayList<Libro>lista){
        String linea;
        String libroConsulta=PedirDatos.pedirString("Indique el nombre del libro a buscar:");
        
            int i=0;
            int flag=0;
            do{
                
                if(lista.get(i).getNombreLibro().equalsIgnoreCase(libroConsulta)){
                    JOptionPane.showMessageDialog(null, "Libro encontrado: "+"\n"+
                            "Precio: "+lista.get(i).getPrecio());
                    i=lista.size();
                    flag=1;
                }
                i++;
            }while(i<lista.size());
            
            if (flag==0){
                JOptionPane.showMessageDialog(null,"Libro no encontrado");
                
            }
        
        }
    
    public void mostrarLibreria(File ficheiro){
        
        try{
            sc=new Scanner(ficheiro);
            while(sc.hasNextLine()){
                String dato=sc.nextLine();
                System.out.println(dato);
            }
        }
        catch(FileNotFoundException ex){
                System.out.println("error: "+ex.getMessage());
                }
        finally{
                sc.close();
                }
    }
    
    public void borrarLibros(File ficheiro,ArrayList<Libro>lista){
        
        ficheiro.delete();
        ArrayList<Libro>aux=new ArrayList();

        try{
            ow=new FileWriter(ficheiro,true);
            pw= new PrintWriter(ow);
            
            for (int i=0;i<lista.size();i++){
            if(lista.get(i).getUnidades()!=0){
                aux.add(lista.get(i));
                pw.println(aux.get((aux.size()-1)));
                }
            }
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            pw.close();
        }
    }
    
    public void modificarPrecio(File ficheiro,ArrayList<Libro>lista){
        
        String libroModif=PedirDatos.pedirString("Indique el nombre del libro a modificar:");
        
        ficheiro.delete();
        
        
        int flag=0;

        try{
            
            for (int i=0;i<lista.size();i++){
            if(lista.get(i).getNombreLibro().equalsIgnoreCase(libroModif)){
                    lista.get(i).setPrecio(PedirDatos.pedirFLoat("Indique el precio nuevo:"));
                    flag=1;
                    
                    ficheiro.delete();
                    
                    ow=new FileWriter(ficheiro,true);
                    pw= new PrintWriter(ow);
                    
                    for(int j=0;j<lista.size();j++){
                        
                        pw.println(lista.get(j));
                    }
                }
            }
            
            if(flag==0){
                JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            }
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            pw.close();
        }
    }

    
}
