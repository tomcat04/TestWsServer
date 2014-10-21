/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.ws;

import javax.jws.WebService;

/**
 *
 * @author cgx1844568
 * @date 2014-10-21
 * @time 11:09:48
 *
 */
@WebService
public interface Calculator {

    public int add(int a , int b);
    
    public int mult(int a , int b);
}
