/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.interfaces;

import java.util.List;
import org.modelos.Producto;
import org.modelos.TipoProducto;

/**
 *
 * @author hackobo
 */
public interface CRUDProducto {
    public List listarTipoProducto();
    public List listarProducto();
    public boolean insertarProducto(Producto producto);
    public boolean insertarTipoProducto(TipoProducto tipoProducto);
}
