/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test6;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author root
 */
@Entity
@Table(name = "region")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
    , @NamedQuery(name = "Region.findByRegionId", query = "SELECT r FROM Region r WHERE r.regionId = :regionId")
    , @NamedQuery(name = "Region.findByRegionDescription", query = "SELECT r FROM Region r WHERE r.regionDescription = :regionDescription")})
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "region_id")
    private Short regionId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "region_description")
    private String regionDescription;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionId")
    private Collection<Territories> territoriesCollection;

    public Region() {
    }

    public Region(Short regionId) {
        this.regionId = regionId;
    }

    public Region(Short regionId, String regionDescription) {
        this.regionId = regionId;
        this.regionDescription = regionDescription;
    }

    public Short getRegionId() {
        return regionId;
    }

    public void setRegionId(Short regionId) {
        this.regionId = regionId;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = regionDescription;
    }

    @XmlTransient
    public Collection<Territories> getTerritoriesCollection() {
        return territoriesCollection;
    }

    public void setTerritoriesCollection(Collection<Territories> territoriesCollection) {
        this.territoriesCollection = territoriesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regionId != null ? regionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.regionId == null && other.regionId != null) || (this.regionId != null && !this.regionId.equals(other.regionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.test6.Region[ regionId=" + regionId + " ]";
    }
    
}
