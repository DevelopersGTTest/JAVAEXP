/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

/**
 *
 * @author Hackobo
 */
public class MenuController {
    private static MenuController instance;
    
    public static MenuController getInstance(){
        if(instance == null ){
            instance = new MenuController();
        }
        return instance;
    }   
    
    public void menuGeneral(){
        System.out.println(" == Menu Geenral == ");
    }
    
    public void menuArticulo(){
        System.out.println(" == Menu Articulo ==  ");
    }
    
    public void menuCompras(){
        System.out.println(" == Menu Compras == ");
    }
    
    public void menuVentas(){
        System.out.println(" == Menu Ventas ==  ");
    }
    
}
