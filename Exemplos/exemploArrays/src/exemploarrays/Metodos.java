/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploarrays;

import com.gabriel.datos.PedirDatos;
import java.util.Arrays;
import javax.swing.JOptionPane;
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

public void buscarElemento(float [] temperaturas){
    int b1=0, pt=0;
    float elemento=PedirDatos.pedirFLoat("Qué temperatura desea buscar?:");
    for(int i=0;i<temperaturas.length;i++){
        if (elemento==temperaturas[i]){
            pt=i;
            JOptionPane.showMessageDialog(null,"Está en el array (posición "+(pt+1)+")");
            b1=1;
        }
    }
    if (b1==0){
        JOptionPane.showMessageDialog(null,"No está en el array");
    }
}

public void ordenarArray(float [] temperaturas){/*
    float aux;
    for(int i=0;i<(temperaturas.length -1);i++){
        for(int j=i+1;j<temperaturas.length;j++){
            if(temperaturas[i]>temperaturas[j]){
                aux=temperaturas[i];
                temperaturas[i]=temperaturas[j];
                temperaturas[j]=aux;
            }
        }
    }
    JOptionPane.showMessageDialog(null, "Temperaturas Ordenadas"); */
    Arrays.sort(temperaturas);
    Arrays.binarySearch(temperaturas, 0);
}

}
