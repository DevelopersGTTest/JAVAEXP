/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Menu {
    
    private Scanner sc = new Scanner(System.in);
    //Array de clases
    private ArrayList<Persona> arrayPersona = new ArrayList();
    private ArrayList<Alumno> arrayAlumno = new ArrayList();
    //Instancias de las clases
    private Persona persona = new Persona();
    private Alumno alumno = new Alumno();
    
    private int opcion;
    
    public void MenuGeneral(){
        System.out.println("1. Persona");
        System.out.println("2. Alumno ");
        this.opcion = Integer.parseInt( sc.nextLine() );
        
        if( this.opcion == 1 ){
           this.MenuPersona();
        }
        
        if( this.opcion == 2){
           this.MenuAlumno();
        }
    }
    
    public void MenuPersona(){
        System.out.println("1. Ingreso");
        System.out.println("2. Leer ");
        this.opcion = Integer.parseInt( sc.nextLine() );
        
        if( this.opcion == 1 ){
            int edad;
            String nombre, apellido;
            System.out.println(" Ingresa tu Nombre");
            nombre = sc.nextLine();
            System.out.println(" Ingresa tu Apellido");
            apellido = sc.nextLine();
            System.out.println(" Ingresa tu Edad");
            edad = Integer.parseInt( sc.nextLine());
            
            //metiendo datos al array
            arrayPersona.add( new Persona( nombre, apellido, edad ) );
            this.MenuGeneral();
        }
        //Hola oswaldo :3
        if( this.opcion == 2){
            
            for(int i=0; i < arrayPersona.size(); i++ ){
                System.out.println("Nombre : "+ arrayPersona.get(i).getNombre() );
                System.out.println("Apellido : " + arrayPersona.get(i).getApellido() );
                System.out.println("Edad : " + arrayPersona.get(i).getEdad() ) ;
            
            }
        }
    }
    
    public void MenuAlumno(){
        System.out.println("1. Ingreso");
        System.out.println("2. Leer ");
        this.opcion = Integer.parseInt( sc.nextLine() );
        if( this.opcion == 1 ){
        
        }
        
        if( this.opcion == 2){
        
        }
    }
    
}
