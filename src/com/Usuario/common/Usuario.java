/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Usuario.common;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class Usuario implements Serializable
{
    String usuario;
    String clave;
    String nombre;
    String apellido;

    public Usuario() 
    {
        this.usuario = "";
        this.clave = "";
        this.nombre = "";
        this.apellido = "";
    }  
    
    public Usuario(String nombre, String apellido,String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    

}
