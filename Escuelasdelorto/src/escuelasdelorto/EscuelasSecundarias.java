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
public class EscuelasSecundarias {
    
    
    int numerodeEscuela;

    public int getNumerodeEscuela() {
        return numerodeEscuela;
    }

    public void setNumerodeEscuela(int numerodeEscuela) {
        this.numerodeEscuela = numerodeEscuela;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getJuntadistrito() {
        return juntadistrito;
    }

    public void setJuntadistrito(String juntadistrito) {
        this.juntadistrito = juntadistrito;
    }

    public String getTipoDeSecundario() {
        return TipoDeSecundario;
    }

    public void setTipoDeSecundario(String TipoDeSecundario) {
        this.TipoDeSecundario = TipoDeSecundario;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    String distrito;
    String juntadistrito;
    String TipoDeSecundario;//tecnico , bachiller, comerciales, historicas
    String Especialidad;//
}
