/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura;

import eFicheiroSerializado.Alumno;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author dam1
 */

public class LerFicheiros {
    
    Scanner sc;
    
    public void lerPalabras(File ficheiro, String del){
        try{
            sc=new Scanner(ficheiro).useDelimiter("\\s*"+del+"\\s*");
        while(sc.hasNext()){
            String dato=sc.next();
            System.out.println(dato);
            }
        
        }catch(FileNotFoundException ex){
            System.out.println("error 1 "+ex.getLocalizedMessage());
        }
    }
    
    public void lerLiña(File ficheiro){
        try{
            sc=new Scanner(ficheiro);
            while(sc.hasNextLine()){
                String dato=sc.nextLine();
                System.out.println(dato);
            }
        }
        catch(FileNotFoundException ex){
                System.out.println("error 2 "+ex.getMessage());
                }
        finally{
                sc.close();
                }
        }
    
    public ArrayList<Integer> lerNumero(File ficheiro){
        int num;
        ArrayList<Integer>lista=new ArrayList<>();
        try{
            sc=new Scanner(ficheiro);
            while(sc.hasNext()){
                num=sc.nextInt();
                lista.add(num);
                }
            }
        catch(FileNotFoundException ex){
            System.out.println("error leer numero"+ex.getMessage());
            }
        finally{
                sc.close();
            }
        
        for(Integer ele:lista){
            System.out.println(ele);
            }
        
        return lista;
        }
    
    
        /* --------------------------------------------------------*/
    
    
        public ArrayList<Integer> lerNumeroConDelimitadores(File ficheiro){
        int num;
        ArrayList<Integer>lista=new ArrayList<>();
        try{
            sc=new Scanner(ficheiro).useDelimiter(",");
            while(sc.hasNext()){
                num=sc.nextInt();
                lista.add(num);
                }
            }
        catch(FileNotFoundException ex){
            System.out.println("error leer numero"+ex.getMessage());
            }
        finally{
                sc.close();
            }
        
        for(Integer ele:lista){
            System.out.println(ele);
            }
        
        return lista;
        }
        
        public void lerObxecto(File ficheiro){
            ArrayList<Alumno>lista=new ArrayList<>();
            String[]aux=new String[2];
            
            try{
            sc=new Scanner(ficheiro);
            while(sc.hasNextLine()){
                aux=sc.nextLine().split(", ");
                lista.add(new Alumno(aux[0],Integer.parseInt(aux[1])));
                }
            }
            catch(FileNotFoundException ex){
                System.out.println("No se puede leer el fichero");
            }
            finally{
                sc.close();
            }
            
            for(Alumno al:lista){
                System.out.println(al.toString());
            }
        }
        
        public void lerBuffer(File ficheiro){
            BufferedReader bf=null;
            try{
                bf=new BufferedReader(new FileReader(ficheiro));
                String linea;
                linea=bf.readLine();
            }catch(FileNotFoundException ex){
                System.out.println("Error Lectura buffer: "+ex.getMessage());
            }catch(IOException ex){
                System.out.println("Error lectura: "+ex.getMessage());
            }
        }
    
    }
