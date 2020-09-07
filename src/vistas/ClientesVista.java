/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controller.ClienteController;
import controller.ContactoClienteController;
import controller.DireccionAnexaController;
import entity.Cliente;
import entity.ContactoCliente;
import entity.DireccionAnexa;
import exportarexcel.clsExportarExcel;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ARCRODINPC-02
 */
public class ClientesVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientesVista
     */
    String filtro="razonSocial";
    int idCliente;
    int tabla;
    
    public ClientesVista() {
        initComponents();
        listaCliente(filtro, txtBuscarlike.getText());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtBuscarlike = new javax.swing.JTextField();
        comboBoxFiltro = new javax.swing.JComboBox<>();
        buttonExportExcel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        buttonNuevoCliente = new javax.swing.JButton();

        setClosable(true);
        setTitle("Vista de Clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "CódigoCliente", "Razon Social", "Ruc", "Tipo", "Direccion", "Observacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(0);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(10000);
            jTable1.getColumnModel().getColumn(3).setMinWidth(0);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(92);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(0);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(5).setMinWidth(0);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(250);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(1000);
            jTable1.getColumnModel().getColumn(6).setMinWidth(0);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(258);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(1000);
        }

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtBuscarlike.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarlikeActionPerformed(evt);
            }
        });
        txtBuscarlike.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarlikeKeyReleased(evt);
            }
        });

        comboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "RAZ. SOCIAL", "R.U.C." }));
        comboBoxFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxFiltroItemStateChanged(evt);
            }
        });

        buttonExportExcel.setText("ExportExcel");
        buttonExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportExcelActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idContCli", "Contacto", "Telefono 1", "Correo", "Sucursal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jLabel1.setText("Contactos:");

        jLabel2.setText("Direccioness Anexas:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idDireccion", "Dirección", "Observación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable3.getColumnModel().getColumn(1).setPreferredWidth(430);
            jTable3.getColumnModel().getColumn(2).setPreferredWidth(200);
        }

        buttonNuevoCliente.setText("Nuevo Cliente");
        buttonNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarlike, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(buttonExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 488, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarlike, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExportExcel)
                    .addComponent(buttonNuevoCliente))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtBuscarlikeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarlikeActionPerformed

    }//GEN-LAST:event_txtBuscarlikeActionPerformed

    private void txtBuscarlikeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarlikeKeyReleased
       listaCliente(filtro,txtBuscarlike.getText());
    }//GEN-LAST:event_txtBuscarlikeKeyReleased

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // EVENTOS DE TECLADO PARA TRATAR DE JALAR LOS DATOS DE CLIENTE.
        int fila = this.jTable1.getSelectedRow();  // se identifica que fila ha sido seleccionada
        try {
            
           Clientes.Comborazonsocial.setSelectedItem(jTable1.getValueAt(fila, 1).toString());
           dispose();
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void comboBoxFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxFiltroItemStateChanged
        if (comboBoxFiltro.getSelectedItem() == "RAZ. SOCIAL") {
            filtro = "razonSocial";
            listaCliente(filtro, txtBuscarlike.getText());
            System.out.println(filtro);
        } else if (comboBoxFiltro.getSelectedItem() == "R.U.C.") {
            filtro = "ruc";
            listaCliente(filtro, txtBuscarlike.getText());
            System.out.println(filtro);
        } else if (comboBoxFiltro.getSelectedItem() == "SELECCIONAR") {
            filtro = "razonSocial";
            listaCliente(filtro, txtBuscarlike.getText());
            System.out.println(filtro);
        }
    }//GEN-LAST:event_comboBoxFiltroItemStateChanged

    private void buttonExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportExcelActionPerformed
        clsExportarExcel objeto = new clsExportarExcel();
        try {
            objeto.exportarExcel(jTable1);
        } catch (IOException ex) {
            Logger.getLogger(CajaChicaRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonExportExcelActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tabla = jTable1.getSelectedRow();
        idCliente = Integer.parseInt(jTable1.getValueAt(tabla, 0).toString());
        
        listaContactoCliente(idCliente);
        listaDireccionAnexa(idCliente);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
       if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
           tabla = jTable1.getSelectedRow();
        idCliente = Integer.parseInt(jTable1.getValueAt(tabla, 0).toString());
        
        listaContactoCliente(idCliente);
        listaDireccionAnexa(idCliente);
       }
    }//GEN-LAST:event_jTable1KeyReleased

    private void buttonNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoClienteActionPerformed
        Clientes clis= new Clientes();
        Principal.jDesktopPane1.add(clis);
        clis.toFront();
        clis.setVisible(true);
    }//GEN-LAST:event_buttonNuevoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExportExcel;
    private javax.swing.JButton buttonNuevoCliente;
    private javax.swing.JComboBox<String> comboBoxFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtBuscarlike;
    // End of variables declaration//GEN-END:variables

    ClienteController obj = new ClienteController();
    
    ContactoClienteController contactoclientecontroler=new ContactoClienteController();
    ContactoCliente contactocliente;
    
    DireccionAnexaController direccioncontroler =  new DireccionAnexaController();
    DireccionAnexa direccion;

    private void listaCliente(String filtro, String buscar) {
        List<Cliente> lista;
        try {
            lista = obj.ClienteFiltrar(filtro, buscar);
            verCliente(lista);

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void verCliente(List<Cliente> lista) {

        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        tabla.setRowCount(0);
        for (Cliente cli : lista) {
            Object[] fila = {cli.getIdCliente(), cli.getCodigoCliente() ,cli.getRazonSocial(), cli.getRuc(), cli.getTipo(), cli.getDireccion(), cli.getObservacion()};
            tabla.addRow(fila);
        }
    }
    
// ---------------------------- Contactos de Clientes ---------------------------------
    
     private void listaContactoCliente(int idcli) {
        List<ContactoCliente> lista;
        try {
            
            lista = contactoclientecontroler.ContactoClienteListar1(idcli);
            verContactoCliente(lista);

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void verContactoCliente(List<ContactoCliente> lista) {

        DefaultTableModel tabla = (DefaultTableModel) jTable2.getModel();
        tabla.setRowCount(0);
        for (ContactoCliente conCli : lista) {
            Object[] fila = {conCli.getIdContactoCliente(), conCli.getNombres()+" "+conCli.getApellidos(), 
                conCli.getTlf1(), conCli.getCorreo(), conCli.getSucursal() };
            tabla.addRow(fila);
        }
    }
    
// -------------------------------- Tabla Dirección Anexa --------------------------
   
     private void listaDireccionAnexa(int id) {
        List<DireccionAnexa> lista;
        try {
            lista = direccioncontroler.DireccionAnexaListar(id);
            verDireccionAnexa(lista);

        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void verDireccionAnexa(List<DireccionAnexa> lista) {
        DefaultTableModel tabla = (DefaultTableModel) jTable3.getModel();
        tabla.setRowCount(0);
        for (DireccionAnexa direc : lista) {

            Object[] fila = {direc.getIdDireccion(), direc.getDireccion(), direc.getObser()};
            tabla.addRow(fila);
        }
    }
    
}