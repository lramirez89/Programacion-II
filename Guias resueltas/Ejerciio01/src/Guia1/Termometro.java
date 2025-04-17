/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 7. Clase Termómetro:
 * Crea una clase Termómetro con un atributo temperatura de tipo double.
 * Escribe métodos para convertir la temperatura de grados Celsius a Fahrenheit y viceversa.
 * Implementa un método que permita aumentar o disminuir la temperatura en un valor dado.
 * @author lean
 */
public class Termometro {
    private double _temperatura; //la representación interna es arbitraria. En este caso se guardan grados Celcius

    public Termometro(double temperatura) {
        this._temperatura = temperatura;
    }

    public double getTemperaturaCelsius() {
        return _temperatura;
    }
    
    public double getTemperaturaFarenheit(){
        return _temperatura*1.8+32; 
    }
   
    //el incremento puede ser negativo, y por lo tanto decrementa
    public void aumentarTemperaturaCelsius(double incremento){
        _temperatura+=incremento;
    }
    
    public void aumentarTemperaturaFarenheit(double incremento){
        _temperatura+= incremento * (5.0/9.0);
    }
    
    
}
