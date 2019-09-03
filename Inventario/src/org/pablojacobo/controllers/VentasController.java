/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.io.FileOutputStream;
import java.io.IOException;
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
       
       
    
}
