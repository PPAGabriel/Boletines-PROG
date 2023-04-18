/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenpractico_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Operaciones {
    
    FileWriter fw=null;
    PrintWriter pw=null;
    
    public void añadirAlumnos(ArrayList<Alumno>lista){
        for(int i=0;i<4;i++){
            String nom=JOptionPane.showInputDialog(null, "Introduzca el nombre del alumno "+(i+1)+":");
            int not=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca la nota del alumno "+(i+1)+":"));
            
            lista.add(new Alumno(nom,not));
        }
    }
    
    public void crearFichero(File ficheiro,ArrayList<Alumno>lista){
        try{
        fw=new FileWriter(ficheiro);
        pw=new PrintWriter(fw);

        for(Alumno e:lista){
            pw.println("Alumno: "+e.getNome()+", "+"Nota: "+e.getNota());
        }
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            pw.close();
        }
    }
    
}
