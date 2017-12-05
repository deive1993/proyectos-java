/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author PC16
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* for(int x=0; x<=100; x++){
            if(x==53) continue;
        if ((x%2)!=0)
        {System.out.println("El valor es: "+x);
                
        }
            }
        */
       int x=1;
       int anterior = 0;
       int temp;
       //0,1,1,2,3,5,8,13
       while (true)
       {System.out.println(x);
        temp=x;
        x=x+anterior;
        anterior=temp;
        if(x>60){
            break;
        }
       }
    }
}
