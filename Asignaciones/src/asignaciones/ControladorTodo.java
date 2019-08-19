/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciones;

import java.util.ArrayList;

/**
 *
 * @author Hackobo
 */
public class ControladorTodo {
    //CONTROLADOR MAESTRO
    //USARE SINGLETON PARA EL CONTROLADOR
    private static ControladorTodo instance;
    
    public static ControladorTodo getInstance(){
        if( instance == null ){
            instance = new ControladorTodo();
        }
        return instance;
    }
    
    private ArrayList<Alumnos> alumnos = new ArrayList();
    private ArrayList<Catedraticos> catedraticos = new ArrayList();
    private ArrayList<Cursos> cursos = new ArrayList();
    private ArrayList<Asign> asign = new ArrayList();
    
    /*
    * @Alumnos
    */
    public void agregarAlumno(String nombre, String apellido, int edad){
        alumnos.add( new Alumnos(nombre, apellido, edad ));
    }
    
    public void modificarAlumno(int id, String nombre, 
    String apellido, int edad){
        for(int i=0; i< alumnos.size(); i++){
            if( i == id ){
                alumnos.get(i).setNombre(nombre);
                alumnos.get(i).setApellido(apellido);
                alumnos.get(i).setEdad(edad);
            }
        }
    }
    
    public void mostrarAlumnos(){
        for(int i=0; i< alumnos.size(); i++){
            System.out.println("---------------------------------------");
            System.out.println("idAlumno :" + i  );
            System.out.println("Nombre   :" + alumnos.get(i).getNombre());
            System.out.println("Apellido :" + alumnos.get(i).getApellido());
            System.out.println("Edad     :" + alumnos.get(i).getEdad());
            System.out.println("Estatus  :" + alumnos.get(i).isEstatus());
            System.out.println("---------------------------------------");
        }
    }
    
    public void cambiarStatus(int id ){
        for(int i=0; i< alumnos.size(); i++){
            if( i == id ){
                alumnos.get(i).setEstatus(false); //solo existen dos estatus :)
            }
        }
    }
    
    
    /*
    * @Catedraticos
    */
    public void agregarCatedratico(String nombre, String dpi){
        catedraticos.add( new Catedraticos(nombre , dpi));
    }
    
    public void modificarCatedratico(int id, String nombre, String dpi){
        for(int i=0; i< catedraticos.size(); i++){
            if( i == id ){
                catedraticos.get(i).setNombreCatedratico(nombre);
                catedraticos.get(id).setDpiCatedratico(dpi);
            }
        }
    }
    
    public void mostrarCatedratico(){
        for(int i=0; i< catedraticos.size(); i++){
            System.out.println("---------------------------------------");
            System.out.println("idCatedratico :" 
                + i  );
            System.out.println("Nombre    :" 
                + catedraticos.get(i).getNombreCatedratico());
            System.out.println("DPI       :" 
                + catedraticos.get(i).getDpiCatedratico());
            System.out.println("Estatus  :" 
                + catedraticos.get(i).isEstatus());
            System.out.println("---------------------------------------");
        }
    }
    
    public void cambiarStatusC(int id ){
        for(int i=0; i< catedraticos.size(); i++){
            if( i == id ){
                catedraticos.get(i).setEstatus(false); //solo existen dos estatus :)
            }
        }
    }
    
    
    /*
    * @Cursos
    */
    
    /*
    * @Asignaciones
    */
}
