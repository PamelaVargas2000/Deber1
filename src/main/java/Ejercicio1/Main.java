/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author pamel
 */
public class Main {
 
public static void main(String[] args){
C obj = new D();
obj.p(obj);
((D)obj).p(obj);
obj.p((D) obj);
}
}
