/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignaciones;

import java.util.ArrayList;
import java.io.*;

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
        try {
            FileOutputStream fos = new FileOutputStream("alumnos");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(alumnos);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }   
    }
    
    public void modificarAlumno(int id, String nombre, 
    String apellido, int edad){
          try{
            FileInputStream file = new FileInputStream("alumnos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            alumnos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
          
        for(int i=0; i< alumnos.size(); i++){
            if( i == id ){
                alumnos.get(i).setNombre(nombre);
                alumnos.get(i).setApellido(apellido);
                alumnos.get(i).setEdad(edad);
                try {
                    FileOutputStream fos = new FileOutputStream("alumnos");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(alumnos);
                    oos.close();
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }      
            }
        }
    }
    
    public void mostrarAlumnos(){
        try{
            FileInputStream file = new FileInputStream("alumnos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            alumnos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
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
         try{
            FileInputStream file = new FileInputStream("alumnos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            alumnos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
         
        for(int i=0; i< alumnos.size(); i++){
            if( i == id ){
                alumnos.get(i).setEstatus(false); //solo existen dos estatus :)
                try {
                    FileOutputStream fos = new FileOutputStream("alumnos");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(alumnos);
                    oos.close();
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }       
            }
        }
    }
    
    
    /*
    * @Catedraticos
    */
    public void agregarCatedratico(String nombre, String dpi){
        catedraticos.add( new Catedraticos(nombre , dpi));
        try {
            FileOutputStream fos = new FileOutputStream("catedraticos");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(catedraticos);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }   
    }
    
    public void modificarCatedratico(int id, String nombre, String dpi){
        try{
            FileInputStream file = new FileInputStream("catedraticos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            catedraticos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
        for(int i=0; i< catedraticos.size(); i++){
            if( i == id ){
                catedraticos.get(i).setNombreCatedratico(nombre);
                catedraticos.get(id).setDpiCatedratico(dpi);
                try {
                    FileOutputStream fos = new FileOutputStream("catedraticos");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(catedraticos);
                    oos.close();
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                } 
            }
        }
    }
    
    public void mostrarCatedratico(){
        try{
            FileInputStream file = new FileInputStream("catedraticos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            catedraticos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
           
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
        try{
            FileInputStream file = new FileInputStream("catedraticos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            catedraticos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
        for(int i=0; i< catedraticos.size(); i++){
            if( i == id ){
                catedraticos.get(i).setEstatus(false); 
                try {
                    FileOutputStream fos = new FileOutputStream("catedraticos");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(catedraticos);
                    oos.close();
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                } 
            }
        }
    }
    
    
    /*
    * @Cursos
    */
    
    public void agregarCurso(String nombre){
        cursos.add( new Cursos(nombre));
        try {
            FileOutputStream fos = new FileOutputStream("cursos");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cursos);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }   
    }
    
    public void modificarCurso(int id, String nombre){
        try{
            FileInputStream file = new FileInputStream("cursos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            cursos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
         
        for(int i=0; i< cursos.size(); i++){
            if( i == id ){
                cursos.get(i).setNombreCurso(nombre);
                 try {
                    FileOutputStream fos = new FileOutputStream("cursos");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(cursos);
                    oos.close();
                    fos.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }   
            }
        }
    }
    
    public void mostrarCursos(){
        try{
            FileInputStream file = new FileInputStream("cursos");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            cursos = (ArrayList) ois.readObject();
 
            ois.close();
            file.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
         
        for(int i=0; i< cursos.size(); i++){
            System.out.println("---------------------------------------");
            System.out.println("idCurso :" 
                + i  );
            System.out.println("Nombre    :" 
                + cursos.get(i).getNombreCurso());
            System.out.println("Estatus  :" 
                + cursos.get(i).isEstatus());
            System.out.println("---------------------------------------");
        }
    }
    
    public void cambiarStatusCU(int id ){
        for(int i=0; i< cursos.size(); i++){
            if( i == id ){
                cursos.get(i).setEstatus(false); //solo existen dos estatus :)
            }
        }
    }
    
    /*
    * @Asignaciones
    */
    
    public boolean verificarEstadoAlumno(int idAlumno){
        boolean type = false;
        if( alumnos.size() > 0  ){
            for(int i =0; i < alumnos.size(); i++ ){
                if(i == idAlumno ){
                    if( alumnos.get(i).isEstatus() == true ){
                         type = true;
                         break;
                    }else{
                         type = false;
                         break;
                    }
                }
            }
        }
        return type;
    }
    
       public boolean verificarEstadoCatedratico(int idCatedratico){
        boolean type = false;
        if( catedraticos.size() > 0  ){
            for(int i =0; i < catedraticos.size(); i++ ){
                if(i == idCatedratico){
                    if( catedraticos.get(i).isEstatus() == true ){
                         type = true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return type;
    }
       
       public boolean verificarEstadoCurso(int idCurso){
        boolean type = false;
        if( cursos.size() > 0  ){
            for(int i =0; i < cursos.size(); i++ ){
                if(i == idCurso){
                    if( cursos.get(i).isEstatus() == true ){
                         type = true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return type;
    }
       
       
     public void agregarAsignacion(int id ){
         asign.add(new Asign( id));
     }
     
     public void mostrarAsign(){
         for(int i =0; i < asign.size(); i++ ){
             System.out.println("id :" + i );
             System.out.println(" id Asignacion " + asign.get(i).getIdAlgo() );
         }
     }
    
}
