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
    //USARE SINGLETON PARA EL CONTROLADOR Y CLASE MAIN :)
   private static UI instance;
   private Scanner sc  = new Scanner(System.in);
   private String nombre, apellido,dpi = "";
   private int opcion, edad, id = 0;
   private boolean typeOPVERIFY = false;
   
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
       System.out.println("4. Deshabilitar ");
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
               this.id = Integer.parseInt( sc.nextLine());
               System.out.println("Ingresa el nuevo Nombre");
               this.nombre = sc.nextLine();
               System.out.println("Ingresa el nuevo Apellido");
               this.apellido = sc.nextLine();
               System.out.println("Ingresa la nueva Edad");
               this.edad = Integer.parseInt( sc.nextLine());
               ControladorTodo.getInstance()
                    .modificarAlumno(this.id, this.nombre, 
                        this.apellido, this.edad);
                System.out.println("");
                System.out.println("Modificado Correctamente!!!");
                System.out.println("");
                ControladorTodo.getInstance().mostrarAlumnos();
                System.out.println("");
               this.MenuGeneral();
           case 3:
               System.out.println(" [ Mostrar ] ");
               ControladorTodo.getInstance().mostrarAlumnos();
               System.out.println(" ");
               this.MenuGeneral();
           break;
           case 4:
               System.out.println(" [ Deshabilitar ] ");
               ControladorTodo.getInstance().mostrarAlumnos();
               System.out.println("Ingresa el idAlumno a DesHabilitar");
               this.id = Integer.parseInt( sc.nextLine());
               ControladorTodo.getInstance().cambiarStatus(this.id);
               System.out.println("");
               System.out.println("Usuario Deshabilitado  !!!!");
               System.out.println("");
               ControladorTodo.getInstance().mostrarAlumnos();
               this.MenuGeneral();
               System.out.println("");
               
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
               System.out.println(" ");
               System.out.println("[ Agregar ]");
               System.out.println(" ");
               System.out.println("Ingresa el nombre del catedratico");
               this.nombre = sc.nextLine();
               System.out.println("Ingresa el DPI del catedratico");
               this.dpi = sc.nextLine();
               ControladorTodo.getInstance()
                .agregarCatedratico(this.nombre, this.dpi);
               System.out.println("");
               System.out.println("Ingresado Correctamente!!!");
               System.out.println("");
               this.MenuGeneral();
           break;
           case 2:
               System.out.println(" [ Modificar ]  ");
               ControladorTodo.getInstance().mostrarCatedratico();
               System.out.println("Ingresa el idCatedratico a modificar");
               this.id = Integer.parseInt( sc.nextLine());
               System.out.println("Ingresa el nuevo Nombre del catedratico");
               this.nombre = sc.nextLine();
               System.out.println("Ingresa el nuevo DPI o el mismo");
               this.dpi = sc.nextLine();
               ControladorTodo.getInstance()
                    .modificarCatedratico(this.id, this.nombre, this.dpi);
                System.out.println("");
                System.out.println("Modificado Correctamente!!!");
                System.out.println("");
                ControladorTodo.getInstance().mostrarCatedratico();
                System.out.println("");
               this.MenuGeneral();
           case 3:
               System.out.println(" [ Mostrar ] ");
               ControladorTodo.getInstance().mostrarCatedratico();
               System.out.println(" ");
               this.MenuGeneral();
           break;
           case 4:
               System.out.println(" [ Deshabilitar ] ");
               ControladorTodo.getInstance().mostrarCatedratico();
               System.out.println("Ingresa el idCatedratico a DesHabilitar");
               this.id = Integer.parseInt( sc.nextLine());
               ControladorTodo.getInstance().cambiarStatusC(this.id);
               System.out.println("");
               System.out.println("Catedratico Deshabilitado  !!!!");
               System.out.println("");
               ControladorTodo.getInstance().mostrarCatedratico();
               this.MenuGeneral();
               System.out.println("");
               
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
               System.out.println(" ");
               System.out.println("[ Agregar ]");
               System.out.println(" ");
               System.out.println("Ingresa el nombre del curso");
               this.nombre = sc.nextLine();
               ControladorTodo.getInstance()
               .agregarCurso(this.nombre);
               System.out.println("");
               System.out.println("Ingresado Correctamente!!!");
               System.out.println("");
               this.MenuGeneral();
           break;
           case 2:
               System.out.println(" [ Modificar ]  ");
               ControladorTodo.getInstance().mostrarCursos();
               System.out.println("Ingresa el idCurso a modificar");
               this.id = Integer.parseInt( sc.nextLine());
               System.out.println("Ingresa el nuevo Nombre del curso");
               this.nombre = sc.nextLine();
               ControladorTodo.getInstance()
                    .modificarCurso(this.id, this.nombre);
                System.out.println("");
                System.out.println("Modificado Correctamente!!!");
                System.out.println("");
                ControladorTodo.getInstance().mostrarCursos();
                System.out.println("");
               this.MenuGeneral();
           case 3:
               System.out.println(" [ Mostrar ] ");
               ControladorTodo.getInstance().mostrarCursos();
               System.out.println(" ");
               this.MenuGeneral();
           break;
           case 4:
               System.out.println(" [ Deshabilitar ] ");
               ControladorTodo.getInstance().mostrarCursos();
               System.out.println("Ingresa el idCurso a DesHabilitar");
               this.id = Integer.parseInt( sc.nextLine());
               ControladorTodo.getInstance().cambiarStatusCU(this.id);
               System.out.println("");
               System.out.println("Curso Deshabilitado  !!!!");
               System.out.println("");
               ControladorTodo.getInstance().mostrarCursos();
               this.MenuGeneral();
               System.out.println("");
               
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
         
   public void Asignaciones(){
       System.out.println("1. Agregar Asignacion         ");
       System.out.println("2. Mostrar Asignaciones       ");
       this.opcion = Integer.parseInt( sc.nextLine());
       switch( this.opcion ){
           case 1:
               System.out.println("");
               System.out.println("[ Ingreso asignaciones ] ");
               System.out.println("");
               System.out.println("PASO 1");
               ControladorTodo.getInstance().mostrarAlumnos();
               System.out
                    .println(" Ingresa un idAlumno valido [Activo] | true ");
               this.id =  Integer.parseInt( sc.nextLine());
                this.agregarAsignacion(this.id);
               
               
               System.out.println("el resultado es  "  + this.typeOPVERIFY  );
               this.MenuGeneral();
           break;
           case 2:
               ControladorTodo.getInstance().mostrarAsign();
           break;
           default:
               System.out.println("Opcion invalida!!!!");
               this.MenuGeneral();
       }
   }
   
   public boolean agregarAsignacion(int idAlumno){
       
       this.typeOPVERIFY = ControladorTodo
                    .getInstance().verificarEstadoAlumno( this.id );
       if( this.typeOPVERIFY == true ){
           ControladorTodo.getInstance().mostrarCatedratico();
           System.out
                .println("Ingresa un idCatedratico valido [Activo] | true");
           this.id = Integer.parseInt( sc.nextLine());
           this.agregarAsignCatedratico(this.id);
           
       }else{
           ControladorTodo.getInstance().mostrarAlumnos();
           System.out
                    .println(" Ingresa un idAlumno valido !!!! ");
           this.id =  Integer.parseInt( sc.nextLine());
           this.agregarAsignacion(this.id);
       }
   
       return this.typeOPVERIFY;
   }
   
   public boolean agregarAsignCatedratico(int idCatedratico ){
       this.typeOPVERIFY = ControladorTodo
                    .getInstance().verificarEstadoCatedratico(idCatedratico);
       if( this.typeOPVERIFY == true ){
           ControladorTodo.getInstance().mostrarCursos();
            System.out
                .println("Ingresa un idCurso valido [Activo] | true");
           this.id = Integer.parseInt( sc.nextLine());
           this.agregarAsignCurso(this.id);
       }else{
           ControladorTodo.getInstance().mostrarCatedratico();
           System.out
                    .println(" Ingresa un idCatedratico valido !!!! ");
           this.id =  Integer.parseInt( sc.nextLine());
           this.agregarAsignCatedratico(this.id);
       }
   
       return this.typeOPVERIFY;
   }
   
    public boolean agregarAsignCurso(int idCurso ){
       this.typeOPVERIFY = ControladorTodo
                    .getInstance().verificarEstadoCurso(idCurso);
       if( this.typeOPVERIFY == true ){
           ControladorTodo.getInstance().agregarAsignacion(idCurso);
       }else{
           ControladorTodo.getInstance().mostrarCursos();
           System.out
                    .println(" Ingresa un idCurso valido !!!! ");
           this.id =  Integer.parseInt( sc.nextLine());
           this.agregarAsignCurso(this.id);
       }
   
       return this.typeOPVERIFY;
   }
   
   
   
}
