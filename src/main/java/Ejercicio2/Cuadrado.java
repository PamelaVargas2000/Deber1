/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author pamel
 */

    class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    public double area() {
        return lado * lado;
    
}
    }
