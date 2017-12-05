/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaEjercicios;

/**

 * @author PC12
 */
import java.util.Scanner; // importamos las librerias de JAVA. 

public class GuiaEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tengo que instanciar esa clase. Operaciones. 
        
       OPERACIONES calcular = new OPERACIONES();
       
       //Si quiero llenar propiedades      
       calcular.nombre = "diego";
       
        //Si quiero udar un método
       calcular.saludar();
       
       // Ejercicio 1.1
        long num1 = calcular.getNeg(8);
        System.out.println(num1);
        
        double num2 = calcular.getInv(8);
        System.out.println(num2);  
      
        // Ejercicio 1.2
        int num3 = calcular.valSueldo(80, 8);
        System.out.println(num3);
       
        //Ejercicio 1.3
        int num4 = calcular.angulos(40, 60);
        System.out.println(num4);
        
        //Ejercicio 1.4
        double num5 = calcular.supCirc(5);
        System.out.println(num5);
        
        double num6 = calcular.perCirc(5);
        System.out.println(num6);
        
        //Ejercicio 1.5
        double num7 = calcular.Hipo(3, 4);
        System.out.println(num7);
        
        //Ejercicio 1.6
        double num8 = calcular.Notas(3, 8, 2);
        System.out.println(num8);
         
        //Ejercicio 1.7
        double num9 = calcular.perCua(81);
        System.out.println(num9);
        
        Scanner lector = new Scanner(System.in);
        
        Empleado empleado1 = new Empleado("Bárbara","Mele",29,33271265);
        //necesito un constructor que llene esos daos ()
        //instanciamos empleado como empleado1 y le insanciamos los datos
        System.out.println("El nombre del empeado es: "+ empleado1.getNombre() + " " + empleado1.getApellido());
                
               //necesito generar un metodo que me traiga el dato. Se hace por metodo para que no haya error.
               //si nó se puede camair
        
        Empleado empleado2 = new Empleado(); //llamo al constructor vacio
        
        System.out.println("Ingresas la edad del empleado ");
        int edad = lector.nextInt();
        System.out.println("Ingrese el CUIL del empleado");
        long cuil = lector.nextLong();
        
        empleado2.setNombre("Nico");
        empleado2.setApellido("Perez");
        empleado2.setCuil(33333333);
        empleado2.setEdad(edad);
       
        Docente docente1 = new Docente ();
        docente1.setDedicacion("semi-exclusiva");
        
        System.out.println("El nombre del empleado es: "+ empleado1.getNombre());
        System.out.println("La edad del empleado es: "+ empleado1.getEdad());
        
      Administrativo administrativo1 = new Administrativo ();
      administrativo1.setTurno("Noche");
      System.out.println("El turno del administrativo es: "+ administrativo1.getTurno());
      
    }
    
    
   
    
}
