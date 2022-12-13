import javax.swing.*;

public class Ejercicio1 {

    public void clasificarNumeros(){
        double num;
        int c1,c2,c3;
        c1=c2=c3=0;
        for (int i=0; i<10; i++){
            num=Double.parseDouble(JOptionPane.showInputDialog("Introduzca un número"));

            if (num>0){
                c1++;

            } else if (num==0) {
                c2++;
            }else{
                c3++;
            }
        }

        JOptionPane.showMessageDialog(null,"Números positivos: "+c1+"\n"+
                                                                 "Números iguales a 0: "+c2+"\n"+
                                                                    "Números negativos: "+c3+"\n");
    }
}
