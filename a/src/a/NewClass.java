/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author PC16
 */
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int max = 0;
            int imax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(i); // represents the height of one mountain.
             ; 
System.out.println("Altura de la montaña" + mountainH);
// represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (mountainH > max) {
                    max = mountainH;
                    imax = i;
                     System.out.println("Disparar a montaña " + imax);
                }
            }

           
        }
    }
}