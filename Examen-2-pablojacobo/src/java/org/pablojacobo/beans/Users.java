/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.beans;

/**
 *
 * @author Hackobo
 */
public class Users {
    private String username;
    private String password;
    
    private static Users instance;
    
    //use singleton
    public static Users getInstance(){
        if(instance == null){
            instance = new Users();
        }
        return instance;
    }
    
    public boolean authValid( String u, String p ){
        boolean isValid = false;
        String dumyUser = "kzea";
        String dumyPass = "umg123";
        if( ( dumyUser.equals(u) ) && ( dumyPass.equals(p) )){
            isValid = true;
            System.out.println("eres un usuario valido");
        }else{
            isValid = false;
            System.out.println("no eres un usuario valido");
        }
        return isValid;
    }
}