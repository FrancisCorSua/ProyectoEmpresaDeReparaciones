/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.miproyecto.reparaciones;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FR
 */
@Entity
@Table(name = "trabajador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trabajador.findAll", query = "SELECT t FROM Trabajador t"),
    @NamedQuery(name = "Trabajador.findByTrabajadorID", query = "SELECT t FROM Trabajador t WHERE t.trabajadorID = :trabajadorID"),
    @NamedQuery(name = "Trabajador.findByTrabajadorUsuario", query = "SELECT t FROM Trabajador t WHERE t.trabajadorUsuario = :trabajadorUsuario"),
    @NamedQuery(name = "Trabajador.findByTrabajadorContrasena", query = "SELECT t FROM Trabajador t WHERE t.trabajadorContrasena = :trabajadorContrasena"),
    @NamedQuery(name = "Trabajador.findByTrabajadorNombre", query = "SELECT t FROM Trabajador t WHERE t.trabajadorNombre = :trabajadorNombre"),
    @NamedQuery(name = "Trabajador.findByTrabajadorCategoria", query = "SELECT t FROM Trabajador t WHERE t.trabajadorCategoria = :trabajadorCategoria")})
public class Trabajador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TrabajadorID")
    private Integer trabajadorID;
    @Size(max = 255)
    @Column(name = "TrabajadorUsuario")
    private String trabajadorUsuario;
    @Size(max = 12)
    @Column(name = "TrabajadorContrasena")
    private String trabajadorContrasena;
    @Size(max = 20)
    @Column(name = "TrabajadorNombre")
    private String trabajadorNombre;
    @Size(max = 12)
    @Column(name = "TrabajadorCategoria")
    private Integer trabajadorCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "trabajadorTrabajadorID")
    private Collection<Problema> problemaCollection;

    public Trabajador() {
    }

    public Trabajador(Integer trabajadorID) {
        this.trabajadorID = trabajadorID;
    }

    public Integer getTrabajadorID() {
        return trabajadorID;
    }

    public void setTrabajadorID(Integer trabajadorID) {
        this.trabajadorID = trabajadorID;
    }

    public String getTrabajadorUsuario() {
        return trabajadorUsuario;
    }

    public void setTrabajadorUsuario(String trabajadorUsuario) {
        this.trabajadorUsuario = trabajadorUsuario;
    }

    public String getTrabajadorContrasena() {
        return trabajadorContrasena;
    }

    public void setTrabajadorContrasena(String trabajadorContrasena) {
        this.trabajadorContrasena = trabajadorContrasena;
    }

    public String getTrabajadorNombre() {
        return trabajadorNombre;
    }

    public void setTrabajadorNombre(String trabajadorNombre) {
        this.trabajadorNombre = trabajadorNombre;
    }

    public Integer getTrabajadorCategoria() {
        return trabajadorCategoria;
    }

    public void setTrabajadorCategoria(Integer trabajadorCategoria) {
        this.trabajadorCategoria = trabajadorCategoria;
    }

    @XmlTransient
    public Collection<Problema> getProblemaCollection() {
        return problemaCollection;
    }

    public void setProblemaCollection(Collection<Problema> problemaCollection) {
        this.problemaCollection = problemaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trabajadorID != null ? trabajadorID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajador)) {
            return false;
        }
        Trabajador other = (Trabajador) object;
        if ((this.trabajadorID == null && other.trabajadorID != null) || (this.trabajadorID != null && !this.trabajadorID.equals(other.trabajadorID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.miproyecto.reparaciones.Trabajador[ trabajadorID=" + trabajadorID + " ]";
    }
    
}
