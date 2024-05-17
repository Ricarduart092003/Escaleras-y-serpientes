/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package escalerasyserpientes;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOÑO
 */
public class Tablero13x13 extends javax.swing.JFrame {

    private DefaultTableModel model;
    private EscalerasySerpientes j;
    private int turno = 1;

    public Tablero13x13(EscalerasySerpientes juego) {
        j = juego;
        initComponents();
        this.tabla.setModel(j.crearTabla(13));
        tabla.setRowHeight(30);

    }

    private Tablero13x13() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        InstalarSerpienteEscalera = new javax.swing.JButton();
        JugarTurno = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("SERPIENTES Y ESCALERAS 13 x 13");

        InstalarSerpienteEscalera.setText("Instalar Serpiente y Escalera");
        InstalarSerpienteEscalera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstalarSerpienteEscaleraActionPerformed(evt);
            }
        });

        JugarTurno.setText("Jugar");
        JugarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarTurnoActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo1.setText("HISTORIAL PARTIDA");

        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        jScrollPane2.setViewportView(tabla);

        txtHistorial.setEditable(false);
        txtHistorial.setColumns(20);
        txtHistorial.setRows(5);
        jScrollPane1.setViewportView(txtHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InstalarSerpienteEscalera)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JugarTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo1)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(titulo1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InstalarSerpienteEscalera)
                    .addComponent(JugarTurno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstalarSerpienteEscaleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstalarSerpienteEscaleraActionPerformed

        int cantidad = Integer.valueOf(JOptionPane.showInputDialog("¿Cuántas fichas especiales quiere agregar?"));

        while (cantidad != 0) {

            String nombre = JOptionPane.showInputDialog(null, "Digite el nombre de la ficha especial (Serpiente o Escalera)");
            String posini = JOptionPane.showInputDialog(null, "Digite la posición inicial de la ficha");
            String posfin = JOptionPane.showInputDialog(null, "Digite la posición final de la ficha");

            this.j.agregarFichaEspecial(nombre, Integer.parseInt(posini), Integer.parseInt(posfin));
            cantidad--;
        }

        this.model = this.j.getTab().getModel();
        this.tabla.setModel(model);
    }//GEN-LAST:event_InstalarSerpienteEscaleraActionPerformed

    private void JugarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarTurnoActionPerformed

        if (turno == 1) {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(0).getPosicion();
            if (posactual != 0) {
                if (posactual % 13 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(0).getPosicion() / 13, (this.j.getJugadores().get(0).getPosicion() % 13) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(0).getPosicion() - 1) / 13, (this.j.getJugadores().get(0).getPosicion() - 1) % 13);
                }

            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(0).getFicha(), 169) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(0).getPosicion() % 13 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), this.j.getJugadores().get(0).getPosicion() / 13, (this.j.getJugadores().get(0).getPosicion() % 13) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(0).getFicha(), (this.j.getJugadores().get(0).getPosicion() - 1) / 13, (this.j.getJugadores().get(0).getPosicion() - 1) % 13);
            }

            this.tabla.setModel(model);

        } else if (turno == 2) {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(1).getPosicion();
            if (posactual != 0) {
                if (posactual % 13 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(1).getPosicion() / 13, (this.j.getJugadores().get(1).getPosicion() % 13) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(1).getPosicion() - 1) / 13, (this.j.getJugadores().get(1).getPosicion() - 1) % 13);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(1).getFicha(), 169) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(1).getPosicion() % 13 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), this.j.getJugadores().get(1).getPosicion() / 13, (this.j.getJugadores().get(1).getPosicion() % 13) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(1).getFicha(), (this.j.getJugadores().get(1).getPosicion() - 1) / 13, (this.j.getJugadores().get(1).getPosicion() - 1) % 13);
            }
            this.tabla.setModel(model);

        } else if (turno == 3) {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(2).getPosicion();
            if (posactual != 0) {
                if (posactual % 13 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(2).getPosicion() / 13, (this.j.getJugadores().get(2).getPosicion() % 13) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(2).getPosicion() - 1) / 13, (this.j.getJugadores().get(2).getPosicion() - 1) % 13);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(2).getFicha(), 169) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(2).getPosicion() % 13 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), this.j.getJugadores().get(2).getPosicion() / 13, (this.j.getJugadores().get(2).getPosicion() % 13) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(2).getFicha(), (this.j.getJugadores().get(2).getPosicion() - 1) / 13, (this.j.getJugadores().get(2).getPosicion() - 1) % 13);
            }
            this.tabla.setModel(model);

        } else {
            this.txtHistorial.setText(this.txtHistorial.getText() + "Turno: " + turno + "\n");
            int posactual = this.j.getJugadores().get(3).getPosicion();
            if (posactual != 0) {
                if (posactual % 13 != 0) {
                    this.model.setValueAt(String.valueOf(posactual), this.j.getJugadores().get(3).getPosicion() / 13, (this.j.getJugadores().get(3).getPosicion() % 13) - 1);
                } else {
                    this.model.setValueAt(String.valueOf(posactual), (this.j.getJugadores().get(3).getPosicion() - 1) / 13, (this.j.getJugadores().get(3).getPosicion() - 1) % 13);
                }
            }
            this.txtHistorial.setText(this.txtHistorial.getText() + this.j.moverFicha(j.getJugadores().get(3).getFicha(), 169) + "\n");
            turno = this.j.cambiarTurno(turno);
            if (this.j.getJugadores().get(3).getPosicion() % 13 != 0) {
                this.model.setValueAt(this.j.getJugadores().get(3).getFicha(), this.j.getJugadores().get(3).getPosicion() / 13, (this.j.getJugadores().get(3).getPosicion() % 13) - 1);
            } else {
                this.model.setValueAt(this.j.getJugadores().get(32).getFicha(), (this.j.getJugadores().get(3).getPosicion() - 1) / 13, (this.j.getJugadores().get(3).getPosicion() - 1) % 13);
            }
            this.tabla.setModel(model);
        }
    }//GEN-LAST:event_JugarTurnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero13x13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero13x13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero13x13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero13x13.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero13x13().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InstalarSerpienteEscalera;
    private javax.swing.JButton JugarTurno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextArea txtHistorial;
    // End of variables declaration//GEN-END:variables
}
