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
    
    public static ComprasController getInstance(){
        if( instance == null ){
            instance = new ComprasController();
        }
        return instance;
    }
    
    public void addCompra(String nombre, float precio, int stock ){
        compras.add( new Compras(nombre, precio, stock ));
        System.out.println(" salio aqui===================================================== ");
    }
    
    public void showArticulos(){
        for(int j =0; j < compras.size(); j ++){
            System.out.println(" idCompra    : " + j );
            System.out.println(" Nombre: " + compras.get(j).getNombreArticulo() );
            System.out.println(" Precio: " + compras.get(j).getPrecioArtirulo() );
            System.out.println(" Strock: " + compras.get(j).getStock());
            System.out.println("----------------------------");
        }
    }
    
    
}
