/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogasolinera;

/**
 *
 * @author PC19
 */
public class MetodosGasolinera {
                                       
    //variables
    private static String valorTecladoNumerico = new String();
    private static double valorNumerico;

    private static int litrosIngresados;
    private static double montoIngresado;
    
    private static double precio;
    private static double recargo;
    private static int stockCombustible;
    
    private static double montoAPagar;
    
    //metodos operaciones
    //setters
    public void setLitrosIgresados(){
        this.setMontoIngresado();
        if(MetodosGasolinera.precio > 0){
            MetodosGasolinera.litrosIngresados = (int)(MetodosGasolinera.montoIngresado/MetodosGasolinera.precio);
        }else{
            MetodosGasolinera.litrosIngresados = 0;
        }
    }
    
    public void setMontoPagar(){
        MetodosGasolinera.montoAPagar = (MetodosGasolinera.precio * MetodosGasolinera.litrosIngresados);
        MetodosGasolinera.montoAPagar *= (1 + (MetodosGasolinera.recargo/100));
        MetodosGasolinera.montoAPagar = Math.round( MetodosGasolinera.montoAPagar*100.00)/100.00;
    }

    public void setRecargo(int codigoTarjeta) {
        int aux_recargo = 0;
        if((MetodosGasolinera.valorNumerico >= 3) && (codigoTarjeta == 1)){
            aux_recargo = 10;
        }
        if((MetodosGasolinera.valorNumerico == 1) && (codigoTarjeta == 2)){
            aux_recargo = 5;
        }
        if((MetodosGasolinera.valorNumerico == 2) && (codigoTarjeta == 2)){
            aux_recargo = 10;
        }
        
        MetodosGasolinera.recargo = aux_recargo;
    }

    private void setMontoIngresado() {
        MetodosGasolinera.montoIngresado = MetodosGasolinera.valorNumerico;
    }

    public void setPrecio(double precio) {
        MetodosGasolinera.precio = precio;
    }
    
    public boolean comprobarCodigo(int codigo){
        if((codigo >=50)&&(codigo <=500)){
            return ((codigo % 2) == 0);
        }else{
            return false;
        }
    }
    
    public double devolverCodigo(double codigo){
        return (codigo -1)/2;
    }
    
    //getters

    public int getLitrosIngresados() {
        return litrosIngresados;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }
    
    
    //metodos teclado numerico
    //setters
    public void setValorTecladoNumerico(String valorTecladoNumerico) {
        MetodosGasolinera.valorTecladoNumerico = valorTecladoNumerico;
    }

    public void setValorNumerico(double valorNumerico) {
        MetodosGasolinera.valorNumerico = valorNumerico;
    }
    
    //getters
    public String getValorTecladoNumerico() {
        return MetodosGasolinera.valorTecladoNumerico;
    }

    public double getValorNumerico() {
        return MetodosGasolinera.valorNumerico;
    }
}
