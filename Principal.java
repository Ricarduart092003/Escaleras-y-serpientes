/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package escalerasyserpientes;

import javax.swing.JOptionPane;

/**
 *
 * @author TOÑO
 */
public class Principal extends javax.swing.JFrame {

    private EscalerasySerpientes juego;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cantjugadores = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fichaJ1 = new javax.swing.JComboBox<>();
        fichaJ2 = new javax.swing.JComboBox<>();
        fichaJ3 = new javax.swing.JComboBox<>();
        fichaJ4 = new javax.swing.JComboBox<>();
        txtNombreJ1 = new javax.swing.JTextField();
        txtNombreJ2 = new javax.swing.JTextField();
        txtNombreJ3 = new javax.swing.JTextField();
        txtNombreJ4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tamañotablero = new javax.swing.JComboBox<>();
        Jugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("SERPIENTES Y ESCALERAS");

        jLabel1.setText("Cantidad de Jugadores");

        cantjugadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        cantjugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantjugadoresActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre Jugador 1");

        jLabel3.setText("Nombre Jugador 2");

        jLabel4.setText("Nombre Jugador 3");

        jLabel5.setText("Nombre Jugador 4");

        fichaJ1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla" }));
        fichaJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaJ1ActionPerformed(evt);
            }
        });

        fichaJ2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla" }));

        fichaJ3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla" }));
        fichaJ3.setEnabled(false);

        fichaJ4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roja", "Azul", "Verde", "Amarilla" }));
        fichaJ4.setEnabled(false);

        txtNombreJ3.setEnabled(false);

        txtNombreJ4.setEnabled(false);

        jLabel6.setText("Ficha");

        jLabel7.setText("Ficha");

        jLabel8.setText("Ficha");

        jLabel9.setText("Ficha");

        jLabel10.setText("Tamaño Tablero");

        tamañotablero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "13", "15" }));

        Jugar.setText("Lanzar Juego");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(35, 35, 35)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fichaJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fichaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fichaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fichaJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(cantjugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10)
                        .addGap(34, 34, 34)
                        .addComponent(tamañotablero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Jugar)
                        .addGap(215, 215, 215))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tamañotablero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(cantjugadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fichaJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fichaJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fichaJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fichaJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(Jugar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantjugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantjugadoresActionPerformed

        switch (cantjugadores.getSelectedItem().toString()) {

            case "2" -> {
                txtNombreJ3.setEnabled(false);
                fichaJ3.setEnabled(false);
                txtNombreJ4.setEnabled(false);
                fichaJ4.setEnabled(false);
                break;
            }
            case "3" -> {
                txtNombreJ3.setEnabled(true);
                fichaJ3.setEnabled(true);
                break;
            }
            case "4" -> {
                txtNombreJ3.setEnabled(true);
                fichaJ3.setEnabled(true);
                txtNombreJ4.setEnabled(true);
                fichaJ4.setEnabled(true);
                break;
            }
            default -> {
                break;
            }

        }

    }//GEN-LAST:event_cantjugadoresActionPerformed

    private void fichaJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaJ1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fichaJ1ActionPerformed

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed

        switch (cantjugadores.getSelectedItem().toString()) {
            case "2": {
                if (fichaJ1.getSelectedItem().equals(fichaJ2.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Error, cada jugador debe escoger fichas de color diferentes.");
                    return;
                } else {
                    this.juego = new EscalerasySerpientes("2", this.tamañotablero.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ1.getText(), this.fichaJ1.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ2.getText(), this.fichaJ2.getSelectedItem().toString());
                }
                break;
            }
            case "3": {
                if (fichaJ1.getSelectedItem().equals(fichaJ2.getSelectedItem()) || fichaJ1.getSelectedItem().equals(fichaJ3.getSelectedItem()) || fichaJ2.getSelectedItem().equals(fichaJ3.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Error, cada jugador debe escoger fichas de color diferentes.");
                    return;
                } else {
                    this.juego = new EscalerasySerpientes("3", this.tamañotablero.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ1.getText(), this.fichaJ1.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ2.getText(), this.fichaJ2.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ3.getText(), this.fichaJ3.getSelectedItem().toString());
                }
                break;
            }
            case "4": {
                if (fichaJ1.getSelectedItem().equals(fichaJ2.getSelectedItem()) || fichaJ1.getSelectedItem().equals(fichaJ3.getSelectedItem()) || fichaJ1.getSelectedItem().equals(fichaJ4.getSelectedItem()) || fichaJ2.getSelectedItem().equals(fichaJ3.getSelectedItem()) || fichaJ3.getSelectedItem().equals(fichaJ4.getSelectedItem())) {
                    JOptionPane.showMessageDialog(null, "Error, cada jugador debe escoger fichas de color diferentes.");
                    return;
                } else {
                    this.juego = new EscalerasySerpientes(this.cantjugadores.getSelectedItem().toString(), this.tamañotablero.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ1.getText(), this.fichaJ1.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ2.getText(), this.fichaJ2.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ3.getText(), this.fichaJ3.getSelectedItem().toString());
                    juego.registrarJugadores(this.txtNombreJ4.getText(), this.fichaJ4.getSelectedItem().toString());
                }

            }
        }

        switch (tamañotablero.getSelectedItem().toString()) {
            case "10": {
                Tablero10x10 tab10 = new Tablero10x10(juego);
                tab10.setVisible(true);
                break;
            }
            case "13": {
                Tablero13x13 tab13 = new Tablero13x13(juego);
                tab13.setVisible(true);
                break;
            }
            case "15": {
                Tablero15x15 tab15 = new Tablero15x15(juego);
                tab15.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_JugarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jugar;
    private javax.swing.JComboBox<String> cantjugadores;
    private javax.swing.JComboBox<String> fichaJ1;
    private javax.swing.JComboBox<String> fichaJ2;
    private javax.swing.JComboBox<String> fichaJ3;
    private javax.swing.JComboBox<String> fichaJ4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> tamañotablero;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField txtNombreJ1;
    private javax.swing.JTextField txtNombreJ2;
    private javax.swing.JTextField txtNombreJ3;
    private javax.swing.JTextField txtNombreJ4;
    // End of variables declaration//GEN-END:variables
}
