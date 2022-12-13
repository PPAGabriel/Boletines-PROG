import javax.swing.*;

public class Ejercicio1y2 {

    public int introducirRespuesta() {
        int resp = 0;
        do {
            resp = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número del 1 al 50:"));

        } while (resp < 1 || resp > 50);
        return resp;
    }

    public int introducirIntentos() {
        int intentos = 0;
        do {
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos:"));
        } while (intentos <= 0);
        return intentos;
    }

    public void jugarMultijugador() {
        int resp = introducirRespuesta();
        int intentos = introducirIntentos();
        int c1 = 1;
        int adivinanza = 0;

        do {
            adivinanza = Integer.parseInt(JOptionPane.showInputDialog("Jugador 2: ¿Cuál es el número?"));

            if (adivinanza > resp) {
                JOptionPane.showMessageDialog(null, "Incorrecto, el valor es menor.");
            } else if (adivinanza < resp) {
                JOptionPane.showMessageDialog(null, "Incorrecto, el valor es mayor.");
            } else {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado :)");
            }
            c1++;
        } while (c1 <= intentos && adivinanza != resp);

        if (c1 > intentos && adivinanza != resp) {
            JOptionPane.showMessageDialog(null, "GAME OVER: Mejor suerte la próxima :(");
        }

    }
    public void juegoAdivinanzaMultijugador() {
        jugarMultijugador();
        int n = 0;
        n = JOptionPane.showConfirmDialog(null, "¡Quieres seguir jugando?");

        while (n == 0) {
            jugarMultijugador();
            n = JOptionPane.showConfirmDialog(null, "¡Quieres seguir jugando?");
        }
        JOptionPane.showMessageDialog(null, "¡Hasta la próxima! :)");
    }

    public void jugarCPU(){
        int resp = (int)(Math.random()*50+1);
        // System.out.println(resp);
        int intentos = introducirIntentos();
        int c1 = 1;
        int adivinanza = 0;
        int distancia= 0;

        do {
            adivinanza = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el número?"));
            distancia=adivinanza-resp;

            if (Math.abs(distancia)>20) {
                JOptionPane.showMessageDialog(null, "Incorrecto, muy lejos.");
            } else if (Math.abs(distancia)>=10 && Math.abs(distancia)<=20) {
                JOptionPane.showMessageDialog(null, "Incorrecto, lejos.");
            } else if(Math.abs(distancia)>5 && Math.abs(distancia)<10){
                JOptionPane.showMessageDialog(null, "Incorrecto, pero estas cerca");
            }else if(Math.abs(distancia)<=5 && adivinanza!=resp) {
                JOptionPane.showMessageDialog(null, "Estás muy cerca...");
            }else if(adivinanza==resp){
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has ganado :)");
            }
            c1++;
        } while (c1 <= intentos && adivinanza != resp);

        if (c1 > intentos && adivinanza != resp) {
            JOptionPane.showMessageDialog(null, "GAME OVER: Mejor suerte la próxima :(");
        }
    }
    public void JuegoAdivinanzaCPU() {
        jugarCPU();
        int n = 0;
        n = JOptionPane.showConfirmDialog(null, "¡Quieres seguir jugando?");

        while (n == 0) {
            jugarCPU();
            n = JOptionPane.showConfirmDialog(null, "¡Quieres seguir jugando?");
        }
        JOptionPane.showMessageDialog(null, "¡Hasta la próxima! :)");
    }
}
