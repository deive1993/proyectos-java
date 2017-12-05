/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package _04_Exepciones;

/**
 *
 * @author SA
 * 
 * Ejercicio 4:

   Imprimir los numeros del 1 al 10, salvo el 2 el 5 y el 9.

   Diagrama:


   Pseudocodigo:
   Inicio:
   Leer n=1
   Mientras n<=10
	entonces
		si n!=2 & n!=5 & n!=9
		imprir n
		n++
		sino
		n++
		fin si
   fin mientras
   fin

   Prueba de escritorio:

   1	   1
   2	
   3       3
   4	   4
   5	
   6  	   6
   7	   7
   8	   8
   9
   10	   10
 */
public class Exepciones {
    public static void main(String[] args) {
        int n=1;
        while (n<=10) {
            if (n!=2 & n!=5 & n!=9) {
            System.out.println(n);
            n++;
        }else{
                n++;
            
            
                
            }
            
        }
    }
    
}
