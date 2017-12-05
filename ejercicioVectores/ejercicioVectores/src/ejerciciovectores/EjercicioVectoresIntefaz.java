/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores;

import java.time.Year;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author PC19
 */
public class EjercicioVectoresIntefaz extends javax.swing.JFrame {

    /**
     * Creates new form EjercicioVectoresIntefaz
     */
    public EjercicioVectoresIntefaz() {
        initComponents();
        panelSaldo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        labelTitulo = new javax.swing.JLabel();
        botonSaldo = new javax.swing.JButton();
        botonCurso = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelSaldo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonIntro = new javax.swing.JRadioButton();
        botonJava = new javax.swing.JRadioButton();
        btonCplusplus = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        botonVisaMaster = new javax.swing.JRadioButton();
        botonTarjeta = new javax.swing.JRadioButton();
        botonEfectivo = new javax.swing.JRadioButton();
        selectorPagos = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textoSaldo = new javax.swing.JTextField();
        botonCalcularSaldo = new javax.swing.JButton();
        spinnerAnio = new javax.swing.JSpinner();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Ejercicio de vectores");

        botonSaldo.setText("Calculo de saldo");
        botonSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaldoActionPerformed(evt);
            }
        });

        botonCurso.setText("Notas de curso");
        botonCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCursoActionPerformed(evt);
            }
        });

        jLabel1.setText("Año de inscribicion:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("cursos a los que se anota ");

        botonIntro.setText("Introduccion a programacion basada en objetos");

        botonJava.setText("Java");

        btonCplusplus.setText("C++");

        jLabel4.setText("Medio de pagos");

        buttonGroup1.add(botonVisaMaster);
        botonVisaMaster.setText("Visa o Mastercard");
        botonVisaMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVisaMasterActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonTarjeta);
        botonTarjeta.setText("Otra tarjeta");
        botonTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTarjetaActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonEfectivo);
        botonEfectivo.setText("Efectivo");
        botonEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEfectivoActionPerformed(evt);
            }
        });

        selectorPagos.setModel(new javax.swing.SpinnerNumberModel(0, null, 12, 1));

        jLabel5.setText("Cantidad de pagos");

        jLabel6.setText("Saldo a pagar:");

        botonCalcularSaldo.setText("calcular");
        botonCalcularSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCalcularSaldoActionPerformed(evt);
            }
        });

        spinnerAnio.setModel(new javax.swing.SpinnerNumberModel(0, null, 2100, 1));

        javax.swing.GroupLayout panelSaldoLayout = new javax.swing.GroupLayout(panelSaldo);
        panelSaldo.setLayout(panelSaldoLayout);
        panelSaldoLayout.setHorizontalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaldoLayout.createSequentialGroup()
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSaldoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectorPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEfectivo)
                            .addComponent(botonVisaMaster)
                            .addComponent(btonCplusplus)
                            .addComponent(botonJava)
                            .addComponent(botonIntro)
                            .addComponent(botonTarjeta)
                            .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spinnerAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSaldoLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(botonCalcularSaldo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSaldoLayout.setVerticalGroup(
            panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spinnerAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(botonIntro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonJava)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btonCplusplus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(botonVisaMaster))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEfectivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectorPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCalcularSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(panelSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(botonSaldo)
                        .addGap(51, 51, 51)
                        .addComponent(botonCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSaldo)
                    .addComponent(botonCurso))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaldoActionPerformed
        // TODO add your handling code here:
        int añoActual = Year.now().getValue();
        SpinnerNumberModel tamanio = new SpinnerNumberModel(añoActual, añoActual, añoActual +10, 1);
        selectorPagos.setModel(tamanio);
        panelSaldo.setVisible(true);
    }//GEN-LAST:event_botonSaldoActionPerformed

    private void botonCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCursoActionPerformed
        // TODO add your handling code here:
        panelSaldo.setVisible(false);
    }//GEN-LAST:event_botonCursoActionPerformed

    private void botonVisaMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVisaMasterActionPerformed
        // TODO add your handling code here:
        SpinnerNumberModel tamanio = new SpinnerNumberModel(0, 0, 3, 1);
        selectorPagos.setModel(tamanio);
    }//GEN-LAST:event_botonVisaMasterActionPerformed

    private void botonTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTarjetaActionPerformed
        // TODO add your handling code here:
        SpinnerNumberModel tamanio = new SpinnerNumberModel(0, 0, 12, 1);
        selectorPagos.setModel(tamanio);
    }//GEN-LAST:event_botonTarjetaActionPerformed

    private void botonEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEfectivoActionPerformed
        // TODO add your handling code here:
        SpinnerNumberModel tamanio = new SpinnerNumberModel(0, 0, 0, 1);
        selectorPagos.setModel(tamanio);
    }//GEN-LAST:event_botonEfectivoActionPerformed

    private void botonCalcularSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCalcularSaldoActionPerformed
        // TODO add your handling code here:
        double saldo = 0;
        int cantCursos;
        int añoActual = Year.now().getValue();
        int añoIngreasdo = Integer.parseInt(spinnerAnio.getValue().toString());
        
        
    }//GEN-LAST:event_botonCalcularSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(EjercicioVectoresIntefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjercicioVectoresIntefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjercicioVectoresIntefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjercicioVectoresIntefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjercicioVectoresIntefaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCalcularSaldo;
    private javax.swing.JButton botonCurso;
    private javax.swing.JRadioButton botonEfectivo;
    private javax.swing.JRadioButton botonIntro;
    private javax.swing.JRadioButton botonJava;
    private javax.swing.JButton botonSaldo;
    private javax.swing.JRadioButton botonTarjeta;
    private javax.swing.JRadioButton botonVisaMaster;
    private javax.swing.JRadioButton btonCplusplus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelSaldo;
    private javax.swing.JSpinner selectorPagos;
    private javax.swing.JSpinner spinnerAnio;
    private javax.swing.JTextField textoSaldo;
    // End of variables declaration//GEN-END:variables
}