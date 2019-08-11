/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1pablojacobo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Menu {
    
    private int op = 0;
    //variables de clase
    private String nombreProd = "";
    private int cantidadProd, precioProd;
    //ELIMINAR
    private int eliminar; 
    
    private Scanner sc = new Scanner(System.in);
    
    //Arrays
      private ArrayList<Electrodomestico> elec = new ArrayList();
      private ArrayList<TipoA> tipoA = new ArrayList();
      private ArrayList<TipoB> tipoB = new ArrayList();
    
      
    public void menuGeneral(){
        System.out.println("este es el menu general");
        System.out.println(" 1. Agregar  ");
        System.out.println(" 2. Mostrar  ");
        System.out.println(" 3. Eliminar ");
        System.out.println(" 4. Salir    ");
        this.op = Integer.parseInt( sc.nextLine());
        switch( this.op ){
            case 1 :
                this.parteIngreso();
            break;
            case 2:
                this.parteMostrar();
            break;
            case 3:
                this.parteEliminar();
            break;
            case 4:
                System.exit(0);
            break;
            default :
                    System.out.println("Opcion invalida");
        }
    }
    
    public void parteIngreso(){
        System.out.println(" Que tipo de electrodomestico deseas ingresar ");
        System.out.println(" 1. Tipo A ");
        System.out.println(" 2. Tipo B ");
        System.out.println(" 3. Tipo C ");
        this.op = Integer.parseInt( sc.nextLine());
        switch( this.op ){
            case 1:
                System.out.println("Tipo A");
                System.out.println("Ingrese el nombre");
                this.nombreProd = sc.nextLine();
                System.out.println("Ingrese el precio");
                this.precioProd = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la cantidad");
                this.cantidadProd = Integer.parseInt( sc.nextLine());
                elec.add( new Electrodomestico( 
                        this.nombreProd, this.precioProd, this.cantidadProd ));
                this.menuGeneral();
            break;
            case 2:
                System.out.println("Tipo 2");
                System.out.println("Ingrese el nombre");
                this.nombreProd = sc.nextLine();
                System.out.println("Ingrese el precio");
                this.precioProd = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la cantidad");
                this.cantidadProd = Integer.parseInt( sc.nextLine());
                tipoA.add( new TipoA( 
                        this.nombreProd, this.precioProd, this.cantidadProd ));
                this.menuGeneral();
            break;
            case 3:
                System.out.println("TIPO 3");
                System.out.println("Ingrese el nombre");
                this.nombreProd = sc.nextLine();
                System.out.println("Ingrese el precio");
                this.precioProd = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese la cantidad");
                this.cantidadProd = Integer.parseInt( sc.nextLine());
                tipoB.add( new TipoB( 
                        this.nombreProd, this.precioProd, this.cantidadProd ));
                this.menuGeneral();
            break;
            default:
                System.out.println("Opcion invalida");
        }
        
    }
    
    public void parteMostrar(){
        System.out.println("MOSTRANDO");
        System.out.println("1. mostrar productos tipo a");
        System.out.println("2. mostrar productos tipo b");
        System.out.println("3. mostrar productos tipo c");
        this.op = Integer.parseInt( sc.nextLine());
        switch( this.op ){
            case 1:
                for( int i=0; i< elec.size(); i++ ){
                    System.out.println("idProdA: " + i );
                    System.out.println("Nonbre de producto" 
                        + elec.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + elec.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + elec.get(i).getCantidad());
                }
                this.menuGeneral();
            break;
            case 2:
                for(int i=0; i < tipoA.size(); i ++ ){
                    System.out.println("idProdB: " + i );
                    System.out.println("Nonbre de producto" 
                        + tipoA.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + tipoA.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + tipoA.get(i).getCantidad());
                }
                this.menuGeneral();
            break;
            case 3:
                for( int i=0; i < tipoB.size(); i ++){
                     System.out.println("idProdC: " + i );
                    System.out.println("Nonbre de producto" 
                        + tipoB.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + tipoB.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + tipoB.get(i).getCantidad());
                }
                this.menuGeneral();
            break;
            default:
                System.out.println("op invalida");
        }
    }
    
    public void parteEliminar(){
        System.out.println("vas a eliminar");
        System.out.println(" 1. eliminar Tipos A ");
        System.out.println(" 2. eliminar Tipos B ");
        System.out.println(" 3. eliminar Tipos C ");
        this.op = Integer.parseInt( sc.nextLine()); 
        switch( this.op ){
            case 1:
                for( int i=0; i< elec.size(); i++ ){
                    System.out.println("idProdA: " + i );
                    System.out.println("Nonbre de producto" 
                        + elec.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + elec.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + elec.get(i).getCantidad());
                }
                System.out.println("Ingresa el id para eliminar");
               this.eliminar = Integer.parseInt( sc.nextLine());
               //////////////////////////////////////////////
               for(int i=0; i< elec.size(); i++ ){
                    if( i == this.eliminar){
                        elec.remove(i);
                        break;
                    }
                }
               //////////////////////////////////////////////////
               this.menuGeneral();
            break;
            case 2:
                for(int i=0; i < tipoA.size(); i ++ ){
                    System.out.println("idProdB: " + i );
                    System.out.println("Nonbre de producto" 
                        + tipoA.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + tipoA.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + tipoA.get(i).getCantidad());
                }
                System.out.println("Ingresa el id para eliminar");
                this.eliminar = Integer.parseInt( sc.nextLine());
                 //////////////////////////////////////////////
               for(int i=0; i< tipoA.size(); i++ ){
                    if( i == this.eliminar){
                        tipoA.remove(i);
                        break;
                    }
                }
                System.out.println("Eliminado correctamente");
               //////////////////////////////////////////////////
                this.menuGeneral();
            break;
            case 3:
                for( int i=0; i < tipoB.size(); i ++){
                     System.out.println("idProdC: " + i );
                    System.out.println("Nonbre de producto" 
                        + tipoB.get(i).getNombre() );
                    System.out.println("Precio de producto " 
                        + tipoB.get(i).getPrecio());
                    System.out.println("Cantidad de producto " 
                        + tipoB.get(i).getCantidad());
                }
                System.out.println("Ingresa el id para eliminar");
                this.eliminar = Integer.parseInt( sc.nextLine());
                 //////////////////////////////////////////////
                for(int i=0; i< tipoB.size(); i++ ){
                    if( i == this.eliminar){
                        tipoB.remove(i);
                        break;
                    }
                }
               //////////////////////////////////////////////////
                System.out.println("Eliminado correctamente");
                this.menuGeneral();
            break;
            default:
                System.out.println("op invalida");
        }
        
    }
}
