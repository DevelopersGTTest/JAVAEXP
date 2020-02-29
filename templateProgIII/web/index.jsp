q<%-- 
    Document   : index
    Created on : 20/03/2019, 04:25:25 PM
    Author     : josef
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="plantillaIndex.jsp"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <br><br>
     <body>
        <div class="container">
            <h1>Clientes</h1>
            <a class="btn btn-success" href="ControllerCliente?accion=nuevo">Agregar Nuevo</a>
            <br><br>
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
                   
                    <tr>
                        <td class="text-center"> 1 </td>
                        <td class="text-center"> Daniela fernanda </td>
                        <td class="text-center"> Oliva sarceño  </td>
                        <td class="text-center"> 101420621 </td>
                        <td class="text-center"> 41130425 </td>
                        <td class="text-center"> zona 11 mixco </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 2 </td>
                        <td class="text-center"> Lidia lorena    </td>
                        <td class="text-center"> Gonzales ventura </td>
                        <td class="text-center"> 102150632  </td>
                        <td class="text-center"> 58061811 </td>
                        <td class="text-center"> zona 2 guatemala </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 3 </td>
                        <td class="text-center"> Gustavo andre </td>
                        <td class="text-center"> mendez pinto </td>
                        <td class="text-center"> 102225923 </td>
                        <td class="text-center"> 41145702 </td>
                        <td class="text-center"> zona 4 de guatemala </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 4 </td>
                        <td class="text-center"> Bilkar manuel </td>
                        <td class="text-center"> morataya molina </td>
                        <td class="text-center"> 101427624 </td>
                        <td class="text-center"> 59235178 </td>
                        <td class="text-center"> zona 8 ciudad de guatemala </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 5 </td>
                        <td class="text-center"> Cristel Gabriela </td>
                        <td class="text-center"> Morales Mendez  </td>
                        <td class="text-center"> 101224625 </td>
                        <td class="text-center"> 66609024 </td>
                        <td class="text-center"> zona 11 mixco </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>   
                    
                   
                </tbody>
                </thead>  
            </table>
            
        </div>
        
    </body>
</html>
