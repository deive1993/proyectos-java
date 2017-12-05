/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelahindu;

/**
 *Esta clase es responsable de mantener  el control de los estudiantes
 * pagos, nombre, si se pago la cuota
 * 
 */
public class estudiante {
  private   int id;
  private String name;
  private int grade;
  private int feesPaid;
  private int feesTotal;
  
  //contructor: va servir para crear un nuevo objeto.El roll de un coosntructor
  //es crear un nuevo objeto inicialando los valores
  /**
   * 
   * Fees or every studen 30000 per year
   * fees pais initially is 0
   * @param id id unica para cada estudiante
   * @param name nombre del estudiante
   * @param grade grado del estudainte?
   * 
   */
  
  public estudiante (int id,String name,int grade){
      this.feesPaid=0;
      this.feesTotal=30000;
      this.id=id; //atributo id es igual al argumento id
      this.name=name;
      this.grade=grade;
      
  }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
  
  
  /**
   * 
   * 
   * used to upgrade the students grade
   * @param grade 
   */
  public void setGrade(int grade){
      
      this.grade=grade;
      
  }
  /**
   * add the dees to the fees paid
   * La escuela va a recibir los fondos pe
   * 
   * 
   * @param fees 
   */
    
    public void Payfees(int fees){
        feesPaid+=fees;
        School.udateTotalMoneyEarned(feesPaid);
    }
    
    public  int getramainingFees(){
        
       return feesTotal - feesPaid;
    
        
    
}
    
    
  
}
//Not going to alter student name,students id