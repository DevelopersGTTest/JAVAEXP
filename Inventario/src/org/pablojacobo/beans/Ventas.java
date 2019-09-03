/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.beans;

import java.io.Serializable;

/**
 *
 * @author Hackobo
 */
public class Ventas implements Serializable {
    private String total;
    private String nombreProducto;

    public Ventas(String total, String nombreProducto) {
        this.total = total;
        this.nombreProducto = nombreProducto;
    }
    
 
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
        
}
