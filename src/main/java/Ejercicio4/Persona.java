/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author pamel
 */
class Persona implements Humano {
    private String nombre;
    private String apellidos;
    private String nif;
    private Direccion direccion;

    public Persona(String nombre, String apellidos, String nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.direccion = new Direccion();
    }

 
    public void indentificate() {
        System.out.println("Soy una persona.");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", NIF: " + nif + ", Dirección: " + direccion;
    }

    @Override
    public void identificate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
