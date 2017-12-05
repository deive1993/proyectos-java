/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciovectores;
import java.util.Scanner;
import java.time.Year;

/**
 *
 * @author PC12
 */
public class EjercicioVectores {

    private static final int JAVA = 1;
    private static final int CPLUSPLUS = 2;
    private static final int INTRODUCCION_PROG_OBJETOS = 3;
    private static final int VISA = 1;
    private static final int MASTER = 2;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calcularSaldo(10);
        manejarNotas();
    }
    
    //ejercicio 1
    //se csabe a priori cuantos alumnos vienen por empresas
    public static void calcularSaldo(int cantEmpresas){
        
        Scanner in = new Scanner(System.in);
        double saldo = 0;
        int cantCursos;
        int[] cursos;
        int tarjeta;
        int cantPagos;
        boolean flagEmpresa;
        boolean flagMatricula;
        double recargo = 0;
        double descuento = 0;
        int añoActual = Year.now().getValue();
        int añoInscribcion;
        
        
        
        System.out.println("En que año se inscribe?");
        añoInscribcion = in.nextInt();
        
        flagMatricula = añoInscribcion == añoActual;
        
        do{
            System.out.println("ingrese la cantidad de cursos a que se va anotar");
            cantCursos = in.nextInt();
        }while(cantCursos > 3);
        cursos = new int[cantCursos];
        
        for(int i = 0; i < cantCursos; i++){
            System.out.println("ingrese el " + (i + 1) + "° curso al que se anota");
            do{
                cursos[i] = in.nextInt();
            }while(cursos[i] > 3);
        }
        
        System.out.println("vino de parte de una empresa?");
        flagEmpresa = in.nextBoolean();
        
        do{
            System.out.println("ingrese su tarjeta");
            tarjeta = in.nextInt();
            System.out.println("ingrese la cantidad de pagos a realizar");
            cantPagos = in.nextInt();
        }while(!((((tarjeta == VISA)||(tarjeta == MASTER)) && (cantPagos <= 3)) || (((tarjeta != VISA)||(tarjeta != MASTER)) && (cantPagos <= 12))));
        
        for(int i = 0; i < cantCursos; i++){
            switch(cursos[i]){
                case JAVA:
                    saldo += 12000;
                    break;
                case CPLUSPLUS:
                    saldo += 8000;
                    break;
                case INTRODUCCION_PROG_OBJETOS:
                    saldo += 6000;
                    break;
            }
        }
        
        if((tarjeta != VISA) || (tarjeta != MASTER)){
            if(cantPagos == 1){
                recargo = (saldo * 0.10);
            }else if(cantPagos <=6){
                recargo = (saldo * 0.15);
            }else{
                recargo = (saldo * 0.2);
            }
        }
        
        if(cantCursos > 1){
            descuento += (saldo * 0.10);
        }
        
        if((flagEmpresa == true) && (cantEmpresas > 3)){
             descuento += (saldo * 0.20);
        }
        
        if(flagMatricula == true){
            saldo += 3000;
        }else{
            saldo += 2000;
        }
        
        saldo = saldo + recargo - descuento;
        
        System.out.println("el saldo a pagar es $" + saldo);
    }
    
    //ejercicio 2
    private static void manejarNotas(){
        Scanner in = new Scanner(System.in);
        double[] notas = new double[10];
        String[] alumnos = new String[10];
        double promedio = 0;
        double ptgeAprobados = 0;
        double ptgeAplazados = 0;
        String mejorAlumno;
        double mejorNota;
        
        for(int i = 0; i < 10; ++i){
            System.out.println("ingrese el nombre del " + (i + 1) + "° alumno");
            alumnos[i] = in.next();
            System.out.println("ingrese la nota del " + (i + 1) + "° alumno");
            do{
                notas[i] = in.nextInt();
            }while((notas[i] > 10) && (notas[i] < 0));
        }
        
        //promedio
        for(int i = 0; i < 10; ++i){
            promedio += notas[i];
        }
        promedio /= 10;
        System.out.println("\nel promedio es: " + promedio + "\n");
        
        //cantidad de aplazados y aprobados, porcentages
        for(int i = 0; i < 10; ++i){
            if(notas[i] < 4){
                ptgeAplazados++; 
            }else{
                ptgeAprobados++;
            }
        }
        System.out.println("hay " + ptgeAplazados + " aplazados. Es el " + ((ptgeAplazados /= 10)*100) + "%");
        System.out.println("hay " + ptgeAprobados + " aprobados. Es el " + ((ptgeAprobados /= 10)*100) + "%");
        
        //ordenamiento de lista
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10; ++j){
                if(notas[j] < notas[i]){
                    double auxNotas;
                    String auxNombre;
                    auxNotas = notas[i];
                    auxNombre = alumnos[i];
                    notas[i] = notas[j];
                    alumnos[i] = alumnos[j]; 
                    notas[j] = auxNotas;
                    alumnos[j] = auxNombre;
                }
            }
        }
        
        //mejor Alummno
        System.out.println("Mejor nota:\n" + notas[0]);
        System.out.println("alumnos:");
        for(int i = 0; i < 10; ++i){
            if(notas[0] == notas[i]){ 
                System.out.println(alumnos[i]);
            }
        }
        
        //listado alumnos
        System.out.println("\nListado Alumnos:");
        for(int i = 0; i < 10; ++i){
            System.out.println(alumnos[i] + " " + notas[i]);
        }
        
        //alumnos aprobados
        System.out.println("\nalumnos aprobados:");
        for(int i = 0; i < 10; ++i){
            if(notas[i] >= 4){
                System.out.println(alumnos[i]);
            }
        }
        
        //alumnos aplazados
        System.out.println("\nalumnos apalzados:");
        for(int i = 0; i < 10 ; ++i){
            if(notas[i] < 4){
                System.out.println(alumnos[i]);
            }
        }
    }
}
