/*
 * Autor: Ing. José Félix
 * Descripción: Clase de conexión para base de datos
 * Fecha: dd/mm/YYYY
 */
package org.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {    
    
    // verify this issue = https://stackoverflow.com/questions/18841744/jdbc-connection-failed-error-tcp-ip-connection-to-host-failed
    
    private PreparedStatement preparar = null;    
    private  Connection coneccion=null;    
    private ResultSet resultado = null;
    //Cadena de Conexion
    String stringConnectionUrl = "jdbc:sqlserver://LAPTOP-8AU1D8AN\\SQLEXPRESS:1433;databaseName=Sistema-flx;";
    //Driver o controlador JDBC
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection open() throws ClassNotFoundException{        
        try {  
            Class.forName(driver);
            coneccion = DriverManager.getConnection(stringConnectionUrl,"hackobo","123abc");
        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);            
            System.out.println("Excepción: " + e.getMessage());
        }
        return coneccion;
    }
    
    public void close() throws Exception{
        //Connection coneccion = null;
        try {
            if (coneccion != null){
                coneccion.clearWarnings();
                coneccion.close();                
            }
        } catch (SQLException e) {
            coneccion = null;
            throw new Exception(e.getMessage());
        }

    }
    
    public boolean executeSql (String cmd) throws Exception{
            if (cmd != null){
                try {
                    this.preparar = this.coneccion.prepareStatement(cmd);
                    this.preparar.executeUpdate();
                } catch (SQLException e) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);            
                    return false;
                }
            }            
            else
                throw new Exception("El comando a ejecutar es nulo!");
            return true;
    }
	
    public ResultSet executeQuery (String strSQL){
        
            if (strSQL != null)
            try {                            
                preparar = coneccion.prepareStatement(strSQL);                    
                resultado = preparar.executeQuery();	
            } catch (SQLException e) {                    
                System.out.println("Error al ejecutar el query en Clase: Conexion: " + e.toString());
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
            }
            //close();
            return resultado;
    }
    
}
