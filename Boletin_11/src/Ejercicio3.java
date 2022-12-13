import javax.swing.*;

public class Ejercicio3 {

    public void areaRectangulo(){

        double base, altura;
        do {
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base (debe ser positiva):"));
        }while(base<=0);

        do {
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura (debe ser positiva):"));
        }while(altura<=0);


        JOptionPane.showMessageDialog(null,"El área es: "+(base*altura));
    }
}
