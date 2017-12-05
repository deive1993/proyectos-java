/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaulas;

/**
 *
 * @author PC16
 */
public class Aula {
    //constante
    private static final int CANTIDAD_ALUMNOS_MAX= 40;
    private static final int[] CAPACIDAD_AULAS = {40, 35, 30};
    private static final String[] NOMBRE_AULAS = {"Azul", "Verde", "Amarillo"}; 
    private static final int CANTIDAD_AULAS_MAX = 3;
    
    private CapacidadAula[] cantidadAulas = new CapacidadAula[CANTIDAD_AULAS_MAX];
    
    public Aula(){
        for(int i = 0; i < CANTIDAD_AULAS_MAX; ++i){
            cantidadAulas[i] = new CapacidadAula(NOMBRE_AULAS[i],CAPACIDAD_AULAS[i],0);
        }
    }
    
    public void setAlumnos(int alumnos){
        int diferencia;
        int diferenciaAnt = cantidadAulas[0].getCapacidadMax() - alumnos;
        int flagAula = -1;
        
        if((alumnos > CANTIDAD_ALUMNOS_MAX) || (alumnos < 0)){
            return;
        }
        
        for(int i = 0; i < CANTIDAD_AULAS_MAX; ++i){
            diferencia = cantidadAulas[i].getCapacidadMax() - alumnos;
            if((diferencia <= diferenciaAnt) && (diferencia >= 0)){
                flagAula = i;
            }
            diferenciaAnt = diferencia;
        }
        if(flagAula >= 0){
            cantidadAulas[flagAula].setCantidadAlumnos(alumnos);
        }
    }
    
    public void showResult(){
        System.out.println("Aula " + NOMBRE_AULAS[0] + ": (" + CAPACIDAD_AULAS[0] + " bancos)");
        System.out.println("total alumnos: " + cantidadAulas[0].getCantidadAlumnos());
        System.out.println("Aula " + NOMBRE_AULAS[1] + ": (" + CAPACIDAD_AULAS[1] + " bancos)");
        System.out.println("total alumnos: " + cantidadAulas[1].getCantidadAlumnos());
        System.out.println("Aula " + NOMBRE_AULAS[2] + ": (" + CAPACIDAD_AULAS[2] + " bancos)");
        System.out.println("total alumnos: " + cantidadAulas[2].getCantidadAlumnos());
    }
    
}

class CapacidadAula{
   
   private String nombre;
   private int capacidadMax;
   private int cantidadAlumnos;
   
   public CapacidadAula(String nombre,int capacidadMax, int cantAlumnos){
       this.nombre = nombre;
       this.capacidadMax = capacidadMax;
       this.cantidadAlumnos = cantAlumnos;
   }
   
   public String getNombre(){
       return this.nombre;
   }
   
   public int getCapacidadMax(){
       return this.capacidadMax;
   }
   
   public int getCantidadAlumnos(){
       return this.cantidadAlumnos;
   }
   
   public void setCantidadAlumnos(int cantAlumnos){
       this.cantidadAlumnos = cantAlumnos;
   }
}