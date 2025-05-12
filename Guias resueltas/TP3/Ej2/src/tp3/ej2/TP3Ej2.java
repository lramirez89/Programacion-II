
package tp3.ej2;

import java.util.ArrayList;

public class TP3Ej2 {

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        EmpleadoHoras empleadoHoras = new EmpleadoHoras("Perez", "Juan", 1285, 16, 800);
        EmpleadoSalariado empleadoSalrariado = new EmpleadoSalariado("Castro", "Roberto", 20, 1000);
        empleados.add(empleadoHoras);
        empleados.add(empleadoSalrariado);

        for (Empleado empleado : empleados) {
            empleado.calcularSalario();
            empleado.mostrarInformacion();
        }

    }

}
