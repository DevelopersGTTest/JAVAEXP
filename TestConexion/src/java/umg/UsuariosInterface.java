/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umg;

import java.util.List;

/**
 *
 * @author Hackobo
 */
public interface UsuariosInterface {
    
    //listar todos los datos
    public List<Usuarios> listarUsuarios(); //{..}{..}{..}
    //obtener un elemento
    public Usuarios obtenerUsuario();       //{..}
    //insertar un elemento
    public boolean AgregarUser( Usuarios usuario );
    //eliminar 
    public boolean EliminarUser( int idUser );
    //actualizar
    public boolean actualizarUser( Usuarios usuario );
       
}
