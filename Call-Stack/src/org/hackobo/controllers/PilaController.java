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
public class PilaController {
    private Foo fooRoot;   //Basic root base
    private int nElements; //# elements in stack
   
   //Create a empty values in obj
   public PilaController(){
       this.fooRoot = null;
       this.nElements = 0;
   }
   
   public boolean isEmptyStack(){
       return this.fooRoot == null;
   }
   
   //pushing simple Obj
   public void pushObject(String fname, String lname, int age){
       Foo instanceObj = new Foo(fname, lname, age, fooRoot);
       fooRoot = instanceObj;
       nElements++;
   }
   
   //remove last element
   public Foo pop(){
       Foo aux = this.fooRoot;
       this.fooRoot = this.fooRoot.getNext();
       aux.setNext(null);
       this.nElements --;
       return aux;
   }
   
   //size 
   public int sizeStack(){
       return this.nElements;
   }
   
   //Empty All
   public void dropStack(){
       while(!this.isEmptyStack()){
           this.pop();
       }
   }
   
   public void showFooElements(){
       Foo aux = this.fooRoot;
       while(null != aux ){
           System.out.println(" firstname : " + aux.getFname());
           System.out.println(" lastname  : " + aux.getLname());
           System.out.println(" age       : " + aux.getAge());
       }
   }
   
   
   
   
}
