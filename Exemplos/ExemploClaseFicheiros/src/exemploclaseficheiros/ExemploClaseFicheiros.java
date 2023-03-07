/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploclaseficheiros;

import eFicheiroSerializado.LecEscrituraSerializados;
import escritura.EscribirFicheiros;
import java.io.File;
import lectura.LerFicheiros;

/**
 *
 * @author dam1
 */
public class ExemploClaseFicheiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        File f=new File("numerosN.txt");
        LerFicheiros obxLer=new LerFicheiros();
        
        //obxLer.lerPalabras(f);
        obxLer.lerLiña(f);
        
        */
        
       /* File n=new File("numeros.txt");
        LerFicheiros obxLer=new LerFicheiros();
        
        //obxLer.lerNumero(n);
        obxLer.lerPalabras(n,",");
       */
       
       /*File n=new File("alumnos.txt");
       LerFicheiros obxLer=new LerFicheiros();
       
       obxLer.lerObxecto(n);*/
       
     /*  File n=new File("/home/dam1/Documentos/PROG/probaNumero.txt");
       LerFicheiros obxLer=new LerFicheiros();
       
       obxLer.lerPalabras(n," ");

*/
     
    /* EscribirFicheiros es=new EscribirFicheiros();
     File f=new File("dias.txt");
     
     //es.escribir(f);
     es.añadir(f);
     
     LerFicheiros leer=new LerFicheiros();
     leer.lerPalabras(f, "\n");
*/
   /* File f=new File("buffer");
    LerFicheiros obxL=new   LerFicheiros();
    EscribirFicheiros obxE=new EscribirFicheiros();
    
    obxE.escribirBuffer(f);
    obxL.lerBuffer(f);

*/
   
   File f=new File("alumnadoSerializado.DAT");
   LecEscrituraSerializados obx=new LecEscrituraSerializados();
        obx.escribirSeri(f);
        obx.lerSerializable(f);
        obx.engadirSeri(f);
        obx.lerSerializable(f);

    }
}
