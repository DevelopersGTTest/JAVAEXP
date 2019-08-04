/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicmemory;

/**
 *
 * @author Hackobo
 */
public class Menu {
    private static Menu instance;
    
    public static Menu getInstance(){
        if( instance == null ){
            instance = new Menu();
        }
        return instance;
    }
    
    public void optsGeneral(){
        System.out.println("menu general");
    }
    
    public void optsEmpleado(){
        System.out.println("este es el  menu del empleado");
    }
    
    public void optsPersona(){
        System.out.println("este es el menu de la persona");
    }
    
}
