/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModuloUsuario.common;

import com.MenuPrincipal.common.MenuPrincipal;
import com.Usuario.common.AdministrarUsuarios;
import com.Usuario.common.Usuario;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Registrar extends javax.swing.JFrame {

    AdministrarUsuarios adm_usuarios; 
    /**
     * Creates new form Registrar
     */
    String predecesor; //para saber de cual ventana viene
    public Registrar(String predecesor) 
    {
        initComponents();
        adm_usuarios= new AdministrarUsuarios();
        this.predecesor = predecesor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_registro = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txf_name = new javax.swing.JTextField();
        txf_apellido = new javax.swing.JTextField();
        txf_usuario = new javax.swing.JTextField();
        txf_password = new javax.swing.JPasswordField();
        btn_registrar_Usuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_registro.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        lbl_registro.setForeground(new java.awt.Color(153, 255, 255));
        lbl_registro.setText("Registrar Usuario");
        lbl_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_registro);
        lbl_registro.setBounds(160, 40, 360, 49);

        lbl_nombre.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(153, 255, 255));
        lbl_nombre.setText("Nombre");
        lbl_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_nombre);
        lbl_nombre.setBounds(160, 120, 61, 20);

        lbl_apellido.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(153, 255, 255));
        lbl_apellido.setText("Apellido");
        lbl_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_apellido);
        lbl_apellido.setBounds(160, 160, 67, 20);

        lbl_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(153, 255, 255));
        lbl_usuario.setText("Usuario");
        lbl_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_usuario);
        lbl_usuario.setBounds(160, 200, 61, 20);

        lbl_password.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(153, 255, 255));
        lbl_password.setText("Password");
        lbl_password.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_password);
        lbl_password.setBounds(160, 240, 73, 20);

        txf_name.setBackground(new java.awt.Color(153, 255, 255));
        txf_name.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        txf_name.setForeground(new java.awt.Color(0, 0, 102));
        txf_name.setToolTipText("Ingrese su nombre.");
        txf_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_nameActionPerformed(evt);
            }
        });
        txf_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_nameKeyReleased(evt);
            }
        });
        getContentPane().add(txf_name);
        txf_name.setBounds(280, 120, 156, 20);

        txf_apellido.setBackground(new java.awt.Color(153, 255, 255));
        txf_apellido.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        txf_apellido.setForeground(new java.awt.Color(0, 0, 102));
        txf_apellido.setToolTipText("Ingrese su apellido.");
        txf_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_apellidoKeyReleased(evt);
            }
        });
        getContentPane().add(txf_apellido);
        txf_apellido.setBounds(280, 160, 156, 20);

        txf_usuario.setBackground(new java.awt.Color(153, 255, 255));
        txf_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        txf_usuario.setForeground(new java.awt.Color(0, 0, 102));
        txf_usuario.setToolTipText("Ingrese su nombre de usuario.");
        txf_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txf_usuario);
        txf_usuario.setBounds(280, 200, 157, 20);

        txf_password.setBackground(new java.awt.Color(153, 255, 255));
        txf_password.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        txf_password.setForeground(new java.awt.Color(0, 0, 102));
        txf_password.setToolTipText("Ingrese su password.");
        getContentPane().add(txf_password);
        txf_password.setBounds(280, 240, 157, 23);

        btn_registrar_Usuario.setBackground(new java.awt.Color(153, 255, 255));
        btn_registrar_Usuario.setForeground(new java.awt.Color(0, 0, 153));
        btn_registrar_Usuario.setText("Registrar");
        btn_registrar_Usuario.setToolTipText("Presione para registrar el usuario.");
        btn_registrar_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrar_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registrar_UsuarioMouseClicked(evt);
            }
        });
        getContentPane().add(btn_registrar_Usuario);
        btn_registrar_Usuario.setBounds(280, 300, 90, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ModuloUsuario/common/Bio-Grid_Computing.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 370);

        setBounds(0, 0, 658, 409);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar_UsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registrar_UsuarioMouseClicked
 // TODO add your handling code here:
        
        try
        {
        if (txf_name.getText().toString().equals("") || txf_apellido.getText().toString().equals("") || txf_usuario.getText().toString().equals("") || txf_password.getText().toString().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Datos Incompletos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        ArrayList<Usuario> lista_usuario = adm_usuarios.Get_Usuarios();//si se lleno los especios se carga la lista
        
        boolean resultado = false;
        
        for(Usuario item : lista_usuario )
        {
        if(txf_usuario.getText().toString().equals(item.getUsuario()))
        {
        resultado=true;
        
        }
        }
        if(resultado==true)
        {
        JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe!!", "Error", JOptionPane.ERROR_MESSAGE);
        txf_usuario.setText("");
        }
        else
        {
        int respuesta = JOptionPane.showConfirmDialog(null, "Seguro de Registrar Usuario","Question",JOptionPane.YES_NO_OPTION); 
          
          if(respuesta == JOptionPane.YES_OPTION)
          {
            
              Usuario usuario = new Usuario(txf_name.getText().toString(),txf_apellido.getText().toString(),txf_usuario.getText().toString(),txf_password.getText().toString());
              lista_usuario.add(usuario);
               boolean exito=true;
                exito=adm_usuarios.Guardar_Usuarios(lista_usuario);
        
              
    
             if(exito != false)
             {
               
               JOptionPane.showMessageDialog(null, "Usuario Registrado","Exito", JOptionPane.INFORMATION_MESSAGE);
               adm_usuarios=new AdministrarUsuarios();
               lista_usuario=adm_usuarios.Get_Usuarios();

               if(predecesor.equals("Login"))
               {
                   MenuPrincipal JfMenuPrincipal = new MenuPrincipal(txf_usuario.getText().toString());
                   JfMenuPrincipal.show();
                   this.dispose();
               } 
               
               txf_name.setText("");
               txf_apellido.setText("");
               txf_usuario.setText("");
               txf_password.setText("");
               
           }
           else{ JOptionPane.showMessageDialog(null, "Usuario NO Registrado","Error", JOptionPane.ERROR_MESSAGE); }
          }
        
        }
        
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_registrar_UsuarioMouseClicked

    private void txf_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txf_nameActionPerformed

    private void txf_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_nameKeyReleased
        txf_name.setText(txf_name.getText().toUpperCase(Locale.FRENCH));// convierte todos los caracteres a mayuscula
    }//GEN-LAST:event_txf_nameKeyReleased

    private void txf_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_apellidoKeyReleased
       txf_apellido.setText(txf_apellido.getText().toUpperCase(Locale.FRENCH));
    }//GEN-LAST:event_txf_apellidoKeyReleased

    private void txf_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_usuarioKeyReleased
       txf_usuario.setText(txf_usuario.getText().toUpperCase(Locale.FRENCH));
    }//GEN-LAST:event_txf_usuarioKeyReleased

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registrar_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_name;
    private javax.swing.JPasswordField txf_password;
    private javax.swing.JTextField txf_usuario;
    // End of variables declaration//GEN-END:variables
}