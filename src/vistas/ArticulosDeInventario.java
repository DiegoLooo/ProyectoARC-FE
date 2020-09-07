/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controller.ArticuloController;
import controller.InventarioController;
import database.AccesoDB;
import entity.Articulo;
import entity.Inventario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ARCRODINPC-06
 */
public class ArticulosDeInventario extends javax.swing.JInternalFrame {
    
    Connection conexion;
    CallableStatement cs = null;
    ResultSet rs = null;
    Statement s = null;
    PreparedStatement ps = null;
    String q;
    
    
    int ultimoId;
    int idInventario;
    String idInvCombo;
    
    static int idArt;
    static String artid;
    static String codArt;
    String tipoArt="SELECCIONAR";

    /**
     * Creates new form Articulos
     */
    public ArticulosDeInventario() throws SQLException, ClassNotFoundException, Exception {
        initComponents();
        habilitarInicio();
        txtMedidaDia.setText("MM");
        txtMedLongitud.setText("MM");
        CargarInventarios();
        ubicarId(IinventarioRegistro.idInventario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodArticulo = new javax.swing.JTextField();
        buttonBuscarCodigo = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodUbicacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelIdArticulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtObservacion = new javax.swing.JTextField();
        labelDiametro = new javax.swing.JLabel();
        txtDiametro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMedidaDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtMedLongitud = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtProcedencia = new javax.swing.JTextField();
        buttonNuevo = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        buttonModificar = new javax.swing.JButton();
        buttonGuardar = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPulg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboBoxInventario = new javax.swing.JComboBox<>();
        txtFechInventario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Articulos desde Inventario");

        jLabel1.setText("N°:");

        jLabel2.setText("Codigo Articulo:");

        buttonBuscarCodigo.setText("Buscar");
        buttonBuscarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarCodigoActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo Ubicacion:");

        jLabel4.setText("Nombre:");

        labelIdArticulo.setText("0000000");

        jLabel6.setText("Observacion:");

        labelDiametro.setText("Diametro:");

        txtDiametro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiametroActionPerformed(evt);
            }
        });

        jLabel9.setText("Unidad de Medida: ");

        jLabel10.setText("Longitud:");

        jLabel11.setText("Unidad de Medida:");

        jLabel12.setText("Cantidad:");

        jLabel13.setText("Procedencia:");

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

        buttonCerrar.setText("Cerrar");
        buttonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCerrarActionPerformed(evt);
            }
        });

        jLabel7.setText("Dia. Pulg.:");

        jLabel8.setText("Inventario:");

        comboBoxInventario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxInventarioItemStateChanged(evt);
            }
        });

        jLabel5.setText("Fecha de Registro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelDiametro)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(2, 2, 2))
                                .addComponent(jLabel10)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonBuscarCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMedLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPulg, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiametro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMedidaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(buttonRegistrar)
                                .addGap(18, 18, 18)
                                .addComponent(buttonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(buttonGuardar)
                                .addGap(28, 28, 28)
                                .addComponent(buttonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCerrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelIdArticulo))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(jLabel4))
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBoxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtCodArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBuscarCodigo)
                    .addComponent(buttonLimpiar)
                    .addComponent(jLabel3)
                    .addComponent(txtCodUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdArticulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboBoxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiametro)
                    .addComponent(txtDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtMedidaDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPulg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtMedLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtProcedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonNuevo)
                    .addComponent(buttonRegistrar)
                    .addComponent(buttonModificar)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonEliminar)
                    .addComponent(buttonCerrar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        procesar(2);
        habilitarGuardar();
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCerrarActionPerformed

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        procesar(1);
        try {
            consultar(txtCodArticulo.getText(), idInventario);
        } catch (Exception ex) {
            Logger.getLogger(ArticulosDeInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitarRegistrar();
        
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonBuscarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarCodigoActionPerformed
        try {
            consultar(txtCodArticulo.getText(), idInventario);
        } catch (Exception ex) {
            Logger.getLogger(ArticulosDeInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        habilitarBuscar();
    }//GEN-LAST:event_buttonBuscarCodigoActionPerformed

    private void buttonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEliminarActionPerformed
        procesar(3);
        limpiar();
        habilitarEliminar();
    }//GEN-LAST:event_buttonEliminarActionPerformed

    private void txtDiametroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiametroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiametroActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        limpiar();
        habilitarInicio();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNuevoActionPerformed
        habilitarNuevo();
    }//GEN-LAST:event_buttonNuevoActionPerformed

    private void buttonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarActionPerformed
        habilitarModificar();
    }//GEN-LAST:event_buttonModificarActionPerformed

    private void comboBoxInventarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxInventarioItemStateChanged
        if (comboBoxInventario.getSelectedIndex() != 0) {
            idInvCombo = comboBoxInventario.getSelectedItem().toString();
            idInventario = Integer.parseInt(idInvCombo);

            System.out.println(idInvCombo);

            try {
                consultar(idInventario);
            } catch (Exception ex) {
                Logger.getLogger(ArticulosDeInventario.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {

        }
    }//GEN-LAST:event_comboBoxInventarioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscarCodigo;
    private javax.swing.JButton buttonCerrar;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonModificar;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JComboBox<String> comboBoxInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelDiametro;
    private javax.swing.JLabel labelIdArticulo;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodArticulo;
    private javax.swing.JTextField txtCodUbicacion;
    private javax.swing.JTextField txtDiametro;
    private javax.swing.JTextField txtFechInventario;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtMedLongitud;
    private javax.swing.JTextField txtMedidaDia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtObservacion;
    private javax.swing.JTextField txtProcedencia;
    private javax.swing.JTextField txtPulg;
    // End of variables declaration//GEN-END:variables

ArticuloController obj= new ArticuloController();
Articulo pro;

InventarioController inventariocontroler= new InventarioController();
Inventario inventario;



// ------------------------- Procesar ----------------------------

   private void procesar(int op ) {
       pro=leerDatos();
        try {
            String msg=obj.ArticuloProcesar(pro,pro,op);
            JOptionPane.showMessageDialog(null, msg);            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e.getMessage());
             System.out.println("Error"+e.getMessage());
        }       
   }
   
   
 //-------------------------- Consultar -----------------------------
 //txtCodArticulo.getText(), idInventario
   
      private void consultar(String codA, int in) throws Exception {
       pro=obj.ArticuloBuscar(codA, in);
        if (pro!=null) {
            
            labelIdArticulo.setText(Integer.toString(pro.getAidArticulo()));
            
            idInventario=pro.getIdInventario();
            String testValue2 = Integer.toString(idInventario);
            for (int i = 0; i < comboBoxInventario.getModel().getSize(); i++) {
                if (comboBoxInventario.getItemAt(i).equals(testValue2)) {
                    System.out.println(i);
                    comboBoxInventario.setSelectedIndex(i);
                    break;
                }
            }
            consultar(idInventario);            
            
            idArt=pro.getAidArticulo();
            txtCodArticulo.setText(pro.getCodigoArticulo());
            codArt=pro.getCodigoArticulo();
            txtCodUbicacion.setText(pro.getCodigoUbicacion());
            txtNombre.setText(pro.getNombre());
            txtObservacion.setText(pro.getObservacion());
            txtDiametro.setText(pro.getDiametro());
            txtPulg.setText(pro.getDiamPulg());
          //txtDiamInterno.setText("");
            txtMedidaDia.setText(pro.getUnidadMedidaDia());
            txtLongitud.setText(pro.getLongitud());
            txtMedLongitud.setText(pro.getUnidadMedidaLong());
            txtProcedencia.setText(pro.getProcedencia());
            txtCantidad.setText(Integer.toString(pro.getCantidad()));
            
          }else{
          JOptionPane.showMessageDialog(null, "Articulo no registrado");
          //System.out.println("Error");
        }
    }


//--------------------------- Leer Datos -----------------------

     private Articulo leerDatos() {
        Articulo art = new Articulo();
        
        art.setIdInventario(idInventario);
        art.setCodigoArticulo(txtCodArticulo.getText());
        art.setCodigoUbicacion(txtCodUbicacion.getText());
        art.setNombre(txtNombre.getText());
        art.setObservacion(txtObservacion.getText());
        art.setDiametro(txtDiametro.getText());
        art.setDiamPulg(txtPulg.getText());
        art.setLongitudReal("");//longitud real
        art.setUnidadMedidaDia(txtMedidaDia.getText());
        art.setLongitud(txtLongitud.getText());
        art.setUnidadMedidaLong(txtMedLongitud.getText());
        art.setCantidad(Integer.parseInt(txtCantidad.getText()));
        art.setProcedencia(txtProcedencia.getText());
        art.setAidArticulo(idArt);
        
        return art;
    }
//------------------------------- Limpiar -------------------------
    public void limpiar(){
    
    txtCodArticulo.setText("");
    txtCodUbicacion.setText("");
    txtNombre.setText("");
    txtObservacion.setText("");
    txtDiametro.setText("");
    txtPulg.setText("");
    txtMedidaDia.setText("MM");
    txtLongitud.setText("");
    txtMedLongitud.setText("MM");
    txtCantidad.setText("");
    txtProcedencia.setText("");
    labelIdArticulo.setText("000000");
    
    }
//------------------------------ Habilitar -----------------------
public void habilitarInicio(){
    buttonBuscarCodigo.setEnabled(true);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(true);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(false);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(false);

    txtCodArticulo.setEnabled(true);
    txtCodUbicacion.setEnabled(false);
    txtNombre.setEnabled(false);
    txtObservacion.setEnabled(false);
    txtDiametro.setEnabled(false);
    txtPulg.setEnabled(false);
    txtMedidaDia.setEnabled(false);
    txtLongitud.setEnabled(false);
    txtMedLongitud.setEnabled(false);
    txtCantidad.setEnabled(false);
    txtProcedencia.setEnabled(false);      
    }
    
    public void habilitarNuevo(){
    buttonBuscarCodigo.setEnabled(false);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(false);
    buttonRegistrar.setEnabled(true);
    buttonModificar.setEnabled(false);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(false);

    txtCodArticulo.setEnabled(true);
    txtCodUbicacion.setEnabled(true);
    txtNombre.setEnabled(true);
    txtObservacion.setEnabled(true);
    txtDiametro.setEnabled(true);
    txtPulg.setEnabled(true);
    txtMedidaDia.setEnabled(true);
    txtLongitud.setEnabled(true);
    txtMedLongitud.setEnabled(true);
    txtCantidad.setEnabled(true);
    txtProcedencia.setEnabled(true);      
    }
    
    public void habilitarRegistrar(){
    buttonBuscarCodigo.setEnabled(false);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(false);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(true);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(true);

    txtCodArticulo.setEnabled(false);
    txtCodUbicacion.setEnabled(false);
    txtNombre.setEnabled(false);
    txtObservacion.setEnabled(false);
    txtDiametro.setEnabled(false);
    txtPulg.setEnabled(false);
    txtMedidaDia.setEnabled(false);
    txtLongitud.setEnabled(false);
    txtMedLongitud.setEnabled(false);
    txtCantidad.setEnabled(false);
    txtProcedencia.setEnabled(false);      
    }
    
    public void habilitarModificar(){
    buttonBuscarCodigo.setEnabled(false);
    buttonLimpiar.setEnabled(false);
    buttonNuevo.setEnabled(false);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(false);
    buttonGuardar.setEnabled(true);
    buttonEliminar.setEnabled(false);

    txtCodArticulo.setEnabled(true);
    txtCodUbicacion.setEnabled(true);
    txtNombre.setEnabled(true);
    txtObservacion.setEnabled(true);
    txtDiametro.setEnabled(true);
    txtPulg.setEnabled(true);
    txtMedidaDia.setEnabled(true);
    txtLongitud.setEnabled(true);
    txtMedLongitud.setEnabled(true);
    txtCantidad.setEnabled(true);
    txtProcedencia.setEnabled(true);      
    }
    
    public void habilitarBuscar(){
    buttonBuscarCodigo.setEnabled(true);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(false);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(true);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(true);

    txtCodArticulo.setEnabled(true);
    txtCodUbicacion.setEnabled(false);
    txtNombre.setEnabled(false);
    txtObservacion.setEnabled(false);
    txtDiametro.setEnabled(false);
    txtPulg.setEnabled(false);
    txtMedidaDia.setEnabled(false);
    txtLongitud.setEnabled(false);
    txtMedLongitud.setEnabled(false);
    txtCantidad.setEnabled(false);
    txtProcedencia.setEnabled(false);      
    }
    
    public void habilitarEliminar(){
    buttonBuscarCodigo.setEnabled(true);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(true);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(false);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(false);

    txtCodArticulo.setEnabled(true);
    txtCodUbicacion.setEnabled(false);
    txtNombre.setEnabled(false);
    txtObservacion.setEnabled(false);
    txtDiametro.setEnabled(false);
    txtPulg.setEnabled(false);
    txtMedidaDia.setEnabled(false);
    txtLongitud.setEnabled(false);
    txtMedLongitud.setEnabled(false);
    txtCantidad.setEnabled(false);
    txtProcedencia.setEnabled(false);      
    }
     public void habilitarGuardar(){
    buttonBuscarCodigo.setEnabled(false);
    buttonLimpiar.setEnabled(true);
    buttonNuevo.setEnabled(false);
    buttonRegistrar.setEnabled(false);
    buttonModificar.setEnabled(true);
    buttonGuardar.setEnabled(false);
    buttonEliminar.setEnabled(true);

    txtCodArticulo.setEnabled(false);
    txtCodUbicacion.setEnabled(false);
    txtNombre.setEnabled(false);
    txtObservacion.setEnabled(false);
    txtDiametro.setEnabled(false);
    txtPulg.setEnabled(false);
    txtMedidaDia.setEnabled(false);
    txtLongitud.setEnabled(false);
    txtMedLongitud.setEnabled(false);
    txtCantidad.setEnabled(false);
    txtProcedencia.setEnabled(false);      
    }

//----------------------------- Cargar Inventarios ---------------------------------     
public JComboBox<String> CargarInventarios() throws SQLException, ClassNotFoundException {
        comboBoxInventario.removeAllItems();
        comboBoxInventario.addItem("Inventario");
        try {
            conexion = AccesoDB.obtener();
            q = "select idInventario from inventario";
            ps = conexion.prepareStatement(q);
            rs = ps.executeQuery();
            while (rs.next()) {
                comboBoxInventario.addItem(Integer.toString(rs.getInt(1)));
            }
            rs.close();
            ps.close();

        } catch (SQLException e) {
            throw e;

        }
        return comboBoxInventario;
    }

// ------------------ Ultimo id Inventario -------------------------------------
private void consultarUltimoId() throws Exception {
        inventario = inventariocontroler.InventarioBuscarUltimoId();
        if (inventario != null) {
        }
        ultimoId = inventario.getIdInventario();
        idInventario=ultimoId;
        
         String testValue2 = Integer.toString(idInventario);
            for (int i = 0; i < comboBoxInventario.getModel().getSize(); i++) {
                if (comboBoxInventario.getItemAt(i).equals(testValue2)) {
                    System.out.println(i);
                    comboBoxInventario.setSelectedIndex(i);
                    break;
                }
            }
        consultar(idInventario);
        
    }

private void ubicarId(int id) throws Exception {
        idInventario=id;
        
         String testValue2 = Integer.toString(idInventario);
            for (int i = 0; i < comboBoxInventario.getModel().getSize(); i++) {
                if (comboBoxInventario.getItemAt(i).equals(testValue2)) {
                    System.out.println(i);
                    comboBoxInventario.setSelectedIndex(i);
                    break;
                }
            }
        consultar(idInventario);
        
    }


void consultar(int id) throws Exception{
        inventario= inventariocontroler.InventarioBuscar(id);
        if (inventario != null) {
            System.out.println("22222222222222222");
            idInventario=inventario.getIdInventario();
            System.out.println("111111111111111111111");
           
            txtFechInventario.setText(inventario.getFechReg());
           

        } else {
            JOptionPane.showMessageDialog(null, "Articulo no registrado");
            //System.out.println("Error");
        }
    } 
}
