package tp3.ej2;

public class EmpleadoHoras extends Empleado {

    private float horaTrabajada;
    private float tarifaPorHora;

    public EmpleadoHoras(String apellido, String nombre, int legajo, float horaTrabajada, float tarifaPorHora) {
        super(apellido, nombre, legajo);
        this.horaTrabajada = horaTrabajada;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public float calcularSalario() {
        return this.horaTrabajada * this.tarifaPorHora;
    }

    public float getHoraTrabajada() {
        return horaTrabajada;
    }

    public void setHoraTrabajada(float horaTrabajada) {
        this.horaTrabajada = horaTrabajada;
    }

    public float getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(float tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

}
