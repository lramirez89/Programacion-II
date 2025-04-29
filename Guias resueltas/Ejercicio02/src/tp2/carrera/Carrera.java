package tp2.carrera;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private List<Asignatura> asignaturas = new ArrayList<>();

    public void agregarAsignatura(Asignatura unaAsignatura) {
        this.getAsignaturas().add(unaAsignatura);
    }

    public void mostrarDatosAsignaturas() {

        for (Asignatura asignatura : asignaturas) {
            asignatura.mostrarDatos();
        }

    }

    /**
     * @return the asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
     * @param asignaturas the asignaturas to set
     */
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

}
