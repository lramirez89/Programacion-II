/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rous
 */
public class Adaptador implements EnchufeBrasil {

    private CargadorArgentino cargadorArgentino;

    public Adaptador(CargadorArgentino cargadorArgentino) {
        this.cargadorArgentino = cargadorArgentino;
    }

    @Override
    public void enchufar() {
        System.out.println("Adaptador en funcionamiento");
        cargadorArgentino.conectar();
    }

}
