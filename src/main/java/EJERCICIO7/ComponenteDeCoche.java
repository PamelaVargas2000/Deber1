
package EJERCICIO7;


public class ComponenteDeCoche {
    private String descripcion;
    private double peso;
    private double coste;
    
    public ComponenteDeCoche(String descripcion, double peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }
    
    public void mostrarInformacion() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Coste: " + coste + " €");
    }
}
