/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Login.common;

import com.MenuPrincipal.common.MenuPrincipal;
import com.ModuloUsuario.common.Registrar;
import com.Usuario.common.AdministrarUsuarios;
import com.Usuario.common.Usuario;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Login extends javax.swing.JFrame
{
    String Dayana;
    String Gonzalo;
    AdministrarUsuarios adm_usuarios; 
    /**
     * Creates new form Login
     */
    public Login()
    {
        initComponents();
        adm_usuarios = new AdministrarUsuarios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txf_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contrasena = new javax.swing.JLabel();
        lbl_Login = new javax.swing.JLabel();
        btn_inicio = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        txf_password = new javax.swing.JPasswordField();
        btn_Registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("JfLogin"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        txf_usuario.setBackground(new java.awt.Color(204, 204, 204));
        txf_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txf_usuario.setForeground(new java.awt.Color(0, 102, 255));
        txf_usuario.setToolTipText("Digite su usuario.");
        txf_usuario.setName("txf_usuario"); // NOI18N
        txf_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txf_usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txf_usuario);
        txf_usuario.setBounds(280, 150, 260, 25);

        lbl_usuario.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 102));
        lbl_usuario.setText("USUARIO");
        lbl_usuario.setName("lbl_usuario"); // NOI18N
        getContentPane().add(lbl_usuario);
        lbl_usuario.setBounds(140, 150, 81, 20);

        lbl_contrasena.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_contrasena.setForeground(new java.awt.Color(0, 0, 102));
        lbl_contrasena.setText("PASSWORD");
        lbl_contrasena.setName("lbl_contrasena"); // NOI18N
        getContentPane().add(lbl_contrasena);
        lbl_contrasena.setBounds(140, 190, 97, 20);

        lbl_Login.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lbl_Login.setForeground(new java.awt.Color(0, 0, 102));
        lbl_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Login.setText("LOGIN");
        lbl_Login.setName("lbl_titulo"); // NOI18N
        getContentPane().add(lbl_Login);
        lbl_Login.setBounds(140, 90, 60, 30);

        btn_inicio.setBackground(new java.awt.Color(204, 204, 204));
        btn_inicio.setForeground(new java.awt.Color(0, 102, 204));
        btn_inicio.setText("Iniciar Sección");
        btn_inicio.setToolTipText("Presione para Iniciar Sesion");
        btn_inicio.setName("btn_inicio"); // NOI18N
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inicioMouseClicked(evt);
            }
        });
        getContentPane().add(btn_inicio);
        btn_inicio.setBounds(280, 260, 130, 23);

        btn_cancelar.setBackground(new java.awt.Color(204, 204, 204));
        btn_cancelar.setForeground(new java.awt.Color(0, 102, 204));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setToolTipText(" Presione para Salir");
        btn_cancelar.setName("btn_cancelar"); // NOI18N
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cancelar);
        btn_cancelar.setBounds(450, 260, 90, 23);

        txf_password.setBackground(new java.awt.Color(204, 204, 204));
        txf_password.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        txf_password.setForeground(new java.awt.Color(0, 102, 255));
        txf_password.setToolTipText("Digite su password");
        txf_password.setName("txf_password"); // NOI18N
        getContentPane().add(txf_password);
        txf_password.setBounds(280, 190, 260, 27);

        btn_Registrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_Registrar.setForeground(new java.awt.Color(0, 102, 204));
        btn_Registrar.setText("Registrar");
        btn_Registrar.setToolTipText("Presione para registrar un usuario");
        btn_Registrar.setName("btn_registrar"); // NOI18N
        btn_Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RegistrarMouseClicked(evt);
            }
        });
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Registrar);
        btn_Registrar.setBounds(140, 260, 100, 23);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("ADMINISTRADOR DE SERVIDORES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 30, 371, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/Login/common/tecnologia.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 360);

        setBounds(0, 0, 665, 397);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_RegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RegistrarMouseClicked
        Registrar jf_registrar = new Registrar("Login");
        jf_registrar.show();
    }//GEN-LAST:event_btn_RegistrarMouseClicked

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseClicked
        
        try
        {
         if (txf_usuario.getText().toString().equals("") || txf_password.getText().toString().equals("")) 
        {
            JOptionPane.showMessageDialog(null, "Datos Incompletos!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         else
         {
            adm_usuarios = new AdministrarUsuarios();
            ArrayList<Usuario> lista_usuario = adm_usuarios.Get_Usuarios();//si se lleno los especios se carga la lista

            boolean resultado = false;

            for(Usuario item : lista_usuario )
            {
                if(txf_usuario.getText().toString().equals(item.getUsuario())&& txf_password.getText().toString().equals(item.getClave()))
                {
                resultado=true;
                }
            }

            if(resultado==true)
            {
            MenuPrincipal JfMenuPrincipal = new MenuPrincipal(txf_usuario.getText().toString());
            JfMenuPrincipal.show();
            this.dispose();

            }
            else
            {
                JOptionPane.showMessageDialog(null, "Usuario o Password incorrectos!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
         }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_inicioMouseClicked

    private void txf_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txf_usuarioKeyReleased
        txf_usuario.setText(txf_usuario.getText().toUpperCase(Locale.FRENCH));//convierte todos los caracteres a mayuscula
        
    }//GEN-LAST:event_txf_usuarioKeyReleased

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_contrasena;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField txf_password;
    private javax.swing.JTextField txf_usuario;
    // End of variables declaration//GEN-END:variables
}
