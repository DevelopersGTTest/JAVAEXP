/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.models.SEG;


/**
 *
 * @author Ronald Galicia
 */
public interface CrudUsuarioseg {
    public List listar();
    public SEG list (int id);
    public boolean SEG ( SEG seg );
    public boolean modificar ( SEG seg);
    public boolean eliminar (int seg);
}

/*public class CrudUsuarioseg {
    public List listar();
    public ModelUsuario list (int id);
    public boolean insertar (ModelUsuario usuario );
    public boolean modificar (ModelUsuario usuario);
    public boolean eliminar (ModelUsuario usuario);

}*/
