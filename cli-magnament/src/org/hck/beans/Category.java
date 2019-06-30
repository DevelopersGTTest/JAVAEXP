/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.beans;

/**
 *
 * @author Hackobo
 */
public class Category {
    
    private Integer idCatergory;
    private String nameCategory;
    
    public Category(Integer idCategory, String nameCategory ){
        this.idCatergory = idCategory;
        this.nameCategory = nameCategory;
    }

    public Integer getIdCatergory() {
        return idCatergory;
    }

    public void setIdCatergory(Integer idCatergory) {
        this.idCatergory = idCatergory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
    
    
}
