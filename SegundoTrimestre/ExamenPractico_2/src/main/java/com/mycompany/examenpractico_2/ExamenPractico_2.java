/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpractico_2;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class ExamenPractico_2 {

    public static void main(String[] args) {
        File f=new File("ficheiroAlumnos.txt");
        ArrayList<Alumno>aux=new ArrayList();
        
        Operaciones obx=new Operaciones();
        
        obx.añadirAlumnos(aux);

        obx.crearFichero(f, aux);
    }
}
