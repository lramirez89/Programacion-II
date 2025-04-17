/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 8. Clase Producto:
 * Desarrolla una clase Producto con atributos nombre, precio, y cantidadEnStock.
 * Crea un método para aplicar un descuento al precio del producto.
 * Implementa un método para realizar una venta, actualizando la cantidad en stock y verificand que haya suficiente stock disponible.
 * @author lean
 */
public class Producto {
    private final String _nombre;
    private double _precio;
    private int _cantidadEnStock;

    public Producto(String nombre, double precio) {
        this._nombre = nombre;
        this._precio = precio;
        this._cantidadEnStock = 0;
    }

    public String getNombre() {
        return _nombre;
    }

    public double getPrecio() {
        return _precio;
    }

    public int getCantidadEnStock() {
        return _cantidadEnStock;
    }
    
    public void compra(int cantidad){
        if(cantidad>0)
            _cantidadEnStock+=cantidad;
    }
    
    public void descuento(double valor){
        if(valor>0 && _precio-valor>=0)
            _precio-=valor;
    }
    
    public void venta(int cantidad){
        if(cantidad>0 && _cantidadEnStock>=cantidad)
            _cantidadEnStock-=cantidad;
    }
    
    
}
