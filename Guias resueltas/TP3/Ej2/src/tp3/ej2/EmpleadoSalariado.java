package tp3.ej2;

public class EmpleadoSalariado extends Empleado {

    private float salarioMensual;

    public EmpleadoSalariado(String apellido, String nombre, int legajo, float salarioMensual) {
        super(apellido, nombre, legajo);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public float calcularSalario() {

        return this.salarioMensual;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

}
