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
public class ColaController {
    //data types
    private Foo fooRoot;
    private Foo fooEnd;
    private int nElements;
    
    public ColaController(){
        this.fooRoot = null;
        this.fooEnd = null;
        this.nElements = 0;
    }
    
    public boolean isEmptyTail(){
        return this.fooRoot == null;
    }
        
    //using super();
    public void push(){}
}
