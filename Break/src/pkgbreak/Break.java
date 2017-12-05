/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgbreak;

/**
 *
 * @author PC16
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int x=0; x<=10; x++)
        {
            System.out.println ("Estas en el ciclo");
            if (x==4) continue;
            System.out.println("El valor de x es: "+x);}
            {System.out.println("Se termino el ciclo");}
    
}
