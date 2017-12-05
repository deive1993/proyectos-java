package GuiaEjercicios;

public class OPERACIONES {

    String nombre; //rstas serian las propiedades de una clase
    int edad;
    long dni;
    long num;
    int horas; //valor hora de trabajo
    int cantht; // cantidad de hora de trabajo
    
    // y los metodos los empiezo aca
    public void saludar (){
        System.out.println("Hola Clase!!!");
    }    
    
    // si quiero declarar un metodo que me devuelva algo
    public long getNeg (long a){ // el long indica que tiene que retornar algo
        return -a;
        
    }
    
    public double getInv (double b) {
        return (1/b);
    }
    
    public int valSueldo (int a, int b) {
        int producto = a*b;
        return producto;
 
}
    
     public int angulos (int a, int b) {
        int resta = 180-a-b;
        return resta;
}
      public double supCirc (double a) {
        double supCir = (3.14*a*a);
        return supCir;
     
}
      
      public double perCirc (double a) {
        double perCir = (2*3.14*a);
        return perCir;
      
}
     
   
      public double Hipo (double a, double b) {
        double Hipo = Math.sqrt(a*a+b*b);
        return Hipo;
}
      
        public double Notas (double a, double b, double c) {
        double prom = (a+b+c)/3;
        return prom;
      
}
        public double perCua (double a) {
        double perCua = Math.sqrt(a)*4;
        return perCua;
}
}