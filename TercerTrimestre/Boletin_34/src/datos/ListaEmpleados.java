/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import entidades.EContratado;
import entidades.EDestajo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class ListaEmpleados {
    FileWriter ou=null;
    PrintWriter fich=null;
    
    public void escribirContratado(File ficheiro, EContratado emp){
        try{
            ou=new FileWriter(ficheiro,true);
            fich= new PrintWriter(ou);
            fich.println(emp.toString());
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
    
    public void escribirDestajo(File ficheiro, EDestajo emp){
        try{
            ou=new FileWriter(ficheiro,true);
            fich= new PrintWriter(ou);
            fich.println(emp.toString());
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
}
