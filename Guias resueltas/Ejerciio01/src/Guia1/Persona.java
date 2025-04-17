/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 3. Clase Persona:
 * Desarrolla una clase Persona con los atributos nombre, edad, y altura (en metros).
 * Implementa un método esMayorDeEdad() que devuelva true si la persona es mayor de 18 años.
 * Agrega un método para calcular el índice de masa corporal (IMC) de la persona, dado su peso.
 *
 * @author lean
 */
public class Persona {
    private String _nombre;         //¿nos interesa que el nombre sea final?¿El problema a resolver quiere poder cambiar los nombres?
    private int _edad;
    private double _altura;

    public Persona(String _nombre, int _edad, double _altura) {
        this._nombre = _nombre;
        this._edad = _edad;
        this._altura = _altura;
    }

    public String getNombre() {
        return _nombre;
    }

    public int getEdad() {
        return _edad;
    }

    public double getAltura() {
        return _altura;
    }
    
    public boolean esMayorDeEdad(){
        return _edad>18;
    }
   
   //¿Sería correcto tener setters para la clase persona? ¿queremos que los atributos cambien libremente a decisión del 
   //usuario de la clase?
    
    
    // como el peso no es un atributo de la clase, es necesario que se pase por parámetro
    public double imc(int peso){
        return peso/_altura*_altura;
    }
}
