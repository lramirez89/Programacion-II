/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 *Clase Círculo:
 *Define una clase Círculo con un atributo radio de tipo double.
 *Crea métodos para calcular el área y la circunferencia del círculo.
 *Implementa un método para escalar el círculo, aumentando o disminuyendo su radio en un porcentaje dado.
 *
 * @author lean
 */
public class Circulo {
    private double _radio;

    public Circulo(double _radio) {
        this._radio = _radio;
    }

    public double getRadio() {
        return _radio;
    }
    
    //se puede utilizar la constante pi de la biblioteca Math. área = pi*radio²
    public double area(){
        return Math.PI*getRadio()*getRadio();
    }
    
    //la circunferencia se cacula como pi*diámetro
    public double circunferencia(){
        return 2*Math.PI*getRadio();
    }
    
    /** 
    * Una forma de resolverlo es transformar el porcentaje pasado por parámetro en una proporcion, porcentaje/100
    * luego a esa proporcion se le suma 1. Ese es el número por el cual tenemos que multiplicar al radio
    **/
    public void escalarCirculo(double porcentaje){
        double multiplicador = porcentaje/100 + 1;
        this._radio = this._radio*multiplicador;
    }
}
