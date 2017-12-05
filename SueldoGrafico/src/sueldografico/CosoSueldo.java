/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldografico;

/**
 *
 * @author 2014
 */
public class CosoSueldo extends javax.swing.JFrame {

    /**
     * Creates new form CosoSueldo
     */
     private int totalhoras;
    private int totalhorasextras;
    private int  totalhorasfinal;
    private int canthorasextras;
    private int adicional;
    private int retencion;
    
 
    private int  sueldobruto;

    public int getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(int totalhoras) {
        this.totalhoras = totalhoras;
    }

    public int getTotalhorasextras() {
        return totalhorasextras;
    }

    public void setTotalhorasextras(int totalhorasextras) {
        this.totalhorasextras = totalhorasextras;
    }

    public int getCanthorasextras() {
        return canthorasextras;
    }

    public void setCanthorasextras(int canthorasextras) {
        this.canthorasextras = canthorasextras;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    public int getSueldobruto() {
        return sueldobruto;
    }

    public void setSueldobruto(int sueldobruto) {
        this.sueldobruto = sueldobruto;
    }
    
    
    
    public int sueldoNeto (int años, int horas) {
        
        
        sueldobruto(años,horas);     
        int sueldoTope= 18000;
        
        int sueldoneto=0;
          // 2-al sueldo bruto calculado se le aplica una retencion 
       //del 20% hasta lso 18.000 pesos o el 24 % en caso de superar ese importe
       //para obtener el sueldo neto. Se deberá calcular y 
       // retornar el sueldo neto que le corresponde  al trabajador.

        if (this.sueldobruto >sueldoTope){
            
            this.retencion= (sueldobruto * 24) / 100;
            
            sueldoneto = sueldobruto - this.retencion;
            
        } else {
            
            
            retencion= (sueldobruto * 20)/ 100;
            
             sueldoneto = sueldobruto - this.retencion;
            
        }
        
        
        
        
        
        
        
        
        
        return sueldoneto;
        
        
        
        
    }
    
    public void sueldobruto (int años, int horas){
        
        this.antiguedad(años);
        this.horastrabajadas(horas);
        
        this.sueldobruto = this.adicional + this.totalhorasfinal;
        
        
        
       
        
       
                
        
    }
        

public void antiguedad (int años ) {
    
      
       int constanti500 =800;
       int constant300= 300;
        int sumaaños=0;
        int sumaaños2=0;
        int x[];
        x = new int[años+1];
       
    
      for (int i = 5; i <=años;i++){
               
               if (i %  5 == 0) {
                   
                   x[i]=constanti500;
                    sumaaños = sumaaños + x[i];
                    
                   
    } else {
                   
                 x[i]=constant300;  
                 sumaaños2 = sumaaños2 + x[i];
                   
               }
               
               
                
      }
     System.out.println(sumaaños);
    System.out.println(sumaaños2);
     this.adicional = (sumaaños+sumaaños2);
   System.out.println(adicional);
    
}    
            
            
    
    public void antiguedad2 (int años){
        
      //c-se  recibe un adicional de 800 pesos cada 5 años de antiguedad 
       //d-300 pesos por cada año remanente. 
       
       if (años %  5 == 0) {
           this.adicional = 800;
           
        } else {
           
           this.adicional = 300;
        
        
        
    }
       
       
       
       
   //    System.out.println("El adicional es" + this.adicional);
       
    }
  
    
  
    
    
        public void horastrabajadas (int horas){
        
    
 
     if (horas> 160) {
          
          this.canthorasextras  = horas - 160;
                  
                 
          
         // System.out.println(canthorasextras);
          
        this.totalhorasextras = canthorasextras * 150;
         int canthorasComunes = horas - canthorasextras;
         
        
          this.totalhoras= canthorasComunes * 120;
          
        } else {
       
      
      this.totalhoras = horas * 120;
          
  
          
          
          
     }
      
     
      this.totalhorasfinal= this.totalhoras + this.totalhorasextras;
              
      
     //   System.out.println("El total de las horas trabajadas es " + this.totalhorasfinal);
      
     
        }
   
    public CosoSueldo() {
        initComponents();
       
      this.setTitle(" SIPRECASE (Sistema precario calculo sueldo de esclavos)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campo3 = new java.awt.Label();
        campo1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        campo2 = new java.awt.TextField();
        botonDelOrto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areatext = new javax.swing.JTextPane();
        button1 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campo3.setText("Ingresar horas trabajadas en el mes");

        campo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo1ActionPerformed(evt);
            }
        });

        label2.setText("Ingresar años de antiguedad");

        botonDelOrto.setText("Calcular coso del coso para saber  cuanto es el  coso");
        botonDelOrto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDelOrtoActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(areatext);

        button1.setActionCommand("Borrar");
        button1.setLabel("Limpiar  Pantalla");
        button1.setName(""); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campo2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(85, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(botonDelOrto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(112, 112, 112))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(botonDelOrto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        campo3.getAccessibleContext().setAccessibleName("");
        button1.getAccessibleContext().setAccessibleName("Borrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDelOrtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDelOrtoActionPerformed
       
       int horas = Integer.parseInt (campo1.getText());
       int antiguedad = Integer.parseInt (campo2.getText());
       System.out.println(horas);
       System.out.println(antiguedad);
       
       
       this.sueldoNeto(horas, antiguedad);
       //this.sueldobruto(ABORT, horas);
       
      int netotemp =  this.sueldoNeto(antiguedad, horas);
     
      
      System.out.println(netotemp);
      
      String neto = Integer.toString(netotemp);
      String bruto = Integer.toString(this.sueldobruto);
      String extras = Integer.toString(this.canthorasextras);
      String adicionalantig = Integer.toString(this.adicional);
      String rentencionSueldo= Integer.toString(this.retencion);
      String antig = Integer.toString(antiguedad);
           
      
      areatext.setText( "El sueldo bruto es " + bruto + 
              " pesos " + " \nTotal horas extras " + extras + " (a pagar por horas extras " + this.totalhorasextras + " pesos )" 
                      + "\nAños de antiguedad " + antig + " \nAdicional por antiguedad " + adicionalantig  
              + (" pesos ") + "\nRetención Sueldo " +  rentencionSueldo + " pesos " + "\nEl sueldo neto es " 
              + neto + " pesos " + "\n Haga clic en el botón 'Limpiar pantalla' e ingrese datos del siguiente esclavo ") ;
     
      
    }//GEN-LAST:event_botonDelOrtoActionPerformed

    private void campo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo1ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // Borrar
        this.sueldobruto=0;
        this.canthorasextras=0;
        this.adicional=0;
        this.retencion=0;
        this.totalhorasextras=0;
        areatext.setText("");
        campo1.setText("");
        campo2.setText("");
        
        
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(CosoSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CosoSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CosoSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CosoSueldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CosoSueldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areatext;
    private javax.swing.JButton botonDelOrto;
    private java.awt.Button button1;
    private java.awt.TextField campo1;
    private java.awt.TextField campo2;
    private java.awt.Label campo3;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
