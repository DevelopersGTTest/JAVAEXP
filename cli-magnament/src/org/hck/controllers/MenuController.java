/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.utils.ReadIO;
/**
 *
 * @author Hackobo
 */
public class MenuController {
    private static MenuController instance;
    ReadIO read = new ReadIO();
    String username = "";
    String password = "";
    
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
    
        System.out.println("|==================|");
        System.out.println("|  Need a logger   |");
        System.out.println("|==================|");
        System.out.println(" Typing a Username.... ");
        this.username = read.IOData();
        System.out.println(" Typing a Password.... ");
        this.password = read.IOData();
    }
    
}
