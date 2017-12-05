/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiaEjercicios;

/**
 *
 * @author PC16
 */
public class Empleado {
    
    // retomas las propiedades privadas de esa clase
    private String nombre;
    private String apellido;
    private int edad;
    private long cuil;
    
    // tal cual llame a la clase voy a llamar un metodo
   public Empleado (String nom, String ape, int eda, long cui){   
    /* esto es el constructor de la clase, llamado igual que la clase
    si yo no le pongo nada, sin darle ningun parametro, es un constructor vacío Empleado ()
    si yo lo quiero completar le ingrso los datos entre (). No necesariamene se ienen que llamar igual.
    Ejemplo apellido, luego lo llamo ape, y luego adentro los igualo
    */
       
    this.apellido=ape;
    this.nombre=nom;
    this.edad=eda;
    cuil=cui;
   }
   
    // métodos get
    public String getNombre(){
         return this.nombre;
    
    
  }
   public String getApellido(){
       return this.apellido;
   }

   public int getEdad(){
       return this.edad;
      
}
   public long getCuit(){ 
       return this.cuil;
}
   public Empleado () {
       //Este es el constructos vacío, tengo que darle método.
       // Al ser privado la propiedad nombre, no puedo setearlo , tiene que ser si o si
      // con un metodo publico. Encapsulamiento. 
   
   }
   // metodo set
   public void setNombre(String nombre){
       this.nombre=nombre;
     
   }
   
   public void setApellido (String apellido) {
       this.apellido=apellido;
      
}
   public void setEdad (int edad) {
       this.edad=edad;
   }
   
   public void setCuil (long Cuil) {
       this.cuil=cuil;
   }
}