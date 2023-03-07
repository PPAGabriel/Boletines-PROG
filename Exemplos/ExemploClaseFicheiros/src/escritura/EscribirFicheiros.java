/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author dam1
 */
public class EscribirFicheiros {
    
    FileWriter ou=null;
    PrintWriter fich=null;
    public void escribir(File ficheiro){
        try{
            ou=new FileWriter(ficheiro,true);
            fich= new PrintWriter(ou);
            fich.println("lunes");
            fich.println("martes");
            fich.println("miercoles");
            fich.println("jueves");
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
    
    public void añadir(File ficheiro){
        try{
            ou=new FileWriter(ficheiro,true);
            fich= new PrintWriter(ou);
            fich.println("sabado");
            fich.println("domingo");
            
        }
        catch(IOException ex){
            System.out.println("Error de escritura "+ex.getMessage());
        }
        finally{
            fich.close();
        }
    }
    
    public void escribirBuffer(File ficheiro){
        BufferedWriter bf=null;
        
        try{
            bf=new BufferedWriter(new FileWriter(ficheiro,true));
            bf.write("Hola\n");
            bf.write("que\n");
            bf.write("tal");
        } catch(FileNotFoundException ex){
            System.out.println("Error lectura buffer: "+ex.getMessage());
        }catch(IOException ex){
            System.out.println("Error lectura buffer: "+ex.getMessage());
        }
        finally{
            try{
                bf.close();
            } catch(IOException ex){
                System.out.println("Error en cerrar: "+ex.getMessage());
            }
        }
    }
    
}
