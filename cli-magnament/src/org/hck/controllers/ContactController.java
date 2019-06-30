/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.beans.Contacts;
import org.hck.beans.Category;
import java.util.ArrayList;

/**
 *
 * @author Hackobo
 */
public class ContactController {
    private static ContactController instance;
    private ArrayList<Contacts> contactArray = new  ArrayList<Contacts>();
    
    public static ContactController getInstance(){
        if( instance == null ){
            instance = new ContactController();
        }
        return instance;
    }
    
    public void AddContact(Integer idContact, String nameContact, 
        String emailContact, Integer phoneContact, Category category ){
        this.contactArray.add(new Contacts(idContact, nameContact, 
            emailContact, phoneContact, category));
    }
    
    public void ShowContacts(){
        for(int i=0; i < contactArray.size(); i++ ){
            System.out.println(" id: " +
                this.contactArray.get(i).getIdContact());
            System.out.println(" name: " +
                this.contactArray.get(i).getNameContact());
            System.out.println(" email: " +
                this.contactArray.get(i).getEmailContact());
            System.out.println(" phone: " +
                this.contactArray.get(i).getPhoneContact());
            System.out.println(" category: " +
                this.contactArray.get(i).getCategory());
        }
    }
    
}
