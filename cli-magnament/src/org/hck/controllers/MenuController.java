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
    int op, numb, idx = 0;
    
    public static MenuController getInstance(){
        if( instance == null ){
            instance = new MenuController();
        }
        return instance;
    }
    
    public void DisplayOPTS(){
    
        System.out.println("|========================|");
        System.out.println("| 1.    [ADD]   :  User  |");
        System.out.println("| 2.    [READ]  :  User  |");
        System.out.println("| 3.    [DELETE]:  User  |");
        System.out.println("|========================|");
    
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
        
        String x = UserController.getInstance().Login(this.username, this.password);
        System.out.println("el status es: " + x );
        
        //A simple validation
        if( x == "IS_LOGGED"){
            this.DisplayOPTS();
        }
        
    }
    
}
