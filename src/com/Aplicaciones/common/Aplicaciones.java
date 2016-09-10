/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aplicaciones.common;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class Aplicaciones implements Serializable{
    private String nombreAplicación;
    private String departamento;
    private String encargado;
    private int servidor;
    private String categoria;
    private String tecInstalada;
    private String version;
    
    public Aplicaciones (){
        nombreAplicación="";
        departamento="";
        encargado="";
        servidor=0;
        categoria ="";
        tecInstalada="";
        version="";
}
 public Aplicaciones(String nombreAplicación, String departamento,String encargado, int servidor, String categoria, String tecInstalada,String version) {
        this.nombreAplicación = nombreAplicación;
        this.departamento = departamento;
        this.encargado = encargado;
        this.servidor = servidor;
        this.categoria = categoria;
        this.tecInstalada = tecInstalada;
        this.version =version;
    }
      public String getNombreAplicación (){
        return nombreAplicación;
      }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
      
      public String getDepartamento (){
        return departamento;
      }
      public String getEncargado (){
        return encargado;
      }
      
       public String getCategoria (){
        return categoria;
      }
        public String getTecInstalada (){
        return tecInstalada;
      }
      public void setNombreAplicación (String nombreAplicación){
        this.nombreAplicación=nombreAplicación;
      }
      public void setDepartamento (String departamento){
        this.departamento=departamento;
      }
      public void setEncargado (String encargado){
        this.encargado=encargado;
      }

    public int getServidor() {
        return servidor;
    }

    public void setServidor(int servidor) {
        this.servidor = servidor;
    }
      
       public void setCategoria (String categoria){
        this.categoria=categoria;
      }
        public void setTecInstalada (String tecInstalada){
        this.tecInstalada=tecInstalada;
      }
}
