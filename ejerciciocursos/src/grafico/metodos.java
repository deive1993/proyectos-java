/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafico;

/**
 *
 * @author PC16
 */
public class metodos {
    
    
   
    
     public double PromedioGeneral ( int array [],int valorarray){
        //decir promedio general de la meteria
       double suma =0;
        double resultado=0;
         for (int i = 0 ; i < array.length; i++){
            
            
            suma = suma +array[i];
            
           
            
            
            
        }
        
        
        
         double promedioGeneral = suma/valorarray;
            
            resultado = promedioGeneral;
           
            
        
        return resultado;
        
        
        
        
    }
    
    
    public int aplazo (int array[]) {
        
        int cantidadaplazados=0;
        for (int i = 0 ; i < array.length; i++){
            
          
            if (array[i] < 4) {
                
                
                cantidadaplazados=cantidadaplazados + 1;
                
                
            }
            
            
            
            
            
            
            
        }
        
        
        
        
        
        return cantidadaplazados;
        
        
        
        
    }
    
    
    public int  aprobados(int array[]){
        
        
        int cantidadaprobados=0;
        for (int i = 0 ; i < array.length; i++){
            
          
            if (array[i] >= 4) {
                
                
                cantidadaprobados=cantidadaprobados + 1;
                
                
            }
            
            
            
            
          
            
            
        }
        
        
        
        
        return cantidadaprobados;
        
        
    } // fin metodo aprobados
    
    
    
    public int PorcentajeAplazados(int cantidadTotalAlu, int cantidadAplazados){
       
        
     
        
        
        int PorcentajeAplazados=0;
  
        PorcentajeAplazados = (cantidadAplazados * 100) /cantidadTotalAlu;
        
        
        
        
        return PorcentajeAplazados;
        
    
    }
    
    
    public int PorcentajeAprobados(int cantidadTotalAlu, int cantidadaprobados){
        
        
        int PorcentajeAprobados=0;
        
        
        
        PorcentajeAprobados = (cantidadaprobados * 100) /cantidadTotalAlu;
        
        
        
        return PorcentajeAprobados;
        
        
        
        
        
        
    }
    
    


    
     public void MostrarListadoaplazados (int []arreglo,String [] arreglo2,int x){
       
         int posicion = 0;
             
         for (int i=0 ; i <arreglo.length ; i++ ){
         
         if (arreglo[i] < x){
             posicion = i;
             
          
           System.out.println ( "El alumno " + arreglo2[posicion] + " fue aplazado");
             
             
         }
         
         
         
         
     }
         
         
         
       
         
         
     }
     
     
     
     public void MostrarListadoAprobados (int []arreglo,String [] arreglo2,int x){
         
         int posicion = 0;
             
         for (int i=0 ; i <arreglo.length ; i++ ){
         
         if (arreglo[i] >= x){
             posicion = i;
             
          
           System.out.println ( "El alumno " + arreglo2[posicion] + " fue aprobado");
             
             
         }
         
         
         
         
     }
         
         
         
         
         
         
     }
     
     
     public void MostarMejorCalificado (int []arreglo,String [] arreglo2){
         
             
      int posicion=0;
         int mayor = arreglo[0];
         for (int i=0 ; i <arreglo.length ; i++ ){
             
             
             if (arreglo[i]>mayor){
             
             mayor = arreglo[i];
            posicion = i;
           
         }
         
         
         
         
         
     }
         
          System.out.println("El alumno " + arreglo2[posicion] + " tiene la nota mas alta " + arreglo[posicion]);
     }
    
    
     public void NombresYNotasMayorAMenor (int []arreglo,String [] arreglo2){
         
        int  aux;
       String aux2;
        
        boolean cambios=false;//cambia true cada vez que hay un cambio
        
        while(true) {
            cambios=false;
            for (int i =1 ;i < arreglo.length ; i++){
            
                if (arreglo[i]>arreglo[i-1])    //i-1 sería una posicion hacia la izquierda comparara la posicion actual con la de la izquierda
                {
                    
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1]; //asigno el valor del arreglo izquierda
                    arreglo[i-1] = aux; //asignamos el valor de lo que originalmente tenia arreglo[i] a la variable aux
                    
                    aux2 = arreglo2[i];
                    arreglo2[i] = arreglo2[i-1]; //asigno el valor del arreglo izquierda
                    arreglo2[i-1] = aux2; 
                    cambios =true;
                }
            
        }
           
            
            
            
            if (cambios==false)
                break;
            
            
        }
         
         
            
            System.out.println("Lista de nombres  y notas de mayor a menor ( Alumno con mejor nota primero y con peor nota ultimo ");
            
             for (int i =0 ;i < arreglo.length ; i++){
                 
                 System.out.println("La nota del alumno " + arreglo2[i]+ " es " + arreglo[i]);
                 
             }
            
         
         
     }

     
       
     public int MostarMejorCalificadoGrafico (int []arreglo,String [] arreglo2){
         
             
      int posicion=0;
         int mayor = arreglo[0];
         for (int i=0 ; i <arreglo.length ; i++ ){
             
             
             if (arreglo[i]>mayor){
             
             mayor = arreglo[i];
            posicion = i;
           
         }
         
         
         
         
         
     }
         
         
         
        
         return posicion;
     }
    
     
     
         public void MostrarListadoAprobadosGrafico (int []arreglo,String [] arreglo2,int x){
         
         int posicion = 0;
             
         for (int i=0 ; i <arreglo.length ; i++ ){
         
         if (arreglo[i] >= x){
             posicion = i;
             
          
           System.out.println ( "El alumno " + arreglo2[posicion] + " fue aprobado");
             
             
         }
         
         
         
         
     }
         
         
         
         
         
         
     }
         
         public void NombresYNotasMayorAMenorGrafico (int []arreglo,String [] arreglo2){
             
                 int  aux;
       String aux2;
        
        boolean cambios=false;//cambia true cada vez que hay un cambio
        
        while(true) {
            cambios=false;
            for (int i =1 ;i < arreglo.length ; i++){
            
                if (arreglo[i]>arreglo[i-1])    //i-1 sería una posicion hacia la izquierda comparara la posicion actual con la de la izquierda
                {
                    
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i-1]; //asigno el valor del arreglo izquierda
                    arreglo[i-1] = aux; //asignamos el valor de lo que originalmente tenia arreglo[i] a la variable aux
                    
                    aux2 = arreglo2[i];
                    arreglo2[i] = arreglo2[i-1]; //asigno el valor del arreglo izquierda
                    arreglo2[i-1] = aux2; 
                    cambios =true;
                }
            
        }
           
            
            
            
            if (cambios==false)
                break;
            
            
        }
         
         
            
            
          
             
         }
     
     
}
