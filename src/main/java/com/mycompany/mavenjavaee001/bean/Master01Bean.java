/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjavaee001.bean;

import com.mycompany.mavenjavaee001.db.Master01Db;
import com.mycompany.mavenjavaee001.entity.Master01;
import java.io.Serializable;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author 07930
 */
@Named
@ViewScoped
public class Master01Bean implements Serializable {

    @Inject
    private Master01Db master01Db;

    public List<Master01> getAllMaster01() {
	return master01Db.findAll();
    }
    
}
