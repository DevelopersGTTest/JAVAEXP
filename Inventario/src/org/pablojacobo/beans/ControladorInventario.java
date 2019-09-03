/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.beans;

import java.util.ArrayList;

/**
 *
 * @author Hackobo
 */
public class ControladorInventario {
    private static ControladorInventario instance;
    private ArrayList<Articulos> articulo = new ArrayList();

    public static ControladorInventario getInstance(){
        if( instance == null ){
            instance = new ControladorInventario();
        }
        return instance;
    }

    public void aArticulo(String nombreArticulo, float precioArtirulo, int stock){
        articulo.add( new Articulos( nombreArticulo, precioArtirulo, stock ));
    }
    
    public void mArticulo(){
        for( int i=0; i < articulo.size(); i++ ){
            System.out.println("id " + i );
            System.out.println("nombre A " + articulo.get(i).getNombreArticulo());
            System.out.println("precio A " + articulo.get(i).getPrecioArtirulo() );
            System.out.println("stock A " + articulo.get(i).getStock());
            System.out.println("=========================================");
        }
    }

}
