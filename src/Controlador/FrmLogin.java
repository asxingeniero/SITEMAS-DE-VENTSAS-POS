package Controlador;

import Datos.Dusuario;
import Funciones.Fusuario;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmLogin extends javax.swing.JFrame {

    public FrmLogin() {
        initComponents();

        ContarUsuarios();
        jScrollPane1.setVisible(false);
        this.setLocationRelativeTo(null);
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
              btnIngresarActionPerformed(null);
            }
         });
      }
    public void ContarUsuarios() {

        Fusuario funcion = new Fusuario();
        int cantidadUsuarios = funcion.ContarUsuarios();
        if (cantidadUsuarios == 0) {

            JOptionPane.showMessageDialog(rootPane, "DEBE CREAR EL ADMINISTRADOR DEL SISTEMA");
            FrmInstalacion form = new FrmInstalacion();
            form.setResizable(false);
            form.toFront();
            form.setVisible(true);
            form.setLocationRelativeTo(null);
        }//cierre
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtpassword = new javax.swing.JPasswordField();
        txtLogin = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));

        jPanel1.setBackground(new java.awt.Color(36, 33, 33));

        txtpassword.setBackground(new java.awt.Color(36, 33, 33));
        txtpassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(207, 207, 207));
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtpassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        txtLogin.setBackground(new java.awt.Color(36, 33, 33));
        txtLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(207, 207, 207));
        txtLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        btnIngresar.setBackground(new java.awt.Color(36, 33, 33));
        btnIngresar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(25, 118, 210));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresarKeyTyped(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(36, 33, 33));
        btnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(25, 118, 210));
        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/usuarioA.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/password.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnSalir))
                .addGap(30, 30, 30))
        );

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablalistado);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 118, 210));
        jLabel3.setText("Iniciar Sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        if (txtLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un UserName");
            txtLogin.requestFocus();
            return;
        }

        if (txtpassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una contraseña");
            txtpassword.requestFocus();
            return;
        }

        try {
            DefaultTableModel modelo;

            Fusuario func = new Fusuario();
            Dusuario dts = new Dusuario();

            dts.setLogin(txtLogin.getText());
            dts.setPassword(txtpassword.getText());

            modelo = func.login(dts.getLogin(), dts.getPassword());

            tablalistado.setModel(modelo);

            if (func.totalRegistros > 0) {
                this.dispose();
                FRMPRINCIPAL form = new FRMPRINCIPAL();
                form.toFront();
                form.setVisible(true);
                FRMPRINCIPAL.lblCod_persona.setText(tablalistado.getValueAt(0, 0).toString());
                FRMPRINCIPAL.lblNombre_persona.setText(tablalistado.getValueAt(0, 1).toString());
                FRMPRINCIPAL.lblAcceso.setText(tablalistado.getValueAt(0, 8).toString());

                FrmVentaDetalle form2 = new FrmVentaDetalle();
                FRMPRINCIPAL.deskPricipal.add(form2);
                try {
                    form2.toFront();
                    form2.setClosable(true);
                    form2.setIconifiable(true);
                    form2.setVisible(true);
                    this.setLocationRelativeTo(null);
                    FrmVentaDetalle.txtCod_usuario.setText(tablalistado.getValueAt(0, 0).toString());
                    FrmVentaDetalle.txtNombre_usuario.setText(tablalistado.getValueAt(0, 1).toString());
                    form2.setMaximum(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "ERROR " + e);
                }

                if (!FRMPRINCIPAL.lblAcceso.getText().equals("Administrador")) {
                    FRMPRINCIPAL.MenuPersonal.setEnabled(true);
                    FRMPRINCIPAL.MenuProductos.setEnabled(false);
                //    FRMPRINCIPAL.MenuCompras.setEnabled(false);
                    FRMPRINCIPAL.MenuInformes.setEnabled(false);
                    
                    FRMPRINCIPAL.JmIUsuarios.setEnabled(false);
//                    FRMPRINCIPAL.JmIProveedores.setEnabled(false);
                    FRMPRINCIPAL.JmIClientes.setEnabled(true);
                    
                    FRMPRINCIPAL.JmiHerramientas.setEnabled(true);
                    FRMPRINCIPAL.JmIAbrirCaja.setEnabled(true);
                    FRMPRINCIPAL.JmICerrarCaja.setEnabled(true);
                    
                    FRMPRINCIPAL.JmIDatosEmpresa.setEnabled(false);
                    FRMPRINCIPAL.JmIControlInv.setEnabled(false);
                    FRMPRINCIPAL.JmIControlVentas.setEnabled(true);
                    
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Datos incorrectos", "Acceso al Sistema", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e);
        }


    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        txtLogin.transferFocus();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        txtpassword.transferFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyTyped

    }//GEN-LAST:event_btnIngresarKeyTyped

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables

}
