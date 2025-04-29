/*
    Ejercicio 2
 */
package tp2.coche;


public class Coche {

    private String modelo;
    private String color;
    private String matricula;
    private Boolean esMetalizada;
    private TipoCoche tipoCoche;
    private int añoFab;
    private ModalidadSeguro seguro;

    public Coche(String modelo, String color) {
        this.color = color;
        this.modelo = modelo;
    }

    public Coche(String modelo, String color, String matricula, Boolean esMetalizada, TipoCoche tipoCoche, int añoFab, ModalidadSeguro seguro) {
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.esMetalizada = esMetalizada;
        this.tipoCoche = tipoCoche;
        this.añoFab = añoFab;
        this.seguro = seguro;
    }

    //2.2 y 2.3
    public void mostrarDatos(Coche unCoche) {

        if (unCoche != null) {
            System.out.println("El modelo del coche es: " + unCoche.getModelo());
            System.out.println("El color del coche es: " + unCoche.getColor());
        }
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the esMetalizada
     */
    public Boolean getEsMetalizada() {
        return esMetalizada;
    }

    /**
     * @param esMetalizada the esMetalizada to set
     */
    public void setEsMetalizada(Boolean esMetalizada) {
        this.esMetalizada = esMetalizada;
    }

    /**
     * @return the tipoCoche
     */
    public TipoCoche getTipoCoche() {
        return tipoCoche;
    }

    /**
     * @param tipoCoche the tipoCoche to set
     */
    public void setTipoCoche(TipoCoche tipoCoche) {
        this.tipoCoche = tipoCoche;
    }

    /**
     * @return the añoFab
     */
    public int getAñoFab() {
        return añoFab;
    }

    /**
     * @param añoFab the añoFab to set
     */
    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    /**
     * @return the seguro
     */
    public ModalidadSeguro getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(ModalidadSeguro seguro) {
        this.seguro = seguro;
    }

}
