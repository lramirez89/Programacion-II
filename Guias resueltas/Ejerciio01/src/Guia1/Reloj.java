/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 10. Clase Reloj:
 * Diseña una clase Reloj con atributos hora, minuto, y segundo.
 * Implementa métodos para ajustar la hora, minuto y segundo.
 * Crea un método que permita avanzar el reloj un segundo, asegurando que los valores de hora, minuto y segundo se mantengan correctos.
 *
 * @author lean
 */
public class Reloj {
    private int _hora;
    private int _minuto;
    private int _segundo;

    public Reloj(int _hora, int _minuto, int _segundo) {
        this._hora = _hora;
        this._minuto = _minuto;
        this._segundo = _segundo;
    }

    public int getHora() {
        return _hora;
    }

    public int getMinuto() {
        return _minuto;
    }

    public int getSegundo() {
        return _segundo;
    }
    
    
    
    //los setters son los métodos para ajustar las horas, minutos y segundos

    public void setHora(int hora) {
        this._hora = hora;
    }

    public void setMinuto(int minuto) {
        this._minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this._segundo = segundo;
    }
    
    public void avanzarUnSegundo(){
        
        //se usan ifs anidados pero también se podría usar case
        if(_segundo<59){
            _segundo++;
        }else if(_minuto<59){
            _minuto++;
            _segundo=0;
        }else{
            _segundo=0;
            _minuto=0;
            _hora++;
        }
    }
    
}
