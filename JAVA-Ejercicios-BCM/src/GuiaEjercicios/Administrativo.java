
package GuiaEjercicios;


public class Administrativo extends Empleado {

 private String turno;     
    
public Administrativo (String Nombre, String Apellido, int edad, long Cuil,String turno){
super (Nombre, Apellido, edad, Cuil);
this.turno = turno;
    
}
   public Administrativo () {
}
//método get
    
    public String getTurno() {
        return this.turno;
}
//metodo set
    public void setTurno(String turno){
        this.turno=turno;
}
}