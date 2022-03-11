package ControladorMINI;

import FuncionesMINI.Fproducto;
import FuncionesMINI.conexion;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class FrmProductoImportarMINI extends javax.swing.JInternalFrame {

    private int numdatos = 1;
    private DefaultTableModel model;
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    private String sSQL = "";

    public FrmProductoImportarMINI() {
        initComponents();
        model = new DefaultTableModel();
        datos.setModel(model);
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        datos.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                //l.setBorder(new LineBorder(Color.black, 1));
                l.setBackground(new java.awt.Color(36, 33, 33));
                l.setForeground(new java.awt.Color(207, 207, 207));
                l.setFont(new java.awt.Font("Arial", 1, 12));
                return l;
            }
        });
        mostrar();
    }

    public void mostrar() {
        try {
            DefaultTableModel modelo;
            Fproducto funcion = new Fproducto();
            modelo = funcion.mostrarProdSistema();
            datos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        btnImportarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        btnGuardarProd = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMostrarCant = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel.setBackground(new java.awt.Color(36, 33, 33));

        btnImportarProd.setBackground(new java.awt.Color(36, 33, 33));
        btnImportarProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnImportarProd.setForeground(new java.awt.Color(207, 207, 207));
        btnImportarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/excel.png"))); // NOI18N
        btnImportarProd.setText("Importar productos");
        btnImportarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarProdActionPerformed(evt);
            }
        });

        datos.setBackground(new java.awt.Color(36, 33, 33));
        datos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        datos.setForeground(new java.awt.Color(207, 207, 207));
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(datos);

        btnGuardarProd.setBackground(new java.awt.Color(36, 33, 33));
        btnGuardarProd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarProd.setForeground(new java.awt.Color(207, 207, 207));
        btnGuardarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/guardar.png"))); // NOI18N
        btnGuardarProd.setText("Ingresar productos");
        btnGuardarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProdActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(36, 33, 33));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(207, 207, 207));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/Eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar Datos");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(207, 207, 207));
        jLabel1.setText("Productos a ingresar con stock de sistema");

        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesMINI/back57.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lblMostrarCant.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMostrarCant.setForeground(new java.awt.Color(207, 207, 207));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnImportarProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnGuardarProd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMostrarCant, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(btnImportarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnGuardarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(lblMostrarCant, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarProdActionPerformed
        model = new DefaultTableModel();
        datos.setModel(model);
        JFileChooser examinar = new JFileChooser();

        examinar.setFileFilter(new FileNameExtensionFilter("Archivos xls", "xls"));
        int opcion = examinar.showOpenDialog(this);
        File archivoExcel = null;
        if (opcion == JFileChooser.APPROVE_OPTION) {
            archivoExcel = examinar.getSelectedFile().getAbsoluteFile();
            // JOptionPane.showMessageDialog(rootPane, archivoExcel);
            try {
                Workbook leerExcel = Workbook.getWorkbook(archivoExcel);
                for (int hoja = 0; hoja < leerExcel.getNumberOfSheets(); hoja++) {
                    Sheet hojaP = leerExcel.getSheet(hoja);
                    int columnas = hojaP.getColumns();

                    int filas = hojaP.getRows();
                    if (filas == 0) {
                        JOptionPane.showMessageDialog(rootPane, "El archivo no tiene datos");
                        return;
                    }
                    Object data[] = new Object[columnas];

                    for (int fila = 0; fila < filas; fila++) {
                        for (int columna = 0; columna < columnas; columna++) {
                            if (fila == 0) {
                                model.addColumn(hojaP.getCell(columna, fila).getContents());
                            }
                            // System.out.println(hojaP.getCell(columna, fila).getContents());

                            if (fila >= 1) {
                                data[columna] = hojaP.getCell(columna, fila).getContents();
                            }
                        }
                        model.addRow(data);
                    }
                }
                model.removeRow(0);
            } catch (IOException | BiffException ex) {

                Logger.getLogger(FrmProductoImportarMINI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnImportarProdActionPerformed

    private void btnGuardarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProdActionPerformed

        final SwingWorker worker = new SwingWorker() {

            @Override
            protected Object doInBackground() throws Exception {
                int cantidad = 0;
                try {
                    if (datos.getColumnCount() > 7 || datos.getColumnCount() < 7) {
                        JOptionPane.showMessageDialog(rootPane, "El archivo excel debe tener las columnas : codigo-nombre-descripcion-unidad-precio venta-stock-precio compra ");
                        model = new DefaultTableModel();
                        datos.setModel(model);
                        return null;
                    }
                    
                     for (int i = 0; i < datos.getRowCount(); i++) {
                        if (!datos.getValueAt(i, 0).toString().trim().equals("")) {
                            cantidad = cantidad + 1;
                        }
                    }

                    if (datos.getRowCount() > 0) {
                        for (int i = 0; i < datos.getRowCount(); i++) {
                            sSQL = "insert into productostock (cod_producto , nombre_producto,descripcion_producto"
                                    + ", unidad_producto , precio_producto,stock_producto,precio_compra) "
                                    + " values('"
                                    + datos.getValueAt(i, 0)
                                    + "','" + datos.getValueAt(i, 1)
                                    + "','" + datos.getValueAt(i, 2)
                                    + "','" + datos.getValueAt(i, 3)
                                    + "','" + datos.getValueAt(i, 4)
                                    + "','" + datos.getValueAt(i, 5)
                                    + "','" + datos.getValueAt(i, 6) + "')";
                            //   System.out.println(sSQL);
                            PreparedStatement pst = cn.prepareStatement(sSQL);
                            pst.executeUpdate(sSQL);

                            if (i == 1) {
                                numdatos = i + 1;
                            } else {
                                numdatos++;
                            }

                            lblMostrarCant.setText("Productos ingresados : " + numdatos + " de " + cantidad);

                        }

                        JOptionPane.showMessageDialog(rootPane, "Registros ingresados correctamente.");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No existen registros para ingresar.");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    JOptionPane.showMessageDialog(rootPane, "Intenta ingresar un registro ya existente en la base de datos."
                            + " Presione el boton - Eliminar Datos - ");

                }
                model = new DefaultTableModel();
                datos.setModel(model);
                mostrar();
                return null;
            }
        };

        worker.execute();
    }//GEN-LAST:event_btnGuardarProdActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Fproducto funcion = new Fproducto();
        if (funcion.eliminar()) {
            JOptionPane.showMessageDialog(rootPane, "Se eliminaron todos los datos Importados. ");
          lblMostrarCant.setText("");
            mostrar();

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(FrmProductoImportarMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProductoImportarMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProductoImportarMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProductoImportarMINI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProductoImportarMINI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarProd;
    private javax.swing.JButton btnImportarProd;
    private javax.swing.JTable datos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMostrarCant;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

}
