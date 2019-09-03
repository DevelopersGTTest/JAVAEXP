/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.pablojacobo.beans.Articulos;
import org.pablojacobo.beans.Ventas;

/**
 *
 * @author Hackobo
 */
public class VentasController {
    private static VentasController instance;
    private ArrayList<Ventas> ventas = new ArrayList();
    private String[] partsChain;
    private String partZero = "";
    private String partOne = "";

    
    public static VentasController getInstance(){
        if( instance == null ){
            instance = new VentasController();
        }
        return instance;
    }
    
       public void guardarArchivoVentas(ArrayList<Ventas> ventas ){
         try {
            FileOutputStream fos = new FileOutputStream("ventas");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ventas);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
       
    public void registrarventa(String chainStr ){
        this.partsChain = chainStr.split("|");
        this.partZero = this.partsChain[0]; ///nombre producto
        this.partOne = this.partsChain[1]; //total
        
        ventas.add( new Ventas(  this.partOne, this.partZero  ));
        this.guardarArchivoVentas(ventas);
    }
    
        public void showVentas(){
        try{
            FileInputStream file = new FileInputStream("ventas");
            ObjectInputStream ois = new ObjectInputStream(file);
            ventas = (ArrayList) ois.readObject();
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
        for(int i=0; i < ventas.size(); i++){
            System.out.println(" idVenta-Registro    : " + i );
            System.out.println(" Nombre: " + ventas.get(i).getNombreProducto());
            System.out.println(" Total: " +  ventas.get(i).getTotal());
            System.out.println("----------------------------");
        }
    }
       
       
    
}
