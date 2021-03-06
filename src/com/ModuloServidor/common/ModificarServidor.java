/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ModuloServidor.common;

import com.Servidor.common.AdministradorServidores;
import com.Servidor.common.ServidorFisico;
import com.Servidor.common.ServidorVirtual;
import com.Usuario.common.AdministrarUsuarios;
import com.Usuario.common.Usuario;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ModificarServidor extends javax.swing.JFrame {

    /**
     * Creates new form ModificarServidor
     */
      AdministradorServidores adm_servidores; 
      ArrayList<ServidorFisico> lista_Servidores;
      int index;
      int numeserie;
      
    public ModificarServidor() {
        initComponents();
        adm_servidores = new AdministradorServidores();
        lista_Servidores=new ArrayList<>();
        lista_Servidores = adm_servidores.Get_Servidores();
        index = 0;
        numeserie = 0;
        setEnablesFalse();
    }
    
    private void setEnablesFalse()
    {
              lblCodigo.setEnabled(false);
        rbtnV.setSelected(false);
        lblDataCenter.setEnabled(false);
        lblTecnologia.setEnabled(false);
        lblVirtualizacion.setEnabled(false);
        lblArquitectura.setEnabled(false);
        lblCantCpu.setEnabled(false);
        lblCantMem.setEnabled(false);
        lblHostname.setEnabled(false);
        lblSO.setEnabled(false);
        lblTamDiscoDuro.setEnabled(false);
        lblDireccion.setEnabled(false);
        txfdataCenter.setEnabled(false);
        txftecnologia.setEnabled(false);
        txfhostname.setEnabled(false);
        
        txfIP1.setEnabled(false);
        txfIP2.setEnabled(false);
        txfIP3.setEnabled(false);
        txfIP4.setEnabled(false);
        
        txfcpu.setEnabled(false);
        txfdiscoduro.setEnabled(false);
        txfmemoria.setEnabled(false); 
        combovirtualizacion.setEnabled(false);
        comboSistemaoperativo.setEnabled(false);
        comboArquitectura.setEnabled(false);
        rbtnF.setSelected(false);
        rbtnF.setEnabled(false);
        rbtnV.setEnabled(false);
        
        btnModificar.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfdataCenter = new javax.swing.JTextField();
        lblCantCpu = new javax.swing.JLabel();
        txftecnologia = new javax.swing.JTextField();
        txfmemoria = new javax.swing.JTextField();
        lblTamDiscoDuro = new javax.swing.JLabel();
        txfcpu = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        lblHostname = new javax.swing.JLabel();
        txfdiscoduro = new javax.swing.JTextField();
        comboArquitectura = new javax.swing.JComboBox();
        lblCodigo = new javax.swing.JLabel();
        lblTecnologia = new javax.swing.JLabel();
        lblArquitectura = new javax.swing.JLabel();
        txfhostname = new javax.swing.JTextField();
        lblSO = new javax.swing.JLabel();
        combovirtualizacion = new javax.swing.JComboBox();
        comboSistemaoperativo = new javax.swing.JComboBox();
        lblVirtualizacion = new javax.swing.JLabel();
        lblDataCenter = new javax.swing.JLabel();
        lblCantMem = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lblUsuarioBuscar = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtnV = new javax.swing.JRadioButton();
        rbtnF = new javax.swing.JRadioButton();
        txfIP2 = new javax.swing.JTextField();
        lblDot1 = new javax.swing.JLabel();
        lblDot2 = new javax.swing.JLabel();
        txfIP1 = new javax.swing.JTextField();
        txfIP3 = new javax.swing.JTextField();
        lblDot3 = new javax.swing.JLabel();
        txfIP4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("JfModificarServ"); // NOI18N
        getContentPane().setLayout(null);
        getContentPane().add(txfdataCenter);
        txfdataCenter.setBounds(150, 350, 120, 20);

        lblCantCpu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCantCpu.setForeground(new java.awt.Color(0, 0, 204));
        lblCantCpu.setText("Cantidad de CPU");
        getContentPane().add(lblCantCpu);
        lblCantCpu.setBounds(313, 255, 100, 14);
        getContentPane().add(txftecnologia);
        txftecnologia.setBounds(450, 340, 120, 20);

        txfmemoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfmemoriaKeyTyped(evt);
            }
        });
        getContentPane().add(txfmemoria);
        txfmemoria.setBounds(450, 250, 120, 20);

        lblTamDiscoDuro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTamDiscoDuro.setForeground(new java.awt.Color(153, 255, 255));
        lblTamDiscoDuro.setText("Tamaño de disco duro");
        getContentPane().add(lblTamDiscoDuro);
        lblTamDiscoDuro.setBounds(310, 180, 140, 15);

        txfcpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfcpuKeyTyped(evt);
            }
        });
        getContentPane().add(txfcpu);
        txfcpu.setBounds(450, 220, 120, 20);

        lblDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(0, 0, 255));
        lblDireccion.setText("Dirección IP");
        getContentPane().add(lblDireccion);
        lblDireccion.setBounds(10, 260, 80, 14);

        lblHostname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHostname.setForeground(new java.awt.Color(153, 255, 255));
        lblHostname.setText("Hostname");
        getContentPane().add(lblHostname);
        lblHostname.setBounds(15, 214, 70, 15);

        txfdiscoduro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfdiscoduroKeyTyped(evt);
            }
        });
        getContentPane().add(txfdiscoduro);
        txfdiscoduro.setBounds(450, 180, 120, 20);

        comboArquitectura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arquitectura 64 bits", "Arquitectura 32 bits" }));
        getContentPane().add(comboArquitectura);
        comboArquitectura.setBounds(150, 300, 120, 20);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(153, 255, 255));
        lblCodigo.setText("Num.Serie del Servidor: ");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(15, 173, 150, 15);

        lblTecnologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTecnologia.setForeground(new java.awt.Color(153, 255, 255));
        lblTecnologia.setText("Versión de tecnología");
        getContentPane().add(lblTecnologia);
        lblTecnologia.setBounds(10, 400, 130, 14);

        lblArquitectura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblArquitectura.setForeground(new java.awt.Color(153, 255, 255));
        lblArquitectura.setText("Arquitectura");
        getContentPane().add(lblArquitectura);
        lblArquitectura.setBounds(10, 300, 90, 15);
        getContentPane().add(txfhostname);
        txfhostname.setBounds(149, 214, 120, 20);

        lblSO.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSO.setForeground(new java.awt.Color(204, 255, 255));
        lblSO.setText("Sistema Operativo");
        getContentPane().add(lblSO);
        lblSO.setBounds(313, 290, 110, 14);

        combovirtualizacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VMware", "XenServer", "Hyper-V" }));
        getContentPane().add(combovirtualizacion);
        combovirtualizacion.setBounds(150, 400, 96, 20);

        comboSistemaoperativo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Windows", "Ubuntu", "Mac OS X", "Otro..." }));
        getContentPane().add(comboSistemaoperativo);
        comboSistemaoperativo.setBounds(450, 290, 120, 20);

        lblVirtualizacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVirtualizacion.setForeground(new java.awt.Color(204, 255, 255));
        lblVirtualizacion.setText("Tec. de virtualización");
        getContentPane().add(lblVirtualizacion);
        lblVirtualizacion.setBounds(310, 340, 127, 15);

        lblDataCenter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDataCenter.setForeground(new java.awt.Color(153, 255, 255));
        lblDataCenter.setText("DataCenter");
        getContentPane().add(lblDataCenter);
        lblDataCenter.setBounds(10, 357, 80, 15);

        lblCantMem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCantMem.setForeground(new java.awt.Color(153, 255, 255));
        lblCantMem.setText("Cantidad de memoria");
        getContentPane().add(lblCantMem);
        lblCantMem.setBounds(313, 217, 130, 14);

        btnModificar.setForeground(new java.awt.Color(0, 0, 204));
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(452, 392, 90, 41);

        btnBuscar.setForeground(new java.awt.Color(0, 0, 204));
        btnBuscar.setText("Buscar");
        btnBuscar.setToolTipText("Presione para buscar elusuario digitado");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(450, 90, 92, 41);

        lblUsuarioBuscar.setFont(new java.awt.Font("Kristen ITC", 0, 11)); // NOI18N
        lblUsuarioBuscar.setForeground(new java.awt.Color(153, 255, 255));
        lblUsuarioBuscar.setText("Num.Serie del Servidor");
        getContentPane().add(lblUsuarioBuscar);
        lblUsuarioBuscar.setBounds(10, 106, 124, 16);

        txfBuscar.setToolTipText("Ingrese el Usuario que desea buscar");
        txfBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txfBuscar);
        txfBuscar.setBounds(170, 100, 141, 20);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Digite el numero de serie del servidor que desea modificar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 60, 410, 20);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText(" MODIFICAR SERVIDOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 20, 260, 25);

        rbtnV.setBackground(new java.awt.Color(51, 153, 255));
        rbtnV.setText("Servidor Virtual");
        rbtnV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnVMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnV);
        rbtnV.setBounds(320, 140, 120, 23);

        rbtnF.setBackground(new java.awt.Color(0, 153, 255));
        rbtnF.setText("Servidor Físico");
        rbtnF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnFMouseClicked(evt);
            }
        });
        getContentPane().add(rbtnF);
        rbtnF.setBounds(149, 141, 120, 23);

        txfIP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIP2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIP2KeyTyped(evt);
            }
        });
        getContentPane().add(txfIP2);
        txfIP2.setBounds(140, 252, 30, 20);

        lblDot1.setText(".");
        getContentPane().add(lblDot1);
        lblDot1.setBounds(230, 252, 10, 20);

        lblDot2.setText(".");
        getContentPane().add(lblDot2);
        lblDot2.setBounds(130, 252, 10, 20);

        txfIP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIP1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIP1KeyTyped(evt);
            }
        });
        getContentPane().add(txfIP1);
        txfIP1.setBounds(90, 252, 30, 20);

        txfIP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIP3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIP3KeyTyped(evt);
            }
        });
        getContentPane().add(txfIP3);
        txfIP3.setBounds(190, 252, 30, 20);

        lblDot3.setText(".");
        getContentPane().add(lblDot3);
        lblDot3.setBounds(180, 252, 10, 20);

        txfIP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfIP4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfIP4KeyTyped(evt);
            }
        });
        getContentPane().add(txfIP4);
        txfIP4.setBounds(240, 252, 30, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ModuloServidor/common/tecnologia.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 40, 590, 450);

        setBounds(0, 0, 605, 482);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked

        try
        {
        if(rbtnF.isSelected() == true)
        {
            if (txfhostname.getText().toString().equals("") || txfIP1.getText().toString().equals("") || txfIP2.getText().toString().equals("") || 
                txfIP3.getText().toString().equals("")|| txfIP4.getText().toString().equals("") ||
                txfcpu.getText().toString().equals("") || txfdiscoduro.getText().toString().equals("") ||
                txfmemoria.getText().toString().equals("")) 
            {
                JOptionPane.showMessageDialog(null, "Datos Incompletos!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                lista_Servidores= adm_servidores.Get_Servidores();//si se lleno los especios se carga la lista

                int respuesta = JOptionPane.showConfirmDialog(null, "Seguro de Modificar este Servidor","Question",JOptionPane.YES_NO_OPTION);

                if(respuesta == JOptionPane.YES_OPTION)
                {
                    String IPAdd = "";
              IPAdd = txfIP1.getText().toString()+"."+txfIP2.getText().toString()
                      +"."+txfIP3.getText().toString()+"."+txfIP4.getText().toString();
              
                    ServidorFisico servidor = new ServidorFisico(numeserie,txfhostname.getText().toString(),
                        IPAdd ,comboArquitectura.getSelectedItem().toString(),
                        comboSistemaoperativo.getSelectedItem().toString(),
                        Integer.parseInt(txfcpu.getText().toString()),
                        Double.parseDouble(txfdiscoduro.getText().toString()),
                        Double.parseDouble(txfmemoria.getText().toString()));

                    lista_Servidores.set(index, servidor);
                    
                    boolean exito=true;
                    
                    exito=adm_servidores.Guardar_Servidores(lista_Servidores);

                    if(exito != false)
                    {

                        JOptionPane.showMessageDialog(null, "Servidor Modificado","Exito", JOptionPane.INFORMATION_MESSAGE);
                        adm_servidores=new AdministradorServidores();
                        lista_Servidores= adm_servidores.Get_Servidores();

                        index  = 0;
                        numeserie = 0;
                        txfdataCenter.setText("");
                        txftecnologia.setText("");
                        combovirtualizacion.setSelectedIndex(0);
                        txfhostname.setText("");
                        txfIP1.setText("");
                        txfIP2.setText("");
                        txfIP3.setText("");
                        txfIP4.setText("");
                        txfcpu.setText("");
                        txfdiscoduro.setText("");
                        txfmemoria.setText(""); 
                        comboArquitectura.setSelectedIndex(0);
                        comboSistemaoperativo.setSelectedIndex(0);
                        setEnablesFalse();
                        lblCodigo.setText("Num.Serie del Servidor: ");
                        
                        txfBuscar.setText("");
                    }
                    else{ JOptionPane.showMessageDialog(null, "Servidor NO Modificado","Error", JOptionPane.ERROR_MESSAGE); }
                }
            }
        }
        else
        {
            if (txfdataCenter.getText().toString().equals("") || 
                 txftecnologia.getText().toString().equals("") || 
                 txfhostname.getText().toString().equals("") || 
                 txfIP1.getText().toString().equals("") || txfIP2.getText().toString().equals("") || 
                 txfIP3.getText().toString().equals("")|| txfIP4.getText().toString().equals("") ||
                 txfcpu.getText().toString().equals("") || txfdiscoduro.getText().toString().equals("") || 
                 txfmemoria.getText().toString().equals("")) 
            {
                JOptionPane.showMessageDialog(null, "Datos Incompletos!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                lista_Servidores= adm_servidores.Get_Servidores();//si se lleno los especios se carga la lista

                int respuesta = JOptionPane.showConfirmDialog(null, "Seguro de Modificar este Servidor","Question",JOptionPane.YES_NO_OPTION);

                if(respuesta == JOptionPane.YES_OPTION)
                {
                    String IPAdd = "";
              IPAdd = txfIP1.getText().toString()+"."+txfIP2.getText().toString()
                      +"."+txfIP3.getText().toString()+"."+txfIP4.getText().toString();
              
                    ServidorVirtual servidor = new ServidorVirtual(txfdataCenter.getText().toString(),combovirtualizacion.getSelectedItem().toString(),
                        txftecnologia.getText().toString(),
                        numeserie,txfhostname.getText().toString(),
                        IPAdd ,comboArquitectura.getSelectedItem().toString(),
                        comboSistemaoperativo.getSelectedItem().toString(),
                        Integer.parseInt(txfcpu.getText().toString()),
                        Double.parseDouble(txfdiscoduro.getText().toString()),
                        Double.parseDouble(txfmemoria.getText().toString()));

                    lista_Servidores.set(index, servidor);
                    
                    boolean exito=true;
                    exito=adm_servidores.Guardar_Servidores(lista_Servidores);

                    if(exito != false)
                    {

                        JOptionPane.showMessageDialog(null, "Servidor Modificado","Exito", JOptionPane.INFORMATION_MESSAGE);
                        adm_servidores=new AdministradorServidores();
                        lista_Servidores= adm_servidores.Get_Servidores();

                        index  = 0;
                        numeserie = 0;
                        txfdataCenter.setText("");
                        txftecnologia.setText("");
                        combovirtualizacion.setSelectedIndex(0);
                        txfhostname.setText("");
                        txfIP1.setText("");
                        txfIP2.setText("");
                        txfIP3.setText("");
                        txfIP4.setText("");
                        txfcpu.setText("");
                        txfdiscoduro.setText("");
                        txfmemoria.setText(""); 
                        comboArquitectura.setSelectedIndex(0);
                        comboSistemaoperativo.setSelectedIndex(0);
                        setEnablesFalse();
                        lblCodigo.setText("Num.Serie del Servidor: ");
                        txfBuscar.setText("");
                    }
                    else{ JOptionPane.showMessageDialog(null, "Servidor NO Modificado","Error", JOptionPane.ERROR_MESSAGE); }
                }
            }
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        
        try
        {
        if (txfBuscar.getText().toString().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Digite el Num.Serie del Servidor que desea modificar!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            setEnablesFalse();
            index  = 0;
            numeserie = 0;
            txfdataCenter.setText("");
            txftecnologia.setText("");
            combovirtualizacion.setSelectedIndex(0);
            txfhostname.setText("");
            txfIP1.setText("");
            txfIP2.setText("");
            txfIP3.setText("");
            txfIP4.setText("");
            txfcpu.setText("");
            txfdiscoduro.setText("");
            txfmemoria.setText(""); 
            comboArquitectura.setSelectedIndex(0);
            comboSistemaoperativo.setSelectedIndex(0);

            lblCodigo.setText("Num.Serie del Servidor: ");
            
            adm_servidores= new AdministradorServidores();// Lista refrescada desde el archivo
            
            lista_Servidores= adm_servidores.Get_Servidores();
            
            boolean find=false;// mientras no lo encuentre recorre el for
            boolean isvirtual = false;
            
           for(int i=0;i<lista_Servidores.size();i++)
           { 
               
           if(String.valueOf(lista_Servidores.get(i).getSerie()).equals(txfBuscar.getText().toString()))//compara que el que se digita se encuentre en la lista
           {
               lblCodigo.setText("Num.Serie del Servidor: "+String.valueOf(lista_Servidores.get(i).getSerie()));
               numeserie = lista_Servidores.get(i).getSerie();
               txfhostname.setText(lista_Servidores.get(i).getHostname());

               String IPstring = lista_Servidores.get(i).getIp();
               String[] IPparts = IPstring.split("\\.");
               txfIP1.setText(IPparts[0]);
               txfIP2.setText(IPparts[1]);
               txfIP3.setText(IPparts[2]);
               txfIP4.setText(IPparts[3]);
               
               txfcpu.setText(String.valueOf(lista_Servidores.get(i).getCant_cpu()));
               txfdiscoduro.setText(String.valueOf(lista_Servidores.get(i).getTam_disco()));
               txfmemoria.setText(String.valueOf(lista_Servidores.get(i).getCant_memoria()));
               
               for(int k=0;k<comboSistemaoperativo.getItemCount();k++)//recorre el combox para ver si el So digitado es el mismo
                    {
                        if(lista_Servidores.get(i).getSO().equals(comboSistemaoperativo.getItemAt(k).toString()))
                        {
                        comboSistemaoperativo.setSelectedIndex(k);
                        }
                    }
               
                for(int j=0;j<comboArquitectura.getItemCount();j++)
                {
                    if(lista_Servidores.get(i).getArquitectura().equals(comboArquitectura.getItemAt(j).toString()))
                    {
                    comboArquitectura.setSelectedIndex(j);
                    }
                }
                
                //// Si es servidor virtual entra en este if.
               if(lista_Servidores.get(i) instanceof ServidorVirtual)
               {
                   txfdataCenter.setText(((ServidorVirtual)lista_Servidores.get(i)).getDataCenter());
                   txftecnologia.setText(((ServidorVirtual)lista_Servidores.get(i)).getTecno_version());
                   
                   for(int a=0;a<combovirtualizacion.getItemCount();a++)
                    {
                        if(((ServidorVirtual)lista_Servidores.get(i)).getTecno_virtualizacion().equals(combovirtualizacion.getItemAt(a).toString()))
                        {
                            combovirtualizacion.setSelectedIndex(a);
                        }
                    }
                   isvirtual = true;
                   rbtnV.setSelected(true);
                 
               } // fin del if
               
              
               
               if( isvirtual == true)
               {
                   rbtnF.setSelected(false);
                    lblTecnologia.setEnabled(true);
                    lblVirtualizacion.setEnabled(true);
                    lblDataCenter.setEnabled(true);
                   txfdataCenter.setEnabled(true);
                   txftecnologia.setEnabled(true);
                   combovirtualizacion.setEnabled(true);
               }
               else   
               {
                    rbtnF.setSelected(true);
                    rbtnV.setSelected(false);
                     lblTecnologia.setEnabled(false);
                    lblVirtualizacion.setEnabled(false);
                    lblDataCenter.setEnabled(false);
                   txfdataCenter.setEnabled(false);
                   txftecnologia.setEnabled(false);
                   combovirtualizacion.setEnabled(false);
               }
               
               lblCodigo.setEnabled(true);
                lblCantCpu.setEnabled(true);
               lblArquitectura.setEnabled(true);
                lblCantCpu.setEnabled(true);
                lblCantMem.setEnabled(true);
                lblHostname.setEnabled(true);
                lblSO.setEnabled(true);
                lblTamDiscoDuro.setEnabled(true);
                lblDireccion.setEnabled(true);
                txfhostname.setEnabled(true);
                txfIP1.setEnabled(true);
                txfIP2.setEnabled(true);
                txfIP3.setEnabled(true);
                txfIP4.setEnabled(true);
                txfcpu.setEnabled(true);
                txfdiscoduro.setEnabled(true);
                txfmemoria.setEnabled(true); 
                comboArquitectura.setEnabled(true);
                comboSistemaoperativo.setEnabled(true);

                rbtnF.setEnabled(true);
                rbtnV.setEnabled(true);

                btnModificar.setEnabled(true);

                find = true; // si lo encuentra
                index = i; // index del objeto
           
           } // fin del if mayor en el for
           
           } // fin del for

           if( find != true)
           {
               JOptionPane.showMessageDialog(null, "No existe un servidor con ese num. de serie", "Error", JOptionPane.ERROR_MESSAGE);
           }
        }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void rbtnVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnVMouseClicked
        rbtnV.setSelected(true);
        lblDataCenter.setEnabled(true);
        lblTecnologia.setEnabled(true);
        lblVirtualizacion.setEnabled(true);
        txfdataCenter.setEnabled(true);
        txftecnologia.setEnabled(true);
        combovirtualizacion.setEnabled(true);
        rbtnF.setSelected(false);
    }//GEN-LAST:event_rbtnVMouseClicked

    private void rbtnFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnFMouseClicked

        rbtnF.setSelected(true);
        lblDataCenter.setEnabled(false);
        lblTecnologia.setEnabled(false);
        lblVirtualizacion.setEnabled(false);
        txfdataCenter.setEnabled(false);
        txftecnologia.setEnabled(false);
        combovirtualizacion.setEnabled(false);
        rbtnV.setSelected(false);
    }//GEN-LAST:event_rbtnFMouseClicked

    private void txfIP2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP2KeyPressed
        if (txfIP2.getText().length() >= 2) {
            txfIP2.setText(txfIP2.getText().substring(0, 2));
        }
    }//GEN-LAST:event_txfIP2KeyPressed

    private void txfIP1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP1KeyPressed

        if (txfIP1.getText().length() >= 2) {
            txfIP1.setText(txfIP1.getText().substring(0, 2));
        }

    }//GEN-LAST:event_txfIP1KeyPressed

    private void txfIP3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP3KeyPressed
        if (txfIP3.getText().length() >= 2) {
            txfIP3.setText(txfIP3.getText().substring(0, 2));
        }
    }//GEN-LAST:event_txfIP3KeyPressed

    private void txfIP4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP4KeyPressed
        if (txfIP4.getText().length() >= 2) {
            txfIP4.setText(txfIP4.getText().substring(0, 2));
        }
    }//GEN-LAST:event_txfIP4KeyPressed

    private void txfBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfBuscarKeyTyped
     if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfBuscarKeyTyped

    private void txfIP1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP1KeyTyped
    if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfIP1KeyTyped

    private void txfIP2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP2KeyTyped
   if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfIP2KeyTyped

    private void txfIP3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP3KeyTyped
   if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfIP3KeyTyped

    private void txfIP4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfIP4KeyTyped
   if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfIP4KeyTyped

    private void txfdiscoduroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfdiscoduroKeyTyped
   if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfdiscoduroKeyTyped

    private void txfmemoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfmemoriaKeyTyped
    if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfmemoriaKeyTyped

    private void txfcpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfcpuKeyTyped
  if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar()))
{
     Toolkit.getDefaultToolkit().beep();
     evt.consume();
 }
    }//GEN-LAST:event_txfcpuKeyTyped

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox comboArquitectura;
    private javax.swing.JComboBox comboSistemaoperativo;
    private javax.swing.JComboBox combovirtualizacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblArquitectura;
    private javax.swing.JLabel lblCantCpu;
    private javax.swing.JLabel lblCantMem;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCenter;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDot1;
    private javax.swing.JLabel lblDot2;
    private javax.swing.JLabel lblDot3;
    private javax.swing.JLabel lblHostname;
    private javax.swing.JLabel lblSO;
    private javax.swing.JLabel lblTamDiscoDuro;
    private javax.swing.JLabel lblTecnologia;
    private javax.swing.JLabel lblUsuarioBuscar;
    private javax.swing.JLabel lblVirtualizacion;
    private javax.swing.JRadioButton rbtnF;
    private javax.swing.JRadioButton rbtnV;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfIP1;
    private javax.swing.JTextField txfIP2;
    private javax.swing.JTextField txfIP3;
    private javax.swing.JTextField txfIP4;
    private javax.swing.JTextField txfcpu;
    private javax.swing.JTextField txfdataCenter;
    private javax.swing.JTextField txfdiscoduro;
    private javax.swing.JTextField txfhostname;
    private javax.swing.JTextField txfmemoria;
    private javax.swing.JTextField txftecnologia;
    // End of variables declaration//GEN-END:variables
}
