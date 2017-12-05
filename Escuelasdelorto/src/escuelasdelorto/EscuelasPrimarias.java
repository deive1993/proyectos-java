/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuelasdelorto;

/**
 *
 * @author PC16
 */
public class EscuelasPrimarias {
    int numerodescuela;
    String tipodeJornada;
    String orientacionEspecialidad; //arte o Deporte
    int distrito;
    
    //constructor
    public EscuelasPrimarias() {
    
    }

    public int getNumerodescuela() {
        return numerodescuela;
    }

    public void setNumerodescuela(int numerodescuela) {
        this.numerodescuela = numerodescuela;
    }

    public String getTipodeJornada() {
        return tipodeJornada;
    }

    public void setTipodeJornada(String tipodeJornada) {
        this.tipodeJornada = tipodeJornada;
    }

    public String getOrientacionEspecialidad() {
        return orientacionEspecialidad;
    }

    public void setOrientacionEspecialidad(String orientacionEspecialidad) {
        this.orientacionEspecialidad = orientacionEspecialidad;
    }

    public int getDistrito() {
        return distrito;
    }

    public void setDistrito(int distrito) {
        this.distrito = distrito;
    }
}




