/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presentacion;

import datos.ListaEmpleados;
import entidades.EContratado;
import entidades.EDestajo;
import java.io.File;
import java.util.GregorianCalendar;

/**
 *
 * @author dam1
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f1=new File("contratados.txt");
        File f2=new File("destajo.txt");
        
        GregorianCalendar data =new GregorianCalendar();
        
       /* UI obx = new UI();
        obx.setVisible(true);*/
       
       ListaEmpleados obxLista= new ListaEmpleados();
       
       EContratado e1 = new EContratado("01845304Z","Priscilla","Sarmiento",data,1000,20);
       EDestajo d1=new EDestajo("Y9245677R","Gabriel","Perez",data,12);
      
       obxLista.escribirContratado(f1, e1);
       obxLista.escribirDestajo(f2, d1);
    }
    
}
