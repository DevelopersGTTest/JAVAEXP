/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.utils.ReadIO;
import org.hck.utils.FakeDB;
/**
 *
 * @author Hackobo
 */
public class MenuController {
    private static MenuController instance;
   // ReadIO read = new ReadIO();
    String username = "";
    String password = "";
    Boolean auth = false; 
    int op, numb, idx = 0;
     
    public static MenuController getInstance(){
        if( instance == null ){
            instance = new MenuController();
        }
        return instance;
    }
    
    public void DisplayGlobalMenu(){
    
        System.out.println("|========================|");
        System.out.println("| 1.    [ Categories ]   |");
        System.out.println("| 2.    [ Contacts   ]   |");    
        System.out.println("|========================|");
        try{
            this.op = Integer.parseInt(ReadIO.getInstance().IOData());
            switch( this.op  ){
                case 1:
                    this.DisplayCategoriesMenu();
                break;
                case 2:
                    this.DisplayContactsMenu();
                break;
                default:
                    System.out.println(" Invalid Option");
                    this.DisplayGlobalMenu();
            } 
        }catch(NumberFormatException e){
            System.out.println("invalid character");
            this.DisplayGlobalMenu();
        }
    }
         
    public void DisplayLogin(){
        //Mapping a data dummy
        FakeDB.getInstance().RegisterUsers();
        
        System.out.println("|==================|");
        System.out.println("|  Need a logger   |");
        System.out.println("|==================|");
        System.out.println(" Typing a Username.... ");
        this.username = ReadIO.getInstance().IOData();
        System.out.println(" Typing a Password.... ");
        this.password = ReadIO.getInstance().IOData();        
        this.auth = UserController
            .getInstance().Login(this.username, this.password);
        if( this.auth = true){
            this.DisplayGlobalMenu();
        }else{
            this.DisplayLogin();   
        } 
   }
    
    public void DisplayCategoriesMenu(){
    
    }
    
    public void DisplayContactsMenu(){
    
    }
    
    
    
}
