/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelasdelorto;

/**
 *
 * @author PC16
 */
public class Escuelasdelorto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EscuelasPrimarias Escuela1 = new EscuelasPrimarias();
        
        Escuela1.setDistrito(3);
        Escuela1.setNumerodescuela(1);
        Escuela1.setTipodeJornada("completa");
        Escuela1.setOrientacionEspecialidad("Deportes");
        
        System.out.println("Numero de escuela");
        System.out.println(Escuela1.getNumerodescuela());
        
        System.out.println("Numero de Distrito");
        System.out.println(Escuela1.getDistrito());
        
        System.out.println("Especialidad ");
        System.out.println(Escuela1.getOrientacionEspecialidad());
        
        
        System.out.println(" Tipo de Jornada ");
        System.out.println(Escuela1.getTipodeJornada());
    }
    
}
