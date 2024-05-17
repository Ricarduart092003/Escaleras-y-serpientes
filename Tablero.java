/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escalerasyserpientes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOÑO
 */
public class Tablero {

    private int[][] tablero;
    private ArrayList<Especial> fichasesp;
    private DefaultTableModel model;
    private int cantescaleras;
    private int cantserpientes;

    public Tablero(int tamaño) {
        this.tablero = new int[tamaño][tamaño];
        this.fichasesp = new ArrayList<Especial>();
        this.model = new DefaultTableModel();
        this.cantescaleras = 0;
        this.cantserpientes = 0;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public ArrayList<Especial> getFichasesp() {
        return fichasesp;
    }

    public DefaultTableModel crearTablero(int tamaño) {

        switch (tamaño) {
            case 10 -> {
                int count = 1;
                this.model = new DefaultTableModel(10, 10);
                for (int row = 0; row < 10; row++) {
                    for (int col = 0; col < 10; col++) {
                        model.setValueAt(count++, row, col);
                    }
                }
            }
            case 13 -> {
                int count = 1;
                this.model = new DefaultTableModel(13, 13);
                for (int row = 0; row < 13; row++) {
                    for (int col = 0; col < 13; col++) {
                        model.setValueAt(count++, row, col);
                    }
                }
            }
            case 15 -> {
                int count = 1;
                this.model = new DefaultTableModel(15, 15);
                for (int row = 0; row < 15; row++) {
                    for (int col = 0; col < 15; col++) {
                        model.setValueAt(count++, row, col);
                    }
                }

            }
        }
        return model;

    }

    public void instalarFichaEspecial(String nombre, int posini, int posfin) {
        Especial ficha = new Especial(nombre, posini, posfin);
        this.fichasesp.add(ficha);

        switch (tablero.length) {
            case 10: {
                if (nombre.equals("Escalera")) {
                    cantescaleras++;
                    if (posini % 10 != 0 && posfin % 10 != 0) {
                        model.setValueAt("E" + String.valueOf(cantescaleras), posini / 10, (posini % 10) - 1);
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 10, (posfin - 1) % 10);
                    } else {
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posini - 1) / 10, ((posini - 1) % 10));
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 10, (posfin - 1) % 10);
                    }

                } else {
                    cantserpientes++;
                    if (posini % 10 != 0 && posfin % 10 != 0) {
                        model.setValueAt("S" + String.valueOf(cantserpientes), posini / 10, (posini % 10) - 1);
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 10, (posfin - 1) % 10);
                    } else {
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posini - 1) / 10, ((posini - 1) % 10));
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 10, (posfin - 1) % 10);
                    }
                }
                break;
            }
            case 13: {
                if (nombre.equals("Escalera")) {
                    cantescaleras++;
                    if (posini % 13 != 0 && posfin % 13 != 0) {
                        model.setValueAt("E" + String.valueOf(cantescaleras), posini / 13, (posini % 13) - 1);
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 13, (posfin - 1) % 13);
                    } else {
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posini - 1) / 13, ((posini - 1) % 13));
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 13, (posfin - 1) % 13);
                    }

                } else {
                    cantserpientes++;
                    if (posini % 13 != 0 && posfin % 13 != 0) {
                        model.setValueAt("S" + String.valueOf(cantserpientes), posini / 13, (posini % 13) - 1);
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 13, (posfin - 1) % 13);
                    } else {
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posini - 1) / 13, ((posini - 1) % 13));
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 13, (posfin - 1) % 13);
                    }
                }
                break;
            }
            case 15: {
                if (nombre.equals("Escalera")) {
                    cantescaleras++;
                    if (posini % 15 != 0 && posfin % 15 != 0) {
                        model.setValueAt("E" + String.valueOf(cantescaleras), posini / 15, (posini % 15) - 1);
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 15, (posfin - 1) % 15);
                    } else {
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posini - 1) / 15, ((posini - 1) % 15));
                        model.setValueAt("E" + String.valueOf(cantescaleras), (posfin - 1) / 15, (posfin - 1) % 15);
                    }

                } else {
                    cantserpientes++;
                    if (posini % 15 != 0 && posfin % 15 != 0) {
                        model.setValueAt("S" + String.valueOf(cantserpientes), posini / 15, (posini % 15) - 1);
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 15, (posfin - 1) % 15);
                    } else {
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posini - 1) / 15, ((posini - 1) % 15));
                        model.setValueAt("S" + String.valueOf(cantserpientes), (posfin - 1) / 15, (posfin - 1) % 15);
                    }
                }
                break;
            }
            default: {
                break;
            }

        }

    }
}
