
package EJERCICIO6;


public class Planeta extends CuerpoCeleste {
    private double distanciaMedia;
    private double excentricidad;
    
    public Planeta(double masa, double diametroMedio, double distanciaMedia, double excentricidad) {
        super(masa, diametroMedio);
        this.distanciaMedia = distanciaMedia;
        this.excentricidad = excentricidad;
    }
    
    public double periodoRotacion() {
        return 0;
      
    }
    
    public double periodoTraslacion() {
        
        return 0;
        
    }
    
    public String toString() {
        return super.toString() + ", Distancia media: " + distanciaMedia + ", Excentricidad: " + excentricidad;
    }
}
