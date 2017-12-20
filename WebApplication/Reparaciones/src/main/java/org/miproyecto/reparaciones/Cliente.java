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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClienteID", query = "SELECT c FROM Cliente c WHERE c.clienteID = :clienteID"),
    @NamedQuery(name = "Cliente.findByClienteUsuario", query = "SELECT c FROM Cliente c WHERE c.clienteUsuario = :clienteUsuario"),
    @NamedQuery(name = "Cliente.findByClienteContrasena", query = "SELECT c FROM Cliente c WHERE c.clienteContrasena = :clienteContrasena"),
    @NamedQuery(name = "Cliente.findByClienteNombre", query = "SELECT c FROM Cliente c WHERE c.clienteNombre = :clienteNombre"),
    @NamedQuery(name = "Cliente.findByCodigoPostal", query = "SELECT c FROM Cliente c WHERE c.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Cliente.findByClienteTelefono", query = "SELECT c FROM Cliente c WHERE c.clienteTelefono = :clienteTelefono")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ClienteID")
    private Integer clienteID;
    @Size(max = 255)
    @Column(name = "ClienteUsuario")
    private String clienteUsuario;
    @Size(max = 12)
    @Column(name = "ClienteContrasena")
    private String clienteContrasena;
    @Size(max = 20)
    @Column(name = "ClienteNombre")
    private String clienteNombre;
    @Size(max = 12)
    @Column(name = "CodigoPostal")
    private String codigoPostal;
    @Size(max = 5)
    @Column(name = "ClienteTelefono")
    private String clienteTelefono;
    @Size(max = 5)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteClienteID")
    private Collection<Problema> problemaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteClienteID")
    private Collection<Evaluacionservicio> evaluacionservicioCollection;

    public Cliente() {
    }

    public Cliente(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public Integer getClienteID() {
        return clienteID;
    }

    public void setClienteID(Integer clienteID) {
        this.clienteID = clienteID;
    }

    public String getClienteUsuario() {
        return clienteUsuario;
    }

    public void setClienteUsuario(String clienteUsuario) {
        this.clienteUsuario = clienteUsuario;
    }

    public String getClienteContrasena() {
        return clienteContrasena;
    }

    public void setClienteContrasena(String clienteContrasena) {
        this.clienteContrasena = clienteContrasena;
    }

    public String getClienteNombre() {
        return clienteNombre;
    }

    public void setClienteNombre(String clienteNombre) {
        this.clienteNombre = clienteNombre;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getClienteTelefono() {
        return clienteTelefono;
    }

    public void setClienteTelefono(String clienteTelefono) {
        this.clienteTelefono = clienteTelefono;
    }

    @XmlTransient
    public Collection<Problema> getProblemaCollection() {
        return problemaCollection;
    }

    public void setProblemaCollection(Collection<Problema> problemaCollection) {
        this.problemaCollection = problemaCollection;
    }

    @XmlTransient
    public Collection<Evaluacionservicio> getEvaluacionservicioCollection() {
        return evaluacionservicioCollection;
    }

    public void setEvaluacionservicioCollection(Collection<Evaluacionservicio> evaluacionservicioCollection) {
        this.evaluacionservicioCollection = evaluacionservicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clienteID != null ? clienteID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clienteID == null && other.clienteID != null) || (this.clienteID != null && !this.clienteID.equals(other.clienteID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.miproyecto.reparaciones.Cliente[ clienteID=" + clienteID + " ]";
    }
    
}
