/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escalerasyserpientes;

/**
 *
 * @author TOÑO
 */
public class Especial {

    private String nombre;
    private int posinicial;
    private int posfinal;

    public Especial() {
    }

    public Especial(String nombre, int posinicial, int posfinal) {
        this.nombre = nombre;
        this.posinicial = posinicial;
        this.posfinal = posfinal;
    }

    public int getPosinicial() {
        return posinicial;
    }

    public void setPosinicial(int posinicial) {
        this.posinicial = posinicial;
    }

    public int getPosfinal() {
        return posfinal;
    }

    public void setPosfinal(int posfinal) {
        this.posfinal = posfinal;
    }

    public String getNombre() {
        return nombre;
    }
}
