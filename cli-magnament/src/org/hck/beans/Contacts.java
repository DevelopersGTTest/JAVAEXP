/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.beans;
import org.hck.beans.Category;
/**
 *
 * @author Hackobo
 */
public class Contacts {
    
    private Integer idContact;
    private String nameContact;
    private String emailContact;
    private Integer phoneContact;
    private Category category;
    
    public Contacts(Integer idContact, String nameContact, 
        String emailContact, Integer phoneContact, Category category ){
        this.idContact = idContact;
        this.nameContact = nameContact;
        this.emailContact = emailContact;
        this.phoneContact = phoneContact;
        this.category = category;
    }

    public Integer getIdContact() {
        return idContact;
    }

    public void setIdContact(Integer idContact) {
        this.idContact = idContact;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public Integer getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(Integer phoneContact) {
        this.phoneContact = phoneContact;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
    
}
