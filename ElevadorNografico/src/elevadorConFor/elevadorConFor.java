/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevadorConFor;

import java.util.Scanner;

/**
 *
 * @author 2014
 */
public class elevadorConFor {
    
    
     //  private int pesoMaximo;
    //private int capacidadMaxPersona;
    private int pisodestino;
    private int pisoactual;
    final public int totalpisos=6;
    Scanner escribir=new Scanner(System.in);

    
      
    public elevadorConFor(){
        
    this.pisoactual=1;
              
    }
    
   
    
    public void  Seleccionpiso (int piso) {
       
        
        while (piso==this.pisoactual || piso > totalpisos || piso ==0) {
            
            if (piso > totalpisos || piso ==0){
            
            System.out.println(" Ese piso no existe idiota ");
            System.out.println(" Ingresa el piso entre 1 y 6 :");
             piso=escribir.nextInt();
        } else {
            System.out.println("¿Sos boludo? ya estás en el piso " + this.pisoactual);
            System.out.print("Ingresa el piso al que querés ir : ");
            piso=escribir.nextInt();
        
        }
        
        this.pisodestino = piso;
          }
    }
       
  
    
        
        public void subirybajar(){
        
        boolean seguir =true ;
        
        System.out.println(" Hola... se supone que soy un ascensor ");
        
        System.out.println(" Ingresa el piso al que querés ir : ");
        
        this.pisodestino = escribir.nextInt();
        
         Seleccionpiso (this.pisodestino);  
         
         while (seguir ) {
             cerrarPuertas();
        
        if (pisoactual<=this.pisodestino){
        
        for (int i =pisoactual;i<this.pisodestino;i++){
            
            
       
        
        System.out.println(" Estas en el piso " + i );
        System.out.println(" Subiendo... " );
        try {
            Thread.sleep (6000);
            
            
        } catch(Exception e) {
            
            System.out.println("Algo está mal");
            
        }
        
        this.pisoactual=i+1;
        
        }
    }
        if(pisoactual>=this.pisodestino) {
            
           
             for (int i =pisoactual;i>this.pisodestino;i--){
                 
                  
                  System.out.println(" Estas en el piso  " + i );
                  System.out.println(" Bajando... ");
                  
                   try {
            Thread.sleep (6000);
            
            
        } catch(Exception e) {
            
            System.out.println("Algo está mal");
            
        }
                 
                 
        
       this.pisoactual=i-1;
       
   
    }
           
        }
        
             
             
      

        
        System.out.println(" Llegamos al piso " +(this.pisoactual));
        abriendoPuertas();
        System.out.println(" ¿Querés ir a otro piso? ");
        System.out.println(" 1-Si ");
        System.out.println(" 2-No, quiero bajarme de esta mierda ");
        System.out.println(" 3-No, quiero quedarme encerrado aca  adentro hasta morir de inanición ");
        int seleccion=escribir.nextInt();
      
        if (seleccion ==1) {
        System.out.print("Ingresa el piso al que queres ir : ");
             this.pisodestino = escribir.nextInt();
        
         Seleccionpiso (this.pisodestino); 
      
            
           
    
           }  if(seleccion==2) {
            abriendoPuertas();
            
            seguir = false;
        }if (seleccion==3) {
               
               System.out.println("Bueno Chau");
               seguir = false;
               
           }
           
      
        
    }
           
    
        }
        
        
        
        public void cerrarPuertas(){
            
            System.out.println(" Cerrando puertas ");
            
            
        }
        
        public void abriendoPuertas(){
            
            
            System.out.println(" Abriendo puertas ");
            
        }
        
    
    
      public static void main(String[] args) {
        elevadorConFor ascensor = new elevadorConFor();
        
        ascensor.subirybajar();
          
      }
    
}
