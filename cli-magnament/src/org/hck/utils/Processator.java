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
   private String[] parts;
   private String part_prefix;
   private String part_entity;
   private String exp_merge;
   
   public static Processator getInstance(){
       if( instance == null ){
           instance = new Processator();
       }
       return instance;
   }
   
   public String plotProcess(String data){
        this.parts = data.split("-");
        this.part_prefix = this.parts[0];
        this.part_entity = this.parts[1];
        
        switch(this.part_prefix +"-"+ this.part_entity ){
            case "ADD-CATEGORY":
            break;
            case "SHOW-CATEGORY ":
            break;
            case "UPDATE-CATEGORY":
            break;
        }
                
       System.out.println("esto llego" + this.part_prefix  );
       return this.part_prefix; 
   }
   
   
   /*
   *Deleted a a controller this classs return a object list to save :)
   */
   
   
}
