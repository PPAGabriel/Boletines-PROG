public class CuentaAhorro extends Conta{

    private double interesAnual;
    private double SALDOMIN=1000;

    public CuentaAhorro(){}
    public CuentaAhorro (Cliente cli, long nc,double sald,double intAn){
        super(cli,nc,sald);
        interesAnual=intAn;

        if (sald>=SALDOMIN){
            super.setSaldo(sald + sald*interesAnual*1/100);
        }
    }
}
