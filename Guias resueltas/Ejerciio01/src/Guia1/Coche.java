/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 4. Clase Coche:
 * Crea una clase Coche con atributos marca, modelo, kilometraje, y combustibleRestante (en litros).
 * Escribe un método para calcular cuántos kilómetros puede recorrer el coche con el combustible restante, considerando un consumo fijo de combustible por kilómetro.
 * Implementa un método para "recargar" el combustible del coche.
 *
 * @author lean
 */
public class Coche {
    private final String _marca;  //la marca debería ser la misma una vez creado el coche
    private final String _modelo; //idem para el modelo
    private int _kilometraje;
    private double _combustibleRestante;

    //estas decisiones depende del problema a resolver, pero en este caso se asume que cuando se crea un coche no tiene 
    //combustible ni kilometraje. Hay métodos para cargar el combustible y el kilometraje al crearse debe ser 0 (si estamos
    //modelando la creación de autos nuevos y NO de autos usados
    public Coche(String _marca, String _modelo) {
        this._marca = _marca;
        this._modelo = _modelo;
        this._kilometraje = 0;
        this._combustibleRestante = 0;
   
    }

    public String getMarca() {
        return _marca;
    }

    public String getModelo() {
        return _modelo;
    }

    public double getCombustibleRestante() {
        return _combustibleRestante;
    }
    
    public int getKilometraje(){
        return _kilometraje;
    }
    
    //para esta cuenta necesitamos saber cuál es el consumo
    //asumo que consumo es cuatos kilometros se recorren sobre unidad de combustible (para simplificar los cálculos)
    //si el consumo pasado no tiene sentido tampoco lo tendrá el resultado
    public int cuantosKilometros(float consumo){
        
        //se decidió que el kilometraje sea double y el kilometraje int. El operador (int) convierte un double a int
        return (int) (consumo*_combustibleRestante);
    }
    
    public void recargar(double cantidad){
        if(cantidad>0)  //no puede haber recargas negativas
            this._combustibleRestante += cantidad;
    }
}
