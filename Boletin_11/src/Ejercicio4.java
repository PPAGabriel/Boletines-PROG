import javax.swing.*;

public class Ejercicio4 {

    public void tablaDeMultiplicar(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de la tabla que desea:"));;

        while(num>0){
            JOptionPane.showMessageDialog(null,num+" x 1: "+num+"\n"+
                    num+" x 2: "+(num*2)+"\n"+
                    num+" x 3: "+(num*3)+"\n"+
                    num+" x 4: "+(num*4)+"\n"+
                    num+" x 5: "+(num*5)+"\n"+
                    num+" x 6: "+(num*6)+"\n"+
                    num+" x 7: "+(num*7)+"\n"+
                    num+" x 8: "+(num*8)+"\n"+
                    num+" x 9: "+(num*9)+"\n"+
                    num+" x 10: "+(num*10)+"\n");
            num = Integer.parseInt(JOptionPane.showInputDialog("introduzca el número de la tabla que desea:"));
        }

        JOptionPane.showMessageDialog(null,"Lo sentimos, pero esa tabla no existe :(");

    }
}
