/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablo.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.pablo.config.Conexion;
import org.pablo.interf.UsuarioImpl;
import org.pablo.models.Usuario;

/**
 *
 * @author Hackobo
 */
public class UsuarioDao implements UsuarioImpl {

    @Override
    public List<Usuario> listAllUsers() {
       Conexion cnn = new Conexion();
       ArrayList<Usuario> users = new ArrayList<Usuario>();
       String sqlList = "SELECT * FROM SEG.USUARIO";
       ResultSet result = null;
        try{
            cnn.open();
            result = cnn.executeQuery(sqlList);
            while( result.next()){
                Usuario u = new Usuario();
                u.setClave( result.getString("CLAVE"));
                u.setEstado(result.getInt("ESTADO"));
                u.setNombre(result.getString("NOMBRE"));
                u.setUsuario( result.getString("USUARIO"));
                users.add( u );
            }
            cnn.close();
            result.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return users;
    }

    @Override
    public Usuario userById(int id) {
        Conexion cnn = new Conexion();
        Usuario segOBJ = new Usuario();
        String sqlOne = "SELECT * FROM SEG.USUARIO WHERE ID_USUARIO = " + id;
        ResultSet result = null;
        try{
            cnn.open();
            result = cnn.executeQuery(sqlOne);
            segOBJ.setClave( result.getString("CLAVE"));
            segOBJ.setEstado(result.getInt("ESTADO"));
            segOBJ.setNombre(result.getString("NOMBRE"));
            segOBJ.setUsuario( result.getString("USUARIO"));
            
            cnn.close();
            result.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return segOBJ;
    }

    @Override
    public boolean editUser(int id, Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(int idUser) {
        Conexion cnn = new Conexion();
        boolean result = false;
        String sqlDelete = "DELETE FROM SEG.USUARIO WHERE ID_USUARIO " + idUser;
        try{
            cnn.open();
            result = cnn.executeSql(sqlDelete); 
            cnn.close();
        }catch( Exception e ){
            System.out.println(" exception is :: " + e );
        }
        return result;
    }
    
}
