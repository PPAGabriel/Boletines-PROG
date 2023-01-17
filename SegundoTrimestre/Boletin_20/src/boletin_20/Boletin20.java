/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_20;

/**
 *
 * @author dam1
 */
public class Boletin20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato animal1=new Gato();
        
        animal1.camiñar();
        animal1.nadar();
        
        Avestruz animal2=new Avestruz();
        animal2.voar();
        animal2.camiñar();
        
        Papagaio animal3=new Papagaio();
        animal3.voar();
        animal3.camiñar();
        
        Morcego animal4=new Morcego();
        animal4.voar();
        animal4.camiñar();
        
        Tigre animal5=new Tigre();
        animal5.camiñar();
        animal5.nadar();
    }
    
}
