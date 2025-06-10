/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author rous
 */
public class FactoryEmpleadoSupervisor extends FactoryPersona {

    // @Override
    /*public static FactoryPersona crearInstancia() {

        if (instancia == null) {
            instancia = new FactoryEmpleadoSupervisor();

        }
        return instancia;

    }*/
    
    @Override
    public Empleado crearEmpleado() {
        Rol supervisor = new Supervidor();
        Empleado empleadoSupervisor = new Empleado("Juan", "Perez", supervisor);
        return empleadoSupervisor;
    }
}
