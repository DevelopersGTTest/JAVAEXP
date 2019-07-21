/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.utils;
import org.hck.controllers.MenuController;

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
   
   public void plotProcess(String data){
        this.parts = data.split("-");
        this.part_prefix = this.parts[0];
        this.part_entity = this.parts[1];
        this.exp_merge = this.part_prefix + "-" + this.part_entity;
        
        System.out.println("xxxx::: " + this.exp_merge );
        
        switch( this.exp_merge ){
            case "ADD-CATEGORY":
                System.out.println("add category");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "SHOW-CATEGORY ":
                System.out.println("show category");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "UPDATE-CATEGORY":
                System.out.println("update category");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "DELETE-CATEGORY":
                System.out.println("delete category");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "ADD-CONTACT" :
                System.out.println("holas add");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "SHOW-CONTACT":
                System.out.println("holas shos");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "UPDATE-CONTACT":
                System.out.println("holas updated");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            case "DELETE-CONTACT":
                System.out.println("holas deleted");
                MenuController.getInstance().DisplayGlobalMenu();
            break;
            default:
                System.out.println("your exp"+ this.part_prefix 
                        + "-"+ this.part_entity+ "has incorrect");
                MenuController.getInstance().DisplayGlobalMenu();
        }
   }
   
   
   /*
   *Deleted a a controller this classs return a object list to save :)
   */
   
   
}
