/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelahindu;

import java.util.List;

/**
 *
 * @author 2014
 */
public class School {
    
    private List<Profesor> teachers;
    
    private List<estudiante> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Profesor> teachers, List<estudiante> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneySpent=0;
        
        
    }

    public List<Profesor> getTeachers() {
        return teachers;
    }
//agrega un profesor a la escuela
    public void addTeacher(Profesor teacher) {
      teachers.add(teacher);
    }

    public List<estudiante> getStudents() {
        return students;
    }

    public void addEstudents(estudiante student) {
     students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static  void udateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    
    
    public static void updateTotalMoneySpent(int MoneySpent){
        
        totalMoneyEarned-=MoneySpent;
    }
    

  
    
    
    
}
