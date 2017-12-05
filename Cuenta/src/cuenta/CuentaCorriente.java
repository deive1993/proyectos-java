
package cuenta;

public class CuentaCorriente extends CuentaT{
    
    private double descubierto;

    
   public CuentaCorriente(double cuenta, double saldo, String titular,double dni, double cbu, double cuil, double descubierto){
   super (cuenta,saldo,titular,dni,cbu,cuil); 
   this.descubierto = descubierto; 
}
   
   //metodo get
   public double getDescubierto(){
       return this.descubierto;
}

   public CuentaCorriente(){
       
   }
   // metodo set
   
   public void setDescubierto(){
       this.descubierto=descubierto ;
   
}
}