/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaulas;

import java.util.Random;

/**
 *
 * @author PC16
 */
public class EjercicioAulas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aula aula = new Aula();
        Random rnd = new Random();
        
        for(int i = 0; i < 5 ; ++i){
            aula.setAlumnos(rnd.nextInt() % 40);
            aula.showResult();
            System.out.println();
        }
    }
    
}
