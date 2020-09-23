/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controller.ProveedorController;
import entity.Proveedor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author ARCRODINPC-02
 */
public final class Proveedores extends javax.swing.JInternalFrame {

    static String z;
    static int y;

    /**
     * Creates new form ProveedoresVista
     */
    ProveedorController obj = new ProveedorController();
    Proveedor pro;
    Proveedor pro2;

    public Proveedores() throws Exception {
        initComponents();
        buttonRubro.setVisible(false);
        habilitarInicio();  
        ComborazonsocialProveedor.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                // aca falta validar que me ejecute el campo
                String cadenaEscrita = ComborazonsocialProveedor.getEditor().getItem().toString().trim();
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    try {
                        consultarParametro(ComborazonsocialProveedor.getItemAt(0));
                    } catch (Exception ex) {
                        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    ComborazonsocialProveedor.setSelectedIndex(0);

                    if (comparar(cadenaEscrita)) {
                        try {
                            // compara si el texto escrito se ecuentra en la lista
                            // busca el texto escrito en la base de datos, solo pasa si es identico
                            consultarParametro(cadenaEscrita);
                            habilitarEnter();
                           
                            z = labelIdProveedor.getText();
                            y = Integer.parseInt(z);
                        } catch (Exception ex) {
                            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    } else {
                        try {
                            for (int i = 0; i < ComborazonsocialProveedor.getModel().getSize(); i++) {
                                if (ComborazonsocialProveedor.getItemAt(i).equals(cadenaEscrita)) {
                                    consultarParametro(ComborazonsocialProveedor.getItemAt(i));
                                    ComborazonsocialProveedor.setSelectedIndex(i);
                                }
                            }
                            habilitarEnter();
                            z = labelIdProveedor.getText();
                            y = Integer.parseInt(z);
                        } catch (Exception ex) {
                            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }

                }

                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8) {
                    try {
                        ComborazonsocialProveedor.setModel(obj.ProveedorListarCombo(cadenaEscrita));
                    } catch (Exception ex) {
                        Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (ComborazonsocialProveedor.getItemCount() > 0) {
                        ComborazonsocialProveedor.getEditor().setItem(cadenaEscrita);
                        ComborazonsocialProveedor.showPopup();
                    } else {
                        ComborazonsocialProveedor.addItem(cadenaEscrita);
                    }
                }
            }
        });
       habilitarInicio();
       
    }

    private boolean comparar(String cadena) {
        Object[] lista = ComborazonsocialProveedor.getComponents();
        boolean encontrado = false;
        for (Object object : lista) {
            if (cadena.equals(object)) {
                encontrado = true;
                break;
            }

        }
        return encontrado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIdProveedor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRubro = new javax.swing.JTextField();
        buttonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ComborazonsocialProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        buttonNuevo = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonRubro = new javax.swing.JButton();
        buttonArticulos = new javax.swing.JButton();
        buttonAgregarContacto = new javax.swing.JButton();
        buttonDireccion = new javax.swing.JButton();
        buttonCerrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Proveedores");

        labelIdProveedor.setText("00000");

        jLabel7.setText("N°:");

        jLabel5.setText("Rubro: ");

        txtRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRubroActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("Razon Social:");

        ComborazonsocialProveedor.setEditable(true);

        jLabel2.setText("R.U.C.: ");

        jLabel3.setText("Direccion: ");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel6.setText("Observacion: ");

        txtObservacion.setColumns(20);
        txtObservacion.setRows(5);
        jScrollPane1.setViewportView(txtObservacion);

        buttonNuevo.setText("Nuevo");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNuevoActionPerformed(evt);
            }
        });

        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        buttonModificar.setText("Modificar");
        buttonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarActionPerformed(evt);
            }
        });

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEliminarActionPerformed(evt);
            }
        });

        buttonRubro.setText("Definir Rubro");
        buttonRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRubroActionPerformed(evt);
            }
        });

        buttonArticulos.setText("Agregar Productos/Servicios");
        buttonArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArticulosActionPerformed(evt);
            }
        });

        buttonAgregarContacto.setText("Agregar Contacto");
        buttonAgregarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarContactoActionPerformed(evt);
            }
        });

        buttonDireccion.setText("Agregar Dir. Anexa");
        buttonDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDireccionActionPerformed(evt);
            }
        });

        buttonCerrar.setText("Cerrar");
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComborazonsocialProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(buttonRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonAgregarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonDireccion)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(buttonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(buttonGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(buttonEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdProveedor)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(txtRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpiar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(ComborazonsocialProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(buttonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonModificar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEliminar)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonRubro)
                            .addComponent(buttonArticulos)
                            .addComponent(buttonAgregarContacto)
                            .addComponent(buttonDireccion)
                            .addComponent(buttonCerrar))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonCerrarActionPerformed

    private void txtRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRubroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRubroActionPerformed

    private void buttonAgregarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarContactoActionPerformed
//         try {
//            consultarParametro(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        if (y != 0) {
//            RegistrarContactosProveedor conProveedores=null;
//            try {
//                conProveedores = new RegistrarContactosProveedor();
//            } catch (Exception ex) {
//                Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            Principal.jDesktopPane1.add(conProveedores);
//            conProveedores.toFront();
//            conProveedores.setVisible(true);
//        } else {
//            JOptionPane.showMessageDialog(null, "Agregar Cliente");
//        }
    }//GEN-LAST:event_buttonAgregarContactoActionPerformed

    private void buttonArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonArticulosActionPerformed
//         try {
//            consultarParametro(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        ProveedorArticulos artProveedor=null;
//        try {
//            artProveedor = new ProveedorArticulos();
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Principal.jDesktopPane1.add(artProveedor);
//        artProveedor.toFront();
//        artProveedor.setVisible(true);
    }//GEN-LAST:event_buttonArticulosActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        procesar(2);
        habilitarGuardar();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        
        String texto = ComborazonsocialProveedor.getEditor().getItem().toString().trim();
        texto = texto.replaceAll(" ", "");
        if (texto.length() == 0) {
            JOptionPane.showMessageDialog(null, "Llenar los campos");

        } else {
            procesar1(1);
        }
        
        try {
            consultarParametro(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
        } catch (Exception ex) {
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        habilitarRegistrar();
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        procesar1(3);
        limpiar(); //limpia para buscar de nuevo 
        y = 0;
        z = Integer.toString(y);
        labelIdProveedor.setText(z);
        habilitarEliminar();
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        limpiar();
        y = 0;
        z = Integer.toString(y);
        labelIdProveedor.setText(z);
        habilitarInicio();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        limpiar();
        habilitarNuevo();
     
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        habilitarModificar();
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void buttonDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDireccionActionPerformed
//         try {
//            consultarParametro(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        DireccionAnexaProveedor dirProv=null;
//        try {
//            dirProv = new DireccionAnexaProveedor();
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            Principal.jDesktopPane1.add(dirProv);
//            dirProv.toFront();
//            dirProv.setVisible(true);
    }//GEN-LAST:event_buttonDireccionActionPerformed

    private void buttonRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRubroActionPerformed
           
//        try {
//            consultarParametro(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                
//        ProveedorRubroRegistro provRubro=null;
//        try {
//            provRubro = new ProveedorRubroRegistro();
//        } catch (Exception ex) {
//            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            Principal.jDesktopPane1.add(provRubro);
//            provRubro.toFront();
//            provRubro.setVisible(true);
    }//GEN-LAST:event_buttonRubroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComborazonsocialProveedor;
    private javax.swing.JButton buttonAgregarContacto;
    private javax.swing.JButton buttonArticulos;
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JButton buttonDireccion;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIdProveedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtObservacion;
    private javax.swing.JTextField txtRubro;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables

    
//------------------------ Consultar -------------------------------------
    
    private void consultar() throws Exception {
        pro = obj.ProveedorBuscar(ComborazonsocialProveedor.getEditor().getItem().toString());
        if (pro != null) {

            labelIdProveedor.setText(pro.getIdProveedor() + "");
            // txtNombres.setText(pro.getNombres());
            y=pro.getIdProveedor();
            ComborazonsocialProveedor.setSelectedItem(pro.getRazonSocial());
            txtRuc.setText(pro.getRuc());
            txtDireccion.setText(pro.getDireccion());
            txtRubro.setText(pro.getRubro());
            txtDireccion.setText(pro.getDireccion());

        } else {
            JOptionPane.showMessageDialog(null, "Proveedor no registrado");
            //System.out.println("Error");
        }
    }

    private void consultarParametro(String razonsocial) throws Exception {
        pro = obj.ProveedorBuscar(razonsocial);
        if (pro != null) {

            labelIdProveedor.setText(pro.getIdProveedor() + "");
            // txtNombres.setText(pro.getNombres());
            y=pro.getIdProveedor();
            txtRuc.setText(pro.getRuc());
            txtRubro.setText(pro.getRubro());
            txtDireccion.setText(pro.getDireccion());
            txtObservacion.setText(pro.getObservacion());

        } else {
            JOptionPane.showMessageDialog(null, "Usuario no registrado");
            //System.out.println("Error");
        }
    }
//-------------------------- Procesar ---------------------------------
    
    private void procesar1(int op) {
        pro2 = leerDatos2();

        try {
            String msg = obj.ProveedorProcesar(pro2, op);
            JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error" + e.getMessage());
        }

    }

    private void procesar(int op) {
        pro = leerDatos();

        try {

            String msg = obj.ProveedorProcesar(pro, op);
            JOptionPane.showMessageDialog(null, msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error" + e.getMessage());
        }
    }
//-------------------------- Leer Datos -----------------------------
    private Proveedor leerDatos() {
        Proveedor prov = new Proveedor();

        prov.setIdProveedor(Integer.parseInt(labelIdProveedor.getText()));
        prov.setRazonSocial(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
        prov.setRuc(txtRuc.getText());
        prov.setDireccion(txtDireccion.getText());
        prov.setRubro(txtRubro.getText());
        prov.setObservacion(txtObservacion.getText());

        return prov;
    }

    private Proveedor leerDatos2() {
        Proveedor prov = new Proveedor();

        prov.setRazonSocial(ComborazonsocialProveedor.getEditor().getItem().toString().trim());
        prov.setRuc(txtRuc.getText());
        prov.setDireccion(txtDireccion.getText());
        prov.setRubro(txtRubro.getText());
        prov.setObservacion(txtObservacion.getText());

        return prov;
    }

//---------------------------- Limpiar --------------------------------    
    public void limpiar() {
        labelIdProveedor.setText("");
        //ComborazonsocialProveedor.setSelectedItem("");
        ComborazonsocialProveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
        txtRuc.setText("");
        txtRubro.setText("");
        txtDireccion.setText("");
        txtObservacion.setText("");
    }

   
//----------------------------- Habilitar ------------------------------    
    
    void habilitarInicio() {

        buttonAgregarContacto.setEnabled(false);
        buttonDireccion.setEnabled(false);
//        buttonRubro.setEnabled(false);
        buttonModificar.setEnabled(false);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(false);
        buttonNuevo.setEnabled(true);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(false);
       
        ComborazonsocialProveedor.setEnabled(true);
        txtDireccion.setEnabled(false);
        txtObservacion.setEnabled(false);
        txtRubro.setEnabled(false);
        txtRuc.setEnabled(false);
        }
    
    void habilitarNuevo() {

        buttonAgregarContacto.setEnabled(false);
        buttonDireccion.setEnabled(false);
//        buttonRubro.setEnabled(false);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(false);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(false);
        buttonNuevo.setEnabled(false);
        buttonRegistrar.setEnabled(true);
        buttonEliminar.setEnabled(false);
       
        ComborazonsocialProveedor.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtObservacion.setEnabled(true);
        txtRubro.setEnabled(true);
        txtRuc.setEnabled(true);
        }
    
    void habilitarRegistrar() {

        buttonAgregarContacto.setEnabled(true);
        buttonDireccion.setEnabled(true);
//        buttonRubro.setEnabled(true);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(true);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(true);
        buttonNuevo.setEnabled(false);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(true);
       
        ComborazonsocialProveedor.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtObservacion.setEnabled(false);
        txtRubro.setEnabled(false);
        txtRuc.setEnabled(false);
        }
    
    void habilitarEnter() {

        buttonAgregarContacto.setEnabled(true);
        buttonDireccion.setEnabled(true);
//        buttonRubro.setEnabled(true);
        buttonDireccion.setEnabled(true);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(true);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(true);
        buttonNuevo.setEnabled(false);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(true);
       
        ComborazonsocialProveedor.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtObservacion.setEnabled(false);
        txtRubro.setEnabled(false);
        txtRuc.setEnabled(false);
        }
    
    void habilitarModificar() {

        buttonAgregarContacto.setEnabled(false);
        buttonDireccion.setEnabled(false);
//        buttonRubro.setEnabled(false);
        buttonDireccion.setEnabled(false);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(false);
        buttonGuardar.setEnabled(true);
        buttonArticulos.setEnabled(false);
        buttonNuevo.setEnabled(false);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(false);
       
        ComborazonsocialProveedor.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtObservacion.setEnabled(true);
        txtRubro.setEnabled(true);
        txtRuc.setEnabled(true);
        }
    
    void habilitarGuardar() {

        buttonAgregarContacto.setEnabled(true);
        buttonDireccion.setEnabled(true);
//        buttonRubro.setEnabled(true);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(true);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(true);
        buttonNuevo.setEnabled(false);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(true);
       
        ComborazonsocialProveedor.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtObservacion.setEnabled(false);
        txtRubro.setEnabled(false);
        txtRuc.setEnabled(false);
        }
    
    void habilitarEliminar() {

        buttonAgregarContacto.setEnabled(false);
        buttonDireccion.setEnabled(false);
//        buttonRubro.setEnabled(false);
        buttonDireccion.setEnabled(false);
        buttonLimpiar.setEnabled(true);
        buttonModificar.setEnabled(false);
        buttonGuardar.setEnabled(false);
        buttonArticulos.setEnabled(false);
        buttonNuevo.setEnabled(true);
        buttonRegistrar.setEnabled(false);
        buttonEliminar.setEnabled(false);
       
        ComborazonsocialProveedor.setEnabled(true);
        txtDireccion.setEnabled(false);
        txtObservacion.setEnabled(false);
        txtRubro.setEnabled(false);
        txtRuc.setEnabled(false);
        }
}
