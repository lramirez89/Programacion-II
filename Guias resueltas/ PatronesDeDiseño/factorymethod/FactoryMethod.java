/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.factorymethod;

import java.util.ArrayList;

/**
 *
 * @author rous
 */
public class FactoryMethod {

    public static void main(String[] args) {

        //La fabrica es quien crea a las personas!!
        FactoryEmpleadoSupervisor fabricaDePersonaSupervisor = new FactoryEmpleadoSupervisor();
        FactoryEmpleadoCajero fabricaDePersonaCajero = new FactoryEmpleadoCajero();
        
        //FactoryEmpleadoCajero fabricaDePersonaCajero = new FactoryEmpleadoCajero();
        
        //FactoryEmpleadoSupervisor.crearInstancia();
        Persona supervisor = fabricaDePersonaSupervisor.crearEmpleado();
        Persona cajero = fabricaDePersonaCajero.crearEmpleado();

        //Persona cajero = fabricaDePersonaCajero.crearPersona();
        System.out.println("El nombre del empleado SUPERVISOR ES:  " + supervisor.getNombre() + "\n");
        System.out.println("El nombre del empleado CAJERO ES:  " + cajero.getNombre());

    }
}
