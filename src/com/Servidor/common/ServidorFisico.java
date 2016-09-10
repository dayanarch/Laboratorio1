/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servidor.common;

import java.io.Serializable;

/**
 *
 * @author Administrador
 */
public class ServidorFisico implements Serializable{

    protected int serie;
    protected String hostname;
    protected String ip;
    protected String arquitectura;
    protected String SO;
    protected int cant_cpu;
    protected double tam_disco;
    protected double cant_memoria;
    
    public ServidorFisico(){
        serie=0;
        hostname="";
        ip="";
        arquitectura="";
        SO="";
        cant_cpu=0;
        tam_disco=0;
        cant_memoria=0;
    }
     public ServidorFisico(int serie, String hostname, String ip, String arquitectura, String SO, int cant_cpu, double tam_disco, double cant_memoria) {
        this.serie = serie;
        this.hostname = hostname;
        this.ip = ip;
        this.arquitectura = arquitectura;
        this.SO = SO;
        this.cant_cpu = cant_cpu;
        this.tam_disco = tam_disco;
        this.cant_memoria = cant_memoria;
    }
  
    public void setSerie(int serie){
        this.serie=serie;
    }
    
    public void setHostname(String hostname){
        this.hostname=hostname;
    }
    
    public void setIp(String ip){
        this.ip=ip;
    }
    
    public void setArquitectura(String arquitectura){
        this.arquitectura=arquitectura;
    }
    
    public void setSO(String so){
        this.SO=so;
    }
    
    public void setCant_cpu(int cpu){
        this.cant_cpu=cpu;
    }
    
    public void setTam_disco(double disco){
        this.tam_disco=disco;
    }
    
    public void setCant_memoria(double memoria){
        this.cant_memoria=memoria;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public String getHostname(){
        return hostname;
    }
    
    public String getIp(){
        return ip;
    }
   
    public String getArquitectura(){
        return arquitectura;
    }
    
    public String getSO(){
        return SO;
    }
    
    public int getCant_cpu(){
        return cant_cpu;
    }
    public double getTam_disco() {
        return tam_disco;
    }

    public double getCant_memoria() {
        return cant_memoria;
    }
    
    
}
