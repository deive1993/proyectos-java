package paquete;

public class Auto {
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeropuertas;
    String modelo;
    private boolean encendido;
    
    public Auto() {
        this.peso = 1000;
        this.altura = 1.20;
        this.ancho = 0.90;
        this.largo = 2.05;
        this.numeropuertas = 5;
        this.modelo = "Renault";
    }
    public double obtenerPeso()
    {
        return this.peso;
    }
    
    public void encender()
    {
        this.encendido = true;
        System.out.println("El auto esta encenddo");
    }
    public void apagado()
    {
        this.encendido = false;
        System.out.println("El auto esta apagado");
    }
    public void estado()
    {
        if(this.encendido==true)
        {
            System.out.println("El auto esta encenddo");
        }
        else
        {
            System.out.println("El auto esta apagado");
        }
    }
}
