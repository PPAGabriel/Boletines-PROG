/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_4;

/**
 *
 * @author dam1
 */
public class Boletin_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Libro obxLibro1= new Libro("100 años de Soledad","Gabriel García Marquez",1967,(short)496);
        
        String tituloL= obxLibro1.getTitulo();
        String autorL=obxLibro1.getAutor();
        int añoL=obxLibro1.getAno();
        short numPag=obxLibro1.getNumPaginas();
        obxLibro1.setValoracion(9.1f);
        float valoracion= obxLibro1.getValoracion();
        
        obxLibro1.amosar(tituloL, autorL, añoL, numPag, valoracion);
    }
}
