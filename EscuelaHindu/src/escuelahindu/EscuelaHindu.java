/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelahindu;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2014
 */
public class EscuelaHindu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Profesor lizzy = new Profesor(1, "Lizzy",  500);
      Profesor Melissa = new Profesor (2,"Melissa",700);
      Profesor vanderhorn = new Profesor(2,"vanderhorn",600);
      
      List<Profesor> teacherList = new ArrayList<>();
      teacherList.add(lizzy);
      teacherList.add(Melissa);
      teacherList.add(vanderhorn);
      
      estudiante Tamasha = new estudiante  (1,"Tamasha",4);
      estudiante rakshit = new estudiante (2,"rakshit",12);
      estudiante rabbi = new  estudiante (3,"rabbi",5);
      List <estudiante> listaestudiantes = new ArrayList<>();
      listaestudiantes.add(Tamasha);
      listaestudiantes.add(rakshit);
      listaestudiantes.add(rabbi);
      
      School GHS = new School (teacherList,listaestudiantes);
     System.out.println ("La escuela ganó " + GHS.getTotalMoneyEarned());
    
    Tamasha.Payfees(5000);
    
    System.out.println ("La escuela ganó " + GHS.getTotalMoneyEarned());
    rakshit.Payfees(6000);
    System.out.println ("La escuela ganó " + GHS.getTotalMoneyEarned());
    
    System.out.println("------- Pago de sueldos---------");
    lizzy.receiveSalary(lizzy.getSalary());
    
    System.out.println("GHS gastó para salario de " + lizzy.getName()+ " ahora tiene  $" + GHS.getTotalMoneyEarned() );
    
    }
    
}
