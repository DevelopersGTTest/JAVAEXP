/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.config.Conexion;
import org.interfaces.CRUDProducto;
import org.modelos.Cliente;
import org.modelos.Producto;
import org.modelos.TipoProducto;

/**
 *
 * @author hackobo
 */
public class DaoProducto implements CRUDProducto {
    
    String strSql =  "";
    //Se crea un obejto de tipo conexión para manejar la persistencia hacia la base de datos
    Conexion conexion = new Conexion();
    //Obtiene el resultado de las consultas SQL
    ResultSet rs = null;
    //flag para retornar si la sentencia SQL fue satisfactorio o no
    boolean respuesta = false;

    @Override
    public List listarTipoProducto() {
        ArrayList<TipoProducto> tipoProducto = new ArrayList<>();
        try {            
            strSql = "SELECT * FROM POS.TIPO_PRODUCTO";
            conexion.open();
            rs = conexion.executeQuery(strSql);                             
            
            while (rs.next()) {
                TipoProducto tpProducto = new TipoProducto();
                tpProducto.setIdTipoProducto(rs.getInt("ID_TIPO_PRODUCTO"));
                tpProducto.setDescripcion(rs.getString("DESCRIPCION"));
                tpProducto.setEstado(rs.getInt("ESTADO"));
                tipoProducto.add(tpProducto);
            }
            rs.close();
            conexion.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        } catch(Exception ex){
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
         return tipoProducto;
    }

    @Override
    public List listarProducto() {
        ArrayList<Producto> productList = new ArrayList<>();
        try {            
            strSql = "SELECT \n" +
                "	p.ID_PRODUCTO,  \n" +
                "	POS.TIPO_PRODUCTO.DESCRIPCION AS 'TIPO_PRODUCTO',  \n" +
                "	p.DESCRIPCION, \n" +
                "	p.PRECIO, \n" +
                "	p.EXISTENCIA, \n" +
                "	p.ESTADO  \n" +
                "FROM \n" +
                "	POS.PRODUCTO p\n" +
                "INNER JOIN  \n" +
                "	POS.TIPO_PRODUCTO \n" +
                "ON \n" +
                "	p.ID_TIPO_PRODUCTO = POS.TIPO_PRODUCTO.ID_TIPO_PRODUCTO ";
            
            conexion.open();
            rs = conexion.executeQuery(strSql);                             
              
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("ID_PRODUCTO"));
                producto.setTipoProducto(rs.getString("TIPO_PRODUCTO"));
                producto.setDescripcion(rs.getString("DESCRIPCION"));
                producto.setExistencia(rs.getInt("PRECIO"));
                producto.setExistencia(rs.getInt("EXISTENCIA"));
                producto.setEstado(rs.getInt("ESTADO"));
                productList.add(producto);
            }
            rs.close();
            conexion.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        } catch(Exception ex){
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
         return productList;
    }

    @Override
    public boolean insertarProducto(Producto producto) {
        strSql = "INSERT INTO POS.PRODUCTO  "
                + "VALUES((SELECT ISNULL(MAX(ID_PRODUCTO),0) + 1 FROM POS.PRODUCTO), "
                + ""+ producto.getIdTipoProducto() +", '"+ producto.getDescripcion() +"', "
                + ""+ producto.getPrecio()+", "+ producto.getExistencia() +", "
                + ""+ producto.getEstado() +" )";
        
        try {
            conexion.open();
            respuesta = conexion.executeSql(strSql);
            conexion.close();
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);     
            return false;
        } catch(Exception ex){
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return respuesta;
    }

    @Override
    public boolean insertarTipoProducto(TipoProducto tipoProducto) {
        strSql = "INSERT INTO POS.TIPO_PRODUCTO  VALUES "
                + "((SELECT ISNULL(MAX(ID_TIPO_PRODUCTO),0) + 1 FROM POS.TIPO_PRODUCTO), "
                + "'"+ tipoProducto.getDescripcion() +"', "+ tipoProducto.getEstado() +"  )";
        
        try {
            conexion.open();
            respuesta = conexion.executeSql(strSql);
            conexion.close();
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);     
            return false;
        } catch(Exception ex){
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        }
        return respuesta;
    }
    
}
