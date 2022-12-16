import javax.swing.*;

public class NotaFinal {
    public void calcularNotaFinal(){
        int flag;
        do {
            float n1 = calcularNotaPE();
            float n2 = calcularNotaPP();
            float n3 = calcularNotaB();

            JOptionPane.showMessageDialog(null,"PRUEBAS TEÓRICAS: "+n1+"\n"+
                    "PRUEBA PRÁCTICA: "+n2+"\n"+
                    "BOLETINES: "+n3+"\n"+
                    "NOTA TOTAL: "+(n1+n2+n3));

            flag=JOptionPane.showConfirmDialog(null,"¿Deseas calcular otra nota?");
        }while(flag==0);


    }

    //prueba escrita
    public float calcularNotaPE(){
        float n1,n2;
        do {
            n1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de la 1ra evaluación escrita (1 min - 10 max):"));
        }while (n1<0 || n1>10);

        do {
            n2 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de la 2da evaluación escrita (1 min - 10 max):"));
        }while (n2<0 || n2>10);

        float mediape= (float) ((n1+n2)/2*0.4);

        return mediape;
    }

    //prueba práctica
    public float calcularNotaPP(){
        float n;
        do {
            n = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la nota de la evaluación práctica (1 min - 10 max):"));
        }while (n<0 || n>10);

        float mediapp= (float) (n*0.4);

        return mediapp;
    }

    public float calcularNotaB(){
        float bmax,bhechos,n;

        bmax= Integer.parseInt(JOptionPane.showInputDialog("Introduzca el nro de boletines máximo:"));
        bhechos=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos boletines fueron entregados?:"));

        if (bhechos/bmax*100>90){
            n=2;
        }else if (bhechos/bmax*100>=70 && bhechos/bmax*100<=90){
            n=1;
        }else{
            n=0;
        }

        return n;
    }
}
