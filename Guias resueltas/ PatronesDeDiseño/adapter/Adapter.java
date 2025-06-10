/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author rous
 */
public class Adapter {

    public static void main(String[] args) {

        CargadorArgentino cargador = new CargadorArgentino();
        Adaptador adaptador = new Adaptador(cargador);
        adaptador.enchufar();
    }
}
