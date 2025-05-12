/*
    Ejercicio 2.7
 */
package tp2.carrera;

public class CarreraMain {

    public static void main(String[] args) {

        Asignatura asignatura = new Asignatura("Matemáticas", 1017, "Curso I");
        Carrera carrera = new Carrera();
        carrera.agregarAsignatura(asignatura);
        carrera.mostrarDatosAsignaturas();

    }

}
