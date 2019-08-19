/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciones;

import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class UI {
   private static UI instance;
   private Scanner sc  = new Scanner(System.in);
   private String nombre, apellido,dpi = "";
   private int opcion, edad = 0;
   
   public static UI getInstance(){
       if( instance == null ){
           instance = new UI();
       }
       return instance;
   }
   
   public void MenuGeneral(){
       System.out.println("1. [ Alumnos       ] ");
       System.out.println("2. [ Catedraticos  ] ");
       System.out.println("3. [ Cursos        ]  ");
       System.out.println("4. [ Asignaciones  ]  ");
       System.out.println("--Elije una opcion--::>");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               this.Alumnos();
           break;
           case 2:
               this.Catedraticos();
           break;
           case 3:
               this.Cursos();
           break;
           case 4:
               this.Asignaciones();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
   public void Alumnos(){
       System.out.println("1. Agregar     ");
       System.out.println("2. Modificar   ");
       System.out.println("3. Mostrar     ");
       System.out.println("4. Desabilitar ");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               System.out.println(" ");
               System.out.println("[ Agregar ]");
               System.out.println(" ");
               System.out.println("Ingresa el nombre del alumno");
               this.nombre = sc.nextLine();
               System.out.println("Ingresa el apellido del alumno");
               this.apellido = sc.nextLine();
               System.out.println("Ingresa la edad ");
               this.edad = Integer.parseInt( sc.nextLine());
               ControladorTodo.getInstance()
                    .agregarAlumno(this.nombre, this.apellido,this.edad);
               System.out.println("");
               System.out.println("Ingresado Correctamente!!!");
               System.out.println("");
               this.MenuGeneral();
           break;
           case 2:
               System.out.println(" [ Modificar ]  ");
               ControladorTodo.getInstance().mostrarAlumnos();
               System.out.println("Ingresa el idAlumno a modificar");
           case 3:
               this.Cursos();
           break;
           case 4:
               this.Asignaciones();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
   public void Catedraticos(){
       System.out.println("1. Agregar     ");
       System.out.println("2. Modificar   ");
       System.out.println("3. Mostrar     ");
       System.out.println("4. Desabilitar ");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               this.Alumnos();
           break;
           case 2:
               this.Catedraticos();
           break;
           case 3:
               this.Cursos();
           break;
           case 4:
               this.Asignaciones();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
   public void Cursos(){
       System.out.println("1. Agregar     ");
       System.out.println("2. Modificar   ");
       System.out.println("3. Mostrar     ");
       System.out.println("4. Desabilitar ");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               this.Alumnos();
           break;
           case 2:
               this.Catedraticos();
           break;
           case 3:
               this.Cursos();
           break;
           case 4:
               this.Asignaciones();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
   public void Asignaciones(){
       System.out.println("1. Agregar     ");
       System.out.println("2. Modificar   ");
       System.out.println("3. Mostrar     ");
       System.out.println("4. Desabilitar ");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               this.Alumnos();
           break;
           case 2:
               this.Catedraticos();
           break;
           case 3:
               this.Cursos();
           break;
           case 4:
               this.Asignaciones();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
}
