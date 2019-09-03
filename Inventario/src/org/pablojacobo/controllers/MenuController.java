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
    private boolean estaDisponible = false;
     
    public static MenuController getInstance(){
        if(instance == null ){
            instance = new MenuController();
        }
        return instance;
    }   
    
    
    public void menu(){  
        System.out.println(" == Menu Geenral == ");
        System.out.println(" 1. Articulos ");
        System.out.println(" 2. Salir ");  
        System.out.println("¿ Que opcion desea Ingresar ? ");
        this.opt = Integer.parseInt(  sc.nextLine());
        switch( this.opt ){
            case 1:
                this.menuArticulo();
            break;
            case 2:
                System.out.println(" Adios ");
                System.exit(0);           
            break;
            default: System.out.println(" opcion invalida : ");
           
        }
    }
    
    public void menuArticulo(){
        System.out.println(" == Menu Articulo ==  ");
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
        System.out.println(" 3. Vender  ");
        this.opt = Integer.parseInt(  sc.nextLine());
        switch( this.opt ){
            case 1:
                System.out.println(" == AGREGAR == ");
                System.out.println(" Nombre ");
                this.nombre = sc.nextLine();
                System.out.println(" Precio ");
                this.precio = Float.parseFloat( sc.nextLine());
                System.out.println(" Stock ");
                this.stock = Integer.parseInt( sc.nextLine());
                ArticulosController.getInstance()
                    .addArticulos(this.nombre, this.precio, this.stock);
                System.out.println("Articulo Ingresado correctamente ");
                this.menu();
            break;
            case 2:
                System.out.println(" == MOSTRAR == ");
                ArticulosController.getInstance().showArticulos();
                this.menu();
            break;
            case 3:
                System.out.println(" == Estos son los productos disponibles ==");
                ArticulosController.getInstance().showArticulos();
                System.out.println("Seleccione el id del producto a vender");
                this.opt = Integer.parseInt(sc.nextLine());
                this.estaDisponible = ArticulosController.getInstance()
                    .verificarStock(this.opt);
                if( this.estaDisponible ){
                
                }else{
                    System.out.println("EL PRODUCTO DEBE TENER STOCK");
                    this.menuArticulo();
                }
                
            break;
            default: 
                System.out.println(" opcion invalida : ");
                this.menu();
           
        }
        
    }
    

}
