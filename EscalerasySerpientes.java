/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package escalerasyserpientes;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOÑO
 */
public class EscalerasySerpientes {

    private ArrayList<Jugador> jugadores;
    private Tablero tab;

    public EscalerasySerpientes(String cantjugadores, String tamaño) {

        jugadores = new ArrayList<Jugador>(Integer.valueOf(cantjugadores));
        tab = new Tablero(Integer.valueOf(tamaño));
    }

    public EscalerasySerpientes() {
    }

    public Tablero getTab() {
        return tab;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void registrarJugadores(String nombre, String ficha) {
        Jugador j = new Jugador(nombre, ficha, 0);
        this.jugadores.add(j);
    }

    public void agregarFichaEspecial(String nombre, int posini, int posfin) {
        this.tab.instalarFichaEspecial(nombre, posini, posfin);
    }

    public String moverFicha(String ficha, int tamtab) {

        int jugada = 0;
        String mensaje = "";

        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getFicha().equals(ficha)) {
                jugada = jugadores.get(i).tirarDado();

                if ((jugadores.get(i).getPosicion() + jugada) > tamtab) {
                    mensaje = "Ha sacado: " + jugada + " y sobrepasa el tamaño del tablero, pierde el turno y debe volver a jugar" + "\n";
                } else {
                    jugadores.get(i).setPosicion(jugadores.get(i).getPosicion() + jugada);
                    mensaje = "El jugador: " + jugadores.get(i).getNombre() + " lanzó el dado, resultado: " + jugada + ", ahora su posición es: " + jugadores.get(i).getPosicion() + "\n";
                    mensaje += verificarGanador(jugadores.get(i), tamtab);
                    mensaje += verificarPosicion(jugadores.get(i));
                }

            }
        }
        return mensaje;
    }

    public String verificarPosicion(Jugador j) {

        for (Especial e : tab.getFichasesp()) {
            if (e.getPosinicial() == j.getPosicion()) {
                switch (e.getNombre()) {
                    case "Escalera" -> {
                        j.setPosicion(e.getPosfinal());
                        return "EL jugador: " + j.getNombre() + " ha caído en una escalera, ha escalado a la posición: " + j.getPosicion() + "\n";
                    }
                    case "Serpiente" -> {
                        j.setPosicion(e.getPosfinal());
                        return "EL jugador: " + j.getNombre() + " ha caído en una serpiente, ha descendido a la posición: " + j.getPosicion() + "\n";
                    }

                    default -> {
                    }
                }
            }
        }
        return "";
    }

    public String verificarGanador(Jugador j, int tamtab) {

        switch (tab.getTablero().length) {
            case 10: {
                if (j.getPosicion() == tamtab) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + j.getNombre());
                    return "El jugador " + j.getNombre() + " ha ganado el juego";

                }
                break;
            }
            case 13: {
                if (j.getPosicion() == tamtab) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + j.getNombre());
                    return "El jugador " + j.getNombre() + " ha ganado el juego";
                }
                break;
            }
            case 15: {
                if (j.getPosicion() == tamtab) {
                    JOptionPane.showInternalMessageDialog(null, "La Partida ha finalizado, ganador: " + j.getNombre());
                    return "El jugador " + j.getNombre() + " ha ganado el juego";
                }
                break;
            }
            default: {
                break;
            }
        }
        return "";
    }

    public DefaultTableModel crearTabla(int tamaño) {
        return this.tab.crearTablero(tamaño);
    }

    public int cambiarTurno(int turno) {

        if (jugadores.size() == 2) {
            if (turno == 1) {
                return 2;
            } else {
                return 1;
            }
        } else if (jugadores.size() == 3) {
            if (turno == 1) {
                return 2;
            } else if (turno == 2) {
                return 3;
            } else {
                return 1;
            }
        } else {
            if (turno == 1) {
                return 2;
            } else if (turno == 2) {
                return 3;
            } else if (turno == 3) {
                return 4;
            } else {
                return 1;
            }
        }
    }

}
