
package GuiaEjercicios;

public class Docente extends Empleado {
/*cómo le decimos que es una clase que herdeda de otra. Usando la palabra extend.
 La clase Docente hereda todas las  propiedades de empleado
 Para diferenciarlo le vamos a poner una propiedad más. Tiene una propiedad distinta ahora. 
 que es la dedicación.*/
    private String dedicacion; 
    
    //Nombre de clase mayuscula.Nombre de objeto minuscula. 
    //Nombro los mismos parametros y agrego lo distino nomás. 
    public Docente (String Nombre, String Apellido, int edad, long Cuil,String dedicacion){
    // a las clases padres se les llama super clase
    super(Nombre,Apellido,edad,Cuil);
    this.dedicacion = dedicacion;
}
    public Docente () {
}
//método get
    
    public String getDedicacion() {
        return this.dedicacion;
}
//metodo set
    public void setDedicacion(String dedi){
        this.dedicacion=dedi;
}
 
}
