/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author pamel
 */
class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public double area() {
        return base * altura / 2;
    }
}
    
