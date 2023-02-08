/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_24;

import com.gabriel.datos.PedirDatos;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Boletin_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Libro> listLib = new ArrayList<>();
        Metodos obx = new Metodos();
        int opcion = 0;
        do {
            try {
                opcion = PedirDatos.pedirInt("\"***MENU***:\n1--> "
                        + "Añadir libro\n2--> Mostrar libros\n3--> Consultar libro determinado\n4--> Ordenar libros (por titulo)\n5--> Dar de baja un libro\n6-->Comprar un libro");
                switch (opcion) {
                    case 1:
                        obx.añadir(listLib);
                        break;
                    case 2:
                        obx.mostrar(listLib);
                        break;
                    case 3:
                        obx.consultar(listLib, "Introduzca el libro a consultar:");
                        break;
                    case 4:
                        obx.ordenar(listLib);
                        break;
                    case 5:
                        obx.darBaja(listLib, "Introduzca el libro a dar de baja");
                        break;
                    case 6:
                        obx.vender(listLib, "Introduzca el libro que quiere comprar");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } while (opcion >0 && opcion<7);
    }
}
