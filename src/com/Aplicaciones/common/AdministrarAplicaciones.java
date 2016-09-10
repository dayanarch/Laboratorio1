/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Aplicaciones.common;

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
public class AdministrarAplicaciones {
    

    
     ArrayList<Aplicaciones> listaAplicaciones = new ArrayList();
     Path path = Paths.get("C:\\Users\\Dayana\\Documents\\Cosas 2013\\Examen_1_PrograIIIterminado (1)\\Examen_1_PrograIII\\Aplicaciones");

    public AdministrarAplicaciones() 
    {
       
        this.CargarAplicaciones();
    } 
    
   public boolean  GuardarAplicaciones(ArrayList<Aplicaciones> ListaGuardar)
    {
  try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){
            
        listaAplicaciones = ListaGuardar;
            //escribiendo 
            oos.writeObject(listaAplicaciones);
     return true;     
    }
    catch (IOException e){
        
        System.out.print ("IOException");
        return false;
        
    }
    
    }
   
    void CargarAplicaciones()
    {
        
    try (InputStream inputStream=Files.newInputStream(path,StandardOpenOption.READ);
                
    ObjectInputStream ois = new ObjectInputStream (inputStream))
    {
                
     listaAplicaciones =  (ArrayList)ois.readObject(); 
            
              
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
    
    public ArrayList<Aplicaciones> GetAplicaciones()
    {
    
    return this.listaAplicaciones;
    }
}


