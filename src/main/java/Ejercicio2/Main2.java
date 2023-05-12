/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Vector;

/**
 *
 * @author pamel
 */
public class Main2 {
  public static void main(String[] args) {
        Vector<Figura> Figuras = new Vector<Figura>();
        Figuras.add(new Circulo(10)); 
        Figuras.add(new Cuadrado(10)); 
        Figuras.add(new Triangulo(10,5)); 
        for (Figura f: Figuras)
            System.out.println("Área: "+f.area());
    }  
}
