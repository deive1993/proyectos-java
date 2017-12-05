/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectodieta;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author damian
 */
public class MetodosDieta {
    
    private static final String[] LISTA_DIAS_INGLES = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
    //private static final String[] LISTA_DIAS_ESP    = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    private static final String[] LISTA_SEMANA           = {"1ra semana","2da semana","3ra semana","4ta semana"};
    private static int seleccionModo;   //1: dia, 2: semana, 3: mes
    private static int indexDiaIngles;
    private static int indexSemana;
    private static String textoDia      = new String();
    private static String[] textoSemana   = new String[4];
    
    //metodos
    //metodos set
    public void setIndexSemana(String semana){
        for(int i = 0; i < 4; ++i){
            if(semana.equalsIgnoreCase(LISTA_SEMANA[i])){
                MetodosDieta.indexSemana = i;
            }
        }
    }
    
    public void setIndexSemana(int diaMes){
        int semana = diaMes / 7;
        semana = (semana > 3) ? 3:semana;
        MetodosDieta.indexSemana = (semana);
    }
    
    public void setIndexDiaIngles(String dia){
        for(int i = 0; i < 7; ++i){
            if(dia.equalsIgnoreCase(LISTA_DIAS_INGLES[i])){
                MetodosDieta.indexDiaIngles = i;
            }
        }
    }
    
    public void setSeleccionModo(int modo){
        MetodosDieta.seleccionModo = modo;
    }
    
    private void setTextoSemana(String texto){
        String[] token = texto.split("1ra quincena|2da quincena");
        for(int i = 0; i < 4; ++i){
            if((i == 0) || (i == 2)){
                MetodosDieta.textoSemana[i] = token[1];
            }else{
                MetodosDieta.textoSemana[i] = token[2];
            }
        }
    }
    
    private void setTextoDia(String texto, int dia, int semana){
        String[] token = MetodosDieta.textoSemana[semana].split("Lunes|Martes|Miercoles|Jueves|Viernes|Sabado|Domingo");
        MetodosDieta.textoDia = token[dia + 1];
    }
    
    //metodos get
    public int getIndexDiaIngles(){
        return MetodosDieta.indexDiaIngles;
    }
    
    public int getSeleccionModo(){
        return MetodosDieta.seleccionModo;
    }
    
    public int getIndexSemana(){
        return MetodosDieta.indexSemana;
    }
    
    public String getTextoDia(){
        return MetodosDieta.textoDia;
    }
    
    public String getTextoSemana(int semana){
        return MetodosDieta.textoSemana[semana];
    }
    
    //metodos propios
    public void leerArchivo(){
        FileReader fr = null;
        String texto = new String();
        
        try {
           fr = new FileReader("src/doc/semanas.txt");
            
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();//readline devuelve la primer liena que encuentre
            while (cadena != null) //mientras hay lineas que leer
            {
                texto = texto.concat(cadena);
                texto = texto.concat("\n");
                cadena = entrada.readLine();
            }
            
            setTextoSemana(texto);
            setTextoDia(texto, this.getIndexDiaIngles(), this.getIndexSemana());
                
        } catch (FileNotFoundException e1) {
            System.out.println(e1.getMessage());
        } catch (IOException e2) {
            System.out.println(e2.getMessage());
        } finally {
            
            try {
                if (fr !=null) {
                    
                    fr.close();
                }
                
            } catch (IOException e3) {
                System.out.println(e3.getMessage());
            } 
        }  
    }
}
