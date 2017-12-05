/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelahindu;

/**esta clase es responsable de manter un registro
 * del nombre de los porfesores , su id y su salario.
 *
 * @author 2014
 */
public class Profesor {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;
    
    public Profesor (int id,String name, int salary ){
        
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    public String getName() {
        return this.name;
    
    
}
    
    public int getid(){
        return id;
    }
    
    public int getSalary(){
        
        return salary;
    }
    
    public void setSalary(int salary){

this.salary=salary;
}
    
    
   public void receiveSalary (int salary){
     salaryEarned+=salary;   
     School.updateTotalMoneySpent(salary);   
    }
}

