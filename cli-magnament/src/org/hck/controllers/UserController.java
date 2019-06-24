/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.beans.User;

/**
 *
 * @author Hackobo
 */
public class UserController {
    private static UserController instance;
    
    public static UserController getInstance(){
    if( instance == null ){
        instance = new UserController();
    }
       return instance;
    }
    
    //Add
    
    //Read
    
    //Update
    
    //Delete
    
    //Search
    
    
    
}
