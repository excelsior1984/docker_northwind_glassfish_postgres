/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test6;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author root
 */
@Entity
@Table(name = "territories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Territories.findAll", query = "SELECT t FROM Territories t")
    , @NamedQuery(name = "Territories.findByTerritoryId", query = "SELECT t FROM Territories t WHERE t.territoryId = :territoryId")
    , @NamedQuery(name = "Territories.findByTerritoryDescription", query = "SELECT t FROM Territories t WHERE t.territoryDescription = :territoryDescription")})
public class Territories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "territory_id")
    private String territoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "territory_description")
    private String territoryDescription;
    @ManyToMany(mappedBy = "territoriesCollection")
    private Collection<Employees> employeesCollection;
    @JoinColumn(name = "region_id", referencedColumnName = "region_id")
    @ManyToOne(optional = false)
    private Region regionId;

    public Territories() {
    }

    public Territories(String territoryId) {
        this.territoryId = territoryId;
    }

    public Territories(String territoryId, String territoryDescription) {
        this.territoryId = territoryId;
        this.territoryDescription = territoryDescription;
    }

    public String getTerritoryId() {
        return territoryId;
    }

    public void setTerritoryId(String territoryId) {
        this.territoryId = territoryId;
    }

    public String getTerritoryDescription() {
        return territoryDescription;
    }

    public void setTerritoryDescription(String territoryDescription) {
        this.territoryDescription = territoryDescription;
    }

    @XmlTransient
    public Collection<Employees> getEmployeesCollection() {
        return employeesCollection;
    }

    public void setEmployeesCollection(Collection<Employees> employeesCollection) {
        this.employeesCollection = employeesCollection;
    }

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region regionId) {
        this.regionId = regionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (territoryId != null ? territoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Territories)) {
            return false;
        }
        Territories other = (Territories) object;
        if ((this.territoryId == null && other.territoryId != null) || (this.territoryId != null && !this.territoryId.equals(other.territoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.test6.Territories[ territoryId=" + territoryId + " ]";
    }
    
}
