/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author pamel
 */
public class C {

void p (C c) { System.out.println("CC "); }
void p (D d) { System.out.println("CD "); }
}
class D extends C {
void p (C c) { System.out.println("DD"); };
}

