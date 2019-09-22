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

//beans
import org.pablojacobo.beans.Operations;

/**
 *
 * @author Hackobo
 */
@WebServlet(name = "CalculadorController", urlPatterns = {"/CalculadorController"})
public class CalculadorController extends HttpServlet {
    int dato1 = 0;
    int dato2 = 0;
    String signo = "";
    
    int resultEntero = 0;
    String resultString = "";
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
            this.dato1 = Integer.parseInt( request.getParameter("n_uno"));
            this.dato2 = Integer.parseInt( request.getParameter("n_dos"));
            
            this.signo = request.getParameter("signo");
            
            switch( this.signo){
                case  "+":
                    //System.out.println("sumasssss");
                    this.resultEntero = Operations.getInstance()
                        .sumar(this.dato1, this.dato2);
                    this.resultString = Integer.toString(this.resultEntero);
                    out.println("<p>resultado "+ this.resultString + "</p>");
                    out.println("<a href='OperationsController'>Regresar</a>");
                break;
                case  "-":
                    //System.out.println("restasss");
                    this.resultEntero = Operations.getInstance()
                        .restar(this.dato1, this.dato2);
                    this.resultString = Integer.toString(this.resultEntero);
                    out.println("<p>resultado "+ this.resultString + "</p>");
                    out.println("<a href='OperationsController'>Regresar</a>");
                break;
                case  "*":
                    //System.out.println("multiplicasssss");
                    this.resultEntero = Operations.getInstance()
                        .multiplicar(this.dato1, this.dato2);
                    this.resultString = Integer.toString(this.resultEntero);
                    out.println("<p>resultado "+ this.resultString + "</p>");
                    out.println("<a href='OperationsController'>Regresar</a>");
                break;
                case  "/":
                    //System.out.println("dividessssss");
                    this.resultEntero = Operations.getInstance()
                        .dividir(this.dato1, this.dato2);
                    this.resultString = Integer.toString(this.resultEntero);
                    out.println("<p>resultado "+ this.resultString + "</p>");
                    out.println("<a href='OperationsController'>Regresar</a>");
                break;
                default:
                     out.println("<p> operacion invalida </p>");
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
