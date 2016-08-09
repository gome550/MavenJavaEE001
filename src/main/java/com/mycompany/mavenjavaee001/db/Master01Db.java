/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenjavaee001.db;

import com.mycompany.mavenjavaee001.entity.Master01;
import javax.ejb.Stateless;

/**
 *
 * @author t-ito
 */
@Stateless
public class Master01Db extends SuperDb {
    
    public Master01Db() {
	super(Master01.class);
    }

}
