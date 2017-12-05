
package agenda;
import db.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax .swing.table.DefaultTableModel;

public class Telefonos extends javax.swing.JFrame {
     
    DefaultTableModel modelos;
    Connection conn;
    Statement sent;
    
    
    
    
    public Telefonos() {
        initComponents();
       conn=mysql.getConnect();
        deshabilitar();
        LlenarTabla();
    }
        void deshabilitar(){
        japellido.setEnabled(false);
        jnombre.setEnabled(false);
        jdomicilio.setEnabled(false);
        jtelefono.setEnabled(false);
        jemail.setEnabled(false);
  
    }
      void Limpiar(){
          japellido.setText("");
        jnombre.setText("");
        jdomicilio.setText("");
        jtelefono.setText("");
        jemail.setText("");
      }  
      void habilitar(){
        japellido.setEnabled(true);
        jnombre.setEnabled(true);
        jdomicilio.setEnabled(true);
        jtelefono.setEnabled(true);
        jemail.setEnabled(true);
        japellido.requestFocus();
      }
    void LlenarTabla(){
        try{
       String[]titulos={"ID","Apellido","Nombre","Domicilio","Telefono","Email"};
       String SQL="SELECT * FROM contactos";
       modelos =new DefaultTableModel(null,titulos);
       sent = conn.createStatement();
       ResultSet rs = sent.executeQuery(SQL);//guarda resultado de la consulta de SQL
       String[]fila=new String[6];
       while (rs.next()){
           fila[0]=rs.getString("id");
           fila[1]=rs.getString("apellido");
           fila[2]=rs.getString("nombre");
           fila[3]=rs.getString("domicilio");
           fila[4]=rs.getString("telefono");
           fila[5]=rs.getString("email");
           modelos.addRow(fila);//Sigue cargando los registros hasta que deje de ser true
       }
       jTable2.setModel(modelos);
        }catch(Exception e){
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        japellido = new javax.swing.JTextField();
        jnombre = new javax.swing.JTextField();
        jdomicilio = new javax.swing.JTextField();
        jtelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Datos de contacto");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 143, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setText("Domicilio");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 143, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel4.setText("email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 143, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 42, 80, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 143, 30));

        jemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jemailActionPerformed(evt);
            }
        });
        jPanel1.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 130, 30));

        japellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                japellidoActionPerformed(evt);
            }
        });
        jPanel1.add(japellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 130, 30));

        jnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnombreActionPerformed(evt);
            }
        });
        jPanel1.add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, 30));

        jdomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdomicilioActionPerformed(evt);
            }
        });
        jPanel1.add(jdomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, 30));

        jtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(jtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Apellido", "Nombre", "Domicilio", "Telefono", "Email"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 530, 140));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton5.setText("Actualizar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Nuevo
       habilitar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void japellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_japellidoActionPerformed
        // Apellido
    }//GEN-LAST:event_japellidoActionPerformed

    private void jnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnombreActionPerformed
        // Nombres
    }//GEN-LAST:event_jnombreActionPerformed

    private void jdomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdomicilioActionPerformed
        // Domicilio
    }//GEN-LAST:event_jdomicilioActionPerformed

    private void jtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtelefonoActionPerformed
        // Telefono
    }//GEN-LAST:event_jtelefonoActionPerformed

    private void jemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jemailActionPerformed
        // email
    }//GEN-LAST:event_jemailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Guardar
          try{
        String SQL = "INSERT INTO contactos(apellido,nombre,domicilio,telefono,email)"
                +"VALUES(?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1,japellido.getText());
        ps.setString(2,jnombre.getText());
        ps.setString(3,jdomicilio.getText());
        ps.setString(4,jtelefono.getText());
        ps.setString(5,jemail.getText());
        int n = ps.executeUpdate();
        if (n>0){
            Limpiar();
            LlenarTabla();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Eliminar
        int fila=jTable2.getSelectedRow();  
        try{
          String SQL="DELETE FROM contactos WHERE id="+jTable2.getValueAt(fila,0);
          sent = conn.createStatement();
          int n = sent.executeUpdate(SQL);
          if (n>0){
              Limpiar();              
              LlenarTabla();
             JOptionPane.showMessageDialog(null, "Registros eliminados correctamente"); 
          }
          
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());  
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Actualizar
        
        try{
        String SQL = "UPDATE contactos SETapellido=?,nombre=?,domicilio=?,telefono=?,email=?"+"WHERE id=?";
        int fila=jTable2.getSelectedRow();
        String dato=(String)jTable2.getValueAt(fila,0);
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1,japellido.getText());
        ps.setString(2,jnombre.getText());
        ps.setString(3,jdomicilio.getText());
        ps.setString(4,jtelefono.getText());
        ps.setString(5,jemail.getText());
        ps.setString(6,dato);
        int n = ps.executeUpdate();
        if (n>0){
            Limpiar();
            deshabilitar();
            LlenarTabla();
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Cancelar
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // Tabla
        if(evt.getButton()==1);
        int fila = jTable2.getSelectedRow();
        habilitar();
       try{           
           String SQL ="SELECT * FROM contactos WHERE id="+jTable2.getValueAt(fila, 0);
           sent=conn.createStatement();
           ResultSet rs = sent.executeQuery(SQL);
           rs.next();
           japellido.setText(rs.getString("apellido"));
           jnombre.setText(rs.getString("nombre"));
           jdomicilio.setText(rs.getString("domicilio"));
           jtelefono.setText(rs.getString("telefono"));
           jemail.setText(rs.getString("email"));
           
           
       }catch(Exception e){
          JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());  
       }
        
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(Telefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telefonos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telefonos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField japellido;
    private javax.swing.JTextField jdomicilio;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jtelefono;
    // End of variables declaration//GEN-END:variables

 
}
