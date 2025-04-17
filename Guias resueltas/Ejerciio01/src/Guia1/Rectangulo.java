/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 1. Clase Rectángulo:
 * Crea una clase Rectángulo con atributos ancho y alto de tipo double.
 * Implementa métodos para calcular el área y el perímetro del rectángulo.
 * Escribe un método esCuadrado() que devuelva true si el rectángulo es un cuadrado, es decir, si ancho y alto son iguales. 
 *
 * @author lean
 */
public class Rectangulo {
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }
    
    public double area(){
        return ancho*alto;
    }
    
    public double perimetro(){
        return ancho*2+alto*2;
    }

    public boolean esCuadrado(){
        return this.getAncho() == this.getAlto();
    }
    
}

