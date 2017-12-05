/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulafacil;

/**
 *
 * @author PC16
 */

import java.util.Scanner;
public class Aulafacil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1;
        int num2;
        Scanner leer=new Scanner(System.in);
                
        System.out.print("Introduzca un numero: ");
        num1=leer.nextInt();
        
        System.out.print("Introduzca otro numero: ");
        num2=leer.nextInt();
        
        int suma=num1+num2;
            
        System.out.println("La suma de los numeros que introdujo es: "+suma);
    }
    
}
