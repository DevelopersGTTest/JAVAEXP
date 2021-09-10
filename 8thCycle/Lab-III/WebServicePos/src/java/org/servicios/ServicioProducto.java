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
import org.dao.DaoProducto;
import org.modelos.Producto;
import org.modelos.TipoProducto;

/**
 *
 * @author hackobo
 */
@WebService(serviceName = "ServicioProducto")
public class ServicioProducto {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getTipoProductos")
    public List<TipoProducto> getTipoProductos() {
        
        DaoProducto daoProducto = new DaoProducto();
        List<TipoProducto> tipoProductList = daoProducto.listarTipoProducto();
        return tipoProductList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getProductos")
    public List<Producto> getProductos() {
        DaoProducto daoProducto = new DaoProducto();
        List<Producto> productoList = daoProducto.listarProducto();
        return productoList;
    }
    
    
    
}
