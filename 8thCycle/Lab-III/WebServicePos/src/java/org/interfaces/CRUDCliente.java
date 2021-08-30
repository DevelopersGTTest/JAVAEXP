/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.modelos.Cliente;

/**
 *
 * @author Joseph
 */
public interface CRUDCliente {
    public List listar();
    public Cliente list (int id);
    public boolean insertar(Cliente cliente);
    public boolean modificar(Cliente cliente);
    public boolean eliminar(Cliente cliente);
}
