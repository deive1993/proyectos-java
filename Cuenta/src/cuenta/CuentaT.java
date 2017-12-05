package cuenta;

public class CuentaT {
    //atributos
    private double cuenta;
    private double saldo;
    private String titular;
    private double dni;
    private double cbu;
    private double cuil;
    public Movimiento arrayMov[] = new Movimiento[100];
    
    //private Movimientos mov(); //en tipo de datos  
    //cuenta1.movimientos.
    
    //solo se puede acceder desde la clase. 
    
    // constructor lleno
   public CuentaT (double cuenta, double saldo, String titular, double dni, double cbu, double cuil){
   this.cuenta=cuenta; //asignamos a los atributos
   this.saldo=saldo;
   this.titular=titular; 
   this.dni=dni;
   this.cuil=cuil;
   this.cbu=cbu;
}
   //metodos get
   public double getCuenta(){
       return this.cuenta;
    
}
  public double getSaldo(){
      return this.saldo;
}
  public String getTitular(){
      return this.titular;
  }
  
 public double getDni(){
     return this.dni;
 }
 
 public double getCbu(){
     return this.cbu;
 }
 
 public double getCuil(){
     return this.cuil;
 }
 
 //constructor vacío
  public CuentaT (){
}
  //metodos set
  public void setCuenta(double cuenta){
       this.cuenta=cuenta;
}
 public void setSaldo(double saldo){ 
    this.saldo=saldo;
}
 public void setTitular(String titular){
     this.titular=titular;
}
 public void setDni (double dni){
     this.dni=dni;
 }
public  void setCbu (double cbu){
    this.cbu=cbu;
}
public void setCuil  (double cuil) {
    this.cuil=cuil;
}

}
 
