/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;
import java.util.Scanner;
/**
 *
 * @author Hackobo
 */    
public class MenuController {
    private static MenuController instance;
    private Scanner sc = new Scanner(System.in);
    private String nombre = "";
    private int stock, opt = 0;
    private float precio = 0;
     
    public static MenuController getInstance(){
        if(instance == null ){
            instance = new MenuController();
        }
        return instance;
    }   
    
    public void menu(){  
        System.out.println(" == Menu Geenral == ");
        System.out.println(" 1. Articulos ");
        System.out.println(" 2. Compras ");
        System.out.println(" 3. Ventas ");
        System.out.println(" 4. Salir ");  
        System.out.println("¿ Que opcion desea Ingresar ? ");
        this.opt = Integer.parseInt(  sc.nextLine());
        switch( this.opt ){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
                System.exit(0);
            break;
            default: System.out.println(" opcion invalida : ");
           
        }
    }
    
    public void menuArticulo(){
        System.out.println(" == Menu Articulo ==  ");
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
        System.out.println(" 3. Ventas  ");
    }
    
    public void menuCompras(){
        System.out.println(" == Menu Compras == ");
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
    }
    
    public void menuVentas(){
        System.out.println(" == Menu Ventas ==  ");
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
    }
    
}
