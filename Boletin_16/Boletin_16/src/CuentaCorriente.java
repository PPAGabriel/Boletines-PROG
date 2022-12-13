public class CuentaCorriente extends Conta {

    public CuentaCorriente(){}

    public CuentaCorriente(Cliente cli, long nc,double sald){
        super(cli,nc,sald*0.985);
    }
    }
