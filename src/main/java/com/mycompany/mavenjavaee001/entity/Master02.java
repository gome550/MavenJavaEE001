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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "master02")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Master02.findAll", query = "SELECT m FROM Master02 m"),
    @NamedQuery(name = "Master02.findByCd", query = "SELECT m FROM Master02 m WHERE m.master02PK.cd = :cd"),
    @NamedQuery(name = "Master02.findByBeginDatetime", query = "SELECT m FROM Master02 m WHERE m.master02PK.beginDatetime = :beginDatetime"),
    @NamedQuery(name = "Master02.findByEndDatetime", query = "SELECT m FROM Master02 m WHERE m.endDatetime = :endDatetime"),
    @NamedQuery(name = "Master02.findByText", query = "SELECT m FROM Master02 m WHERE m.text = :text"),
    @NamedQuery(name = "Master02.findByFlag01", query = "SELECT m FROM Master02 m WHERE m.flag01 = :flag01"),
    @NamedQuery(name = "Master02.findByFlag02", query = "SELECT m FROM Master02 m WHERE m.flag02 = :flag02"),
    @NamedQuery(name = "Master02.findByFlag03", query = "SELECT m FROM Master02 m WHERE m.flag03 = :flag03"),
    @NamedQuery(name = "Master02.findByUpdateUser", query = "SELECT m FROM Master02 m WHERE m.updateUser = :updateUser"),
    @NamedQuery(name = "Master02.findByUpdateDatetime", query = "SELECT m FROM Master02 m WHERE m.updateDatetime = :updateDatetime"),
    @NamedQuery(name = "Master02.findByCreateDatetime", query = "SELECT m FROM Master02 m WHERE m.createDatetime = :createDatetime")})
public class Master02 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Master02PK master02PK;
    @Column(name = "end_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDatetime;
    @Size(max = 256)
    @Column(name = "text")
    private String text;
    @Size(max = 1)
    @Column(name = "flag01")
    private String flag01;
    @Size(max = 1)
    @Column(name = "flag02")
    private String flag02;
    @Size(max = 1)
    @Column(name = "flag03")
    private String flag03;
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

    public Master02() {
    }

    public Master02(Master02PK master02PK) {
	this.master02PK = master02PK;
    }

    public Master02(Master02PK master02PK, Date updateDatetime, Date createDatetime) {
	this.master02PK = master02PK;
	this.updateDatetime = updateDatetime;
	this.createDatetime = createDatetime;
    }

    public Master02(String cd, Date beginDatetime) {
	this.master02PK = new Master02PK(cd, beginDatetime);
    }

    public Master02PK getMaster02PK() {
	return master02PK;
    }

    public void setMaster02PK(Master02PK master02PK) {
	this.master02PK = master02PK;
    }

    public Date getEndDatetime() {
	return endDatetime;
    }

    public void setEndDatetime(Date endDatetime) {
	this.endDatetime = endDatetime;
    }

    public String getText() {
	return text;
    }

    public void setText(String text) {
	this.text = text;
    }

    public String getFlag01() {
	return flag01;
    }

    public void setFlag01(String flag01) {
	this.flag01 = flag01;
    }

    public String getFlag02() {
	return flag02;
    }

    public void setFlag02(String flag02) {
	this.flag02 = flag02;
    }

    public String getFlag03() {
	return flag03;
    }

    public void setFlag03(String flag03) {
	this.flag03 = flag03;
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
	hash += (master02PK != null ? master02PK.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Master02)) {
	    return false;
	}
	Master02 other = (Master02) object;
	if ((this.master02PK == null && other.master02PK != null) || (this.master02PK != null && !this.master02PK.equals(other.master02PK))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "com.mycompany.mavenjavaee001.entity.Master02[ master02PK=" + master02PK + " ]";
    }
    
}
