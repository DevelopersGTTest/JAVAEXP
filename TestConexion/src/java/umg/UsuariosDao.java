/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hackobo
 */
public class UsuariosDao implements UsuariosInterface {
    
    @Override
    public List<Usuarios> listarUsuarios() {
        List<Usuarios> listaUsuariosDB = new ArrayList();
        String sql = "SELECT * FROM Usuarios";
        Conexion cnn = new Conexion();
        ResultSet resultadosDB = null;
        
        try {
            cnn.open();
             resultadosDB = cnn.executeQuery(sql);
            
            while( resultadosDB.next()){
                Usuarios  u = new Usuarios();
                u.setIdUser( resultadosDB.getInt("idUser"));
                u.setNombre( resultadosDB.getString("nombre"));
                u.setApellido(resultadosDB.getString("apellido"));
                listaUsuariosDB.add(u);
            }
            resultadosDB.close();
            cnn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return listaUsuariosDB;
    }

    @Override
    public Usuarios obtenerUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean AgregarUser(Usuarios usuario) {
        boolean resultadoSQL = false;
        Conexion cnn = new Conexion();
        
        try {
            cnn.open();
            String sqlAdd = "INSERT INTO Usuarios(nombre, apellido) "
                    + "VALUES('"+ usuario.getNombre() +"', '"+ usuario.getApellido() +"');";
            resultadoSQL = cnn.executeSql(sqlAdd);
            cnn.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(UsuariosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultadoSQL;
    }

    @Override
    public boolean EliminarUser(int idUser) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarUser(Usuarios usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
