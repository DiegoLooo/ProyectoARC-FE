/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controller.CalcularPrecioController;
import controller.ListaPrecioController;
import controller.TipoCambioController;
import entity.CalcularPrecio;
import entity.ListaPrecio;
import entity.TipoCambio;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ARCRODINPC-06
 */
public class ValidarPrecio1 extends javax.swing.JInternalFrame {

    String comboDia = ""; //combobox diametro
    String comboMoneda; // combobox moneda
    String nombreCompleto;//nombre de la barrra más su longitud
    ListaPrecioController obj = new ListaPrecioController();
    ListaPrecio lista;
    
    float cant, desc, result, tot, totIGV;

    float num,nume,deno,resFra,res;
    
    public ValidarPrecio1() throws Exception {
        initComponents();
        labelFecha.setText(fechaActual());
        consultarTipoCambio(labelFecha.getText());
        txtNum.setText("0");
//        deshabilitar();
        comboBoxDiametro.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                // aca falta validar que me ejecute el campo
                String cadenaEscrita = comboBoxDiametro.getEditor().getItem().toString();

                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                    comboBoxDiametro.setSelectedItem(comboBoxDiametro.getItemAt(0));
                    comboDia = comboBoxDiametro.getItemAt(0);
                    for (int i = 0; i < comboBoxDiametro.getModel().getSize(); i++) {
                        if (comboBoxDiametro.getItemAt(i).equals(cadenaEscrita)) {
                            // comboBoxDiametro.setSelectedIndex(i);
                            if (!"Selecionar".equals(comboDia)) {
                                comboBoxDiametro.setSelectedItem(comboBoxDiametro.getItemAt(i));
                                comboDia = comboBoxDiametro.getItemAt(i);
                                System.out.println("diametro:" + comboDia);
                            } else {
                                comboDia = "";
                            }
                        }
                    }
                }
                if (evt.getKeyCode() >= 65 && evt.getKeyCode() <= 90 || evt.getKeyCode() >= 96 && evt.getKeyCode() <= 105 || evt.getKeyCode() == 8 || evt.getKeyCode() >= KeyEvent.VK_0 && evt.getKeyCode() <= KeyEvent.VK_9) {
                    try {
                        comboBoxDiametro.setModel(obj.CargarComboDiametro(cadenaEscrita));
                    } catch (Exception ex) {
                        Logger.getLogger(ValidarPrecio1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (comboBoxDiametro.getItemCount() > 0) {
                        comboBoxDiametro.getEditor().setItem(cadenaEscrita);
                        comboBoxDiametro.showPopup();
                    } else {
                        comboBoxDiametro.addItem(cadenaEscrita);
                    }
                }

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBoxMoneda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPrecioIgv = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        labelMoneda1 = new javax.swing.JLabel();
        AgregarAProforma = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelCambioCompra = new javax.swing.JLabel();
        labelCambioVenta = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        comboBoxDiametro = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDenominador = new javax.swing.JTextField();
        buttonConvertir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtNumMm = new javax.swing.JTextField();
        buttonLimpiarConv = new javax.swing.JButton();
        txtNumerador = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCant = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtRes = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        buttonLimpiarDesc = new javax.swing.JButton();
        buttonDesc = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cálculo de Precios");

        labelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelFecha.setText("FECHA");

        jLabel2.setText("CALCULO DE PRECIO");

        jLabel3.setText("Moneda: ");

        comboBoxMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "DOLARES AMERICANOS", "SOLES" }));
        comboBoxMoneda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxMonedaItemStateChanged(evt);
            }
        });

        jLabel4.setText("Diametro (MM)");

        jLabel5.setText("Nombre");

        jLabel6.setText("Longitud (MM)");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio: ");

        jLabel8.setText("Precio con IGV: ");

        labelMoneda1.setText("TIPO DE MONEDA");

        AgregarAProforma.setText("Agregar a Detalle ");
        AgregarAProforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAProformaActionPerformed(evt);
            }
        });

        buttonLimpiar.setText("Limpiar Cálculo");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("T.C.:");

        jLabel10.setText("Compra:");

        jLabel11.setText("Venta:");

        labelCambioCompra.setText("00.000");

        labelCambioVenta.setText("00.000");

        jLabel12.setText("I.G.V.:");

        comboBoxDiametro.setEditable(true);

        jLabel13.setText("Conversor de pulgadas a milimetros");

        jLabel14.setText("Ingrese en (in):");

        jLabel9.setText("/");

        buttonConvertir.setText("Convertir");
        buttonConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertirActionPerformed(evt);
            }
        });

        jLabel15.setText("Salida en (mm):");

        buttonLimpiarConv.setText("Limpiar Conversor");
        buttonLimpiarConv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarConvActionPerformed(evt);
            }
        });

        jLabel16.setText("Descuento:");

        jLabel17.setText("Precio:");

        jLabel18.setText("Descuento:");

        jLabel19.setText("%");

        jLabel21.setText("Nuevo Total con descuento:");

        buttonLimpiarDesc.setText("Limpiar Desc.");
        buttonLimpiarDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarDescActionPerformed(evt);
            }
        });

        buttonDesc.setText("Descuento");
        buttonDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 5, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(132, 132, 132)
                                                        .addComponent(jLabel11))
                                                    .addComponent(comboBoxMoneda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtNumMm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel10)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelCambioCompra)
                                        .addComponent(labelCambioVenta)
                                        .addComponent(buttonLimpiarConv)))
                                .addComponent(jLabel3)))
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel16)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(buttonDesc))
                                .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRes, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(buttonLimpiarDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel12)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(labelMoneda1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addComponent(AgregarAProforma))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonConvertir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(labelFecha))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel10)
                        .addComponent(labelCambioCompra)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelCambioVenta))
                .addGap(7, 7, 7)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtDenominador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonConvertir)
                    .addComponent(jLabel15)
                    .addComponent(txtNumMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpiarConv)
                    .addComponent(txtNumerador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonLimpiar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxDiametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMoneda1)
                    .addComponent(AgregarAProforma))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLimpiarDesc))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBoxMonedaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxMonedaItemStateChanged
//        if (comboDia != "") {
//            if (comboBoxMoneda.getSelectedItem() == "DOLARES AMERICANOS") {
//                try {
//                    consultarDolares(Float.parseFloat(txtLongitud.getText()), comboDia);
//                    deshabilitarGen();
//                } catch (Exception ex) {
//                    Logger.getLogger(ValidarPrecio1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                txtCant.setText(txtPrecio.getText());
//                
//                labelMoneda1.setText("DOLARES AMERICANOS");
//            } else if (comboBoxMoneda.getSelectedItem() == "SOLES") {
//
//                try {
//                    consultarSoles(Float.parseFloat(txtLongitud.getText()), labelFecha.getText(), comboDia);
//                    deshabilitarGen();                   
//                } catch (Exception ex) {
//                    Logger.getLogger(ValidarPrecio1.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                txtCant.setText(txtPrecio.getText());
//                
//                labelMoneda1.setText("SOLES");
//            }
//
//        }else{
//            JOptionPane.showMessageDialog(null, "Tienes que presionar enter en DIametro");
//        }
//
//        nombreCompleto = txtNombre.getText() + " X " + txtLongitud.getText() + " MM LONG";
//        System.out.println(nombreCompleto);

    }//GEN-LAST:event_comboBoxMonedaItemStateChanged

    private void AgregarAProformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAProformaActionPerformed
        DetalleProformas detProf = null;
        detProf = new DetalleProformas(nombreCompleto, txtPrecio.getText());
        limpiar();
        dispose();
    }//GEN-LAST:event_AgregarAProformaActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        limpiar();
        habilitarGen();
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void buttonConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertirActionPerformed
        if("".equals(txtNumerador.getText())&& "".equals(txtDenominador.getText())){
            calculo();
            System.out.println("vacio");
        }else{
            calculoFracion();
            System.out.println("no vacio");
        }
    }//GEN-LAST:event_buttonConvertirActionPerformed

    private void buttonLimpiarConvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarConvActionPerformed
         limpiarConvertir();
    }//GEN-LAST:event_buttonLimpiarConvActionPerformed

    private void buttonDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDescActionPerformed
         CalcDesc();
    //     habilitarDesc();
    }//GEN-LAST:event_buttonDescActionPerformed

    private void buttonLimpiarDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarDescActionPerformed
        habilitarLimp();
        limpiarDesc();
    }//GEN-LAST:event_buttonLimpiarDescActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAProforma;
    private javax.swing.JButton buttonConvertir;
    private javax.swing.JButton buttonDesc;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonLimpiarConv;
    private javax.swing.JButton buttonLimpiarDesc;
    private javax.swing.JComboBox<String> comboBoxDiametro;
    private javax.swing.JComboBox<String> comboBoxMoneda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelCambioCompra;
    private javax.swing.JLabel labelCambioVenta;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelMoneda1;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtDenominador;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtNumMm;
    private javax.swing.JTextField txtNumerador;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecioIgv;
    private javax.swing.JTextField txtRes;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    CalcularPrecioController calcPreControl = new CalcularPrecioController();
    CalcularPrecio calcPre;

    TipoCambioController tipCamControl = new TipoCambioController();
    TipoCambio tipCam;

    private void consultarDolares(float longitud, String dia) throws Exception {
        calcPre = calcPreControl.CalcularPrecioBuscar(longitud, dia);
        if (calcPre != null) {

            txtNombre.setText(calcPre.getNombre());
            txtIgv.setText(Float.toString(calcPre.getPrecioMetro()));
            txtPrecio.setText(Float.toString(calcPre.getPrecio()));
            txtPrecioIgv.setText(Float.toString(calcPre.getPrecioConIgv()));

        } else {
            JOptionPane.showMessageDialog(null, "Operacion Invalida");
            //System.out.println("Error");
        }
    }

    private void consultarSoles(float longitud, String fecha, String dia) throws Exception {
        calcPre = calcPreControl.CalcularPrecioBuscar(longitud, fecha, dia);
        if (calcPre != null) {

            txtNombre.setText(calcPre.getNombre());
            txtIgv.setText(Float.toString(calcPre.getPrecioMetro()));
            txtPrecio.setText(Float.toString(calcPre.getPrecio()));
            txtPrecioIgv.setText(Float.toString(calcPre.getPrecioConIgv()));

        } else {
            JOptionPane.showMessageDialog(null, "Operacion Invalida");
            //System.out.println("Error");
        }
    }

    private void consultarTipoCambio(String fecha) throws Exception {
        tipCam = tipCamControl.TipoCambioBuscarCambio(fecha);
        if (tipCam != null) {

            labelCambioCompra.setText(Float.toString(tipCam.getPrecioCompra()));
            labelCambioVenta.setText(Float.toString(tipCam.getPrecioVenta()));

        } else {
            JOptionPane.showMessageDialog(null, "Operacion Invalida");
            //System.out.println("Error");
        }
    }

//------------------------------- FECHA -------------------------------------
    public String fechaActual() {
        Date fecha = new Date();

        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        return formatofecha.format(fecha);
    }
// ------------------------------ Limpiar ------------------------------------

    public void limpiar() {

        txtNombre.setText("");
        txtIgv.setText(Float.toString((float) 00.00));
        txtPrecio.setText(Float.toString((float) 00.00));
        txtPrecioIgv.setText(Float.toString((float) 00.00));
        comboBoxMoneda.setSelectedIndex(0);
        comboBoxDiametro.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
        txtLongitud.setText("");
        txtNombre.setText("");
        labelMoneda1.setText("TIPO DE MONEDA");
        comboDia="";
    }

//    public void deshabilitar() {
//        txtIgv.setEnabled(false);
//        txtPrecio.setEnabled(false);
//        txtPrecioIgv.setEnabled(false);
//    }
    void deshabilitarGen() {
        txtNombre.setEnabled(false);
        comboBoxMoneda.setEnabled(true);
        comboBoxDiametro.setEnabled(false);
        txtLongitud.setEnabled(false);
    }

    void habilitarGen() {
        txtNombre.setEnabled(true);
        comboBoxMoneda.setEnabled(true);
        comboBoxDiametro.setEnabled(true);
        txtLongitud.setEnabled(true);

    }
    //-------------------------------- Conversor -----------------------------
    void calculoFracion() {
         
        DecimalFormat df = new DecimalFormat("0.00");
        String cero;
        num = Float.parseFloat(txtNum.getText());
        nume = Float.parseFloat(txtNumerador.getText());
        deno = Float.parseFloat(txtDenominador.getText());
        cero=Float.toString(num);
        
         resFra = num + (nume / deno);
         res = (float) (resFra * 25.4);
        
     
        txtNumMm.setText(df.format(res));
    }

    void calculo() {

        DecimalFormat df = new DecimalFormat("0.00");
        num = Float.parseFloat(txtNum.getText());

        res = (float) (num * 25.4);
        txtNumMm.setText(df.format(res));
    }
    void limpiarConvertir(){
        txtNumerador.setText("");
        txtDenominador.setText("");
        txtNum.setText("0");
        txtNumMm.setText("");
    }
    
     void CalcDesc() {
        DecimalFormat df = new DecimalFormat("0.00");
        cant = Float.parseFloat(txtCant.getText());
        desc = Float.parseFloat(txtDesc.getText());

        result = (cant * desc) / 100;

        tot = cant - result;
        
        totIGV=(float) (tot*1.18);
        
        txtRes.setText(df.format(result));
        txtTotal.setText(df.format(tot));
   }
     
     void habilitarDesc(){
        txtCant.setEnabled(true);
        txtDesc.setEnabled(false);
        txtRes.setEnabled(false);
        txtTotal.setEnabled(false);
   }
   
   void habilitarLimp(){
        txtCant.setEnabled(true);
        txtDesc.setEnabled(true);
        txtRes.setEnabled(true);
        txtTotal.setEnabled(true);
   }
   
   void limpiarDesc(){
        txtDesc.setText("");
        txtRes.setText("");
        txtTotal.setText("");
   
   }
}

