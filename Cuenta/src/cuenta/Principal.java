
package cuenta;


public class Principal {


    public static void main(String[] args) {
    
        //instancio la clase con datos
     CajaAhorro ca1=new CajaAhorro(33,200000,"Carlos",33271265,333333,33271265);
        //genero un contador para la posición del array en mi atributo
     int contador=0;
     if(ca1.extraccion(500)){ //como la extraccin se hizo se guarda el movimiento 
         //se instancia en la posicion contado
        ca1.arrayMov[contador] = new Movimiento(ca1.getCuenta(),"Extracción",500);
        contador++;
        System.out.println("Extracción OK");
        }else{
            System.out.println("Saldo insuficiente");
        
        }
  contador
    
    }
    
    
}
    
