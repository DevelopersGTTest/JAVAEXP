/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.interfaces.CrudUsuarioseg;
import org.config.Conexion;
import org.models.SEG;
/**
 *
 * @author Hackobo
 */
public class SedDao implements CrudUsuarioseg {    
    
    Conexion conexion = new Conexion();
    
    @Override
    public List listar() {
        ArrayList<SEG> segList = new ArrayList<SEG>();
        String sqlList = "SELECT * FROM SEG";
        ResultSet result = null;
        try{
            conexion.open();
            result = conexion.executeQuery(sqlList);
            while( result.next()){
                SEG segOBJ = new SEG();
                segOBJ.setClave( result.getString("CLAVE"));
                segOBJ.setEstado(result.getInt("ESTADO"));
                segOBJ.setId_cliente(result.getInt("ID_CLIENTE"));
                segOBJ.setNombre(result.getString("NOMBRE"));
                segOBJ.setUsuario( result.getString("USUARIO"));
                segList.add( segOBJ );
            }
            conexion.close();
            result.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return segList;
    }

    @Override
    public org.models.SEG list(int id) {
        SEG segOBJ = new SEG();
        String sqlListOneRegister = "SELECT * FROM SEG WHERE ID_USUARIO = " + id;
        ResultSet result = null;
        try{
            conexion.open();
            result = conexion.executeQuery(sqlListOneRegister);
            segOBJ.setClave( result.getString("CLAVE"));
            segOBJ.setEstado(result.getInt("ESTADO"));
            segOBJ.setId_cliente(result.getInt("ID_CLIENTE"));
            segOBJ.setNombre(result.getString("NOMBRE"));
            segOBJ.setUsuario( result.getString("USUARIO"));
            
            conexion.close();
            result.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return segOBJ;
    }

    @Override
    public boolean SEG(org.models.SEG seg) {
       return false;
    }

    @Override
    public boolean modificar(org.models.SEG seg) {
        boolean result = false; 
        String sqlUpdate = "UPDATE SEG SET CLAVE = " + seg.getClave() 
            + " SET ESTADO = " + seg.getEstado() + " SET ID_CLIENTE = " 
            + seg.getId_cliente() + " SET NOMBRE =  " + seg.id_cliente 
            + "SET USUARIO = " + seg.getUsuario() + " WHERE ID_USUARIO  = "
            + seg.getId_cliente() + "";
        try{
            conexion.open();
            result = conexion.executeSql(sqlUpdate); 
            conexion.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return result;
    }

    @Override
    public boolean eliminar(int id) {
        boolean result = false;
        String sqlDeleteRegister = "DELETE FROM SEG WHERE " + id;
        try{
            conexion.open();
            result = conexion.executeSql(sqlDeleteRegister); 
            conexion.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return result;
    }
    
}
