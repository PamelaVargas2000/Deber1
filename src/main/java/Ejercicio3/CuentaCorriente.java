/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author pamel
 */
public class CuentaCorriente extends Cuenta {
    private static final double INTERES_FIJO = 1.5;
    
    public CuentaCorriente(Persona cliente, long numerocuenta) {
        super(cliente, numerocuenta);
    }
    
    public String toString() {
        return "Cuenta corriente con número " + numerocuenta;
    }
    
    public void actualizarSaldo() {
        saldo *= (1 + INTERES_FIJO / 100);
    }
    
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        }
    }
}