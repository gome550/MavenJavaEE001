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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author t-ito
 */
@Embeddable
public class Master02PK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "cd")
    private String cd;
    @Basic(optional = false)
    @NotNull
    @Column(name = "begin_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date beginDatetime;

    public Master02PK() {
    }

    public Master02PK(String cd, Date beginDatetime) {
	this.cd = cd;
	this.beginDatetime = beginDatetime;
    }

    public String getCd() {
	return cd;
    }

    public void setCd(String cd) {
	this.cd = cd;
    }

    public Date getBeginDatetime() {
	return beginDatetime;
    }

    public void setBeginDatetime(Date beginDatetime) {
	this.beginDatetime = beginDatetime;
    }

    @Override
    public int hashCode() {
	int hash = 0;
	hash += (cd != null ? cd.hashCode() : 0);
	hash += (beginDatetime != null ? beginDatetime.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object) {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Master02PK)) {
	    return false;
	}
	Master02PK other = (Master02PK) object;
	if ((this.cd == null && other.cd != null) || (this.cd != null && !this.cd.equals(other.cd))) {
	    return false;
	}
	if ((this.beginDatetime == null && other.beginDatetime != null) || (this.beginDatetime != null && !this.beginDatetime.equals(other.beginDatetime))) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "com.mycompany.mavenjavaee001.entity.Master02PK[ cd=" + cd + ", beginDatetime=" + beginDatetime + " ]";
    }
    
}
