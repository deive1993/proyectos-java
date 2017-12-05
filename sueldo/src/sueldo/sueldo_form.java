
package sueldo;
/**
 *
 * @author PC16
 */
public class sueldo_form extends javax.swing.JFrame {

    
    public sueldo_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sueldo = new javax.swing.JLabel();
        antiguedad = new javax.swing.JLabel();
        txtantiguedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtextras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txthtrabajadas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtsueldobruto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtretenciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtsueldoneto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sueldo.setText("sueldo");

        antiguedad.setText("antiguedad");

        txtantiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtantiguedadActionPerformed(evt);
            }
        });

        jLabel1.setText("horas extras ");

        txtextras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtextrasActionPerformed(evt);
            }
        });

        jLabel2.setText("horas trabajadas ");

        txthtrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthtrabajadasActionPerformed(evt);
            }
        });

        jLabel3.setText("sueldo bruto ");

        txtsueldobruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldobrutoActionPerformed(evt);
            }
        });

        jLabel4.setText("retenciones ");

        txtretenciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtretencionesActionPerformed(evt);
            }
        });

        jLabel5.setText("suedo neto");

        txtsueldoneto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsueldonetoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(sueldo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(antiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txthtrabajadas)
                                    .addComponent(txtextras)
                                    .addComponent(txtsueldobruto)
                                    .addComponent(txtretenciones)
                                    .addComponent(txtsueldoneto))))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sueldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(antiguedad)
                    .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtextras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthtrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtsueldobruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtretenciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsueldoneto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtantiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtantiguedadActionPerformed
      int años_antiguedad = Integer.parseInt(txtantiguedad.getText());
        
        int antiguedad1 = 300 * años_antiguedad +(años_antiguedad/5)*(500);
        
        
        
        
        
    }//GEN-LAST:event_txtantiguedadActionPerformed

    private void txtextrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtextrasActionPerformed
       int hextras = Integer.parseInt(txtextras.getText());
       // if {horas_trabajadas > 160){
       //hextras= horas_trabajadas -160;
       // 
       //
       
       
    }//GEN-LAST:event_txtextrasActionPerformed

    private void txthtrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthtrabajadasActionPerformed
        int horas_trabajadas = Integer.parseInt(txthtrabajadas.getText());
        
        
    }//GEN-LAST:event_txthtrabajadasActionPerformed

    private void txtsueldobrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldobrutoActionPerformed
        int sueldobruto = Integer.parseInt(txtsueldobruto.getText());
        
       
      
    }//GEN-LAST:event_txtsueldobrutoActionPerformed

    private void txtretencionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtretencionesActionPerformed
       
    }//GEN-LAST:event_txtretencionesActionPerformed

    private void txtsueldonetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsueldonetoActionPerformed
      
    }//GEN-LAST:event_txtsueldonetoActionPerformed

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
            java.util.logging.Logger.getLogger(sueldo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sueldo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sueldo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sueldo_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sueldo_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel antiguedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel sueldo;
    private javax.swing.JTextField txtantiguedad;
    private javax.swing.JTextField txtextras;
    private javax.swing.JTextField txthtrabajadas;
    private javax.swing.JTextField txtretenciones;
    private javax.swing.JTextField txtsueldobruto;
    private javax.swing.JTextField txtsueldoneto;
    // End of variables declaration//GEN-END:variables
}
