/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.pablojacobo.beans.User;

/**
 *
 * @author Hackobo
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    private ArrayList<User> arrUser = new ArrayList();
    private boolean resp = false; 
    
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
            /* TODO output your page here. You may use following sample code. */
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int edad = Integer.parseInt(request.getParameter("edad"));
            
            //guardando los datos en el arreglo
            this.saveData(nombre, apellido, edad);
            
            
            //solo para mostrar en el html
            String edadConvertida =  Integer.toString(edad);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            
            //valores que paso
            out.println("<p> el nombre es: " + nombre   +  "</p>");
            out.println("<p> el apellido es: " + apellido   +  "</p>");
            out.println("<p> la edad es: " + edadConvertida   +  "</p>");
            
            //valores del array
            out.println("<ul>");
            for(int k=0; k < arrUser.size(); k++ ){
                out.println("<li> " + arrUser.get(k).getName()   + "</li>");
                out.println("<li> " + arrUser.get(k).getLasname()   + "</li>");
            }
            out.println("</ul>");
            
            out.println("<title>Servlet UserController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UserController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    public void saveData(String nom, String ape, int edad ){
        arrUser.add(new User(nom, ape,edad));
        this.createFie(arrUser);
    }
    //   BOOTSTRAP
    //https://getbootstrap.com/docs/4.3/components/forms/
    /*
    LOGIN
     public Boolean Login(String username, String password){
        for(int i =0; i< userArray.size(); i++  ){
            String nick = userArray.get(i).getNickname();
            String pass = userArray.get(i).getPassword();
            if( nick.equals(username) && pass.equals(password)){
                this.resp = true;
                break;
            }else{
                this.resp = false;
            }
        }
        return this.resp;
    }  
    */
    
    public void createFie(ArrayList<User> userArray ){
        try {
            FileOutputStream file = new FileOutputStream("users");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(userArray );
            oos.close();
            file.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserController.class.getName()).log(Level.SEVERE, null, ex);
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
