package Controlador;

import Datos.Dusuario;
import Funciones.Fusuario;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class FrmUsuario extends javax.swing.JInternalFrame {

    public FrmUsuario() {
        initComponents();
        inhabilitar();
        mostrar("");

        txtContacto.setVisible(false);
        txtCel_contacto.setVisible(false);
        txtCorreo_contacto.setVisible(false);
        jLabel15.setVisible(false);
        jLabel13.setVisible(false);
        jLabel14.setVisible(false);

        //   BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        //   bi.setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        jTabla.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                //l.setBorder(new LineBorder(Color.black, 1));
                l.setBackground(new java.awt.Color(36, 33, 33));
                l.setForeground(new java.awt.Color(25, 118, 210));
                l.setFont(new java.awt.Font("Arial", 1, 12));
                return l;
            }
        });
    }

    public void ocultar_columnas() {
        jTabla.getColumnModel().getColumn(0).setMaxWidth(0);
        jTabla.getColumnModel().getColumn(0).setMinWidth(0);
        jTabla.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        

        
        jTabla.getColumnModel().getColumn(10).setMaxWidth(0);
        jTabla.getColumnModel().getColumn(10).setMinWidth(0);
        jTabla.getColumnModel().getColumn(10).setPreferredWidth(0);
        
        
        jTabla.getColumnModel().getColumn(11).setMaxWidth(0);
        jTabla.getColumnModel().getColumn(11).setMinWidth(0);
        jTabla.getColumnModel().getColumn(11).setPreferredWidth(0);
        
        jTabla.getColumnModel().getColumn(12).setMaxWidth(0);
        jTabla.getColumnModel().getColumn(12).setMinWidth(0);
        jTabla.getColumnModel().getColumn(12).setPreferredWidth(0);
    }

    public void inhabilitar() {

        txtCod_persona.setVisible(false);
        txtNombre_persona.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        txtEmail.setEditable(false);

        txtRut.setEditable(false);
        txtLogin.setEditable(false);
        txtPassword.setEditable(false);
        // cboEstado.setEditable(false);
        // cboAcceso.setEditable(false);

        txtBuscar.setEditable(false);

        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);

        txtCod_persona.setText("");
        txtNombre_persona.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");

        txtRut.setText("");
        txtLogin.setText("");
        txtPassword.setText("");
        txtBuscar.setText("");

    }

    public void habilitar() {

        txtNombre_persona.setEditable(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
        txtEmail.setEditable(true);

        txtRut.setEditable(true);
        txtLogin.setEditable(true);
        txtPassword.setEditable(true);
        //cboEstado.setEditable(true);
        //cboAcceso.setEditable(true);

        txtBuscar.setEditable(true);

        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(true);

        btnNuevo.setEnabled(false);

        txtCod_persona.setText("");
        txtNombre_persona.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");

        txtRut.setText("");
        txtLogin.setText("");
        txtPassword.setText("");
        txtBuscar.setText("");

    }

    public void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fusuario func = new Fusuario();
            modelo = func.mostrar(buscar);

            jTabla.setModel(modelo);
            ocultar_columnas();
            //lblTotalRegistros.setText("Total Registros " + Integer.toString(func.totalRegistros));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabla = jTabla = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cboAcceso = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtContacto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCel_contacto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCorreo_contacto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtCod_persona = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(828, 547));

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(822, 521));

        jPanel1.setBackground(new java.awt.Color(36, 33, 33));
        jPanel1.setPreferredSize(new java.awt.Dimension(822, 479));

        jTabla.setBackground(new java.awt.Color(36, 33, 33));
        jTabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabla.setForeground(new java.awt.Color(207, 207, 207));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jTabla.setRowHeight(20);
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jPanel3.setBackground(new java.awt.Color(36, 33, 33));
        jPanel3.setPreferredSize(new java.awt.Dimension(123, 194));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText(" Nombre :");

        txtNombre_persona.setBackground(new java.awt.Color(36, 33, 33));
        txtNombre_persona.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre_persona.setForeground(new java.awt.Color(207, 207, 207));
        txtNombre_persona.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtNombre_persona.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre_personaActionPerformed(evt);
            }
        });
        txtNombre_persona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_personaKeyTyped(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(36, 33, 33));
        txtDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(207, 207, 207));
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 207, 207));
        jLabel3.setText("Direccion :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Telefono :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 207, 207));
        jLabel6.setText("Email :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Cedula :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(207, 207, 207));
        jLabel8.setText("Login :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(207, 207, 207));
        jLabel9.setText("Password :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(207, 207, 207));
        jLabel10.setText("Estado :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 207, 207));
        jLabel11.setText("Acceso :");

        cboAcceso.setBackground(new java.awt.Color(36, 33, 33));
        cboAcceso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboAcceso.setForeground(new java.awt.Color(207, 207, 207));
        cboAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "UsuarioC" }));
        cboAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAccesoActionPerformed(evt);
            }
        });

        cboEstado.setBackground(new java.awt.Color(36, 33, 33));
        cboEstado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboEstado.setForeground(new java.awt.Color(207, 207, 207));
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(36, 33, 33));
        txtPassword.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(207, 207, 207));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
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

        txtRut.setBackground(new java.awt.Color(36, 33, 33));
        txtRut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRut.setForeground(new java.awt.Color(207, 207, 207));
        txtRut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtRut.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(36, 33, 33));
        txtEmail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(207, 207, 207));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtTelefono.setBackground(new java.awt.Color(36, 33, 33));
        txtTelefono.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(207, 207, 207));
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtTelefono.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/login.png"))); // NOI18N
        jLabel16.setText(" ");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/password.png"))); // NOI18N
        jLabel18.setText(" ");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/acceso.png"))); // NOI18N
        jLabel17.setText(" ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/usuarioA.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/direccion.png"))); // NOI18N
        jLabel21.setText(" ");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/telefono.png"))); // NOI18N
        jLabel22.setText(" ");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/email.png"))); // NOI18N
        jLabel23.setText(" ");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/identificacion.png"))); // NOI18N
        jLabel24.setText(" ");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/estado.png"))); // NOI18N
        jLabel25.setText(" ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(207, 207, 207));
        jLabel14.setText("Contacto :");

        txtContacto.setBackground(new java.awt.Color(36, 33, 33));
        txtContacto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtContacto.setForeground(new java.awt.Color(207, 207, 207));
        txtContacto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(207, 207, 207));
        jLabel13.setText("Celular C :");

        txtCel_contacto.setBackground(new java.awt.Color(36, 33, 33));
        txtCel_contacto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCel_contacto.setForeground(new java.awt.Color(207, 207, 207));
        txtCel_contacto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(207, 207, 207));
        jLabel15.setText("Correo C : ");

        txtCorreo_contacto.setBackground(new java.awt.Color(36, 33, 33));
        txtCorreo_contacto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCorreo_contacto.setForeground(new java.awt.Color(207, 207, 207));
        txtCorreo_contacto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)
                                .addComponent(jLabel14)
                                .addComponent(jLabel10)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre_persona)
                            .addComponent(txtDireccion)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRut, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboEstado, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboAcceso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtContacto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCel_contacto)
                            .addComponent(txtCorreo_contacto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel21))
                                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cboAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtCorreo_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(36, 33, 33));
        jPanel4.setPreferredSize(new java.awt.Dimension(317, 47));

        btnEditar.setBackground(new java.awt.Color(36, 33, 33));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(207, 207, 207));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(36, 33, 33));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(207, 207, 207));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(36, 33, 33));
        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(207, 207, 207));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(36, 33, 33));
        jPanel5.setPreferredSize(new java.awt.Dimension(317, 47));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(207, 207, 207));
        jLabel20.setText("Nombre del Usuario :");

        txtBuscar.setBackground(new java.awt.Color(36, 33, 33));
        txtBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(207, 207, 207));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(36, 33, 33));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(207, 207, 207));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(36, 33, 33));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(207, 207, 207));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtCod_persona.setText(" ");

        jLabel19.setBackground(new java.awt.Color(255, 87, 34));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(207, 207, 207));
        jLabel19.setText("Gestion de usuarios para el Sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(214, 214, 214)
                .addComponent(txtCod_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtCod_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un registro a eliminar");
            return;
        }

        int i = JOptionPane.showConfirmDialog(this,
                "Si Elimina el Usuario borrara todas las ventas realizadas por el ¿Desea Eliminar?", "Confirmar Salida",
                JOptionPane.YES_NO_OPTION);
        if (i == 0) {

            if (!txtCod_persona.getText().equals("")) {

                Fusuario funcion = new Fusuario();
                Dusuario datos = new Dusuario();

                datos.setCod_persona(Integer.parseInt(txtCod_persona.getText()));
                funcion.eliminar(datos);
                mostrar("");
                inhabilitar();

            } else {

                JOptionPane.showMessageDialog(null, "NO se ELIMINO");
            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            //  JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        txtNombre_persona.requestFocus();
        mostrar("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            txtNombre_persona.requestFocus();
            return;
        }

        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Direccion");
            txtDireccion.requestFocus();
            return;
        }

        if (txtRut.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un N° de Cedula");
            txtRut.requestFocus();
            return;
        }

        if (txtLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar Login");
            txtLogin.requestFocus();
            return;
        }

        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contraseña");
            txtPassword.requestFocus();
            return;
        }

        Dusuario datos = new Dusuario();
        Fusuario funcion = new Fusuario();
        int login = funcion.verificarLogin();
        if (login == 1) {
            JOptionPane.showMessageDialog(null, "Este Login : " + txtLogin.getText() + " ya esta ocupado por otro usuario.");
            txtLogin.setText("");
            txtLogin.requestFocus();
            return;

        }

        datos.setNombre_persona(txtNombre_persona.getText());
        datos.setDireccion(txtDireccion.getText());
        datos.setTelefono(txtTelefono.getText());
        datos.setEmail(txtEmail.getText());
        datos.setContacto(txtContacto.getText());
        datos.setCel_contacto(txtCel_contacto.getText());
        datos.setCorreo_contacto(txtCorreo_contacto.getText());

        datos.setRut_usuario(txtRut.getText());
        datos.setLogin(txtLogin.getText());
        datos.setPassword(txtPassword.getText());

        int estado = cboEstado.getSelectedIndex();
        datos.setEstado((String) cboEstado.getItemAt(estado));

        int acceso = cboAcceso.getSelectedIndex();
        datos.setAcceso((String) cboAcceso.getItemAt(acceso));

        if (funcion.insertar(datos)) {
            JOptionPane.showMessageDialog(null, "El trabajador fue ingresado al sistema");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "NO se ingresador Datos");
            mostrar("");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (txtNombre_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            txtNombre_persona.requestFocus();
            return;
        }

        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Direccion");
            txtDireccion.requestFocus();
            return;
        }

        if (txtRut.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un N° de Cedula");
            txtRut.requestFocus();
            return;
        }

        if (txtLogin.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar Login");
            txtLogin.requestFocus();
            return;
        }

        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contraseña");
            txtPassword.requestFocus();
            return;
        }

        Dusuario datos = new Dusuario();
        Fusuario funcion = new Fusuario();

        datos.setNombre_persona(txtNombre_persona.getText());
        datos.setDireccion(txtDireccion.getText());
        datos.setTelefono(txtTelefono.getText());
        datos.setEmail(txtEmail.getText());

        datos.setContacto(txtContacto.getText());
        datos.setCel_contacto(txtCel_contacto.getText());
        datos.setCorreo_contacto(txtCorreo_contacto.getText());

        datos.setRut_usuario(txtRut.getText());
        datos.setLogin(txtLogin.getText());
        datos.setPassword(txtPassword.getText());

        int estado = cboEstado.getSelectedIndex();
        datos.setEstado((String) cboEstado.getItemAt(estado));

        int acceso = cboAcceso.getSelectedIndex();
        datos.setAcceso((String) cboAcceso.getItemAt(acceso));

        datos.setCod_persona(Integer.parseInt(txtCod_persona.getText()));

        if (funcion.editar(datos)) {
            JOptionPane.showMessageDialog(null, "El trabajador fue EDITADO");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "NO se EDITARON Datos");
            mostrar("");

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        txtRut.transferFocus();
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        txtLogin.transferFocus();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        txtPassword.transferFocus();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        cboEstado.transferFocus();
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void cboAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAccesoActionPerformed

    }//GEN-LAST:event_cboAccesoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.transferFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombre_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_personaKeyTyped

        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }
    }//GEN-LAST:event_txtNombre_personaKeyTyped

    private void txtNombre_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_personaActionPerformed

    }//GEN-LAST:event_txtNombre_personaActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked

        habilitar();
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnNuevo.setEnabled(true);

        int fila = jTabla.rowAtPoint(evt.getPoint());

        txtCod_persona.setText(jTabla.getValueAt(fila, 0).toString());
        txtNombre_persona.setText(jTabla.getValueAt(fila, 1).toString());
        txtDireccion.setText(jTabla.getValueAt(fila, 2).toString());
        txtTelefono.setText(jTabla.getValueAt(fila, 3).toString());
        txtEmail.setText(jTabla.getValueAt(fila, 4).toString());

        txtRut.setText(jTabla.getValueAt(fila, 5).toString());
        txtLogin.setText(jTabla.getValueAt(fila, 6).toString());
        txtPassword.setText(jTabla.getValueAt(fila, 7).toString());

        cboEstado.setSelectedItem(jTabla.getValueAt(fila, 8).toString());
        cboAcceso.setSelectedItem(jTabla.getValueAt(fila, 9).toString());

        txtContacto.setText(jTabla.getValueAt(fila, 10).toString());
        txtCel_contacto.setText(jTabla.getValueAt(fila, 11).toString());
        txtCorreo_contacto.setText(jTabla.getValueAt(fila, 12).toString());

    }//GEN-LAST:event_jTablaMouseClicked

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
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboAcceso;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCel_contacto;
    private javax.swing.JTextField txtCod_persona;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtCorreo_contacto;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
