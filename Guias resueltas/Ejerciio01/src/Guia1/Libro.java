/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia1;

/**
 * 6. Clase Libro:
 * Diseña una clase Libro con atributos titulo, autor, numeroDePaginas, y paginaActual.
 * Implementa métodos para avanzar y retroceder páginas.
 * Crea un método que indique si el lector ha terminado de leer el libro.
 * 
 * @author lean
 */
public class Libro {
    private final String _titulo;
    private final String _autor;
    private final int _numeroDePaginas;
    private int _paginaActual;

    public Libro(String _titulo, String _autor, int _numeroDePaginas) {
        this._titulo = _titulo;
        this._autor = _autor;
        this._numeroDePaginas = _numeroDePaginas;
        this._paginaActual = 1;
    }

    public String getTitulo() {
        return _titulo;
    }

    public String getAutor() {
        return _autor;
    }

    public int getNumeroDePaginas() {
        return _numeroDePaginas;
    }

    public int getPaginaActual() {
        return _paginaActual;
    }
    
    //paginas es un entero signado, se puede avanzar o retroceder
    public void avanzarPagina(int paginas){
        if(paginas+_paginaActual<=_numeroDePaginas && paginas+_paginaActual>=1)
                _paginaActual+=paginas;
    }
    
    boolean libroTerminado(){
        return _paginaActual==_numeroDePaginas;
    }
    
    
}
