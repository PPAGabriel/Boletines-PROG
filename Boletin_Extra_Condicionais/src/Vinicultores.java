import javax.swing.*;

public class Vinicultores {

    public void calcularPrecio(){
        double pi= Double.parseDouble(JOptionPane.showInputDialog("Indique el precio inicial (en €):"));
        double kiloUva= Double.parseDouble(JOptionPane.showInputDialog("Indique la cantidad de uvas (en kg):"));
        String tipoUva=JOptionPane.showInputDialog("Indique el tipo de uva (A ó B):");
        int sizeUva=Integer.parseInt(JOptionPane.showInputDialog("Indique el tamaño de las uvas (1 ó 2):"));

        if (tipoUva.equals("A")){
            if (sizeUva==1){
                JOptionPane.showMessageDialog(null,"Usted recibirá: "+(kiloUva*(pi+0.20))+" €");
            }else if (sizeUva==2){
                JOptionPane.showMessageDialog(null,"Usted recibirá: "+(kiloUva*(pi+0.30))+" €");
            }else{JOptionPane.showMessageDialog(null,"ERROR: Comando desconocido");}
        }
        else if (tipoUva.equals("B")){
            if (sizeUva==1){
                JOptionPane.showMessageDialog(null,"Usted recibirá: "+(kiloUva*(pi-0.30))+" €");
            }else if (sizeUva==2){
                JOptionPane.showMessageDialog(null,"Usted recibirá: "+(kiloUva*(pi-0.50))+" €");
            }else{JOptionPane.showMessageDialog(null,"ERROR: Comando desconocido");}
        }
        else{JOptionPane.showMessageDialog(null,"ERROR: Comando desconocido");}
    }

}
