/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablojacobo.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.pablojacobo.models.User;
/**
 *
 * @author Hackobo
 */
@WebServlet(name = "UsersController", urlPatterns = {"/UsersController"})
public class UsersController extends HttpServlet {
    private static UsersController instance; 
    
    public static UsersController getInstance(){
         if( instance == null ){
            instance = new UsersController();
        }
        return instance;
    }
    
    private String localeNick;
    private String localePass;
    private String localeId;
    private boolean respuesta;
    private ArrayList<User> miArrayUsers = new ArrayList();
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
        
        this.localeNick =  request.getParameter("nick");
        this.localePass =  request.getParameter("pass");
       // this.localeId =  request.getParameter("idd");
        
        
        
        this.registerUser(this.localeNick, this.localePass);
       
       //this.respuesta = this.isIdValido( Integer.parseInt(this.localeId));
       
       //String castDeRespuesta =  Boolean.toString(this.respuesta);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UsersController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p> Bienvenido "  + this.localeNick +   "</p>");
            out.println("<h2> ESTOS SON MIS USUARIOS </h2>");
            out.println("<ul>");
            for( int k=0; k < miArrayUsers.size(); k++  ){
                out.println("<li> ID "+ k  + "</li>");
               out.println("<li> Nick "+ miArrayUsers.get(k).getNick()  + "</li>");
            }
            out.println("</ul>");
            out.println("<h1>Servlet UsersController at " + request.getContextPath() + "</h1>");
            ///out.println("</h3>" + castDeRespuesta  +"</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    
    public void loginUser(String n, String p ){
        
    }
    
    public void registerUser(String n, String p ){
        miArrayUsers.add( new User(n,p ));
    }
    
    public boolean isIdValido(int idValido ){
        boolean tempResp = false;
        for(int i =0; i < miArrayUsers.size(); i++  ){
            if( i == idValido ){
                tempResp = true;
                break;
            }
        }
        return tempResp;
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
