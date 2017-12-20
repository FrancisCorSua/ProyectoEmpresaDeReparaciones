/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.miproyecto.reparaciones;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FR
 */
@Entity
@Table(name = "problema")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Problema.findAll", query = "SELECT p FROM Problema p"),
    @NamedQuery(name = "Problema.findByProblemaID", query = "SELECT p FROM Problema p WHERE p.problemaID = :problemaID"),
    @NamedQuery(name = "Problema.findByProblemaCategoria", query = "SELECT p FROM Problema p WHERE p.problemaCategoria = :problemaCategoria"),
    @NamedQuery(name = "Problema.findByProblemaNota", query = "SELECT p FROM Problema p WHERE p.problemaNota = :problemaNota"),
    @NamedQuery(name = "Problema.findByProblemaEstado", query = "SELECT p FROM Problema p WHERE p.problemaEstado = :problemaEstado"),
    @NamedQuery(name = "Problema.findByProblemaFecha", query = "SELECT p FROM Problema p WHERE p.problemaFecha = :problemaFecha"),
    @NamedQuery(name = "Problema.findByTrabajadorSolicitado", query = "SELECT p FROM Problema p WHERE p.trabajadorSolicitado = :trabajadorSolicitado")})
public class Problema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ProblemaID")
    private Integer problemaID;
    @Column(name = "ProblemaCategoria")
    private Integer problemaCategoria;
    @Size(max = 255)
    @Column(name = "ProblemaNota")
    private String problemaNota;
    @Column(name = "ProblemaEstado")
    private Integer problemaEstado;
    @Column(name = "ProblemaFecha")
    @Temporal(TemporalType.DATE)
    private Date problemaFecha;
    @Size(max = 255)
    @Column(name = "TrabajadorSolicitado")
    private String trabajadorSolicitado;
    @Size(max = 12) 
    @JoinColumn(name = "ClienteClienteID", referencedColumnName = "ClienteID")
    @ManyToOne(optional = false)
    private Cliente clienteClienteID;
    @JoinColumn(name = "EvaluacionServicioEvaluacionID", referencedColumnName = "EvaluacionID")
    @ManyToOne(optional = false)
    private Evaluacionservicio evaluacionServicioEvaluacionID;
    @JoinColumn(name = "TrabajadorTrabajadorID", referencedColumnName = "TrabajadorID")
    @ManyToOne(optional = false)
    private Trabajador trabajadorTrabajadorID;

    public Problema() {
    }

    public Problema(Integer problemaID) {
        this.problemaID = problemaID;
    }

    public Integer getProblemaID() {
        return problemaID;
    }

    public void setProblemaID(Integer problemaID) {
        this.problemaID = problemaID;
    }

    public Integer getProblemaCategoria() {
        return problemaCategoria;
    }

    public void setProblemaCategoria(Integer problemaCategoria) {
        this.problemaCategoria = problemaCategoria;
    }

    public String getProblemaNota() {
        return problemaNota;
    }

    public void setProblemaNota(String problemaNota) {
        this.problemaNota = problemaNota;
    }

    public Integer getProblemaEstado() {
        return problemaEstado;
    }

    public void setProblemaEstado(Integer problemaEstado) {
        this.problemaEstado = problemaEstado;
    }

    public Date getProblemaFecha() {
        return problemaFecha;
    }

    public void setProblemaFecha(Date problemaFecha) {
        this.problemaFecha = problemaFecha;
    }

    public String getTrabajadorSolicitado() {
        return trabajadorSolicitado;
    }

    public void setTrabajadorSolicitado(String trabajadorSolicitado) {
        this.trabajadorSolicitado = trabajadorSolicitado;
    }

    public Cliente getClienteClienteID() {
        return clienteClienteID;
    }

    public void setClienteClienteID(Cliente clienteClienteID) {
        this.clienteClienteID = clienteClienteID;
    }

    public Evaluacionservicio getEvaluacionServicioEvaluacionID() {
        return evaluacionServicioEvaluacionID;
    }

    public void setEvaluacionServicioEvaluacionID(Evaluacionservicio evaluacionServicioEvaluacionID) {
        this.evaluacionServicioEvaluacionID = evaluacionServicioEvaluacionID;
    }

    public Trabajador getTrabajadorTrabajadorID() {
        return trabajadorTrabajadorID;
    }

    public void setTrabajadorTrabajadorID(Trabajador trabajadorTrabajadorID) {
        this.trabajadorTrabajadorID = trabajadorTrabajadorID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (problemaID != null ? problemaID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Problema)) {
            return false;
        }
        Problema other = (Problema) object;
        if ((this.problemaID == null && other.problemaID != null) || (this.problemaID != null && !this.problemaID.equals(other.problemaID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.miproyecto.reparaciones.Problema[ problemaID=" + problemaID + " ]";
    }
    
}
