/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;
import java.util.ArrayList;
import org.pablojacobo.beans.Compras;

/**
 *
 * @author Hackobo
 */
public class ComprasController {
    private static ComprasController instance;
    private ArrayList<Compras> compras = new ArrayList();
    private int index;
    
    public static ComprasController getInstance(){
        if( instance == null ){
            instance = new ComprasController();
        }
        return instance;
    }
    
    public void addCompra(String nombre, float precio, int stock ){
        compras.add( new Compras(nombre, precio, stock ));
    }
    
    public void showArticulos(){
        for(Compras c : compras){
            System.out.println(" id    : " + this.index++ );
            System.out.println(" Nombre: " + c.getNombreArticulo());
            System.out.println(" Precio: " + c.getPrecioArtirulo());
            System.out.println(" Strock: " + c.getStock());
            System.out.println("----------------------------");
        }
    }
    
    
}
