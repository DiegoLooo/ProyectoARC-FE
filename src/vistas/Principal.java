/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.beans.PropertyVetoException;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author ARCRODINPC-02
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public Principal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //cerrarPrincipal();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LOGO PINION ARC.png")).getImage());
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Principal");

        jDesktopPane1.setForeground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );

        jMenu4.setText("Datos");

        jMenuItem38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vista Users.png"))); // NOI18N
        jMenuItem38.setText("Clientes");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem38);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Globe1.png"))); // NOI18N
        jMenuItem3.setText("Proveedores");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/People.png"))); // NOI18N
        jMenuItem4.setText("Registrar Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/US-dollar.png"))); // NOI18N
        jMenuItem17.setText("Registrar Tipo de Cambio");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bag_black.png"))); // NOI18N
        jMenu1.setText("Caja Chica");

        jMenuItem10.setText("Registrar Caja Chica");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem10);

        jMenuItem11.setText("Reporte Caja Chica");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenu4.add(jMenu1);

        jMenuBar2.add(jMenu4);

        jMenu17.setText("Compras");

        jMenu19.setText("Orden Compra");

        jMenuItem36.setText("Registro Ordenes Compra");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem36);

        jMenuItem37.setText("Vista Ordenes Compra");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem37);

        jMenu17.add(jMenu19);

        jMenuBar2.add(jMenu17);

        jMenu5.setText("Ventas");

        jMenu12.setText("Cotización");

        jMenuItem1.setText("Registrar Cotización ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem1);

        jMenuItem2.setText("Vista Cotizaciones");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem2);

        jMenu5.add(jMenu12);

        jMenu3.setText("Pedido");

        jMenuItem12.setText("Registrar Pedido");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem24.setText("Vista Pedidos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenu5.add(jMenu3);

        jMenu20.setText("Guia de Remision");

        jMenuItem20.setText("Registrar Guia Remision");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem20);

        jMenuItem21.setText("Vista Guia Remision");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem21);

        jMenu5.add(jMenu20);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("Almacen");

        jMenu13.setText("Control Inventario ");

        jMenuItem27.setText("Registro Control");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem27);

        jMenuItem29.setText("Vista Control");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem29);

        jMenu6.add(jMenu13);

        jMenu14.setText("Inventario ");

        jMenuItem13.setText("Registro Inventario");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem13);

        jMenuItem14.setText("Vista Inventario");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem14);

        jMenu6.add(jMenu14);

        jMenuBar2.add(jMenu6);

        jMenu16.setText("Produccion");

        jMenu7.setText("Orden de Corte");

        jMenuItem15.setText("Registrar Orden de Corte");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem15);

        jMenuItem16.setText("Vista Orden de Corte");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem16);

        jMenuItem25.setText("Vista Detalle Orden de Corte");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem25);

        jMenu16.add(jMenu7);

        jMenu15.setText("Orden de Trabajo");

        jMenuItem33.setText("Registrar Orden de Trabajo");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem33);

        jMenuItem35.setText("Vista Ordenes de Trabajo");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem35);

        jMenu16.add(jMenu15);

        jMenuBar2.add(jMenu16);

        jMenu8.setText("Utilitarios");

        jMenuItem22.setText("PrecioBarras");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem22);

        jMenuItem9.setText("PrecioCromado");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuItem31.setText("Cálculo de Peso");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem31);

        jMenuItem5.setText("Rotulaciones");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem5);

        jMenuBar2.add(jMenu8);

        jMenu10.setText("Salir");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        jMenuItem23.setText("Salir");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem23);

        jMenuBar2.add(jMenu10);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        cargarFormInterno(Usuarios.class);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cargarFormInterno(ProformasVista.class);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        cargarFormInterno(Proformas.class);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        cargarFormInterno(ArticulosVista.class);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        cargarFormInterno(Articulos.class);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        cargarFormInterno(OrdenesCorte.class);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        cargarFormInterno(OrdenesCorteVista.class);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        cargarFormInterno(TiposDeCambio.class);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed

    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        cargarFormInterno(GuiaRemision.class);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        cargarFormInterno(ValidarPrecio.class);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        cargarFormInterno(GuiaRemisionVista.class);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        cargarFormInterno(PrecioCromado.class);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      cargarFormInterno(CajaChicaRegistro.class);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      cargarFormInterno(ExportarCajaChica.class);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        cargarFormInterno(Pedidos.class);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        cargarFormInterno(PedidosVista.class);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        cargarFormInterno(CortesVista.class);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        cargarFormInterno(IinventarioRegistro.class);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        cargarFormInterno(InventarioInformacion.class);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        cargarFormInterno(CalculoPesos.class);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cargarFormInterno(Rotulaciones.class);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        cargarFormInterno(OrdenTrabajoRegistro.class);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        cargarFormInterno(OrdenTrabajoVista.class);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        cargarFormInterno(OrdenesCompra.class);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        cargarFormInterno(OrdenCompraVista.class);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        cargarFormInterno(ClientesVista.class);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        cargarFormInterno(ProveedoresVista.class);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            
             new Principal().setVisible(true);  
              
            }
        });
    }

    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables


    private void cargarFormInterno(Class<?> aClass) {
        try {
            // Variable de control
            JInternalFrame view = null;
            // Buscar objeto en desktopPane
            for (JInternalFrame form :  jDesktopPane1.getAllFrames()) {
                if (aClass.isInstance(form)) {
                    view = form;
                    break;
                }
            }
            // Crear instancia
            if (view == null) {
                view = (JInternalFrame) Class.forName(aClass.getName()).newInstance();
                jDesktopPane1.add(view);
                view.setVisible(true);
            }
            // Activar formulario
            view.setSelected(true);
            view.setMaximum(false);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | PropertyVetoException e) {
        }
    }
    
//    public void confirmarsalida(){
//        int valor =JOptionPane.showConfirmDialog(this, "Desea Cerrar Sistema?", "Advertencia",JOptionPane.YES_NO_OPTION );
//        if (valor ==  JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, "Nos vemos Mañana", "Gracias", JOptionPane.INFORMATION_MESSAGE);
//            System.exit(0);
//        }   
//    }
//    public void cerrarPrincipal(){
//        try {
//            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//            addWindowListener(new WindowAdapter() {
//                public void WindowClosing(WindowEvent e){
//                        confirmarsalida();
//                }
//            });
//            this.setVisible(true);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//            
//    }

    
}
