/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.servicios;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.dao.DaoCliente;
import org.modelos.Cliente;

/**
 *
 * @author Joseph
 */
@WebService(serviceName = "ServicioCliente")
public class ServicioCliente {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getClientes")
    public List<Cliente> getClientes() {
        
        DaoCliente daoCliente = new DaoCliente();
        List<Cliente> lstCliente = daoCliente.listar();
        return lstCliente;
    }
    @WebMethod(operationName = "insertCliente")
    public boolean insertCliente(@WebParam(name = "nombre") String nombre,                              
                              @WebParam(name = "apellido") String apellido,
                              @WebParam(name = "nit") String nit,
                              @WebParam(name = "direccion") String direccion,
                              @WebParam(name = "telefono") String telefono
                             ) {
        //Se crea el objeto
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setNit(nit);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        //Instanciamos el objeto 
        DaoCliente daoCliente = new DaoCliente();
        //Insertamos y retornamos la respuesta
        return daoCliente.insertar(cliente);
        
    }
}
