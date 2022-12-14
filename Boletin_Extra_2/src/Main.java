public class Main {
    public static void main(String[] args) {
        Conta cuenta1=new Conta("Gabriel Pérez","ES8173647423",1.5,10000);
        Conta cuenta2=new Conta("Priscilla Sarmiento","ES93846568",1.5,20000);

        cuenta1.ingreso(5000);
        cuenta1.reintegro(3000);
        cuenta2.transferencia(cuenta1,1000);

        System.out.println("Cuenta1: " + cuenta1.getSaldo() + "\n" +
                "Cuenta2: " + cuenta2.getSaldo());
    }
}