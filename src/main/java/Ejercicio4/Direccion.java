/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author pamel
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String codigoPostal;
    private String pais;

    public Direccion() {
        this.calle = "";
        this.ciudad = "";
        this.codigoPostal = "";
        this.pais = "";
    }

    public Direccion(String calle, String ciudad, String codigoPostal, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Calle: " + calle + ", Ciudad: " + ciudad + ", CP: " + codigoPostal + ", País: " + pais;
    }
}
    
