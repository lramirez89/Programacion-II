/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia1;

/**
 *
 * @author lean
 */
public class Ejerciio01 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        
        //Tests de la clase Rectángulo
        System.out.println("------ Tests de la clase Rectangulo ------");
        
        Rectangulo miRectangulo = new Rectangulo(5,5);
        
        System.out.println("¿miRectangulo es cuadrado?: "+ miRectangulo.esCuadrado());
        System.out.println("Área de miRectangulo: " + miRectangulo.area());
        System.out.println("Perímetro de miRectangulo: " + miRectangulo.perimetro());
        
        Rectangulo recNoCuadrado = new Rectangulo(3,2);
        System.out.println("¿recNoCuadrado es cuadrado? " + recNoCuadrado.esCuadrado());
        

        
        
        //imprimo líneas en blanco para separar mejor los tests
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Circulo
        System.out.println("------ Tests de la clase Circulo ------");
        
        Circulo miCirc = new Circulo(1);
        System.out.println("El radio de miCirc es " + miCirc.getRadio()+ 
                           ", su circunferencia es " + miCirc.circunferencia()+ 
                           " y área es "+miCirc.area());
        
        //escalado al 100%. Es decir, el radio se duplica
        miCirc.escalarCirculo(100);
        
        System.out.println("Luego del escalado:");
        System.out.println("El radio de miCirc es " + miCirc.getRadio()+ 
                           ", su circunferencia es " + miCirc.circunferencia()+ 
                           " y área es "+miCirc.area());
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Persona
        System.out.println("------ Tests de la clase Persona ------");
        Persona p = new Persona("Junior",33,1.78);
        
        System.out.println("La persona p se llama "+p.getNombre()+", tiene "+p.getEdad()+" años y mide "+ p.getAltura());
        System.out.println("El IMC de"+p.getNombre()+" es "+p.imc(50));
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Coche
        System.out.println("------ Tests de la clase Coche ------");
        Coche c = new Coche("Ferrari","modelo123");
        
        System.out.println("El coche c tiene combustible: "+c.getCombustibleRestante()
                            + " y tiene "+c.getKilometraje()+" de kilometraje");
        
        c.recargar(100);
        System.out.println("Ahora c tiene "+c.getCombustibleRestante()+" de combustible");
        System.out.println("y puede recorrer "+c.cuantosKilometros(1)+" kilometros");
        
        System.out.println("");
        
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase CuentaBancaria
        System.out.println("------ Tests de la clase CuentaBancaria ------");
        CuentaBancaria cuentita= new CuentaBancaria("Junior",101);
        
        System.out.println("Cuentita tiene un saldo de "+cuentita.getSaldo());
        cuentita.depositar(100);
        System.out.println("Luego del depósito tenemos "+cuentita.getSaldo());
        
        cuentita.retirar(500);
        System.out.println("Luego de retirar más de lo que tenemos nos queda "+cuentita.getSaldo());
        cuentita.retirar(25);
        System.out.println("Si retiramos un monto que podemos (50) nos queda "+cuentita.getSaldo());
        
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Libro
        System.out.println("------ Tests de la clase Libro ------");
        Libro l = new Libro("El terror de los proramadores","Junior",200);
        
        System.out.println("El libro tiene "+l.getNumeroDePaginas()+" y empieza en la página "+l.getPaginaActual());
        
        l.avanzarPagina(119);
        System.out.println("Ahora estamos en la página "+l.getPaginaActual());
        l.avanzarPagina(-20);
        System.out.println("Ahora estamos en la página "+l.getPaginaActual());
        
        //acá estoy en la página 100
        l.avanzarPagina(-100);
        System.out.println("Ahora estoy en la página "+l.getPaginaActual());
        
        //sigo en la página 100 ya que si retrocedo más de lo que puedo no se modifica la pagina actual
        l.avanzarPagina(100);
        System.out.println("Ahora estoy en la página "+l.getPaginaActual());
        l.avanzarPagina(10);
        System.out.println("Ahora estoy en la página "+l.getPaginaActual());
        
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Termometro
        System.out.println("------ Tests de la clase Termometro ------");
        Termometro t = new Termometro(100);
        
        System.out.println("La temperatura de t es "+t.getTemperaturaCelsius()+" en Celsius y "
                            + t.getTemperaturaFarenheit()+" en Farenheit");
        
        //incremento en 100 F
        t.aumentarTemperaturaFarenheit(100);    
        System.out.println("La temperatura de t en Farenheit es "+t.getTemperaturaFarenheit());
        System.out.println("La temperatura de t en Celsius es "+t.getTemperaturaCelsius());
        
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Producto
        System.out.println("------ Tests de la clase Producto ------");
        Producto prod = new Producto("Super pastillas",75);
        
        System.out.println("La cantidad en stock de prod es "+prod.getCantidadEnStock()+" y su precio es "+prod.getPrecio());
        prod.compra(500);
        prod.venta(50);
        System.out.println("La cantidad en stock es "+prod.getCantidadEnStock());
        
        //vendo una cantidad unvalida
        prod.venta(-5);
        prod.venta(500);
        System.out.println("La cantidad en stock es "+prod.getCantidadEnStock());
        
        //aplico un descuento valido
        prod.descuento(71);
        System.out.println("El precio ahora es "+prod.getPrecio()); //el precio es 4
        
        //aplico descuentos invalidos
        prod.descuento(10000);
        prod.descuento(-8);
        System.out.println("El precio ahora es "+prod.getPrecio());
        
        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Pelota
        System.out.println("------ Tests de la clase Pelota ------");
        Pelota pel = new Pelota("Acme", 10);
        
        System.out.println("La pelota pel es de marca "+pel.getMarca()+" y tiene cicrunferencia "+pel.getCircunferencia());
        
        Pelota pel2 = new Pelota("Sarasa",5);
        
        System.out.println("La pelota pel2 es de marca "+pel2.getMarca()+" y tiene cicrunferencia "+pel2.getCircunferencia());

        System.out.println("¿pel y pel2 tienen la misma circunferencia?: "+ pel.mismaCircunferencia(pel2));
        
        //inflar pel2 y volver a comparar
        pel2.inflar(5);
        System.out.println("¿pel y pel2 tienen la misma circunferencia?: "+ pel.mismaCircunferencia(pel2));

        
        System.out.println("");
        
        
        //--------------------------------------------------------------------------------------------------------
        //Tests de la clase Reloj
        System.out.println("------ Tests de la clase Reloj ------");
        Reloj relojito = new Reloj(10,50,50);
        
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.setSegundo(58);
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.avanzarUnSegundo();
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.avanzarUnSegundo();
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        
        relojito.setMinuto(59);
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.avanzarUnSegundo();
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.setSegundo(59);
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        relojito.avanzarUnSegundo();
        System.out.println("La hora es "+relojito.getHora()+":"+relojito.getMinuto()+":"+relojito.getSegundo());
        
        //hay mucho código repetido. En el futuro veremos cómo se soluciona esto mediante el metodo toString
    }
    
}
