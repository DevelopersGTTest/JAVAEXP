/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import java.util.ArrayList;
import org.hck.utils.ReadIO;
import org.hck.beans.Contacts;
import org.hck.beans.Category;
/**
 *
 * @author Hackobo
 */
public class ProcessatorController {
    private static ProcessatorController instance;
    private String term = "";
    
    
    public static ProcessatorController getInstance(){
        if( instance == null ){
            instance = new ProcessatorController();
        }
        return instance;
    }
    
    public void ProcessatorContacts(){
        System.out.println("helow");
        System.out.println("    Actions  ");
        System.out.println(" [ ADD-CONTACT    ] < Entity > ");
        System.out.println(" [ SHOW-CONTACT   ]  ");
        System.out.println(" [ UPDATE-CONTACT ] <IdContact> ");
        System.out.println(" [ DELETE-CONTACT ] <IdContact> ");
        this.term = ReadIO.getInstance().IOData();
        switch( this.term ){
            case "ADD-CONTACT" :
                System.out.println("holas add");
            break;
            case "SHOW-CONTACT":
                System.out.println("holas shos");
            break;
            case "UPDATE-CONTACT":
                System.out.println("holas updated");
            break;
            case "DELETE-CONTACT":
            break;
            default:
                System.out.println(" Invalid Options ");
        }
    }
    
}
