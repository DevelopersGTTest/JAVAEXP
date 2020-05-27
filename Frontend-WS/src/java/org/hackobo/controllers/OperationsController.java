/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hackobo.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import services.OperationsWebService_Service;

/**
 *
 * @author Pablo Jacobo
 */
@WebServlet(name = "OperationsController", urlPatterns = {"/OperationsController"})
public class OperationsController extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Backend-WS/OperationsWebService.wsdl")
    private OperationsWebService_Service service;
    
    private String action = "";
    private String d1, d2 = "";
    private float resultQ;
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
           this.action = request.getParameter("action");
           this.d1 = request.getParameter("n1");
           this.d2 = request.getParameter("n2");
            
            switch( this.action ){
                case "suma":
                    this.resultQ = sumaNumbers( d1, d2 );
                    System.out.println(" resultado es " + this.resultQ );
                    out.println("<h1>" + this.resultQ + "<h1>");
                break;
                case "resta":
                    this.resultQ = restaNumbers( d1, d2 );
                    System.out.println(" resultado es " + this.resultQ );
                    out.println("<h1>" + this.resultQ + "<h1>");
                break;
                case "multiplicacion":
                    this.resultQ = multiNumbers( d1, d2 );
                    System.out.println(" resultado es " + this.resultQ );
                   out.println("<h1>" + this.resultQ + "<h1>");
                break;
                case "division":
                    this.resultQ = divisionNumbers( d1, d2 );
                    System.out.println(" resultado es " + this.resultQ );
                   out.println("<h1>" + this.resultQ + "<h1>");
                break;
            
            }
            
        }
    }
    
    public static float divisionNumbers(java.lang.String n1, java.lang.String n2) {
        services.OperationsWebService_Service service = new services.OperationsWebService_Service();
        services.OperationsWebService port = service.getOperationsWebServicePort();
        return port.divisionNumbers(n1, n2);
    }

    private static float multiNumbers(java.lang.String n1, java.lang.String n2) {
        services.OperationsWebService_Service service = new services.OperationsWebService_Service();
        services.OperationsWebService port = service.getOperationsWebServicePort();
        return port.multiNumbers(n1, n2);
    }

    private static float sumaNumbers(java.lang.String n1, java.lang.String n2) {
        services.OperationsWebService_Service service = new services.OperationsWebService_Service();
        services.OperationsWebService port = service.getOperationsWebServicePort();
        return port.sumaNumbers(n1, n2);
    }
    
    private float restaNumbers(java.lang.String n1, java.lang.String n2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        services.OperationsWebService port = service.getOperationsWebServicePort();
        return port.restaNumbers(n1, n2);
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
