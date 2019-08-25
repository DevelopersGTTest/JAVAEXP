/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files.faker;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Hackobo
 */
public class Maker {
    
    private FileReader fr = null;
    private BufferedReader br = null;
    private Scanner sc = new Scanner(System.in);
 
    
    public void mainMaker(){
        this.readFile();
        this.createFile();
    }
    
    public void readFile( ){
        try {
            fr = new FileReader("C:\\JAVA\\test.txt");
            br = new BufferedReader(fr);
            
            String contains = br.readLine();
            while(contains != null){
                System.out.println(contains);
                contains = br.readLine();
            }
                        
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void createFile(){
        FileWriter fw = null;
        PrintWriter newFile = null;
        try {
            Scanner sc = new Scanner(System.in);
            fw = new FileWriter("C:/JAVA/newFileDemo.txt", true);
            newFile = new PrintWriter(fw);
            String chain;
            System.out.println("send a one number!!!");
            chain = sc.nextLine();
            while (!chain.equalsIgnoreCase("FIN")) {
                newFile.println(chain);
                chain = sc.nextLine();
            }
            newFile.flush();
            
        } catch (IOException ex) {
            System.out.println("exp this :"  + ex) ;
        } finally {    
            newFile.close();
        }
    }
    
 
    //build functions 
    public void createDirectory(String pathFile){
        File nameFile = new File(pathFile);
        if(nameFile.exists()){
         
            System.out.println("alguna");
            
        }else{
            System.out.println("path non valid");
        }
    }
    
    
    
}
