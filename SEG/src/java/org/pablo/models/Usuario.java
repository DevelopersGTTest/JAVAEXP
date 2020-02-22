/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablo.models;

/**
 *
 * @author Hackobo
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String usuario;
    private String clave;
    private int estado;

    public Usuario(int idUsuario, String nombre, 
        String usuario, String clave, int estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }
    
    public Usuario( ) {}

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
