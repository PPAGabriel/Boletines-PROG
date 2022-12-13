import javax.swing.*;

public class Ejercicio5 {

public void sueldos(){
    double  c1=0,c2=0,c3=0,n=1;
    double valorSueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo del trabajador del trabajador "+(n)+":"+"\n"+
            "(pulse 0 para cancelar)"));

        while (valorSueldo>0){
            n++;
            if (valorSueldo>=1000 && valorSueldo<=1750){
                c1++;
            }else if(valorSueldo<1000){
                c2++;
            }else{
                c3++;
            };

            valorSueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el sueldo del trabajador del trabajador "+n+":"+"\n"+
                    "(pulse 0 para cancelar)"));
        }

        double porc=c2/(c1+c2+c3)*100;
        JOptionPane.showMessageDialog(null,"Cantidad de trabajadores que ganan entre 1000€ y 1750€: "+c1);
        JOptionPane.showMessageDialog(null,"Porcentaje de trabajadores que ganan menos de 1000€: "+porc+"%");

}
}
