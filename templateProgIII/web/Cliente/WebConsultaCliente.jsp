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
                   
                    <tr>
                        <td class="text-center"> 1 </td>
                        <td class="text-center"> pablo daniel </td>
                        <td class="text-center"> jacobo sanchez </td>
                        <td class="text-center"> 123456789  </td>
                        <td class="text-center"> 41130425 </td>
                        <td class="text-center"> zona 11 de mixco </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 2 </td>
                        <td class="text-center"> andrea  </td>
                        <td class="text-center"> alonso </td>
                        <td class="text-center"> 9456778   </td>
                        <td class="text-center"> 42150425 </td>
                        <td class="text-center"> zona 3 guatemala </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 3 </td>
                        <td class="text-center"> jimena </td>
                        <td class="text-center"> lopez </td>
                        <td class="text-center"> 54553456 </td>
                        <td class="text-center"> 48632111 </td>
                        <td class="text-center"> zona 5 de guatemala </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 4 </td>
                        <td class="text-center"> francisco javier </td>
                        <td class="text-center"> barrera </td>
                        <td class="text-center"> 678912345  </td>
                        <td class="text-center"> 6645625 </td>
                        <td class="text-center"> zona 4 de mixco </td>
                        <td class="text-center">
                            <a href="ControllerCliente?accion=editar&id=">Editar</a>
                            <a href="ControllerCliente?accion=eliminar&id=>">Eliminar</a>
                        </td>
                    </tr>
                       <tr>
                        <td class="text-center"> 5 </td>
                        <td class="text-center"> jose andres </td>
                        <td class="text-center"> sanabria sandoval </td>
                        <td class="text-center"> 97412345  </td>
                        <td class="text-center"> 77130445 </td>
                        <td class="text-center"> zona 15 mixco </td>
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
