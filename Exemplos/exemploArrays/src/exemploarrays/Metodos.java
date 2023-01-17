/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarrays;

import com.gabriel.datos.PedirDatos;
/**
 *
 * @author dam1
 */
public class Metodos {
    public float[] crearArrayFloat(){
    float [] temperaturas=new float[5];
    for(int i=0;i<temperaturas.length;i++){
    /*previamente tenemos que importar nuestra libreria en el repo Libraries clean and build (nosaLibreria proyecto); click derecgo Libraries
    (nuestro proyecto); add JAR; dist; y añadimos el .jar*/
    temperaturas[i]=PedirDatos.pedirFLoat("temperatura: ");
    }
    return temperaturas;
    }
    

public void amosarArray(float [] temperaturas){
    for(int i=0;i<temperaturas.length;i++){
     System.out.println("Temperatura (posicion "+i+"): "+temperaturas[i]);
        }
    
    }

public void amosarPosicion(float [] temperaturas, int posicion){
    System.out.println("Temperatura (posicion de usuario "+posicion+"): "+temperaturas[posicion-1]);
    }

public void amosarArrayForEach(float [] temperaturas){
    for(Float elemento:temperaturas){
        System.out.println("***"+elemento);
    }   
}

}

