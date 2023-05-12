
package Ejercicios5;


public class Luz {
    private boolean encendida;

    public void encender() {
        encendida = true;
        System.out.println("Luz encendida");
    }

    public void apagar() {
        encendida = false;
        System.out.println("Luz apagada");
    }

    public boolean estaEncendida() {
        return encendida;
    }
}
