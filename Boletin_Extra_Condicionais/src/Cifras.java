import javax.swing.*;

public class Cifras {

    public void ObtenerCifras(){
        int cifra=Integer.parseInt(JOptionPane.showInputDialog("Indique un número:"));

        if (cifra>=0 && cifra<10){
            JOptionPane.showMessageDialog(null,"El número tiene 1 cifra");
        }else if(cifra>=10 && cifra<100){
            JOptionPane.showMessageDialog(null,"El número tiene 2 cifras");
        }else if (cifra>=100 && cifra<1000){
            JOptionPane.showMessageDialog(null,"El número tiene 3 cifras");
        }else if (cifra>=1000 && cifra<10000){
            JOptionPane.showMessageDialog(null,"El número tiene 4 cifras");
        }else if (cifra>=10000 && cifra<100000){
            JOptionPane.showMessageDialog(null,"El número tiene 5 cifras");
        }else{
            JOptionPane.showMessageDialog(null,"Lo siento, el valor supera el límite");
        }
    }
}
