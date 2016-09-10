/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servidor.common;

/**
 *
 * @author Administrador
 */
public class ServidorVirtual extends ServidorFisico {
   private String dataCenter;
   private String tecno_virtualizacion;
   private String tecno_version;
   
   public ServidorVirtual()
   {
       dataCenter="";
       tecno_virtualizacion="";
       tecno_version = "";
   }

    public ServidorVirtual(String dataCenter, String tecno_virtualizacion,String tecno_version,int serie, String hostname, String ip, String arquitectura, String SO, int cant_cpu, double tam_disco, double cant_memoria) {
        super( serie,  hostname,  ip,  arquitectura,  SO,  cant_cpu,  tam_disco,  cant_memoria);
        this.dataCenter = dataCenter;
        this.tecno_virtualizacion = tecno_virtualizacion;
        this.tecno_version = tecno_version;
    }

    public String getTecno_version() {
        return tecno_version;
    }

    public void setTecno_version(String tecno_version) {
        this.tecno_version = tecno_version;
    }
   
   public void setDataCenter(String data){
       this.dataCenter=data;
   }
   
   public void setTecno_virtualizacion(String tecno){
       this.tecno_virtualizacion=tecno;
   }
   
   public String getDataCenter(){
       return dataCenter;
   }
   
   public String getTecno_virtualizacion(){
       return tecno_virtualizacion;
   }   
}

