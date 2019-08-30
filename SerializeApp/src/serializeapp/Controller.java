/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializeapp;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author Hackobo
 */
public class Controller {
    
    private ArrayList<Students> students = new ArrayList();
    
    public void createSerializerDoc(){
        
        //Dummy Data
        students.add(new Students("Pablo", "Hackobo", 20 ));
        students.add(new Students("Brayan", "Geronimo", 19 ));
        students.add(new Students("Diego", "Suriano", 19 ));
     
          try {
            FileOutputStream fos = new FileOutputStream("studentsBucket");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }   
    }
    
    public void desSerializerDoc(){
        try{
            FileInputStream file = new FileInputStream("studentsBucket");
            ObjectInputStream ois = new ObjectInputStream(file);
 
            students = (ArrayList) ois.readObject();
 
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
        
        //Show a data Deserealizer
        for(int i=0; i < students.size(); i++ ){
            System.out.println("name      : " + students.get(i).getName());
            System.out.println("last-name : " + students.get(i).getLastname());
            System.out.println("age       : " + students.get(i).getAge());
            System.out.println("--------------------");
        }
    }
    
}
