<%-- 
    Document   : WebConsultaCliente
    Created on : 22/02/2020, 11:16:00 AM
    Author     : Joseph
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.models.ModelCliente"%>
<%@page import="org.dao.DaoCliente"%>
<jsp:include page="../plantillaIndex.jsp" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta Clientes</title>
    </head>
    <body>
        <div class="container">
            <h1>Clientes</h1>
            <a class="btn btn-success" href="ControllerCliente?accion=nuevo">Agregar Nuevo</a>
            <table class="table table-bordered" border="1" width="1" cellspacing="1">
                <thead>
                    <tr>
                        <th class="text-center">Codigo</th>
                        <th class="text-center">Nombre</th>
                        <th class="text-center">Apellido</th>
                        <th class="text-center">Nit</th>
                        <th class="text-center">Telefono</th>
                        <th class="text-center">Direccion</th>
                        <th class="text-center">Acciones</th>
                    </tr>
                <tbody>
                    <%
                        DaoCliente daoCliente = new DaoCliente();
                        List<ModelCliente> lstCliente = daoCliente.listar();
                        Iterator<ModelCliente> itCliente = lstCliente.iterator();
                        ModelCliente cliente = new ModelCliente();
                        while(itCliente.hasNext()){
                            cliente = itCliente.next();
                    %>
                    <tr>
                        <td class="text-center"> <%= cliente.getIdCliente()%> </td>
                        <td class="text-center"> <%= cliente.getNombre()%> </td>
                        <td class="text-center"> <%= cliente.getApellido()%> </td>
                        <td class="text-center"> <%= cliente.getNit()%> </td>
                        <td class="text-center"> <%= cliente.getTelefono()%> </td>
                        <td class="text-center"> <%= cliente.getDireccion()%> </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=<%= cliente.getIdCliente()%>">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=<%= cliente.getIdCliente()%>">Eliminar</a>
                        </td>
                    </tr>
                    <% } %>
                </tbody>
                </thead>  
            </table>
            
        </div>
        
    </body>
</html>
