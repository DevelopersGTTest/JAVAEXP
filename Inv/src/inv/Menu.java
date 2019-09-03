/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv;

import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Menu {
    
    private int opcion =0;
    private Scanner sc = new Scanner(System.in);
    private String nombre = "";
    private float precio = 0;
    private int stock =0;
    private boolean puedoComprar = false;
    
    public void menuGeneral(){
        System.out.println(" 1. Articulos ");
        System.out.println(" 2. Compras ");
        System.out.println(" 3. Ventas ");
        System.out.println(" 4. Salir ");
        this.opcion = Integer.parseInt( sc.nextLine());
         switch( this.opcion ){
            case 1:
                this.menuArticulo();
            break;
            case 2:
                this.menuCompras();
            break;
            case 3:
                this.menuVentas();
            break;
            case 4:
                System.out.println(" Adios ");
                System.exit(0);
            break;
            default: System.out.println(" opcion invalida : ");
           
        }
    }
    
    public void menuArticulo(){
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
        this.opcion = Integer.parseInt( sc.nextLine());
        if( this.opcion == 1 ){
            System.out.println("Ingrese el nombre ");
            this.nombre = sc.nextLine();
            System.out.println("Ingrese el precio ");
            this.precio = Float.parseFloat( sc.nextLine());
            System.out.println("Ingrese el stock ");
            this.stock = Integer.parseInt( sc.nextLine());
            ControladorInventario
                .getInstance().aArticulo(this.nombre, this.precio, this.stock);
            
            System.out.println("articulo creado !!");
            this.menuGeneral();
        }
        
        if( this.opcion == 2 ){
            ControladorInventario.getInstance().mArticulo();
            this.menuGeneral();
        }
    }
    
    public void menuCompras(){
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
        this.opcion = Integer.parseInt( sc.nextLine());
        if( this.opcion == 1 ){
            System.out.println("estos son los articulos");
            ControladorInventario.getInstance().mArticulo();
            System.out.println("Selecciona el id que deseas comprar");
            this.opcion = Integer.parseInt( sc.nextLine());
            this.puedoComprar = ControladorInventario
                .getInstance().verificarStock( this.opcion);
            if( this.puedoComprar ){
                //si puedo 
                System.out.println("puedes comprar !!!!!!!!!!!!1");
                this.menuCompras();
            }else{
                // no puedo
                System.out.println("selecciona un producto con stock!!");
                this.menuCompras();
            }
        }
        
        if( this.opcion == 2 ){
           
        }
    }
    
    public void menuVentas(){
        System.out.println(" 1. Agregar ");
        System.out.println(" 2. Mostrar ");
    }
    
   
    
}
