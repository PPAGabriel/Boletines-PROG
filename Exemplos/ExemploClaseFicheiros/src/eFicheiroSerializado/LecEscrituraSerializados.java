/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eFicheiroSerializado;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author dam1
 */
public class LecEscrituraSerializados {
    ObjectInputStream lec=null;
    ObjectOutputStream escr=null;
    
    public void escribirSeri(File fich){
        try{
            escr=new ObjectOutputStream(new FileOutputStream(fich));
            AlumnadoSerializado al1=new AlumnadoSerializado("aa",5);
            AlumnadoSerializado al2=new AlumnadoSerializado("bb",6);
            AlumnadoSerializado al3=new AlumnadoSerializado("cc",7);
            escr.writeObject(al1);
            escr.writeObject(al2);
            escr.writeObject(al3);
        }catch(FileNotFoundException ex){
            System.out.println("Error 1: no escribir en el fichero"+ex.toString());
        }catch(IOException ex){
            System.out.println("Error 2: "+ex.getMessage());
        }finally{
            try{
                escr.close();
            }catch(IOException ex){
                System.out.println("Error close "+ex.getMessage());
            }
        }
    }
    
    public void lerSerializable(File fich){
        AlumnadoSerializado al=null;
        
        try{
            lec=new ObjectInputStream(new FileInputStream(fich));
            al=(AlumnadoSerializado)lec.readObject();
            while(al!=null){
                if(al!=null){
                    System.out.println(al);
                    al=(AlumnadoSerializado)lec.readObject();
                }
            }
        }catch(ClassNotFoundException ex){
            System.out.println("error lectura1: "+ex.getMessage());
        }catch(FileNotFoundException ex){
            System.out.println("error lectura2: "+ex.getMessage());
        }catch(IOException ex){
            System.out.println("erro lectura3: "+ex.getMessage());
        }finally{
            try{
                lec.close();
            }catch(IOException ex){
                System.out.println("error al cerrar el fichero");
            }
        }
    }
    
    public void engadirSeri(File fich){
        MeuObjectOutputStream escr=null;
        try{
                escr=new MeuObjectOutputStream(new FileOutputStream(fich,true));
                AlumnadoSerializado al1=new AlumnadoSerializado("qq",5);
                AlumnadoSerializado al2=new AlumnadoSerializado("ww",6);
                escr.writeObject(al1);
                escr.writeObject(al2);
                
                
            }catch(FileNotFoundException ex){
                System.out.println("Error 1: no escribir en el fichero"+ex.toString());
            }catch(IOException ex){
                System.out.println("Error 2: "+ex.getMessage());
            }finally{
                try{
                    escr.close();
                }catch(IOException ex){
                    System.out.println("Error close "+ex.getMessage());
                }
            }
        }
    
}
