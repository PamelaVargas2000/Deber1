/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author pamel
 */
public abstract class Cuenta {
    protected long numerocuenta;
    protected double saldo;
    protected Persona cliente;
    
    public Cuenta(Persona cliente, long numerocuenta) {
        this.cliente = cliente;
        this.numerocuenta = numerocuenta;
        saldo = 0;
    }
    
    public long getNumeroCuenta() {
        return numerocuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public Persona getCliente() {
        return cliente;
    }
    
    public void ingresar(double cantidad) {
        saldo += cantidad;
    }
    
    public abstract void retirar(double cantidad);
    
    public abstract void actualizarSaldo();
}
