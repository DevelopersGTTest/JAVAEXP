/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.views;

/**
 *
 * @author Hackobo
 */
public class LoginView {
    private static LoginView instance;
    
    public static LoginView getInstance(){
        if( instance == null){
            instance = new LoginView();
        }
        return instance;
    }
    
    public void DisplayLogin(){
        System.out.println("holaaa");
    }
    
}
