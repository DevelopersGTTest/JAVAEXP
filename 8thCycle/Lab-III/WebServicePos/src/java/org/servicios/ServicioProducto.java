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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addTipoProducto")
    public boolean addTipoProducto(
        @WebParam(name = "descripcion") String descripcion, 
        @WebParam(name = "estado") int estado
    ) {
        TipoProducto tp = new TipoProducto();
        tp.setDescripcion(descripcion);
        tp.setEstado(estado);
        
        DaoProducto daoProducto = new DaoProducto();
        return  daoProducto.insertarTipoProducto(tp);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addProducto")
    public boolean addProducto(
        @WebParam(name = "idTipoProducto") int idTipoProducto, 
        @WebParam(name = "descripcion") String descripcion, 
        @WebParam(name = "precio") float precio, 
        @WebParam(name = "existencia") int existencia, 
        @WebParam(name = "estado") int estado
    ) {
        Producto p = new Producto();
        p.setDescripcion(descripcion);
        p.setEstado(estado);
        p.setExistencia(existencia);
        p.setIdProducto(idTipoProducto);
        p.setPrecio(precio);
        
        DaoProducto daoProducto = new DaoProducto();
        return  daoProducto.insertarProducto(p);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ModificarProducto")
    public String ModificarProducto(@WebParam(name = "idProducto") String idProducto, @WebParam(name = "idTipoProducto") String idTipoProducto, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "precio") String precio, @WebParam(name = "existencia") String existencia, @WebParam(name = "estado") String estado) {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "modificarTipoProducto")
    public String modificarTipoProducto(@WebParam(name = "idTipoProducto") String idTipoProducto, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "estado") String estado) {
        //TODO write your implementation code here:
        return null;
    }
    
    
    
}
