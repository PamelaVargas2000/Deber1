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
public class Main {
  public static void main(String[] args) {
        Vector<Jerarquia> Jerarquia = new Vector<Jerarquia>();
        Jerarquia.add(new Circulo(10)); 
        Jerarquia.add(new Cuadrado(10)); 
        Jerarquia.add(new Triangulo(10,5)); 
        for (Jerarquia f: Jerarquia)
            System.out.println("Área: "+f.area());
    }  
}
