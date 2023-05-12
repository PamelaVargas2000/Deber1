/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author pamel
 */
public class CuentaAhorro extends Cuenta {
    private double interesVariable;
    private double saldoMinimo;
    
    public CuentaAhorro(Persona cliente, long numerocuenta, double interesVariable, double saldoMinimo) {
        super(cliente, numerocuenta);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }
    
    public String toString() {
        return "Cuenta de ahorro con número " + numerocuenta;
    }
    
    public void actualizarSaldo() {
        saldo += saldo * (interesVariable / 100);
    }
    
    public void cambiarInteres(double nuevoInteres) {
        interesVariable = nuevoInteres;
    }
    
    public void retirar(double cantidad) {
        if (saldo - cantidad >= saldoMinimo) {
            saldo -= cantidad;
        }
    }
}