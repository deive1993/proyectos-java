/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author PC16
 */
public class CajaAhorro extends CuentaT {
       
   public CajaAhorro(double cuenta, double saldo, String titular, double dni, double cbu, double cuil){
       super (cuenta,saldo,titular,dni,cbu,cuil); 
   }
   
    public CajaAhorro(){
        
    }
//metodos
    public boolean extraccion (double monto){
        if(monto <= this.getSaldo()) {
        this.setSaldo(this.getSaldo()-monto);
        return true;
        }else{
                return false;
        }
    }
}
