/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_22;

import com.gabriel.datos.PedirDatos;
import java.util.Random;
import javax.swing.JOptionPane;

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
        String auxEquipo;
        int auxGoles=0;
        int auxAcumGoles=0;
        int acumGoles=0;
        int golesEquipo[]=new int[clubes];
        
        for(int i=0;i<clubes;i++){
            for(int j=0;j<jornadas;j++){
                acumGoles+=matriz[i][j];
            }
           golesEquipo[i]=acumGoles;
            System.out.println(equipo[i]+": "+golesEquipo[i]);
            acumGoles=0;
        }
        System.out.println("************* TABLA ORDENADA **********************");
        
        for(int i=0;i<clubes-1;i++){
            for(int j=i+1;j<clubes;j++){
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
    
    public void goleadorJornada(int[][] matriz,String equipo[]) {
    int jor =PedirDatos.pedirInt("Indique la jornada a consultar:");
    int golesEquipoPJ[]=new int[clubes];
    int maximoGolesPJ=0;

        for(int i=0;i<clubes;i++){
            golesEquipoPJ[i]=matriz[i][jor-1];
        }


        for (int i=0;i<clubes-1;i++){
                if(golesEquipoPJ[i]>maximoGolesPJ){
                    maximoGolesPJ=golesEquipoPJ[i];
                         }
                 }

        System.out.println("Clubes Goleadores (jornada "+jor+"):");
        for(int i=0;i<clubes;i++){
                if(golesEquipoPJ[i]==maximoGolesPJ){
                    System.out.println(equipo[i]+": "+maximoGolesPJ+" goles.");
                }
            }
    }

    public void goatEquipo(int[][] matriz,String equipo[]){
    int maxGoles=0;
        for(int i=0;i<clubes;i++){
            for(int j=0;j<jornadas;j++){
                if(matriz[i][j]>maxGoles){
                    maxGoles=matriz[i][j];
                         }
                    }
                }

        System.out.println("La cantidad máxima de goles registrada en la temporada fue de: "+maxGoles+"\n"+
                "Registro logrado por:");

        for (int i=0;i<clubes;i++){
            for (int j=0;j<jornadas;j++){
                if(matriz[i][j]==maxGoles){
                    System.out.println(equipos[i]+", Jornada: "+(j+1));
                        }
                    }
                }
            }

    public void consultar(int[][]matriz,String equipo[]){
    int posf=0,posc=0;
    boolean validacion=false;

    do{
        String equipoConsultado=PedirDatos.pedirString("Indique el equipo a consultar:");
        for(int i=0;i<clubes;i++){
            if (equipoConsultado.compareToIgnoreCase(equipos[i])==0){
                validacion=true;
                posf=i;
            }
        }
        if (validacion==false){JOptionPane.showMessageDialog(null,"Equipo no encontrado");}
    }while(validacion==false);


    int jornadaConsultada=PedirDatos.pedirInt("Indique la jornada a consultar");
    while(jornadaConsultada>jornadas || jornadaConsultada<=0){
            jornadaConsultada=Integer.parseInt(JOptionPane.showInputDialog("Lo siento esta jornada no existe. Indique una correcta:"));
        }

        System.out.println("Datos encontrados para: "+equipos[posf]+", "+"jornada: "+jornadaConsultada+"\n"+
                matriz[posf][jornadaConsultada-1]+" goles");
    }
    
    
    
}
