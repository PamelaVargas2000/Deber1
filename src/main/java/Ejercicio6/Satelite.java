
package EJERCICIO6;


public class Satelite extends CuerpoCeleste {
    private double periodoOrbita;
    private double distanciaPlaneta;
    
    public Satelite(double masa, double diametroMedio, double periodoOrbita, double distanciaPlaneta) {
        super(masa, diametroMedio);
        this.periodoOrbita = periodoOrbita;
        this.distanciaPlaneta = distanciaPlaneta;
    }
    
    public double periodoRotacion() {
           return 0;
     
    }
    
    public double periodoTraslacion() {
        return 0;
       
    }
    
    public String toString() {
        return super.toString() + ", Periodo de órbita: " + periodoOrbita + ", Distancia al planeta: " + distanciaPlaneta;
    }
    
    public void imprimirInformacion(CuerpoCeleste cuerpoCeleste) {
    System.out.println(cuerpoCeleste.toString());
}
}
