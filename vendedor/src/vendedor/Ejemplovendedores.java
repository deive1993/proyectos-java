/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;


/**
 *i
 * @author PC16
 */
public class Ejemplovendedores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereV
        Vendedor vendedor1 = new Vendedor();
        
        vendedor1.Edad = 22;
        vendedor1.Apellido = " Perez";
        vendedor1.Nombre = " Juan ";
        vendedor1.Domicilio = "Rivadavia 1234";
       
        System.out.println(vendedor1.getDomicilio());
        
        vendedor1.setDomicilio("Moron 343");
       
       
       Vendedor vendedor2 = new Vendedor();
       vendedor2.Edad = 26;
       vendedor2.Apellido = "Gutierrez ";
       vendedor2.Nombre = " Jose";
      vendedor2.Domicilio = "Artigas 230";
        
       
         System.out.println("Domicilio actualizado"); 
          System.out.println  (vendedor1.getDomicilio());
        
        
    }
    
}
