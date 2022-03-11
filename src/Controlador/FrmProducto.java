package Controlador;

import static Controlador.FRMPRINCIPAL.MenuProductos;
import Datos.Dproducto;
import Funciones.Fproducto;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public final class FrmProducto extends javax.swing.JInternalFrame {

    private File file;
    private List<JTable> tabla;
    private List<String> nom_files;

    public FrmProducto() {
        initComponents();
        inhabilitar();
        mostrar("");

        //width a las columnas del jtable
        jTabla.getColumnModel().getColumn(1).setPreferredWidth(220);

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

    public FrmProducto(File file, List<JTable> tabla, List<String> nom_files)
            throws Exception {
        this.file = file;
        this.tabla = tabla;
        this.nom_files = nom_files;
        if (nom_files.size() != tabla.size()) {
            throw new Exception("Error");
        }

    }

    public boolean export() {
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));
            WritableWorkbook w = Workbook.createWorkbook(out);
            for (int index = 0; index < tabla.size(); index++) {
                JTable table = tabla.get(index);
                WritableSheet s = w.createSheet(nom_files.get(index), 0);
                for (int i = 0; i < table.getColumnCount(); i++) {
                    String NomCol = table.getColumnName(i);
                    s.addCell(new Label(i, 0, NomCol));

                    for (int j = 0; j < table.getRowCount(); j++) {
                        Object object = table.getValueAt(j, i);
                        s.addCell(new Label(i, j + 1, String.valueOf(object))); //lo pone en la fila 0+1
                    }
                }
            }
            w.write();
            w.close();
            out.close();
            return true;
        } catch (IOException | WriteException e) {
            System.out.println("Error al exportar a Excel:" + e.getMessage());
            return false;
        }
    }

    public void ocultar_columnas() {
        jTabla.getColumnModel().getColumn(0).setMaxWidth(0);
        jTabla.getColumnModel().getColumn(0).setMinWidth(0);
        jTabla.getColumnModel().getColumn(0).setPreferredWidth(0);

    }

    public void inhabilitar() {

        txtCod_producto.setEditable(false);
        txtNombre_producto.setEditable(false);
        txtDescripcion_producto.setEditable(false);
        txtPrecio.setEditable(false);
        txtPrecio_compra.setEditable(false);
        txtStock.setEditable(false);

        txtBuscar.setEditable(false);

        btnBuscar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
//        lblSalir.setEnabled(true);
        btnNuevo.setEnabled(true);

        txtUbicacion_bodega.setEnabled(false);

        txtCod_producto.setText("");
        txtNombre_producto.setText("");
        txtDescripcion_producto.setText("");
        txtPrecio.setText("");

        txtStock.setText("");
        txtBuscar.setText("");
        txtPrecio_compra.setText("");

        txtUbicacion_bodega.setText("");
    }

    public void habilitar() {
        txtPrecio_compra.setEditable(true);
        txtCod_producto.setEditable(true);
        txtNombre_producto.setEditable(true);
        txtDescripcion_producto.setEditable(true);
        txtPrecio.setEditable(true);
        txtStock.setEditable(true);
        txtBuscar.setEditable(true);
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnNuevo.setEnabled(false);
        txtCod_producto.setText("");
        txtNombre_producto.setText("");
        txtDescripcion_producto.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        txtBuscar.setText("");
        txtPrecio_compra.setText("");

        txtUbicacion_bodega.setText("");

        txtUbicacion_bodega.setEnabled(true);

    }

    public void mostrar(String buscar) {

        try {
            DefaultTableModel modelo;
            Fproducto funcion = new Fproducto();

            if (cboSelec.getSelectedItem() == "Codigo") {
                modelo = funcion.mostrarPorCodigo(buscar);
            } else {
                modelo = funcion.mostrar(buscar);
            }

            jTabla.setModel(modelo);
            // ocultar_columnas();
            //  lblTotalRegistros.setText("Cantidad de Registros : " + Integer.toString(funcion.totalRegistros));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        Fproducto funcion = new Fproducto();
        jComboBox1.removeAllItems();
        ArrayList<String> lista = new ArrayList<String>();
        lista = funcion.llenar_combo();
        for (int i = 0; i < lista.size(); i++) {
            jComboBox1.addItem(lista.get(i));
        }

    }

    public void mostrarExportar(String buscar) {
        try {
            DefaultTableModel modelo;
            Fproducto funcion = new Fproducto();

            if (cboSelec.getSelectedItem() == "Codigo") {
                modelo = funcion.mostrarPorCodigo(buscar);
            } else {
                modelo = funcion.mostrarExportar(buscar);
            }

            jTabla.setModel(modelo);
            // ocultar_columnas();
            //  lblTotalRegistros.setText("Cantidad de Registros : " + Integer.toString(funcion.totalRegistros));
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
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cboSelec = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboUnidad_producto = new javax.swing.JComboBox<>();
        txtDescripcion_producto = new javax.swing.JTextField();
        txtNombre_producto = new javax.swing.JTextField();
        txtCod_producto = new javax.swing.JTextField();
        txtPrecio_compra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUbicacion_bodega = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jLabel12.setText(" ");

        jPanel3.setBackground(new java.awt.Color(36, 33, 33));

        cboSelec.setBackground(new java.awt.Color(36, 33, 33));
        cboSelec.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboSelec.setForeground(new java.awt.Color(207, 207, 207));
        cboSelec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo" }));
        cboSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSelecActionPerformed(evt);
            }
        });

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
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(207, 207, 207));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/buscar.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(36, 33, 33));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(207, 207, 207));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(36, 33, 33));
        btnExportar.setForeground(new java.awt.Color(207, 207, 207));
        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(4, 4, 4)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(cboSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(36, 33, 33));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 207, 207));
        jLabel4.setText("Codigo :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText(" Nombre :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 207, 207));
        jLabel3.setText("Descripcion :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Unidad :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 207, 207));
        jLabel6.setText("Precio Venta :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(207, 207, 207));
        jLabel13.setText("precio Compra :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Stock :");

        txtStock.setBackground(new java.awt.Color(36, 33, 33));
        txtStock.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtStock.setForeground(new java.awt.Color(207, 207, 207));
        txtStock.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtStock.setCaretColor(new java.awt.Color(255, 255, 255));
        txtStock.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(36, 33, 33));
        txtPrecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(207, 207, 207));
        txtPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtPrecio.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        cboUnidad_producto.setBackground(new java.awt.Color(36, 33, 33));
        cboUnidad_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cboUnidad_producto.setForeground(new java.awt.Color(207, 207, 207));
        cboUnidad_producto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidad", " ", " " }));

        txtDescripcion_producto.setBackground(new java.awt.Color(36, 33, 33));
        txtDescripcion_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtDescripcion_producto.setForeground(new java.awt.Color(207, 207, 207));
        txtDescripcion_producto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtDescripcion_producto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDescripcion_producto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtNombre_producto.setBackground(new java.awt.Color(36, 33, 33));
        txtNombre_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombre_producto.setForeground(new java.awt.Color(207, 207, 207));
        txtNombre_producto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtNombre_producto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre_producto.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtCod_producto.setBackground(new java.awt.Color(36, 33, 33));
        txtCod_producto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtCod_producto.setForeground(new java.awt.Color(207, 207, 207));
        txtCod_producto.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtCod_producto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCod_producto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCod_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCod_productoKeyTyped(evt);
            }
        });

        txtPrecio_compra.setBackground(new java.awt.Color(36, 33, 33));
        txtPrecio_compra.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtPrecio_compra.setForeground(new java.awt.Color(207, 207, 207));
        txtPrecio_compra.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtPrecio_compra.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPrecio_compra.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPrecio_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecio_compraKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(207, 207, 207));
        jLabel9.setText("Bodega :");

        txtUbicacion_bodega.setBackground(new java.awt.Color(36, 33, 33));
        txtUbicacion_bodega.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtUbicacion_bodega.setForeground(new java.awt.Color(207, 207, 207));
        txtUbicacion_bodega.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtUbicacion_bodega.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUbicacion_bodega.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUbicacion_bodega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacion_bodegaKeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 207, 207));
        jLabel11.setText("Categoria :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStock, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrecio_compra)
                    .addComponent(txtUbicacion_bodega, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCod_producto)
                    .addComponent(txtDescripcion_producto)
                    .addComponent(txtPrecio)
                    .addComponent(txtNombre_producto)
                    .addComponent(cboUnidad_producto, 0, 514, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 514, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDescripcion_producto))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cboUnidad_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecio_compra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUbicacion_bodega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(36, 33, 33));

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

        btnGuardar.setBackground(new java.awt.Color(36, 33, 33));
        btnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(207, 207, 207));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                btnGuardarComponentResized(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(207, 207, 207));
        jLabel10.setText("Panel de Gestion de Productos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE))
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
        /* PASAMOS TXT A DATOS*/

        Dproducto datos = new Dproducto();
        Fproducto funcion = new Fproducto();
        datos.setCod_producto((txtCod_producto.getText()));
        datos.setNombre_producto(txtNombre_producto.getText());
        datos.setDescripcion_producto(txtDescripcion_producto.getText());

        datos.setStock_producto(Integer.parseInt(txtStock.getText()));

      
        datos.setPrecio_producto(Long.valueOf(txtPrecio.getText()));
        
         datos.setPrecio_compra(Long.valueOf(txtPrecio_compra.getText()));
        
       
        int unidad = cboUnidad_producto.getSelectedIndex();
        datos.setUnidad_producto((String) cboUnidad_producto.getItemAt(unidad));

        datos.setUbicacion_bodega(txtUbicacion_bodega.getText());

        int categoria = jComboBox1.getSelectedIndex();
        String categoria2 = ((String) jComboBox1.getItemAt(categoria));

        if (funcion.editar(datos, categoria2)) {
            JOptionPane.showMessageDialog(null, "Producto Editado.");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "Producto no Editado.");
            mostrar("");

        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        /*PARTE VALIDACION DE CAMPOS*/
        if (txtCod_producto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Codigo.");
            txtCod_producto.requestFocus();
            return;
        }

        if (txtNombre_producto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre.");
            txtNombre_producto.requestFocus();
            return;
        }

        if (txtDescripcion_producto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Descripcion.");
            txtDescripcion_producto.requestFocus();
            return;
        }

        if (txtPrecio.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Precio de venta.");
            txtPrecio.requestFocus();
            return;
        }

        if (txtStock.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una cantidad de Stock.");
            txtStock.requestFocus();
            return;
        }

        if (txtPrecio_compra.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Precio de compra");
            txtPrecio_compra.requestFocus();
            return;
        }

        if (jComboBox1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "DEBES IR A CATEGORIAS EN EL MENU E INGRESAR UNA");
            MenuProductos.requestFocus();
            this.dispose();
            return;
        }
        
        Dproducto datos = new Dproducto();
        Fproducto funcion = new Fproducto();

        String verificarCodigo = (txtCod_producto.getText());
        String cod_producto = funcion.productoIgual(verificarCodigo);

        if (cod_producto.equals (verificarCodigo)) {
            JOptionPane.showMessageDialog(null, "YA EXISTE UN PRODUCTO CON EL MISMO CODIGO");
            txtCod_producto.requestFocus();
            return;
        }

        datos.setCod_producto(txtCod_producto.getText());
        datos.setNombre_producto(txtNombre_producto.getText());
        datos.setDescripcion_producto(txtDescripcion_producto.getText());
        datos.setStock_producto(Integer.parseInt(txtStock.getText()));

        datos.setPrecio_producto(Long.valueOf(txtPrecio.getText()));
        datos.setPrecio_compra(Long.valueOf(txtPrecio_compra.getText()));
      
        int unidad = cboUnidad_producto.getSelectedIndex();
        datos.setUnidad_producto((String) cboUnidad_producto.getItemAt(unidad));

        datos.setUbicacion_bodega(txtUbicacion_bodega.getText());

        int categoria = jComboBox1.getSelectedIndex();
        String categoria2 = ((String) jComboBox1.getItemAt(categoria));

        if (funcion.insertar(datos, categoria2)) {
            JOptionPane.showMessageDialog(null, "Producto Ingresado.");
            mostrar("");
            inhabilitar();
        } else {
            JOptionPane.showMessageDialog(null, "Producto no Ingresado.");
            mostrar("");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMouseClicked

        habilitar();
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnNuevo.setEnabled(true);
        txtCod_producto.setEditable(false);

        int fila = jTabla.rowAtPoint(evt.getPoint());

        txtCod_producto.setText(jTabla.getValueAt(fila, 0).toString());
        txtNombre_producto.setText(jTabla.getValueAt(fila, 1).toString());
        txtDescripcion_producto.setText(jTabla.getValueAt(fila, 2).toString());
        cboUnidad_producto.setSelectedItem(jTabla.getValueAt(fila, 3).toString());
        txtPrecio.setText(jTabla.getValueAt(fila, 4).toString());
        txtStock.setText(jTabla.getValueAt(fila, 5).toString());
        txtPrecio_compra.setText(jTabla.getValueAt(fila, 6).toString());
        txtUbicacion_bodega.setText(jTabla.getValueAt(fila, 7).toString());
        jComboBox1.setSelectedItem(jTabla.getValueAt(fila, 8).toString());


    }//GEN-LAST:event_jTablaMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        mostrar(txtBuscar.getText());
        cboSelec.setSelectedIndex(0);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (txtCod_producto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
            return;
        }
        int i = JOptionPane.showConfirmDialog(this, "Si elimina el Producto lo borrara de las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            if (!txtCod_producto.getText().equals("")) {
                Fproducto funcion = new Fproducto();
                Dproducto datos = new Dproducto();
                datos.setCod_producto((txtCod_producto.getText()));
                funcion.eliminar(datos);
                mostrar("");
                inhabilitar();
            } else { 

                JOptionPane.showMessageDialog(null, "No se elimino el producto.");
            }

        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        if (cboSelec.getSelectedItem() == "Codigo") {

            char c = evt.getKeyChar();
            if (Character.isLetter(c)) {
                getToolkit().beep();
                evt.consume();
            }

        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void cboSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSelecActionPerformed
        if (cboSelec.getSelectedItem() == "Nombre") {

            txtBuscar.setText("");
        } else {
            txtBuscar.setText("");
        }
    }//GEN-LAST:event_cboSelecActionPerformed

    private void txtPrecio_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio_compraKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecio_compraKeyTyped

    private void txtCod_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCod_productoKeyTyped
//        char c = evt.getKeyChar();
//        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_txtCod_productoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtStockKeyTyped

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed

        if (jTabla.getRowCount() > 0) {
            mostrarExportar(txtBuscar.getText());
            cboSelec.setSelectedIndex(0);
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<JTable>();

                List<String> nom = new ArrayList<String>();
                tb.add(jTabla);
                nom.add("Productos");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    FrmProducto e = new FrmProducto(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay datos para exportar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
        mostrar(txtBuscar.getText());
    }//GEN-LAST:event_btnExportarActionPerformed

    private void txtUbicacion_bodegaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacion_bodegaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacion_bodegaKeyTyped

    private void btnGuardarComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_btnGuardarComponentResized
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarComponentResized

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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboSelec;
    private javax.swing.JComboBox<String> cboUnidad_producto;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCod_producto;
    private javax.swing.JTextField txtDescripcion_producto;
    private javax.swing.JTextField txtNombre_producto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio_compra;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtUbicacion_bodega;
    // End of variables declaration//GEN-END:variables
}
