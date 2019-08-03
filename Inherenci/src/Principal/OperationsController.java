/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Hackobo
 */
public class OperationsController {
    private static OperationsController instance;
    
    public static OperationsController getInstance(){
        if( instance == null ){
            instance = new OperationsController();
        }   
        return instance;
    }
    
    
    public void Menu(){
        System.out.println("holas");
    }
    
}
