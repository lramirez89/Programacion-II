/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factorymethod;

/**
 *
 * @author rous
 */
public class FactoryEmpleadoCajero extends FactoryPersona {

    @Override
    public Empleado crearEmpleado() {
        Rol cajero = new Cajero();
        Empleado empleadoCajero = new Empleado("Juan1", "Perez1", cajero);
        return empleadoCajero;
    }
}
