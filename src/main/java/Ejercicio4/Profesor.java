/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author pamel
 */
public class Profesor extends Persona {
    private String despacho;

    public Profesor() {
        super("", "", "");
        this.despacho = "";
    }

    public Profesor(String nombre, String apellidos, String nif, String despacho) {
        super(nombre, apellidos, nif);
        this.despacho = despacho;
    }

    // Métodos accedentes y mutadores
    // ...

    @Override
    public void indentificate() {
        System.out.println("Soy un profesor.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Despacho: " + despacho;
    }
}
