/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.beans.User;
import java.util.ArrayList;
/**
 *
 * @author Hackobo
 */
public class UserController {
    private static UserController instance;
    private ArrayList<User> userArray = new ArrayList<User>();
    
    public static UserController getInstance(){
    if( instance == null ){
        instance = new UserController();
    }
       return instance;
    }
    
    //Add
    public void AddUser(String nickname, String password ){
        this.userArray.add(new User(null, nickname, password ));
    }
     
    //Read
    public void ShowUsers(){
        for(int i=0; i< userArray.size(); i++){
            if( userArray.size() > 0 ){
                System.out.println("Id :" + userArray.get(i).getIdUser());
                System.out.println("Nickname" + userArray.get(i).getNickname());
                System.out.println("Nickname" + userArray.get(i).getPassword());
            }else{
                System.out.println("no exist Users");
            }
        }
    }

    
    //Update
    
    //Delete
    
    //Search
    
    
    
}
