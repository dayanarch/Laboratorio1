/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Usuario.common;

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
public class AdministrarUsuarios {
    
    ArrayList<Usuario> lista_usuario = new ArrayList();
     Path path = Paths.get("C:\\Users\\Dayana\\Documents\\Cosas 2013\\Examen_1_PrograIIIterminado (1)\\Examen_1_PrograIII\\Usuarios");

    public AdministrarUsuarios() 
    {
        this.Cargar_Usuarios();
        
    }
     
    public boolean  Guardar_Usuarios(ArrayList<Usuario> Lista_Guardar)
    {
    
    try (OutputStream outputStream = 
                Files.newOutputStream(path, 
                StandardOpenOption.CREATE);
            ObjectOutputStream oos = new ObjectOutputStream (outputStream)){
            
        lista_usuario = Lista_Guardar;
            //escribiendo 
            oos.writeObject(lista_usuario);
     return true;     
    }
    catch (IOException e){
        
        System.out.print ("IOException");
        return false;
        
    }
    
    }
     
    void Cargar_Usuarios()
    {
        
    try (InputStream inputStream=Files.newInputStream(path,StandardOpenOption.READ);
                
    ObjectInputStream ois = new ObjectInputStream (inputStream))
    {
                
     lista_usuario =  (ArrayList)ois.readObject(); 
            
              
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
    
    public ArrayList<Usuario> Get_Usuarios()
    {
    
    return this.lista_usuario;
    }
}
