/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cososueldosconsola;

import java.util.Scanner;

/**
 *
 * @author 2014
 */

    
    



 public class caiculoSueldoNeto {
    
    public int totalhoras;
    public int totalhorasextras;
    public int  totalhorasfinal;
    public int canthorasextras;
    public int adicional;
 
    public int  sueldobruto;
    
    
    
    public int sueldoNeto (int años, int horas) {
        
        
        sueldobruto(años,horas);     
        int sueldoTope= 18000;
        int retencion =0;
        int sueldoneto=0;
          // 2-al sueldo bruto calculado se le aplica una retencion 
       //del 20% hasta lso 18.000 pesos o el 24 % en caso de superar ese importe
       //para obtener el sueldo neto. Se deberá calcular y 
       // retornar el sueldo neto que le corresponde  al trabajador.

        if (this.sueldobruto >sueldoTope){
            
            retencion= (sueldobruto * 24) / 100;
            
            sueldoneto = sueldobruto - retencion;
            
        } else {
            
            
            retencion= (sueldobruto * 20)/ 100;
            
             sueldoneto = sueldobruto - retencion;
            
        }
        
        
        
        
        
        
        
        
        
        return sueldoneto;
        
        
        
        
    }
    
    public void sueldobruto (int años, int horas){
        
        this.antiguedad(años);
        this.horastrabajadas(horas);
        
        this.sueldobruto = this.adicional + this.totalhorasfinal;
        
        
        
       
        
       
                
        
    }
            
         public void antiguedad (int años ) {
    
      
       int constanti500 =800;
       int constant300= 300;
        int sumaaños=0;
        int sumaaños2=0;
        int x[];
        x = new int[años+1];
       
    
      for (int i = 5; i <=años;i++){
               
               if (i %  5 == 0) {
                   
                   x[i]=constanti500;
                    sumaaños = sumaaños + x[i];
                    
                   
    } else {
                   
                 x[i]=constant300;  
                 sumaaños2 = sumaaños2 + x[i];
                   
               }
               
               
                
      }
    
     this.adicional = (sumaaños+sumaaños2);
 
    
}    
               
            
    
  //  public void antiguedad (int años){
        
      //c-se  recibe un adicional de 800 pesos cada 5 años de antiguedad 
       //d-300 pesos por cada año remanente. 
       
    //   if (años %  5 == 0) {
         //  this.adicional = 800;
           
      //  } else {
           
        //   this.adicional = 300;
        
        
        
    //}
       
       
   //    System.out.println("El adicional es" + this.adicional);
       
   // }
  
    
    
        public void horastrabajadas (int horas){
        
    
 
     if (horas> 160) {
          
          this.canthorasextras  = horas - 160;
                  
                 
          
         // System.out.println(canthorasextras);
          
        this.totalhorasextras = canthorasextras * 150;
         int canthorasComunes = horas - canthorasextras;
         
        
          this.totalhoras= canthorasComunes * 120;
          
        } else {
       
      
      this.totalhoras = horas * 120;
          
  
          
          
          
     }
      
     
      this.totalhorasfinal= this.totalhoras + this.totalhorasextras;
              
      
     //   System.out.println("El total de las horas trabajadas es " + this.totalhorasfinal);
      
     
 
       
        }  
    



 
 public static void main(String[] args) {
     

        caiculoSueldoNeto calculo = new caiculoSueldoNeto();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de horas trabajadas al mes");
        
        int horasTrabMes = leer.nextInt();
        
        System.out.println("Ingrese antiguedad empleado");
        int antiguedad = leer.nextInt();
        
   
           
      
          
          int SueldoNetofinal = calculo.sueldoNeto(antiguedad, horasTrabMes);
          
          System.out.println("El sueldo neto es " + SueldoNetofinal + " pesos ");
 
}
    


}
