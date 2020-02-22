/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablo.interf;
import java.util.List;
import org.pablo.models.Usuario;

/**
 *
 * @author Hackobo
 */
public interface UsuarioImpl {
    public List<Usuario> listAllUsers();
    public Usuario userById (int id);
    public boolean editUser (int id, Usuario u );
    public boolean deleteUser (int idUser);
}
