public class Main {
    public static void main(String[] args) {
    Cliente cli1 = new Cliente("01122334G","Gabriel","Pérez");

    CuentaCorriente c1c= new CuentaCorriente(cli1,1234567,1000);
    CuentaAhorro c1a= new CuentaAhorro(cli1,9876542,10000,1.5);

        System.out.println(c1c.toString());
        c1c.actualizarSaldo();
        c1c.ingresar();
        c1c.retirar();
        c1c.actualizarSaldo();
        System.out.println(c1a.toString());





    }
}