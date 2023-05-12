
package EJERCICIO8;

public class Frigorifico extends Electrodomestico implements MuestraInformacion {
    
    private double temperatura;

    public Frigorifico(double c, String m, double t) {
    super(c, m);
     temperatura = t;
    }

    @Override
    public String toString() {
      return super.toString() + " Temperatura: " + temperatura;
    }

    @Override
    public String muestra() {
      return "La temperatura actual del frigorífico es " + temperatura + " grados.";
    }
}