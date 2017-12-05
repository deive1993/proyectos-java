/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




package a;

import java.util.Scanner;

/**
 *
 * @author PC16
 */
public class A {
    
    /**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);


        // game loop
        while (true) {
            int max=0;
            int imax =0;
 
            for (int i = 0; i < 8; i++) {
               // System.out.println(" Ingresar algo ");
                
                int mountainH = in.nextInt(); // represents the height of one mountain.
            
            if (mountainH > max){
            
            max = mountainH;
            imax = i;
             System.out.println(imax);
            }
            
            
            }

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            // The index of the mountain to fire on.
        }
    }
    
}
