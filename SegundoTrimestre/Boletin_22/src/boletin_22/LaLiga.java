/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_22;

import com.gabriel.datos.PedirDatos;
import java.util.Random;

/**
 *
 * @author dam1
 */
public class LaLiga {
    
    int jornadas=36;
    int clubes=20;
    String[] equipos={"      FC Barcelona","       Real Madrid","     Real Sociedad","Atletico de Madrid","      Villareal CF",
        "        Real Betis","        CA Osasuna","   Athletic Bilbao","    Rayo Vallecano","      RCD Mallorca","        UD Almería","         Girona FC",
        "        Sevilla FC","       Valencia CF","      RCD Espanyol","          RC Celta","   Real Valladolid","          Cadiz CF",
        "         Getafe CF","          Elche CF"};
    
    public int[][] crearTabla(){
        
        Random num=new Random();
        
        int [][] matriz=new int[clubes][jornadas];
    
    
        for(int i=0;i<clubes;i++){
            for(int j=0;j<jornadas;j++){
              matriz[i][j]=num.nextInt(8);
            }
        }
    return matriz;
    }
    
    public void verTabla(int [][]matriz){
        System.out.print("    Equipo/Xornada| ");
        for(int k=0;k<jornadas;k++){
            System.out.print("X"+(k+1)+"  ");
        }
        System.out.println("");
        
        
        for (int i=0;i<clubes;i++){
             System.out.print(equipos[i]+"| ");
            for (int j=0;j<jornadas;j++){
                if (j>8)
                System.out.print("  "+matriz[i][j]+"  ");
                else
                    System.out.print(matriz[i][j]+"   ");
            }
            System.out.println("");
        }
    
    }
    
    public void ordenarTabla(int[][]matriz,String[] equipo){
        int auxGoles=0;
        String auxEquipo;
        int auxAcumGoles=0;
        int acumGoles=0;
        int golesEquipo[]=new int[clubes];
        
        for(int i=0;i<clubes;i++){
            for(int j=0;j<jornadas;j++){
                acumGoles+=matriz[i][j];
            }
           golesEquipo[i]=acumGoles;
        }
        
        for(int i=0;i<clubes-1;i++){
            for(int j=i+1;i<golesEquipo.length;j++){
                if(golesEquipo[i]>golesEquipo[j]){
                    auxAcumGoles=golesEquipo[i];
                    golesEquipo[i]=golesEquipo[j];
                    golesEquipo[j]=auxAcumGoles;
                    auxEquipo=equipo[i];
                    equipo[i]=equipo[j];
                    equipo[j]=auxEquipo;
                    
                }
            }
        }
    
        
    }
    
    
    
}
