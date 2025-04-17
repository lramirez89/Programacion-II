/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 9. Clase Pelota:
 * Define una clase Pelota con atributos marca y circunferencia.
 * Implementa un método para comparar si dos pelotas tienen la misma circunferencia.
 * Crea un método que permita inflar la pelota, aumentando su circunferencia en un valor dado.
 *
 * @author lean
 */
public class Pelota {
    private final String _marca;
    private double _circunferencia;

    public Pelota(String _marca, double _circunferencia) {
        this._marca = _marca;
        this._circunferencia = _circunferencia;
    }

    public String getMarca() {
        return _marca;
    }

    public double getCircunferencia() {
        return _circunferencia;
    }
    
    public boolean mismaCircunferencia(Pelota segundaPelota){
        return this._circunferencia == segundaPelota._circunferencia;
    }
    
    public void inflar(double aumento){
        if(aumento>0)
            _circunferencia+=aumento;
    }
    
    
}
