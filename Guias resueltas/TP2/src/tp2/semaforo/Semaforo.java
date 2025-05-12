/*
    2.5
 */
package tp2.semaforo;

public class Semaforo {

    private String color;
    private boolean parpadeo;

    public Semaforo(String color, boolean parpadeo) {
        this.color = color;
        this.parpadeo = parpadeo;
    }

    public void mostrarColor() {

        System.out.println("Color del semáforo: " + this.getColor());
    }

    public void cambiarColor(String color) {

        this.setColor(color);
        System.out.println("El color cambió a: " + this.getColor());
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
     * @return the parpadeo
     */
    public boolean isParpadeo() {
        return parpadeo;
    }

    /**
     * @param parpadeo the parpadeo to set
     */
    public void setParpadeo(boolean parpadeo) {
        this.parpadeo = parpadeo;
    }
}
