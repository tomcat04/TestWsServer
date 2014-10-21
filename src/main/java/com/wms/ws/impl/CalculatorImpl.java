/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.ws.impl;

import com.wms.ws.Calculator;
import javax.jws.WebService;

/**
 *
 * @author cgx1844568
 * @date 2014-10-21
 * @time 11:12:25
 *
 */
@WebService(endpointInterface = "com.wms.ws.Calculator")//限定仅可调用接口中的方法
public class CalculatorImpl implements Calculator{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }
    
    public int minus(int a , int b) {
        return a - b;
    }

}
