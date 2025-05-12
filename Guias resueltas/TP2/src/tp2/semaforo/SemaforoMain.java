package tp2.semaforo;

public class SemaforoMain {

    public static void main(String[] args) {

        //2.6
        System.out.println("\n-------------Ejercicio 2.6------------\n");
        boolean parpadeo = false;
        Semaforo semaforo = new Semaforo("rojo", parpadeo);
        semaforo.mostrarColor();
        semaforo.cambiarColor("ámbar");

    }
}
