/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogasolinera;

/**
 *
 * @author PC19
 */
public class ProjectoGasolinera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InterfazGasolinera ventanaPrincipal = new InterfazGasolinera();
        ventanaPrincipal.setVisible(true);
        while(true){
            ventanaPrincipal.funcionPrincipal();
        }
    }
    
}
