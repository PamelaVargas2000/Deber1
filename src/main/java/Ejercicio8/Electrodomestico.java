
package EJERCICIO8;

public class Electrodomestico {
      private double consumo;
      private String modelo;
  public Electrodomestico (double c, String m) {
       consumo = c;
       modelo = m;
    }
  
   public String toString () {
      return "Modelo: " + modelo + " Consumo: " + consumo ;
   }
}
