package ControladorMINI;

import FuncionesMINI.conexion;
import java.awt.Graphics;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import reporteMINI.frmReporte;

public class FrmPrincipalMINI extends javax.swing.JFrame {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    public FrmPrincipalMINI() {

        initComponents();
        this.setLocationRelativeTo(null);

        deskPricipal.setUI(new BasicDesktopPaneUI() {

            public void paintComponent(Graphics g) {
                g.setColor(new java.awt.Color(36, 33, 33));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPricipal = new javax.swing.JDesktopPane();
        btnImportarProducto = new javax.swing.JButton();
        btnImportarProInventario = new javax.swing.JButton();
        btnCalculo = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnProdNoinv = new javax.swing.JButton();
        btnProdNoRegistrados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage( new ImageIcon(getClass().getResource("/imagenesMINI/registry16.png")).getImage());
        setResizable(false);

        deskPricipal.setBackground(new java.awt.Color(36, 33, 33));

        btnImportarProducto.setBackground(new java.awt.Color(36, 33, 33));
        btnImportarProducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnImportarProducto.setForeground(new java.awt.Color(207, 207, 207));
        btnImportarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/import.png"))); // NOI18N
        btnImportarProducto.setText("  Importar Productos");
        btnImportarProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 207, 207)));
        btnImportarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarProductoActionPerformed(evt);
            }
        });

        btnImportarProInventario.setBackground(new java.awt.Color(36, 33, 33));
        btnImportarProInventario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnImportarProInventario.setForeground(new java.awt.Color(207, 207, 207));
        btnImportarProInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/curve9.png"))); // NOI18N
        btnImportarProInventario.setText("Importar Inventario");
        btnImportarProInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 207, 207)));
        btnImportarProInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarProInventarioActionPerformed(evt);
            }
        });

        btnCalculo.setBackground(new java.awt.Color(36, 33, 33));
        btnCalculo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCalculo.setForeground(new java.awt.Color(207, 207, 207));
        btnCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/screen6.png"))); // NOI18N
        btnCalculo.setText("Reporte Diferencias");
        btnCalculo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 207, 207)));
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(207, 207, 207));
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/registry16.png"))); // NOI18N
        lblTitulo.setText("                                                 CALCULO DE DIFERENCIAS DE PRODUCTOS.");

        btnProdNoinv.setBackground(new java.awt.Color(36, 33, 33));
        btnProdNoinv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProdNoinv.setForeground(new java.awt.Color(207, 207, 207));
        btnProdNoinv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/screen6.png"))); // NOI18N
        btnProdNoinv.setText("Reporte Productos no contabilizados");
        btnProdNoinv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 207, 207)));
        btnProdNoinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdNoinvActionPerformed(evt);
            }
        });

        btnProdNoRegistrados.setBackground(new java.awt.Color(36, 33, 33));
        btnProdNoRegistrados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnProdNoRegistrados.setForeground(new java.awt.Color(207, 207, 207));
        btnProdNoRegistrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/screen6.png"))); // NOI18N
        btnProdNoRegistrados.setText("Reporte Productos no registrados");
        btnProdNoRegistrados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 207, 207)));
        btnProdNoRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdNoRegistradosActionPerformed(evt);
            }
        });

        deskPricipal.setLayer(btnImportarProducto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPricipal.setLayer(btnImportarProInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPricipal.setLayer(btnCalculo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPricipal.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPricipal.setLayer(btnProdNoinv, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPricipal.setLayer(btnProdNoRegistrados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskPricipalLayout = new javax.swing.GroupLayout(deskPricipal);
        deskPricipal.setLayout(deskPricipalLayout);
        deskPricipalLayout.setHorizontalGroup(
            deskPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskPricipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(deskPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(deskPricipalLayout.createSequentialGroup()
                        .addComponent(btnProdNoinv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnProdNoRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deskPricipalLayout.createSequentialGroup()
                        .addComponent(btnImportarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImportarProInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        deskPricipalLayout.setVerticalGroup(
            deskPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskPricipalLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitulo)
                .addGap(37, 37, 37)
                .addGroup(deskPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImportarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportarProInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(deskPricipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdNoinv, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdNoRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPricipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPricipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarProductoActionPerformed
        FrmProductoImportarMINI form = new FrmProductoImportarMINI();
        deskPricipal.add(form);
        try {
            form.setMaximum(true);
            this.setLocationRelativeTo(null);
        } catch (Exception e) {
        }

        form.toFront();

        form.setVisible(true);

    }//GEN-LAST:event_btnImportarProductoActionPerformed

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
        try {
            int codigo = 0;
            JasperReport jr = (JasperReport) JRLoader.loadObject(frmReporte.class.getResource("/reporteMINI/RptDiferencias.jasper"));
            Map parametro = new HashMap<String, Integer>();
            parametro.put("", codigo);
            JasperPrint jp = JasperFillManager.fillReport(jr,parametro,cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();
            // JasperPrintManager.printReport( jp, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }
    }//GEN-LAST:event_btnCalculoActionPerformed

    private void btnImportarProInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarProInventarioActionPerformed
        FrmProductoInventariadoMINI form = new FrmProductoInventariadoMINI();
        deskPricipal.add(form);
        try {
            form.setMaximum(true);
            this.setLocationRelativeTo(null);
        } catch (Exception e) {
        }

        form.toFront();

        form.setVisible(true);

    }//GEN-LAST:event_btnImportarProInventarioActionPerformed

    private void btnProdNoinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdNoinvActionPerformed
         try {
            int codigo = 0;
            JasperReport jr = (JasperReport) JRLoader.loadObject(frmReporte.class.getResource("/reporteMINI/RptNoinv.jasper"));
            Map parametro = new HashMap<String, Integer>();
            parametro.put("", codigo);
            JasperPrint jp = JasperFillManager.fillReport(jr,parametro,cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();
            // JasperPrintManager.printReport( jp, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }
    }//GEN-LAST:event_btnProdNoinvActionPerformed

    private void btnProdNoRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdNoRegistradosActionPerformed
       try {
            int codigo = 0;
            JasperReport jr = (JasperReport) JRLoader.loadObject(frmReporte.class.getResource("/reporteMINI/RptProdNoRegistrados.jasper"));
            Map parametro = new HashMap<String, Integer>();
            parametro.put("", codigo);
            JasperPrint jp = JasperFillManager.fillReport(jr,parametro,cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();
            // JasperPrintManager.printReport( jp, true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }
    }//GEN-LAST:event_btnProdNoRegistradosActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipalMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipalMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipalMINI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCalculo;
    public static javax.swing.JButton btnImportarProInventario;
    public static javax.swing.JButton btnImportarProducto;
    public static javax.swing.JButton btnProdNoRegistrados;
    public static javax.swing.JButton btnProdNoinv;
    private javax.swing.JDesktopPane deskPricipal;
    public static javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
