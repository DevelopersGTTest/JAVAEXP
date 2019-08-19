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
    //controlador maestro
    //USARE SINGLETON PARA LOS CONTROLADORES
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
    
    public void modificarAlumno(int id){
    
    }
    
    public void mostrarAlumnos(){
        for(int i=0; i< alumnos.size(); i++){
            System.out.println("idAlumno :" + i  );
            System.out.println("Nombre   :" + alumnos.get(i).getNombre());
            System.out.println("Apellido :" + alumnos.get(i).getApellido());
            System.out.println("Edad     :" + alumnos.get(i).getEdad());
            System.out.println("Estatus  :" + alumnos.get(i).isEstatus());
        }
    }
    
    
    /*
    * @Catedraticos
    */
    
    /*
    * @Cursos
    */
    
    /*
    * @Asignaciones
    */
}
