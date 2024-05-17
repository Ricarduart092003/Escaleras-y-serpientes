/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escalerasyserpientes;

/**
 *
 * @author TOÑO
 */
public class Jugador {

    private String nombre;
    private String ficha;
    private int posicion;

    public Jugador(String nombre, String ficha, int posicion) {
        this.nombre = nombre;
        this.ficha = ficha;
        this.posicion = posicion;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getFicha() {
        return ficha;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int tirarDado() {

        return (int) ((Math.random() * 6) + 1);

    }

}
