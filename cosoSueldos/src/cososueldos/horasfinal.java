/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cososueldos;

/**
 *
 * @author PC16
 */
public class horasfinal {
    
    public int totalhoras;
    public int totalhorasextras;
    public int  totalhorasfinal;
    public int canthorasextras;

    public int getTotalhoras() {
        return totalhoras;
    }

    public void setTotalhoras(int totalhoras) {
        this.totalhoras = totalhoras;
    }

    public int getTotalhorasextras() {
        return totalhorasextras;
    }

    public void setTotalhorasextras(int totalhorasextras) {
        this.totalhorasextras = totalhorasextras;
    }

    public int getTotalhorasfinal() {
        return totalhorasfinal;
    }

    public void setTotalhorasfinal(int totalhorasfinal) {
        this.totalhorasfinal = totalhorasfinal;
    }
    
    
    
        public void horastrabajadas (int horas){
        
    
 
     if (horas> 160) {
          
          this.canthorasextras  = horas - 160;
                  
                 
          
          System.out.println(canthorasextras);
          
        this.totalhorasextras = canthorasextras * 150;
         
          this.totalhoras = 160 * 120;
          
        } else {
       
      
      
       
  
          
          
          
     }
      
     
      this.totalhorasfinal = (this.totalhoras +  this.totalhorasextras);
              
      
        System.out.println(this.totalhorasfinal);
      
     
 
       
        }  
    

}

