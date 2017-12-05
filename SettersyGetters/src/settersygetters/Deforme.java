/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settersygetters;

import javax.swing.JOptionPane;

/**
 *
 * @author PC16
 */
public class Deforme {
    
    private String nombre;
    private String Apellido;
    private int edad;
    private char sexo;
    private int peso;
    private int cantidadDeOjos;
    private int cantidadDeBrazos;
    private int cantidadDecabezas;
    private int cantidadDePiernas;
    private String Documento;

    public String getApellido() {
        
        
    
        return Apellido;
    }

    public void setApellido(String Apellido) {
        
       //Apellido= JOptionPane.showInputDialog("Ingrese Apellido");
        this.Apellido = Apellido;
    }
    
    
    public void setnombre(String nombre){
        
        this.nombre=nombre;
        
        
   }
    
    public String getnombre(){
        
        
        return nombre;
        
    }
    
    
    public void edad (int edad){
         this.edad=edad;
    
}
    
   public int edad(){
       
       return edad;
   } 

   public void peso (int peso){
       
       
       this.peso=peso;
       
   }
   
   
   public int peso(){
       
       return peso;
   }
   
   
     public void cantidadDeOjos (int cantidadDeOjos){
         this.cantidadDeOjos=cantidadDeOjos;
    
}
    
   public int cantidadDeOjos(){
       
       return cantidadDeOjos;
               
               
               
               
                
  
    
}
   
   public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
   
      public void cantidadDeBrazos (int cantidadDeBrazos){
         this.cantidadDeBrazos=cantidadDeBrazos;}
    
   
      
      
      public int cantidadDeBrazos(){
       
       return cantidadDeBrazos;
  
  

}

    public int getCantidadDecabezas() {
        return cantidadDecabezas;
    }

    public void setCantidadDecabezas(int cantidadDecabezas) {
        this.cantidadDecabezas = cantidadDecabezas;
    }

    public int getCantidadDePiernas() {
        return cantidadDePiernas;
    }

    public void setCantidadDePiernas(int cantidadDePiernas) {
        this.cantidadDePiernas = cantidadDePiernas;
    }
   
   public void setDocumento(String Documento){
       
       this.Documento=Documento;
   }    
   
   
   public String getDocumento(){
       
       return Documento;
       
   } 
  
 
   
}