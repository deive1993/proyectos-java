/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author PC16
 */
@Entity
@Table(name = "recetas", catalog = "resto", schema = "")
@NamedQueries({
    @NamedQuery(name = "Recetas.findAll", query = "SELECT r FROM Recetas r")
    , @NamedQuery(name = "Recetas.findByIDreceta", query = "SELECT r FROM Recetas r WHERE r.iDreceta = :iDreceta")
    , @NamedQuery(name = "Recetas.findByIdcomida", query = "SELECT r FROM Recetas r WHERE r.idcomida = :idcomida")
    , @NamedQuery(name = "Recetas.findByIdmatprima", query = "SELECT r FROM Recetas r WHERE r.idmatprima = :idmatprima")
    , @NamedQuery(name = "Recetas.findByCantidad", query = "SELECT r FROM Recetas r WHERE r.cantidad = :cantidad")
    , @NamedQuery(name = "Recetas.findByUnidad", query = "SELECT r FROM Recetas r WHERE r.unidad = :unidad")})
public class Recetas implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDreceta")
    private Integer iDreceta;
    @Basic(optional = false)
    @Column(name = "IDCOMIDA")
    private int idcomida;
    @Basic(optional = false)
    @Column(name = "IDMATPRIMA")
    private int idmatprima;
    @Basic(optional = false)
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "UNIDAD")
    private int unidad;

    public Recetas() {
    }

    public Recetas(Integer iDreceta) {
        this.iDreceta = iDreceta;
    }

    public Recetas(Integer iDreceta, int idcomida, int idmatprima, int cantidad, int unidad) {
        this.iDreceta = iDreceta;
        this.idcomida = idcomida;
        this.idmatprima = idmatprima;
        this.cantidad = cantidad;
        this.unidad = unidad;
    }

    public Integer getIDreceta() {
        return iDreceta;
    }

    public void setIDreceta(Integer iDreceta) {
        Integer oldIDreceta = this.iDreceta;
        this.iDreceta = iDreceta;
        changeSupport.firePropertyChange("IDreceta", oldIDreceta, iDreceta);
    }

    public int getIdcomida() {
        return idcomida;
    }

    public void setIdcomida(int idcomida) {
        int oldIdcomida = this.idcomida;
        this.idcomida = idcomida;
        changeSupport.firePropertyChange("idcomida", oldIdcomida, idcomida);
    }

    public int getIdmatprima() {
        return idmatprima;
    }

    public void setIdmatprima(int idmatprima) {
        int oldIdmatprima = this.idmatprima;
        this.idmatprima = idmatprima;
        changeSupport.firePropertyChange("idmatprima", oldIdmatprima, idmatprima);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        int oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        int oldUnidad = this.unidad;
        this.unidad = unidad;
        changeSupport.firePropertyChange("unidad", oldUnidad, unidad);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDreceta != null ? iDreceta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recetas)) {
            return false;
        }
        Recetas other = (Recetas) object;
        if ((this.iDreceta == null && other.iDreceta != null) || (this.iDreceta != null && !this.iDreceta.equals(other.iDreceta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapp.Recetas[ iDreceta=" + iDreceta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
