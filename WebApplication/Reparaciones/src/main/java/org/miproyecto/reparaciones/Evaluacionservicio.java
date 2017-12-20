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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FR
 */
@Entity
@Table(name = "evaluacionservicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluacionservicio.findAll", query = "SELECT e FROM Evaluacionservicio e"),
    @NamedQuery(name = "Evaluacionservicio.findByEvaluacionID", query = "SELECT e FROM Evaluacionservicio e WHERE e.evaluacionID = :evaluacionID"),
    @NamedQuery(name = "Evaluacionservicio.findByCalificacion", query = "SELECT e FROM Evaluacionservicio e WHERE e.calificacion = :calificacion"),
    @NamedQuery(name = "Evaluacionservicio.findByNota", query = "SELECT e FROM Evaluacionservicio e WHERE e.nota = :nota")})
public class Evaluacionservicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EvaluacionID")
    private Integer evaluacionID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Calificacion")
    private int calificacion;
    @Size(max = 255)
    @Column(name = "Nota")
    private String nota;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evaluacionServicioEvaluacionID")
    private Collection<Problema> problemaCollection;
    @JoinColumn(name = "ClienteClienteID", referencedColumnName = "ClienteID")
    @ManyToOne(optional = false)
    private Cliente clienteClienteID;

    public Evaluacionservicio() {
    }

    public Evaluacionservicio(Integer evaluacionID) {
        this.evaluacionID = evaluacionID;
    }

    public Evaluacionservicio(Integer evaluacionID, int calificacion) {
        this.evaluacionID = evaluacionID;
        this.calificacion = calificacion;
    }

    public Integer getEvaluacionID() {
        return evaluacionID;
    }

    public void setEvaluacionID(Integer evaluacionID) {
        this.evaluacionID = evaluacionID;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    @XmlTransient
    public Collection<Problema> getProblemaCollection() {
        return problemaCollection;
    }

    public void setProblemaCollection(Collection<Problema> problemaCollection) {
        this.problemaCollection = problemaCollection;
    }

    public Cliente getClienteClienteID() {
        return clienteClienteID;
    }

    public void setClienteClienteID(Cliente clienteClienteID) {
        this.clienteClienteID = clienteClienteID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (evaluacionID != null ? evaluacionID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluacionservicio)) {
            return false;
        }
        Evaluacionservicio other = (Evaluacionservicio) object;
        if ((this.evaluacionID == null && other.evaluacionID != null) || (this.evaluacionID != null && !this.evaluacionID.equals(other.evaluacionID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.miproyecto.reparaciones.Evaluacionservicio[ evaluacionID=" + evaluacionID + " ]";
    }
    
}
