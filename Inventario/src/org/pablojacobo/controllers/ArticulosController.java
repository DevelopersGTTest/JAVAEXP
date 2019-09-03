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
    private int index = 0;
    
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
        for(int i=0; i < articulos.size(); i++){
            System.out.println(" id    : " + i );
            System.out.println(" Nombre: " + articulos.get(i).getNombreArticulo());
            System.out.println(" Precio: " + articulos.get(i).getPrecioArtirulo());
            System.out.println(" Strock: " + articulos.get(i).getStock() );
            System.out.println("----------------------------");
        }
    }
    
    public boolean Verify( String cantidadStock, 
        ArrayList<Articulos> articulos ){
        if(articulos.stream()
            .anyMatch((a) -> 
            ( a.getStock() ==  Integer.parseInt(cantidadStock) 
            && a.getStock() > 0  ))){
            return true;
        }
        return false;   
    }
    
    public boolean verificarStock( int idProducto ){
        boolean resp = false;
        for(int k=0; k < articulos.size(); k ++){
            if( ( k == idProducto)){
                if( articulos.get(k).getStock() > 0 ){
                    return  resp = true;
                }else{
                    return resp = false;
                }
            }
        }
        return resp;
    }
    
    //@param return arrayObj  --non refactor
    public <T> T returnOneArticulo( int idArticulo){
        ArrayList<Articulos> arrObj = null;
        for(int i=0; i< articulos.size(); i++ ){
            if( i == idArticulo){
              articulos.get(i);
            }
        }
        return (T) arrObj;
    }
     
   
    public void trascCompra(String nombre, float precio, int stock){
        System.out.println("::::::::::::::::::::::::::::::: LEGOOOOOOOOOOOOOOOOOOOOOO :::::::::::::::::::::::::::::::::::");
        ComprasController.getInstance().addCompra(nombre, precio, stock);
         System.out.println("::::::::::::::::::::::::::::::: LEGOOOOOOOOOOOOOOOOOOOOOO :::::::::::::::::::::::::::::::::::");
    }
    

}
