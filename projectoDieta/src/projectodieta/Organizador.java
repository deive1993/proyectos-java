/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectodieta;

import java.awt.Color;


/**
 *
 * @author damian
 */
public class Organizador extends javax.swing.JFrame {
    
    public Organizador() {
        initComponents();
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelDia = new javax.swing.JPanel();
        buttonDia = new javax.swing.JRadioButton();
        spinnerDia = new javax.swing.JSpinner();
        panelMes = new javax.swing.JPanel();
        buttonMes = new javax.swing.JRadioButton();
        buttonMostrar = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelSemana = new javax.swing.JPanel();
        buttonSemana = new javax.swing.JRadioButton();
        spinnerSemana = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(440, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonDia.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(buttonDia);
        buttonDia.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        buttonDia.setText("Dia");
        buttonDia.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiaActionPerformed(evt);
            }
        });

        spinnerDia.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_YEAR));
        spinnerDia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerDiaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PanelDiaLayout = new javax.swing.GroupLayout(PanelDia);
        PanelDia.setLayout(PanelDiaLayout);
        PanelDiaLayout.setHorizontalGroup(
            PanelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonDia, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelDiaLayout.setVerticalGroup(
            PanelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDia)
                    .addComponent(spinnerDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(PanelDia);
        PanelDia.setBounds(0, 150, 440, 50);

        buttonMes.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(buttonMes);
        buttonMes.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        buttonMes.setText("Mes");
        buttonMes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMesLayout = new javax.swing.GroupLayout(panelMes);
        panelMes.setLayout(panelMesLayout);
        panelMesLayout.setHorizontalGroup(
            panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(353, Short.MAX_VALUE))
        );
        panelMesLayout.setVerticalGroup(
            panelMesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonMes)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(panelMes);
        panelMes.setBounds(0, 250, 440, 50);

        buttonMostrar.setText("Mostrar Menu");
        buttonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMostrar);
        buttonMostrar.setBounds(90, 320, 250, 27);

        titulo.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Planificador de dieta");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelTitulo);
        panelTitulo.setBounds(120, 30, 300, 60);

        buttonSemana.setBackground(new java.awt.Color(153, 255, 153));
        buttonGroup1.add(buttonSemana);
        buttonSemana.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        buttonSemana.setText("Semana");
        buttonSemana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSemanaActionPerformed(evt);
            }
        });

        spinnerSemana.setModel(new javax.swing.SpinnerListModel(new String[] {"1er semana", "2da semana", "3ra semana", "4ta semana"}));
        spinnerSemana.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerSemanaStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelSemanaLayout = new javax.swing.GroupLayout(panelSemana);
        panelSemana.setLayout(panelSemanaLayout);
        panelSemanaLayout.setHorizontalGroup(
            panelSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemanaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(spinnerSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSemanaLayout.setVerticalGroup(
            panelSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSemanaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSemanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSemana)
                    .addComponent(spinnerSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(panelSemana);
        panelSemana.setBounds(0, 200, 440, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 100, 90);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/Food_salad.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private MetodosDieta dieta = new MetodosDieta();
    
    private void inicializar(){
        panelSemana.setBackground(new Color(134, 134, 134, 123));
        PanelDia.setBackground(new Color(134, 134, 134, 123));
        panelMes.setBackground(new Color(134, 134, 134, 123));
        buttonSemana.setContentAreaFilled(false);
        buttonDia.setContentAreaFilled(false);
        buttonMes.setContentAreaFilled(false);
        panelTitulo.setBackground(new Color(134, 134, 134, 123));
    }
    
    private void buttonDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiaActionPerformed
        if(buttonDia.isSelected()){
            dieta.setSeleccionModo(1);
            
            String fecha = new String(spinnerDia.getValue().toString());
            int semana;
            semana  = Integer.parseInt(fecha.substring(8, 10));
            dieta.setIndexSemana(semana);
            fecha   = fecha.substring(0, 3);
            dieta.setIndexDiaIngles(fecha);
        }
    }//GEN-LAST:event_buttonDiaActionPerformed

    private void buttonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMostrarActionPerformed
        if(buttonSemana.isSelected() || buttonDia.isSelected() ||buttonMes.isSelected()){
            dieta.leerArchivo();
            Listado listado = new Listado();
            listado.setVisible(true);
        }
    }//GEN-LAST:event_buttonMostrarActionPerformed

    private void buttonSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSemanaActionPerformed
        if(buttonSemana.isSelected()){
            dieta.setSeleccionModo(2);
        }
    }//GEN-LAST:event_buttonSemanaActionPerformed

    private void buttonMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMesActionPerformed
        if(buttonMes.isSelected()){
            dieta.setSeleccionModo(3);
            
            String semana = spinnerSemana.getValue().toString();
            dieta.setIndexSemana(semana);
        }
    }//GEN-LAST:event_buttonMesActionPerformed

    private void spinnerDiaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerDiaStateChanged
        String fecha = new String(spinnerDia.getValue().toString());
        int semana;
        semana  = Integer.parseInt(fecha.substring(8, 10));
        dieta.setIndexSemana(semana);
        fecha   = fecha.substring(0, 3);
        dieta.setIndexDiaIngles(fecha);
    }//GEN-LAST:event_spinnerDiaStateChanged

    private void spinnerSemanaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerSemanaStateChanged
        String semana = spinnerSemana.getValue().toString();
        dieta.setIndexSemana(semana);
    }//GEN-LAST:event_spinnerSemanaStateChanged

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
            java.util.logging.Logger.getLogger(Organizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Organizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Organizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Organizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Organizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDia;
    private javax.swing.JRadioButton buttonDia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton buttonMes;
    private javax.swing.JButton buttonMostrar;
    private javax.swing.JRadioButton buttonSemana;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelMes;
    private javax.swing.JPanel panelSemana;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JSpinner spinnerDia;
    private javax.swing.JSpinner spinnerSemana;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
