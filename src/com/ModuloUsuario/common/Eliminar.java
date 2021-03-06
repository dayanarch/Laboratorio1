/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModuloUsuario.common;

import com.Usuario.common.AdministrarUsuarios;
import com.Usuario.common.Usuario;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Eliminar extends javax.swing.JFrame {

    /**
     * Creates new form ModuloUsuario
     */
    AdministrarUsuarios adm_usuarios; 
      ArrayList<Usuario> lista_usuario;
      int index;
      String username;
      
    public Eliminar(String username) {
        initComponents();
        this.username = username;
        adm_usuarios = new AdministrarUsuarios();
        index=0;
        btnEliminar.setEnabled(false);
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuarioBuscar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txf_name = new javax.swing.JTextField();
        txf_apellido = new javax.swing.JTextField();
        txf_usuario = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lblDatosUsuario = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("JframeEliminar"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        lblUsuarioBuscar.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblUsuarioBuscar.setForeground(new java.awt.Color(153, 255, 255));
        lblUsuarioBuscar.setText("Usuario");
        lblUsuarioBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblUsuarioBuscar);
        lblUsuarioBuscar.setBounds(70, 75, 61, 20);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Digite el Usuario que desea eliminar:");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 24, 357, 25);

        txfBuscar.setBackground(new java.awt.Color(153, 255, 255));
        txfBuscar.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txfBuscar.setForeground(new java.awt.Color(0, 0, 153));
        txfBuscar.setToolTipText("Ingrese el Usuario que desea buscar.");
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfBuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txfBuscar);
        txfBuscar.setBounds(173, 76, 156, 26);

        btnBuscar.setBackground(new java.awt.Color(153, 255, 255));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 153));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Seleccione para buscar el usuario digitado.");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(465, 67, 85, 38);

        txf_name.setEditable(false);
        txf_name.setBackground(new java.awt.Color(153, 255, 255));
        txf_name.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txf_name.setForeground(new java.awt.Color(0, 0, 153));
        txf_name.setToolTipText("Nombre del usuario.");
        txf_name.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txf_name);
        txf_name.setBounds(170, 215, 159, 26);

        txf_apellido.setEditable(false);
        txf_apellido.setBackground(new java.awt.Color(153, 255, 255));
        txf_apellido.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txf_apellido.setForeground(new java.awt.Color(0, 0, 153));
        txf_apellido.setToolTipText("Apellido del usuario.");
        txf_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txf_apellido);
        txf_apellido.setBounds(170, 254, 159, 26);

        txf_usuario.setEditable(false);
        txf_usuario.setBackground(new java.awt.Color(153, 255, 255));
        txf_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txf_usuario.setForeground(new java.awt.Color(0, 0, 153));
        txf_usuario.setToolTipText("Usuario.");
        txf_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txf_usuario);
        txf_usuario.setBounds(170, 300, 159, 26);

        lbl_nombre.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(153, 255, 255));
        lbl_nombre.setText("Nombre");
        lbl_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_nombre);
        lbl_nombre.setBounds(70, 214, 61, 20);

        lbl_apellido.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(153, 255, 255));
        lbl_apellido.setText("Apellido");
        lbl_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_apellido);
        lbl_apellido.setBounds(70, 253, 67, 20);

        lbl_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(153, 255, 255));
        lbl_usuario.setText("Usuario");
        lbl_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lbl_usuario);
        lbl_usuario.setBounds(70, 299, 61, 20);

        lblDatosUsuario.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        lblDatosUsuario.setForeground(new java.awt.Color(153, 255, 255));
        lblDatosUsuario.setText("Datos del usuario: ");
        lblDatosUsuario.setToolTipText("");
        lblDatosUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblDatosUsuario);
        lblDatosUsuario.setBounds(70, 152, 185, 25);

        btnEliminar.setBackground(new java.awt.Color(153, 255, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 153));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Seleccione para eliminar el usuario.");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(465, 292, 85, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ModuloUsuario/common/Bio-Grid_Computing.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        setBounds(0, 0, 612, 435);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        
        try
        {    
        txf_name.setText("");
        txf_apellido.setText("");
        txf_usuario.setText("");
        btnEliminar.setEnabled(false);
        
        if (txfBuscar.getText().toString().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Digite el nombre de usuario que desea eliminar!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        adm_usuarios= new AdministrarUsuarios();// Lista refrescada desde el archivo
        lista_usuario= adm_usuarios.Get_Usuarios();
        boolean find=false;// mientras no lo encuentre recorre el for
        
        for(int i=0; i<lista_usuario.size() && find==false ;i++)//recorriendo la lista
        {
            if(txfBuscar.getText().toString().equals(lista_usuario.get(i).getUsuario()))//compara que el que se digita se encuentre en la lista
            {
            index=i;
             lista_usuario=adm_usuarios.Get_Usuarios();
               
               txf_name.setText(lista_usuario.get(i).getNombre());
               txf_apellido.setText(lista_usuario.get(i).getApellido());
               txf_usuario.setText(lista_usuario.get(i).getUsuario());
              btnEliminar.setEnabled(true);
        
            find = true;            
            }
        }
        
        if(find != true)
        {
            JOptionPane.showMessageDialog(null, "El usuario digitado no existe!!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
     
        try
        {
        if(lista_usuario.get(index).getUsuario().equals(username))
        {
            JOptionPane.showMessageDialog(null, "No puede Eliminar el usuario con la sesión activa!!", "Error", JOptionPane.ERROR_MESSAGE); 
        }
        else
        {
        lista_usuario.remove(index);
        
     boolean resultado =  adm_usuarios.Guardar_Usuarios(lista_usuario);
     if(resultado != false)
     {
         txfBuscar.setText("");
         JOptionPane.showMessageDialog(null, "Usuario Eliminado", "Exito", JOptionPane.INFORMATION_MESSAGE);
     }
     else
     {
         JOptionPane.showMessageDialog(null, "Error al eliminar Usuario!", "Error", JOptionPane.ERROR_MESSAGE);
     }
            txf_name.setText("");
            txf_apellido.setText("");
            txf_usuario.setText("");
            btnEliminar.setEnabled(false);
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void txfBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyReleased
       txfBuscar.setText(txfBuscar.getText().toUpperCase(Locale.FRENCH));
    }//GEN-LAST:event_txfBuscarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDatosUsuario;
    private javax.swing.JLabel lblUsuarioBuscar;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txf_apellido;
    private javax.swing.JTextField txf_name;
    private javax.swing.JTextField txf_usuario;
    // End of variables declaration//GEN-END:variables
}
