/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;

import java.io.Serializable;

/**
 *
 * @author Hackobo
 */
public class Articulo implements Serializable {
    private String nombreArticulo;
    private float precioArtirulo;
    private int stock;

    public Articulo(String nombreArticulo, float precioArtirulo, int stock) {
        this.nombreArticulo = nombreArticulo;
        this.precioArtirulo = precioArtirulo;
        this.stock = stock;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public float getPrecioArtirulo() {
        return precioArtirulo;
    }

    public void setPrecioArtirulo(float precioArtirulo) {
        this.precioArtirulo = precioArtirulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
