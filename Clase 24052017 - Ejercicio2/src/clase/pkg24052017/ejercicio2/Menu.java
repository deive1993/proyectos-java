/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg24052017.ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author PC16
 */
public class Menu {
 
    
    public static void main(String[] args) {
        new Form1().setVisible(true);
        Form2 F2 = new Form2();
        F2.setVisible(true);
        
        Form2 F3 = new Form2();
        F3.setVisible(true);
        
        JOptionPane.showInputDialog(null, "Mensaje");
}
}
