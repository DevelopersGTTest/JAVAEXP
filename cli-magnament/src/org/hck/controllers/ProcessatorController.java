/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;

/**
 *
 * @author Hackobo
 */
public class ProcessatorController {
    private static ProcessatorController instance;
    
    public static ProcessatorController getInstance(){
        if( instance == null ){
            instance = new ProcessatorController();
        }
        return instance;
    }
    
    public void ProcessatorContacts(){
        System.out.println("helow");
    }
    
}