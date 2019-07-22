/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje;
import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Eje {
    
    
    /**
     * @param args the command line arguments
     */
   
   
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dato = 0;
        //primera clase umg progra 2
        
        do{
            System.out.println("   Hola Mundo      ");
            System.out.println("1. Alumnos    ");
            System.out.println("2.  Cursos     ");
            System.out.println("3. Asignacion ");
            dato = Integer.parseInt( sc.nextLine());
            switch( dato ){
                case 1:
                    System.out.println("1");
                break;
                
                case 2:
                    System.out.println("2");
                break;
                
                case 3:
                    System.out.println("3");
                break;
                
            }
            
        }while( dato != 4 );
        
        
        
    }
    
    
   
    
}
