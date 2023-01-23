/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplostring;

import java.util.Arrays;

/**
 *
 * @author dam1
 */
public class ExemploString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome="Nabuconodosor";
        char Caracteres[]=nome.toCharArray();
        
        System.out.println("1) Nro. de letras: "+nome.length());
        System.out.println("2) A mayúsculas: "+nome.toUpperCase());
        System.out.println("3) A minúsculas: "+nome.toLowerCase());
        System.out.println("4) Comparar con 'nabuconodosor': "+nome.compareTo("Nabuconodosor"));
        System.out.println("5) Comparar con 'NaBucoNodosor': "+nome.compareToIgnoreCase("NaBucoNodosor"));
        System.out.println("6) Pasar el nombre a un array tipo char: "+Arrays.toString(Caracteres));
        System.out.println("7) Cortar el String: "+nome.substring(0,4));
        
    }
    
}
