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
    
        /*System.out.println("|==================|");
        System.out.println("|  Need a logger   |");
        System.out.println("|==================|");
        System.out.println(" Typing a Username.... ");
        this.username = read.IOData();
        System.out.println(" Typing a Password.... ");
        this.password = read.IOData();*/
        //UserController.getInstance().AddUser("sam", "hackobo" );
        //UserController.getInstance().AddUser("pablo", "hck2");
        do{
            
            System.out.println(" 1 . saving  ");
            System.out.println(" 2 . reading  ");
            System.out.println(" 3 . updating  ");
            System.out.println(" 4 . deleting  ");
            this.numb = Integer.parseInt( read.IOData());
            switch( this.numb ){
                
                case 1:
                    
                    System.out.println("ingrese nick");
                    this.username = read.IOData();
                    System.out.println("ingrese pass");
                    this.password = read.IOData();
               
                    UserController.getInstance().AddUser(this.idx++, this.username, this.password);
                    
                break;
                
                case 2:
                    UserController.getInstance().ShowUsers();
                break;
                
                case 3:
                    UserController.getInstance().UpdateUser(1, "hackobito", "superDev");
                break;
                case 4:
                    System.out.println("Escribe el numero a eliminar");
                    this.idx = Integer.parseInt( read.IOData() );
                    UserController.getInstance().DeleteUser( this.idx );
                break;
                        
            
            }
            
            
            
            
            
            
        }while( this.op == 0 ); 
        
    }
    
}
