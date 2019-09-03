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
    private int idVenta;
    private float total;
    private String nombreProducto;

    public Ventas(int idVenta, float total, String nombreProducto) {
        this.idVenta = idVenta;
        this.total = total;
        this.nombreProducto = nombreProducto;
    }
    
 
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }
    
}
