/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hackobo
 */
@WebServlet(name = "ConnectionController", urlPatterns = {"/ConnectionController"})
public class ConnectionController extends HttpServlet {

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
            try{
                
                Conexion cnn = new Conexion();
                cnn.open();
            
                System.out.println("reeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            
            String sqlT = "SELECT * FROM foo";
            ResultSet r = cnn.executeQuery(sqlT);
                System.out.println(" resultSer ***** " + r );
            ArrayList<Foo> fooList = new ArrayList();
            
            while( r.next() ){
                System.out.println(" name " + r.getString("nameFoo")  );
                /*Foo foo = new Foo();
                foo.setIdFoo( r.getInt("idFoo"));
                foo.setNameFoo( r.getString("nameFoo"));
                fooList.add(foo);*/
            }
            r.close();
            cnn.close();
            
            ////////changed
            System.out.println(" this length " + fooList.size() );
            
            }catch(Exception e ){
                System.out.println("exception is" + e );
            }
            
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
