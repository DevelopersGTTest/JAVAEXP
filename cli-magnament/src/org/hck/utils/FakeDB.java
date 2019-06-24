package org.hck.utils;
import org.hck.controllers.UserController;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hackobo
 */
public class FakeDB {
    private static FakeDB instance;
    
    public static FakeDB getInstance(){
    
        if( instance == null ){
            instance = new FakeDB();
        }
        return instance;
    }
    
    public void RegisterUsers(){
    
        UserController.getInstance().AddUser("pablo", "12345");
    }
    
    
    
    
}
