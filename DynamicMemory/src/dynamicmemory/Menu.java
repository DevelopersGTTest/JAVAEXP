/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicmemory;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Menu {
    private static Menu instance;
    private ArrayList<Empleado> emp = new ArrayList<Empleado>();
    private Scanner sc = new Scanner(System.in);
    private  int optMenu = 0;
    
    public static Menu getInstance(){
        if( instance == null ){
            instance = new Menu();
        }
        return instance;
    }
    
    public void optsGeneral(){
        System.out.println("|=========================|");
        System.out.println("|   1. Empleado           |");
        System.out.println("|   2. Persona            |");
        System.out.println("==========================");
        this.optMenu = Integer.parseInt(sc.nextLine());
        if( this.optMenu == 1  ){
            this.optsEmpleado();
        }
        if( this.optMenu == 2 ){
            this.optsPersona();
        }
    }
    
    public void optsEmpleado(){
        System.out.println("este es el  menu del empleado");
    }
    
    public void optsPersona(){
        System.out.println("este es el menu de la persona");
    }
    
}
