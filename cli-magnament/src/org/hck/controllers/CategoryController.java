/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hck.controllers;
import org.hck.beans.Category;
import java.util.ArrayList;

/**
 *
 * @author Hackobo
 */
public class CategoryController {
    private static CategoryController instance;
    private ArrayList<Category> categoryArray = new ArrayList<Category>();
    
    public static CategoryController getInstance(){
        if( instance == null ){
            instance = new CategoryController();
        }
        return instance;
    }
    
    public void AddCategory(Integer idCategory, String nameCategory){
        this.categoryArray.add(new Category(idCategory, nameCategory ));
    }
    
    public void ShowCategories(){
        for(int i=0; i< this.categoryArray.size(); i++ ){
            System.out.println(" Id: " + 
                this.categoryArray.get(i).getIdCatergory());
            System.out.println(" Category " +
                this.categoryArray.get(i).getNameCategory());
        }
    }
    
    public void deleteCategory(Integer id ){
        try{
            for(int i=0; i< this.categoryArray.size(); i ++ ){
                if(i == id ){
                    this.categoryArray.remove(i);
                    break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException  e){
            System.out.println("this index not exist" + e);
        }
    
    }
    
    
}
