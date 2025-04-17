/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 5. Clase CuentaBancaria:
 * Define una clase CuentaBancaria con atributos saldo, titular, y numeroDeCuenta.
 * Implementa métodos para depositar y retirar dinero, asegurándote de que no se permita retirar más de lo que hay en el saldo.
 * Crea un método para consultar el saldo actual de la cuenta.
 * @author lean
 */
public class CuentaBancaria {
    private double _saldo;
    private final String _titular;
    private final int _numeroDeCuenta;

    public CuentaBancaria(String _titular, int _numeroDeCuenta) {
        this._saldo = 0;    //al crearse la cuenta no hay saldo
        this._titular = _titular;
        this._numeroDeCuenta = _numeroDeCuenta;
    }

    public double getSaldo() {
        return _saldo;
    }

    public String getTitular() {
        return _titular;
    }

    public int getNumeroDeCuenta() {
        return _numeroDeCuenta;
    }
    
    public void depositar(double dinero){
        if(dinero>0)  //no se puede depositar una cantidad negativa
            this._saldo+=dinero;
    }
    
    public void retirar(int dinero){
        if(_saldo>=dinero)  //no se puede retirar más de lo que se tiene
            _saldo-=dinero;
    }
    
    
    
}
