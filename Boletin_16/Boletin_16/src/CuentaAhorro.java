public class CuentaAhorro extends Conta{

    private double interesAnual;
    private double saldoMin=1000;

    public CuentaAhorro(){}
    public CuentaAhorro (Cliente cli, long nc,double sald,double intAn){
        super(cli,nc,sald);
        interesAnual=intAn;

        if (sald>=saldoMin){
            super.setSaldo(sald + sald*interesAnual*1/100);
        }
    }
}
