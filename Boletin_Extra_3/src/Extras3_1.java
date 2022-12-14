import javax.swing.*;

public class Extras3_1 {

    public void cuotaPaddel(){
        double cuota=800;
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
        int socio=JOptionPane.showConfirmDialog(null,"Tu pais es socio?");

        if (edad>65){
            cuota=cuota*0.6;
            JOptionPane.showMessageDialog(null,"Su cuota es de: "+cuota+ "€");
        }else if (edad<21){
            cuota=cuota*0.75;
            JOptionPane.showMessageDialog(null,"Su cuota es de: "+cuota+ "€");
        }else if (socio==0){
            cuota=cuota*0.55;
            JOptionPane.showMessageDialog(null,"Su cuota es de: "+cuota+ "€");
        }else{
            JOptionPane.showMessageDialog(null,"Su cuota es de: "+cuota+ "€");}
    }

    //Fecha Valida:
        public boolean esFechaValida(int day, int month, int year) {
        boolean validData=true;
        int diaMes;

        if (year>=1600 && year<=3000){

            if (month>=1 && month<=12){
                switch (month){
                    case 1,3,5,7,8,10,12: diaMes=31;
                        break;
                    case 4,6,9,11: diaMes=30;
                        break;
                    case 2: if (year%4==0 || year%400==0){
                        diaMes=29;
                              } else {
                        diaMes=28;
                                 }
                        break;
                    default:
                        diaMes=0;
                             }
                            if (day>0 && day<=diaMes){
                              validData=true;
                            }else{
                              validData=false;
                             }
            }else{
                validData=false;
            }

        }else{
            validData=false;
        }

        return validData;
    }

}
