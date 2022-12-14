import javax.swing.*;

public class Conta {

    private String nomeCliente;
    private String numConta;
    private double tipoInteres;
    private double saldo;

    public Conta(){}
    public Conta(String cli,String nc,double ti,double s){
        nomeCliente=cli;
        numConta=nc;
        tipoInteres=ti;
        saldo=s;
    }

    //Setters y Getters
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public String getNumConta() {
        return numConta;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }
    public double getSaldo() {
        return saldo;
    }

    //Metodos

    public void ingreso(double ing){
        saldo+=Math.abs(ing);
    }

    public void reintegro(double rein){
        saldo-=Math.abs(rein);
    }

    public void transferencia(Conta cnt,double imp){
        cnt.ingreso(imp);
        saldo-=Math.abs(imp);
    }
}
