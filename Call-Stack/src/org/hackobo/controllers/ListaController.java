/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.controllers;
import org.hackobo.beans.Foo;

/**
 *
 * @author Hackobo
 */
public class ListaController {
    private Foo bootFoo;
    private Foo endFoo;
    private int nElelements;
    
    public ListaController(){
        this.bootFoo = null;
        this.endFoo = null;
        this.nElelements = 0;
    }
    
    public boolean isEmptyList(){
        return this.bootFoo == null;
    }
    
    /*public void push(String fname, String lname, int age ){
        Foo newEntity = new Foo(fname, lname, age);
        if( this.bootFoo == null ){
            this.bootFoo = newEntity;
            this.endFoo = newEntity;
        }else{
            if(   ){}
        }
    }*/
    
    
}
