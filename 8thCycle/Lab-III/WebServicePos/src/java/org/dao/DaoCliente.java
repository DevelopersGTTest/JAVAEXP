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
import org.interfaces.CRUDCliente;
import org.modelos.Cliente;

/**
 *
 * @author Joseph
 */
public class DaoCliente implements CRUDCliente{
    //Se crea un objeto publico del Cliente
    Cliente cliente = new Cliente();
    //Variable para crear las sentencias SQL
    String strSql =  "";
    //Se crea un obejto de tipo conexión para manejar la persistencia hacia la base de datos
    Conexion conexion = new Conexion();
    //Obtiene el resultado de las consultas SQL
    ResultSet rs = null;
    //flag para retornar si la sentencia SQL fue satisfactorio o no
    boolean respuesta = false;

    @Override
    public List listar() {
        ArrayList<Cliente> lstCliente = new ArrayList<>();
         try {            
            strSql = "SELECT * FROM POS.CLIENTE";
            conexion.open();
            rs = conexion.executeQuery(strSql);                             
            
            while (rs.next()) {
                Cliente clie = new Cliente();
                clie.setIdCliente(rs.getInt("ID_CLIENTE"));
                clie.setNombre(rs.getString("NOMBRE"));
                clie.setApellido(rs.getString("APELLIDO"));
                clie.setDireccion(rs.getString("DIRECCION"));
                clie.setNit(rs.getString("NIT"));
                clie.setTelefono(rs.getString("TELEFONO"));
                lstCliente.add(clie);
            }
            rs.close();
            conexion.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        } catch(Exception ex){
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);            
        }
        
         return lstCliente;
    }

    @Override
    public Cliente list(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean insertar(Cliente cliente) {
        strSql = "INSERT  INTO  POS.CLIENTE(ID_CLIENTE, NOMBRE, APELLIDO, NIT, TELEFONO, DIRECCION) "
                + "VALUES ( (SELECT ISNULL(MAX(ID_CLIENTE),0) + 1 FROM POS.CLIENTE), " +                   
                 "'" + cliente.getNombre() + "', " +                 
                "'" + cliente.getApellido()+ "', " +       
                 "'" + cliente.getNit() + "', " +
                "'" + cliente.getTelefono()+ "', " +
                 "'" + cliente.getDireccion()+ "'" +                 
                  ")";

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
    public boolean modificar(Cliente cl) {
        //Se prepara la sentencia SQL a ejecutar en la BD
        strSql =  "UPDATE POS.CLIENTE SET NOMBRE = '"+ cl.getNombre()  +"',"
                + " APELLIDO = '"+ cl.getApellido() +"',"
                + " NIT = '"+ cl.getNit() +"', "
                + "TELEFONO = '"+ cl.getTelefono() +"', "
                + "DIRECCION = '"+ cl.getDireccion() +"'"
                + " WHERE ID_CLIENTE = " + cl.getIdCliente();

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
    public boolean eliminar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
