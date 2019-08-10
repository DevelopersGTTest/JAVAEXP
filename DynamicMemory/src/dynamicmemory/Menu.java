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
    private ArrayList<Persona> per = new ArrayList<Persona>();
    
    private Scanner sc = new Scanner(System.in);
    private  int optMenu = 0;
    
    private Persona persona = new Persona();
    
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
        int op = 0;
        System.out.println(" 1. INGRESAR ");
        System.out.println(" 2. MOSTRAR  ");
        op = Integer.parseInt( sc.nextLine());
        if( op  == 1 ){
            System.out.println("este es el  menu del empleado");
            System.out.println("Nombre");
            persona.setNombre( sc.nextLine() );
            System.out.println("DPI");
            persona.setDpi( sc.nextLine() );
            System.out.println("Edad");
            persona.setEdad( Integer.parseInt( sc.nextLine()));
            per.add(persona);
            this.optsGeneral();
        }
        
        if( op == 2){
            System.out.println("los valore son");
            for( int i=0; i < per.size(); i ++ ){
                System.out.println("Nombre : " + per.get(i).getNombre());
                System.out.println("DPI" + per.get(i).getDpi());
                System.out.println("Edad" + per.get(i).getEdad());
            }
        }    
    }
    
    public void optsPersona(){
        System.out.println("este es el menu de la persona");
    }
    
}
