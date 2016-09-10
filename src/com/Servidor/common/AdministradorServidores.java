/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Servidor.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */

    public class AdministradorServidores {
    
    ArrayList<ServidorFisico> listaServidor = new ArrayList<>();
    ArrayList<String> listaSO = new ArrayList<>();
    
     Path path = Paths.get("C:\\Users\\Dayana\\Documents\\NetBeansProjects\\Ejemplo3\\Electrodomesticos");
     Path pathSO = Paths.get("C:\\Users\\Administrador\\Documents\\NetBeansProjects\\Examen_1_PrograIII\\SO");

     public AdministradorServidores() 
    {
        this.CargarServidores();
        this.CargarSO();
    }
     
    public boolean  Guardar_Servidores(ArrayList Lista_Guardar)
    {
    
     try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){
            
        listaServidor = Lista_Guardar;
            //escribiendo 
            oos.writeObject(listaServidor);
     return true;     
    }
    catch (IOException e){
        
        System.out.print ("IOException");
        return false;
        
    }
    
    }
     
    void CargarServidores()
    {
        
    try (InputStream inputStream=Files.newInputStream(path,StandardOpenOption.READ);
                
    ObjectInputStream ois = new ObjectInputStream (inputStream))
    {
                
     listaServidor =  (ArrayList)ois.readObject(); 
            
              
     }
    catch (ClassNotFoundException ex)
    {
      System.out.println("ClassNotFound "+ ex.getMessage());
     } 
        
   catch (IOException ex2)
   {
    System.out.println("IOException " + ex2.getMessage());
    }
        
    }
    
    public ArrayList<ServidorFisico>  Get_Servidores()
    {  
         return this.listaServidor;
    }

    public int UltimaSerie()
    {
        int serie = listaServidor.get(0).getSerie();
        
      for(int i= 0; i <listaServidor.size();i++)
      {
        if(serie < listaServidor.get(i).getSerie())
        {
                serie = listaServidor.get(i).getSerie();
        }
      }
      return serie;
    }
    
    // SO para el combobox
    
    public boolean  Guardar_SO(ArrayList Lista_So)
    {
    
     try (OutputStream outputStream = 
                Files.newOutputStream(pathSO, 
                StandardOpenOption.CREATE);
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){
            
        listaSO= Lista_So;
            //escribiendo 
            oos.writeObject(listaSO);
     return true;     
    }
    catch (IOException e){
        
        System.out.print ("IOException");
        return false;
        
    }
    
    }
    
    void CargarSO()
    {
        
        try (InputStream inputStream=Files.newInputStream(pathSO,StandardOpenOption.READ);

        ObjectInputStream ois = new ObjectInputStream (inputStream))
        {
            listaSO =  (ArrayList)ois.readObject(); 
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("ClassNotFound "+ ex.getMessage());
        } 
        catch (IOException ex2)
        {
            System.out.println("IOException " + ex2.getMessage());
        }       
    }
    
     public ArrayList<String>  Get_SO()
    {  
         return this.listaSO;
    }

}

    

