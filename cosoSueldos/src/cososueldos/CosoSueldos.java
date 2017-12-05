/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cososueldos;

import java.util.Scanner;

  
        
public class CosoSueldos {
    
 
    public static void main(String[] args) {
        
       horasfinal horas = new horasfinal(); 
       
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de horas trabajadas al mes");
        
        int horasTrabMes = leer.nextInt();
        
        System.out.println("Ingrese antiguedad empleado");
        int anostrabajados = leer.nextInt();
        
        //sueldo bruto depende de horas trabajadas y la antiguedad
       // b-el sueldo bruto total que cobra cada empleado 
       // se calcula de la siguiente manera :120 * cada hor normal trabajada y 150 por cada 
       // hora extra trabajada al mes. Se dfinene como horas extras aquella 
       //que estan por enciema de la hora 160 al mes
       //c-se  recibe un adicional de 800 pesos cada 5 años de antiguedad 
       //d-300 pesos por cada año remanente. 
       
       horas.horastrabajadas(horasTrabMes);
         
      

   
 
       
        
        
        
        }
    

        
            
        
            
            
        
        
        
        
        
        
    
    
    
    
}
