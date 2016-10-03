/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjavaee001.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author t-ito
 */
@Entity
@Table(name = "tran02")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tran02.findAll", query = "SELECT t FROM Tran02 t"),
    @NamedQuery(name = "Tran02.findById", query = "SELECT t FROM Tran02 t WHERE t.id = :id"),
    @NamedQuery(name = "Tran02.findByText", query = "SELECT t FROM Tran02 t WHERE t.text = :text"),
    @NamedQuery(name = "Tran02.findByTran01Id", query = "SELECT t FROM Tran02 t WHERE t.tran01Id = :tran01Id"),
    @NamedQuery(name = "Tran02.findByUpdateDateTime", query = "SELECT t FROM Tran02 t WHERE t.updateDateTime = :updateDateTime"),
    @NamedQuery(name = "Tran02.findByCreateDateTime", query = "SELECT t FROM Tran02 t WHERE t.createDateTime = :createDateTime")})
public class Tran02 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Text")
    private String text;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Tran01_Id")
    private int tran01Id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UpdateDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDateTime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CreateDateTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDateTime;

    public Tran02() {
    }

    public Tran02(Integer id) {
	this.id = id;
    }

    public Tran02(Integer id, String text, int tran01Id, Date updateDateTime, Date createDateTime) {
	this.id = id;
	this.text = text;
	this.tran01Id = tran01Id;
	this.updateDateTime = updateDateTime;
	this.createDateTime = createDateTime;
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public int getTran01Id() {
	return tran01Id;
    }

    public void setTran01Id(int tran01Id) {
	this.tran01Id = tran01Id;
    }

    public Date getUpdateDateTime() {
	return updateDateTime;
    }

    public void setUpdateDateTime(Date updateDateTime) {
	this.updateDateTime = updateDateTime;
    }

    public Date getCreateDateTime() {
	return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
	this.createDateTime = createDateTime;
    }

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (id != null ? id.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Tran02)) {
	    return false;
	}
	Tran02 other = (Tran02) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "com.mycompany.mavenjavaee001.bean.Tran02[ id=" + id + " ]";
    }
    
}
