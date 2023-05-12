/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author pamel
 */
public class Estudiante extends Persona {
    private int id;

    public Estudiante(String juan, String gómez, String string) {
        super("", "", "");
        this.id = 0;
    }

    public Estudiante(String nombre, String apellidos, String nif, int id) {
        super(nombre, apellidos, nif);
        this.id = id;
    }

    // Métodos accedentes y mutadores
    // ...

    @Override
    public void indentificate() {
        System.out.println("Soy un estudiante.");
    }

    @Override
    public String toString() {
        return super.toString() + ", ID: " + id;
    }
}
