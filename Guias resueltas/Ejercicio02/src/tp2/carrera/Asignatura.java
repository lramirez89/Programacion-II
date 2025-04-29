/*
    Ejercicio 2.7
 */
package tp2.carrera;

public class Asignatura {

    private String nombre;
    private int codigo;
    private String curso;

    public Asignatura(String nombre, int codigo, String curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }

    public void mostrarDatos() {

        System.out.println("El nombre del curso es: " + this.getNombre() + "\n" + "EL código del curso es: " + this.getCodigo() + "\n" + "El nombre del curso es: " + this.getCurso());
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
