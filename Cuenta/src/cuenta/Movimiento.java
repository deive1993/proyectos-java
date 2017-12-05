
package cuenta;


public class Movimiento {
    private double cuenta;
    private String descripcion; 
    private double monto;
    
    public Movimiento () {
    }
    
    public Movimiento (double cuenta, String desc, double monto) {
        this.cuenta=cuenta;
        this.descripcion=desc;
        this.monto=monto;
    }
    public double getCuenta(){
        return this.cuenta;
}
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getMonto(){
        return this.monto;
    }
    
    public void setCuenta(double cuenta){
        this.cuenta=cuenta;
    }
    
    
    public void setDescripcion(String desc) {
        this.descripcion=desc; 
    }
    public void setMonto (double monto) {
        this.monto=monto;
    }
    public void setMovimiento (double cuenta, String desc, double monto){ 
        this.cuenta=cuenta;
        this.descripcion=desc;
        this.monto=monto;
    }
}