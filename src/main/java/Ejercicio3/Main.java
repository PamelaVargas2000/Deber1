/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author pamel
 */
public class Main {
    public static void main(String[] args) {
        Persona cliente1 = new Persona("Pamela", "Vargas", "12345678S");
        CuentaCorriente cuenta1 = new CuentaCorriente(cliente1, 1);
        cuenta1.ingresar(5000);
        cuenta1.actualizarSaldo();
        System.out.println(cuenta1.getSaldo());
        
        Persona cliente2 = new Persona("María", "Pérez", "23456789B");
        CuentaAhorro cuenta2 = new CuentaAhorro(cliente2, 2, 2.5, 600);
        cuenta2.ingresar(2050);
        cuenta2.actualizarSaldo();
        System.out.println(cuenta2.getSaldo());
        cuenta2.retirar(3500);
        System.out.println(cuenta2.getSaldo());
    }
}