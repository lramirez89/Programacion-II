package tp3.ej2;

public abstract class Empleado {

    private String apellido;
    private String nombre;
    private int legajo;

    public Empleado(String apellido, String nombre, int legajo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + "Legajo: " + this.legajo);
    }

    public abstract float calcularSalario();

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

}
