package Controlador;

import Datos.Dcliente;
import Funciones.Fcliente;

import java.awt.Component;

import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JTable;
//import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public final class FrmCliente extends javax.swing.JInternalFrame {

    public FrmCliente() {
        initComponents();
        inhabilitar();
        mostrar("");
       
      
        //   BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        //  bi.setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        //  jTabla.setBackground(new java.awt.Color(66,66,66));
        // jTabla.setForeground(new java.awt.Color(207,207,207));
        //  jTabla.setFont(new java.awt.Font("Arial",0 , 12));
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
    }

    public void inhabilitar() {

        txtCod_persona.setVisible(false);
        txtNombre_persona.setEditable(false);
        txtDireccion.setEditable(false);
        txtTelefono.setEditable(false);
        txtEmail.setEditable(false);
        txtRut.setEditable(false);
        txtBuscar.setEditable(false);

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
        txtBuscar.setText("");
    }

    public void habilitar() {

        txtNombre_persona.setEditable(true);
        txtDireccion.setEditable(true);
        txtTelefono.setEditable(true);
        txtEmail.setEditable(true);
        txtRut.setEditable(true);
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
        txtBuscar.setText("");
    }

    public void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fcliente funcion = new Fcliente();
            modelo = funcion.mostrar(buscar);
            jTabla.setModel(modelo);
            ocultar_columnas();

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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre_persona = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCod_persona = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(36, 33, 33));

        jTabla.setBackground(new java.awt.Color(36, 33, 33));
        jTabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTabla.setForeground(new java.awt.Color(207, 207, 207));
        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTabla.setOpaque(true);
        jTabla.setRowHeight(20);
        jTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTabla);

        jPanel3.setBackground(new java.awt.Color(36, 33, 33));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Telefono :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 207, 207));
        jLabel6.setText("Email :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Cedula :");

        txtRut.setBackground(new java.awt.Color(36, 33, 33));
        txtRut.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtRut.setForeground(new java.awt.Color(207, 207, 207));
        txtRut.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtRut.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRut.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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
        txtTelefono.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        txtDireccion.setBackground(new java.awt.Color(36, 33, 33));
        txtDireccion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(207, 207, 207));
        txtDireccion.setText(" ");
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtDireccion.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDireccion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 207, 207));
        jLabel3.setText("Direccion :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText(" Nombre :");

        txtNombre_persona.setBackground(new java.awt.Color(36, 33, 33));
        txtNombre_persona.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre_persona.setForeground(new java.awt.Color(207, 207, 207));
        txtNombre_persona.setText(" ");
        txtNombre_persona.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtNombre_persona.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre_persona.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/usuarioA.png"))); // NOI18N
        jLabel1.setText(" ");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/direccion.png"))); // NOI18N
        jLabel8.setText(" ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/email.png"))); // NOI18N
        jLabel10.setText(" ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/telefono.png"))); // NOI18N
        jLabel9.setText(" ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/identificacion.png"))); // NOI18N
        jLabel11.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombre_persona, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre_persona)
                    .addComponent(jLabel1))
                .addGap(18, 75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(18, 78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(18, 78, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(18, 74, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRut)
                    .addComponent(jLabel11))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(36, 33, 33));

        btnNuevo.setBackground(new java.awt.Color(36, 33, 33));
        btnNuevo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(224, 224, 224));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(36, 33, 33));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(224, 224, 224));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setActionCommand("");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(36, 33, 33));
        btnEditar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(224, 224, 224));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(36, 33, 33));

        jLabel20.setBackground(new java.awt.Color(224, 224, 224));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(207, 207, 207));
        jLabel20.setText("Nombre Cliente");

        txtBuscar.setBackground(new java.awt.Color(36, 33, 33));
        txtBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(207, 207, 207));
        txtBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtBuscar.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBuscar.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(36, 33, 33));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(36, 33, 33));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(224, 224, 224));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addGap(12, 12, 12)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscar)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 207, 207));
        jLabel4.setText("GESTION DE CLIENTES");

        txtCod_persona.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCod_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCod_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        if (txtTelefono.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Telefono");
            txtTelefono.requestFocus();
            return;
        }

        if (txtRut.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un N° de Cedula");
            txtRut.requestFocus();
            return;
        }

        Dcliente datos = new Dcliente();
        Fcliente funcion = new Fcliente();

        datos.setNombre_persona(txtNombre_persona.getText());
        datos.setDireccion(txtDireccion.getText());
        datos.setTelefono(txtTelefono.getText());
        datos.setEmail(txtEmail.getText());

        datos.setRut_cliente(txtRut.getText());

        datos.setCod_persona(Integer.parseInt(txtCod_persona.getText()));

        if (funcion.editar(datos)) {
            JOptionPane.showMessageDialog(null, "Cliente Modificado.");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "No se modifico el Cliente.");
            mostrar("");

        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
        txtNombre_persona.requestFocus();
        mostrar("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtNombre_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre.");
            txtNombre_persona.requestFocus();
            return;
        }

        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Direccion.");
            txtDireccion.requestFocus();
            return;
        }

        if (txtTelefono.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Telefono.");
            txtTelefono.requestFocus();
            return;
        }
        if (txtRut.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un N° de Cedula.");
            txtRut.requestFocus();
            return;
        }
        Dcliente datos = new Dcliente();
        Fcliente funcion = new Fcliente();

        datos.setNombre_persona(txtNombre_persona.getText());
        datos.setDireccion(txtDireccion.getText());
        datos.setTelefono(txtTelefono.getText());
        datos.setEmail(txtEmail.getText());
        datos.setRut_cliente(txtRut.getText());

        if (funcion.insertar(datos)) {
            JOptionPane.showMessageDialog(null, "Cliente registrado.");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "No se ingreso el Cliente.");
            mostrar("");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        txtTelefono.transferFocus();
    }//GEN-LAST:event_txtTelefonoActionPerformed

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
    }//GEN-LAST:event_jTablaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtCod_persona.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Cliente a eliminar");
            return;
        }
        int codigoPersona = Integer.parseInt(txtCod_persona.getText());
        String nombreCliente = txtNombre_persona.getText();
        //codigoPersona == 2
        if (nombreCliente.equalsIgnoreCase("Cliente General")) {

            JOptionPane.showMessageDialog(null, "No puede eliminar este Cliente del sistema.");
            return;
        }

        int i = JOptionPane.showConfirmDialog(this,
                "Si elimina el Cliente borrara todas las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion",
                JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            if (!txtCod_persona.getText().equals("")) {
                Fcliente funcion = new Fcliente();
                Dcliente datos = new Dcliente();
                datos.setCod_persona(Integer.parseInt(txtCod_persona.getText()));
                funcion.eliminar(datos);
                mostrar("");
                inhabilitar();
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el Cliente.");
            }
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombre_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre_personaActionPerformed
        txtNombre_persona.transferFocus();
    }//GEN-LAST:event_txtNombre_personaActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.transferFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtEmail.transferFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed


    }//GEN-LAST:event_txtRutActionPerformed

    private void txtNombre_personaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_personaKeyTyped
        /*char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }*/
    }//GEN-LAST:event_txtNombre_personaKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        /*char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            // JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }*/
    }//GEN-LAST:event_txtBuscarKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JTextField txtCod_persona;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre_persona;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
