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
public class Compras extends Articulos implements Serializable {

    public Compras(String nombreArticulo, float precioArtirulo, int stock) {
        super(nombreArticulo, precioArtirulo, stock);
    }
      
}
