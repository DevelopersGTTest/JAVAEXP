/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.utils;

/**
 *
 * @author Hackobo
 */
public class Processator {
   private static Processator instance;
   
   public static Processator getInstance(){
       if( instance == null ){
           instance = new Processator();
       }
       return instance;
   }
   
   /*
   *Deleted a a controller this classs return a object list to save :)
   */
   
   
}
