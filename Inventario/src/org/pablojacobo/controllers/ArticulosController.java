/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.util.ArrayList;
import org.pablojacobo.beans.Articulos;

/**
 *
 * @author Hackobo
 */
public class ArticulosController {
    private static ArticulosController instance;
    private ArrayList<Articulos> articulos = new ArrayList();
    private int index;
    
    public static ArticulosController getInstance(){
        if( instance == null ){
            instance = new ArticulosController();
        }
        return instance;
    }
    
    public void addArticulos(String nombre, float precio, int stock ){
        articulos.add( new Articulos(nombre, precio, stock ));
    }
    
    public void showArticulos(){
        for(Articulos a : articulos ){
            System.out.println(" id    : " + this.index++ );
            System.out.println(" Nombre: " + a.getNombreArticulo());
            System.out.println(" Precio: " + a.getPrecioArtirulo());
            System.out.println(" Strock: " + a.getStock());
            System.out.println("----------------------------");
        }
    }

}
