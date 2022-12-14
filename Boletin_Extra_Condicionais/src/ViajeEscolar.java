import javax.swing.*;

public class ViajeEscolar {
    public void cotizarViaje(int cantAlum){
        double costo;
        if (cantAlum>=100){
            costo=cantAlum*65;
            JOptionPane.showMessageDialog(null,"Precio del viaje: "+costo+" €.");
            JOptionPane.showMessageDialog(null,"Cada alumno debe pagar 65 €.");
        }else if (cantAlum>=50 && cantAlum<100){
            costo=cantAlum*70;
            JOptionPane.showMessageDialog(null,"Precio del viaje: "+costo+" €.");
            JOptionPane.showMessageDialog(null,"Cada alumno debe pagar 70 €.");
        }else if (cantAlum>=30 && cantAlum<50){
            costo=cantAlum*95;
            JOptionPane.showMessageDialog(null,"Precio del viaje: "+costo+" €.");
            JOptionPane.showMessageDialog(null,"Cada alumno debe pagar 95 €.");
        }else{
            costo=4000;
            JOptionPane.showMessageDialog(null,"Precio del viaje: "+costo+" €.");
            JOptionPane.showMessageDialog(null,"Cada alumno debe pagar "+costo/cantAlum+" €.");
        }
    }

}
