import javax.swing.*;

public class Conta {
    private long numeroConta;
    private double saldo;
    private Cliente cliente;

    //constructor

    public Conta(){
    };
    public Conta(Cliente cli, long nc,double s){
        cliente=cli;
        numeroConta=nc;
        saldo=s;
    }

    public void setSaldo(double s){
        saldo=s;
    }

    public void setCliente(Cliente c){
        cliente=c;
    }

    public void setNumeroConta(long n){
        numeroConta=n;
    }
    public long getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public double ingresar(){
        int pregunta=JOptionPane.showConfirmDialog(null,"Quieres ingresar saldo?");
            if (pregunta==0) {
                double ing=Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a ingresar:"));
                saldo = saldo + ing;
            }
            return saldo;
    }

    public double retirar(){
        int pregunta=JOptionPane.showConfirmDialog(null,"Quieres retirar saldo?");
        if (pregunta==0) {
            double ret=Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a retirar:"));
            saldo = saldo - ret;
        }
        return saldo;
    }

    public void actualizarSaldo(){
        JOptionPane.showMessageDialog(null,"Su saldo actual es: "+
        saldo+" €");
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta:" + numeroConta +
                ", saldo:" + saldo +
                ", cliente: " + cliente.toString() +
                '}';
    }
}
