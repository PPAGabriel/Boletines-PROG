import javax.swing.*;

public class Ejercicio2 {

    public void sumarNumeros(){
        int n=10, suma=0;
        do{
           suma=suma+n ;
           n++;
        }while (n<=90);

        JOptionPane.showMessageDialog(null,"La suma es: "+suma);

    }
    public void multiplicarNumeros(){
        int n=10;
        double producto=1;
        do{
            producto=producto*n;
            n++;
        }while (n<=90);

        JOptionPane.showMessageDialog(null,"La multiplicacion es: "+producto);

    }
}
