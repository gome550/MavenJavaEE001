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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "master01")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Master01.findAll", query = "SELECT m FROM Master01 m"),
    @NamedQuery(name = "Master01.findById", query = "SELECT m FROM Master01 m WHERE m.id = :id"),
    @NamedQuery(name = "Master01.findByText", query = "SELECT m FROM Master01 m WHERE m.text = :text"),
    @NamedQuery(name = "Master01.findByFlag1", query = "SELECT m FROM Master01 m WHERE m.flag1 = :flag1"),
    @NamedQuery(name = "Master01.findByFlag2", query = "SELECT m FROM Master01 m WHERE m.flag2 = :flag2"),
    @NamedQuery(name = "Master01.findByUpdateUser", query = "SELECT m FROM Master01 m WHERE m.updateUser = :updateUser"),
    @NamedQuery(name = "Master01.findByUpdateDatetime", query = "SELECT m FROM Master01 m WHERE m.updateDatetime = :updateDatetime"),
    @NamedQuery(name = "Master01.findByCreateDatetime", query = "SELECT m FROM Master01 m WHERE m.createDatetime = :createDatetime")})
public class Master01 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 40)
    @Column(name = "text")
    private String text;
    @Size(max = 1)
    @Column(name = "flag1")
    private String flag1;
    @Size(max = 1)
    @Column(name = "flag2")
    private String flag2;
    @Size(max = 20)
    @Column(name = "update_user")
    private String updateUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "create_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;

    public Master01() {
    }

    public Master01(Long id) {
	this.id = id;
    }

    public Master01(Long id, Date updateDatetime, Date createDatetime) {
	this.id = id;
	this.updateDatetime = updateDatetime;
	this.createDatetime = createDatetime;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getFlag1() {
	return flag1;
    }

    public void setFlag1(String flag1) {
	this.flag1 = flag1;
    }

    public String getFlag2() {
	return flag2;
    }

    public void setFlag2(String flag2) {
	this.flag2 = flag2;
    }

    public String getUpdateUser() {
	return updateUser;
    }

    public void setUpdateUser(String updateUser) {
	this.updateUser = updateUser;
    }

    public Date getUpdateDatetime() {
	return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
	this.updateDatetime = updateDatetime;
    }

    public Date getCreateDatetime() {
	return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
	this.createDatetime = createDatetime;
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
	if (!(object instanceof Master01)) {
	    return false;
	}
	Master01 other = (Master01) object;
	if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "com.mycompany.mavenjavaee001.entity.Master01[ id=" + id + " ]";
    }
    
}
