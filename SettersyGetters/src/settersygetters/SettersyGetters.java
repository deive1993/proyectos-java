/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settersygetters;

import javax.swing.JOptionPane;



/**
 *
 * @author PC16
 */
public class SettersyGetters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Deforme Carlitos = new Deforme();
        
       
        
       Carlitos.setApellido( JOptionPane.showInputDialog("Ingrese apellido de Carlitos"));
       
       
       
       Carlitos.setDocumento(JOptionPane.showInputDialog("Ingrese DNI de Carlitos"));
       
       JOptionPane.showMessageDialog(null," El apellido de Carlitos es " + Carlitos.getApellido());
      JOptionPane.showMessageDialog(null," El Documento de Carlitos es " + Carlitos.getDocumento());
        
           
        
        
        // TODO code application logic here
    }
    
}
