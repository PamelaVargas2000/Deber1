/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author pamel
 */
class Circulo extends Jerarquia {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double area() {
        return Math.PI * radio * radio;
    }
}