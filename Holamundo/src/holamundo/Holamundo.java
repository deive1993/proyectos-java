/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

/**
 *
 * @author PC16
 */
public class Holamundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1;
        numero1=10;
        float numero2;
        numero2=(float) 12.5;
        double resultado;
        resultado=numero1*numero2;
        double suma;
        suma=numero1+numero2;
        double resta;
        resta=numero1-numero2;
        float division;
        division=numero1/numero2;
            System.out.println("Vamos a mostrar algunas operaciones con los siguientes valores:");
            System.out.println("NUMERO 1: "+numero1);
            System.out.println("NUMERO 2: "+numero2);
            System.out.println("Multiplicandolos  el resultado es: " +resultado);
            System.out.println("Si los restamos el valor que da es: "+resta);
            System.out.println("Si los sumamos da: "+suma);
            System.out.println("Por ultimo, si los dividimos obtenemos: "+division);
        if(suma>=10){
            System.out.println("Nabo");
        }else{
            System.out.println("Ok Chango");
        }
    }
    
}
