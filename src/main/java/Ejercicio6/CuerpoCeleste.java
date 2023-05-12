
package EJERCICIO6;

abstract class CuerpoCeleste {
    private double masa;
    private double diametro;

    public CuerpoCeleste(double masa, double diametro) {
        this.masa = masa;
        this.diametro = diametro;
    }

    public abstract double periodoRotacion();
    public abstract double periodoTraslacion();

    public String toString() {
        return "Masa: " + masa + " kg, Diametro medio: " + diametro + " km";
    }
}
