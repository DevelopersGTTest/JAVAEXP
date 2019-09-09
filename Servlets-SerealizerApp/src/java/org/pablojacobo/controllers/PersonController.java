/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.pablojacobo.beans.Person;

/**

/**
 *
 * @author Hackobo
 */
@WebServlet(name = "PersonController", urlPatterns = {"/PersonController"})
public class PersonController extends HttpServlet {
    private ArrayList<Person> person = new ArrayList();
     
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //request data
            String name = request.getParameter("name_");
            String username = request.getParameter("username");
            
            //create FileBucket    
            this.addPerson(name, username);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Env DB</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PersonController at " + request.getContextPath() + "</h1>");
            //out.println("<p> los valores son : " + name + " | " + username +  "    </p>");
            out.println("<ul>");
                try{
                    FileInputStream file = new FileInputStream("personsBucket");
                    ObjectInputStream ois = new ObjectInputStream(file);
                    person = (ArrayList) ois.readObject();
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
                
                for(int k=0; k < person.size(); k++ ){
                    out.println("<li>"
                        + person.get(k).getName_() + 
                            " | " 
                        + person.get(k).getUsername() 
                    +"  </li>");
                }
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }
        
    public void addPerson(String name , String username ){
        person.add(new Person(name, username ));
        this.serializerPerson(person);
    }
    
    public void serializerPerson(ArrayList<Person> person ){
        try {
            FileOutputStream fos = new FileOutputStream("personsBucket");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
            fos.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
