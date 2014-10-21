/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wms.ws.main;

import com.wms.ws.impl.CalculatorImpl;
import javax.xml.ws.Endpoint;

/**
 *
 * @author cgx1844568
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8088/calculator",  
                new CalculatorImpl());
    }
    
}
