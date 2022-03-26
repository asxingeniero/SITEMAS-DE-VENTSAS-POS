package Controlador;

import static Controlador.rptVentasFechas.comprobar;
import ControladorMINI.FrmPrincipalMINI;
import Funciones.conexion;
import Reportes.ReportHistorial;
import Reportes.frmStockCritico;
import java.awt.Graphics;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.plaf.basic.BasicMenuBarUI;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class FRMPRINCIPAL extends javax.swing.JFrame {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    public FRMPRINCIPAL() {
        initComponents();
        // jmIVenta.setMnemonic(KeyEvent.VK_V);
        this.setLocationRelativeTo(null);
        lblCod_persona.setVisible(false);
        this.setExtendedState(MAXIMIZED_BOTH);
        menuBar.setOpaque(true);
        menuBar.setUI(new BasicMenuBarUI() {
            public void paint(Graphics g, JComponent c) {
                g.setColor(new java.awt.Color(36, 33, 33));
                g.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
        });
        deskPricipal.setUI(new BasicDesktopPaneUI() {
            public void paintComponent(Graphics g) {
                g.setColor(new java.awt.Color(36, 33, 33));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        });
        //jmIVentas.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    public void abrirVenta() {

        FrmVentaDetalle form = new FrmVentaDetalle();
        deskPricipal.add(form);

        //   form.setMaximizable(true);
        form.setClosable(true);
        form.setIconifiable(true);
        FrmVentaDetalle.txtCod_usuario.setText(lblCod_persona.getText());
        FrmVentaDetalle.txtNombre_usuario.setText(lblNombre_persona.getText());
        try {
            form.setMaximum(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRORasx ");
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPricipal = new javax.swing.JDesktopPane();
        lblCod_persona = new javax.swing.JLabel();
        lblNombre_persona = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jmIVenta = new javax.swing.JMenu();
        jmIVentas = new javax.swing.JMenuItem();
        MenuPersonal = new javax.swing.JMenu();
        JmIClientes = new javax.swing.JMenuItem();
        jMproveedores = new javax.swing.JMenuItem();
        JmIUsuarios = new javax.swing.JMenuItem();
        MenuProductos = new javax.swing.JMenu();
        JmIProductos = new javax.swing.JMenuItem();
        JmIStock = new javax.swing.JMenuItem();
        JmIStock1 = new javax.swing.JMenuItem();
        MenuInformes = new javax.swing.JMenu();
        JmIStockCritico = new javax.swing.JMenuItem();
        JmIVentasPorFecha = new javax.swing.JMenuItem();
        JmIProdVendFEc = new javax.swing.JMenuItem();
        JmITotalRecaudacion = new javax.swing.JMenuItem();
        JmIVentasPorCategorias = new javax.swing.JMenuItem();
        JmIHistorial = new javax.swing.JMenuItem();
        JmiHerramientas = new javax.swing.JMenu();
        JmIControlInv = new javax.swing.JMenuItem();
        JmIControlVentas = new javax.swing.JMenuItem();
        JmIDatosEmpresa = new javax.swing.JMenuItem();
        JmIAbrirCaja = new javax.swing.JMenuItem();
        JmICerrarCaja = new javax.swing.JMenuItem();
        jMIAyuda = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(36, 33, 33));
        setIconImage( new ImageIcon(getClass().getResource("/ImanegesMenuBar/LOGO.png")).getImage());

        deskPricipal.setBackground(new java.awt.Color(36, 33, 33));
        deskPricipal.setToolTipText("");
        deskPricipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deskPricipal.setOpaque(true
        );

        lblCod_persona.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblCod_persona.setForeground(new java.awt.Color(207, 207, 207));
        lblCod_persona.setText("CODIGO");
        deskPricipal.add(lblCod_persona);
        lblCod_persona.setBounds(30, 20, 170, 15);

        lblNombre_persona.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblNombre_persona.setForeground(new java.awt.Color(207, 207, 207));
        lblNombre_persona.setText("NOMBRE");
        deskPricipal.add(lblNombre_persona);
        lblNombre_persona.setBounds(30, 50, 170, 15);

        lblAcceso.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(207, 207, 207));
        lblAcceso.setText("ACCESO");
        deskPricipal.add(lblAcceso);
        lblAcceso.setBounds(30, 80, 170, 10);

        menuBar.setBackground(new java.awt.Color(36, 33, 33));
        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuBar.setToolTipText("");
        menuBar.setAlignmentX(0.2F);
        menuBar.setAlignmentY(0.2F);
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuBar.setOpaque(true);

        jmIVenta.setBackground(new java.awt.Color(36, 33, 33));
        jmIVenta.setForeground(new java.awt.Color(245, 245, 245));
        jmIVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/ventaMenu.png"))); // NOI18N
        jmIVenta.setText("Venta");
        jmIVenta.setToolTipText("");
        jmIVenta.setAlignmentX(0.0F);
        jmIVenta.setAlignmentY(0.0F);
        jmIVenta.setBorderPainted(true);
        jmIVenta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jmIVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmIVenta.setOpaque(true
        );

        jmIVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmIVentas.setBackground(new java.awt.Color(36, 33, 33));
        jmIVentas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jmIVentas.setForeground(new java.awt.Color(255, 255, 255));
        jmIVentas.setText("Venta");
        jmIVentas.setOpaque(true);
        jmIVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmIVentasActionPerformed(evt);
            }
        });
        jmIVenta.add(jmIVentas);

        menuBar.add(jmIVenta);

        MenuPersonal.setBackground(new java.awt.Color(36, 33, 33));
        MenuPersonal.setForeground(new java.awt.Color(245, 245, 245));
        MenuPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/usuarioMenu.png"))); // NOI18N
        MenuPersonal.setText("Personal");
        MenuPersonal.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MenuPersonal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPersonal.setOpaque(true);

        JmIClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        JmIClientes.setBackground(new java.awt.Color(36, 33, 33));
        JmIClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIClientes.setForeground(new java.awt.Color(255, 255, 255));
        JmIClientes.setText("Clientes");
        JmIClientes.setOpaque(true);
        JmIClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIClientesActionPerformed(evt);
            }
        });
        MenuPersonal.add(JmIClientes);

        jMproveedores.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMproveedores.setBackground(new java.awt.Color(36, 33, 33));
        jMproveedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMproveedores.setForeground(new java.awt.Color(255, 255, 255));
        jMproveedores.setText("Proveedores");
        MenuPersonal.add(jMproveedores);

        JmIUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        JmIUsuarios.setBackground(new java.awt.Color(36, 33, 33));
        JmIUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        JmIUsuarios.setText("Usuarios");
        JmIUsuarios.setOpaque(true);
        JmIUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIUsuariosActionPerformed(evt);
            }
        });
        MenuPersonal.add(JmIUsuarios);

        menuBar.add(MenuPersonal);

        MenuProductos.setBackground(new java.awt.Color(36, 33, 33));
        MenuProductos.setForeground(new java.awt.Color(245, 245, 245));
        MenuProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/codigoMenu.png"))); // NOI18N
        MenuProductos.setText("Productos");
        MenuProductos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MenuProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuProductos.setOpaque(true);
        MenuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuProductosMouseClicked(evt);
            }
        });
        MenuProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductosActionPerformed(evt);
            }
        });

        JmIProductos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        JmIProductos.setBackground(new java.awt.Color(36, 33, 33));
        JmIProductos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIProductos.setForeground(new java.awt.Color(255, 255, 255));
        JmIProductos.setText("Productos");
        JmIProductos.setOpaque(true);
        JmIProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmIProductosMouseClicked(evt);
            }
        });
        JmIProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIProductosActionPerformed(evt);
            }
        });
        MenuProductos.add(JmIProductos);

        JmIStock.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        JmIStock.setBackground(new java.awt.Color(36, 33, 33));
        JmIStock.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIStock.setForeground(new java.awt.Color(255, 255, 255));
        JmIStock.setText("Modificar Stock");
        JmIStock.setOpaque(true);
        JmIStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmIStockMouseClicked(evt);
            }
        });
        JmIStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIStockActionPerformed(evt);
            }
        });
        MenuProductos.add(JmIStock);

        JmIStock1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        JmIStock1.setBackground(new java.awt.Color(36, 33, 33));
        JmIStock1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIStock1.setForeground(new java.awt.Color(255, 255, 255));
        JmIStock1.setText("Categorias");
        JmIStock1.setOpaque(true);
        JmIStock1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmIStock1MouseClicked(evt);
            }
        });
        JmIStock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIStock1ActionPerformed(evt);
            }
        });
        MenuProductos.add(JmIStock1);

        menuBar.add(MenuProductos);

        MenuInformes.setBackground(new java.awt.Color(36, 33, 33));
        MenuInformes.setForeground(new java.awt.Color(245, 245, 245));
        MenuInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/reporteMenu.png"))); // NOI18N
        MenuInformes.setText("Informes");
        MenuInformes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        MenuInformes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuInformes.setOpaque(true);

        JmIStockCritico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK));
        JmIStockCritico.setBackground(new java.awt.Color(36, 33, 33));
        JmIStockCritico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIStockCritico.setForeground(new java.awt.Color(255, 255, 255));
        JmIStockCritico.setText("Stock de productos");
        JmIStockCritico.setOpaque(true);
        JmIStockCritico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIStockCriticoActionPerformed(evt);
            }
        });
        MenuInformes.add(JmIStockCritico);

        JmIVentasPorFecha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK));
        JmIVentasPorFecha.setBackground(new java.awt.Color(36, 33, 33));
        JmIVentasPorFecha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIVentasPorFecha.setForeground(new java.awt.Color(255, 255, 255));
        JmIVentasPorFecha.setText("Ventas por Fecha");
        JmIVentasPorFecha.setOpaque(true);
        JmIVentasPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIVentasPorFechaActionPerformed(evt);
            }
        });
        MenuInformes.add(JmIVentasPorFecha);

        JmIProdVendFEc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK));
        JmIProdVendFEc.setBackground(new java.awt.Color(36, 33, 33));
        JmIProdVendFEc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIProdVendFEc.setForeground(new java.awt.Color(255, 255, 255));
        JmIProdVendFEc.setText("Ventas de productos por Fecha");
        JmIProdVendFEc.setOpaque(true);
        JmIProdVendFEc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIProdVendFEcActionPerformed(evt);
            }
        });
        MenuInformes.add(JmIProdVendFEc);

        JmITotalRecaudacion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK));
        JmITotalRecaudacion.setBackground(new java.awt.Color(36, 33, 33));
        JmITotalRecaudacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmITotalRecaudacion.setForeground(new java.awt.Color(255, 255, 255));
        JmITotalRecaudacion.setText("Total Recaudacion con detalle de productos ");
        JmITotalRecaudacion.setOpaque(true);
        JmITotalRecaudacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmITotalRecaudacionActionPerformed(evt);
            }
        });
        MenuInformes.add(JmITotalRecaudacion);

        JmIVentasPorCategorias.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_MASK));
        JmIVentasPorCategorias.setBackground(new java.awt.Color(36, 33, 33));
        JmIVentasPorCategorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIVentasPorCategorias.setForeground(new java.awt.Color(255, 255, 255));
        JmIVentasPorCategorias.setText("Total Recaudacion por Categorias");
        JmIVentasPorCategorias.setOpaque(true);
        JmIVentasPorCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIVentasPorCategoriasActionPerformed(evt);
            }
        });
        MenuInformes.add(JmIVentasPorCategorias);

        JmIHistorial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.SHIFT_MASK));
        JmIHistorial.setBackground(new java.awt.Color(36, 33, 33));
        JmIHistorial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIHistorial.setForeground(new java.awt.Color(255, 255, 255));
        JmIHistorial.setText("Historial de modificacion de Stock de productos");
        JmIHistorial.setOpaque(true);
        JmIHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIHistorialActionPerformed(evt);
            }
        });
        MenuInformes.add(JmIHistorial);

        menuBar.add(MenuInformes);

        JmiHerramientas.setBackground(new java.awt.Color(36, 33, 33));
        JmiHerramientas.setForeground(new java.awt.Color(245, 245, 245));
        JmiHerramientas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/toolsMenu.png"))); // NOI18N
        JmiHerramientas.setText("Herramientas");
        JmiHerramientas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        JmiHerramientas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JmiHerramientas.setOpaque(true);

        JmIControlInv.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        JmIControlInv.setBackground(new java.awt.Color(36, 33, 33));
        JmIControlInv.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIControlInv.setForeground(new java.awt.Color(255, 255, 255));
        JmIControlInv.setText("Herramientas de inventario");
        JmIControlInv.setOpaque(true);
        JmIControlInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIControlInvActionPerformed(evt);
            }
        });
        JmiHerramientas.add(JmIControlInv);

        JmIControlVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        JmIControlVentas.setBackground(new java.awt.Color(36, 33, 33));
        JmIControlVentas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIControlVentas.setForeground(new java.awt.Color(255, 255, 255));
        JmIControlVentas.setText("Herramientas de Venta");
        JmIControlVentas.setOpaque(true);
        JmIControlVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIControlVentasActionPerformed(evt);
            }
        });
        JmiHerramientas.add(JmIControlVentas);

        JmIDatosEmpresa.setBackground(new java.awt.Color(36, 33, 33));
        JmIDatosEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIDatosEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        JmIDatosEmpresa.setText("Datos Empresa para Boleta");
        JmIDatosEmpresa.setOpaque(true);
        JmIDatosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIDatosEmpresaActionPerformed(evt);
            }
        });
        JmiHerramientas.add(JmIDatosEmpresa);

        JmIAbrirCaja.setBackground(new java.awt.Color(36, 33, 33));
        JmIAbrirCaja.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmIAbrirCaja.setForeground(new java.awt.Color(255, 255, 255));
        JmIAbrirCaja.setText("Abrir Caja");
        JmIAbrirCaja.setOpaque(true);
        JmIAbrirCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmIAbrirCajaActionPerformed(evt);
            }
        });
        JmiHerramientas.add(JmIAbrirCaja);

        JmICerrarCaja.setBackground(new java.awt.Color(36, 33, 33));
        JmICerrarCaja.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        JmICerrarCaja.setForeground(new java.awt.Color(255, 255, 255));
        JmICerrarCaja.setText("Cerrar Caja");
        JmICerrarCaja.setOpaque(true);
        JmICerrarCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmICerrarCajaActionPerformed(evt);
            }
        });
        JmiHerramientas.add(JmICerrarCaja);

        menuBar.add(JmiHerramientas);

        jMIAyuda.setBackground(new java.awt.Color(36, 33, 33));
        jMIAyuda.setForeground(new java.awt.Color(245, 245, 245));
        jMIAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/ayuda.png"))); // NOI18N
        jMIAyuda.setText("Ayuda");
        jMIAyuda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMIAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMIAyudaMouseClicked(evt);
            }
        });
        menuBar.add(jMIAyuda);

        jMenu5.setBackground(new java.awt.Color(36, 33, 33));
        jMenu5.setForeground(new java.awt.Color(245, 245, 245));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImanegesMenuBar/exitMenu.png"))); // NOI18N
        jMenu5.setText("Salir");
        jMenu5.setAutoscrolls(true);
        jMenu5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setOpaque(true);
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, deskPricipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, deskPricipal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductosActionPerformed

    }//GEN-LAST:event_MenuProductosActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void MenuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuProductosMouseClicked

    }//GEN-LAST:event_MenuProductosMouseClicked

    private void JmIStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIStockActionPerformed
        FrmStock form = new FrmStock();
        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);
        try {
            form.setMaximum(true);
        } catch (Exception e) {
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_JmIStockActionPerformed

    private void JmIProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmIProductosMouseClicked

    }//GEN-LAST:event_JmIProductosMouseClicked

    private void JmIStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmIStockMouseClicked

    }//GEN-LAST:event_JmIStockMouseClicked

    private void JmIProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIProductosActionPerformed
        FrmProducto form = new FrmProducto();
        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);
        try {
            form.setMaximum(true);
        } catch (Exception e) {
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_JmIProductosActionPerformed

    private void JmIClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIClientesActionPerformed
        FrmCliente form = new FrmCliente();
        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);
        try {
            form.setMaximum(true);
        } catch (Exception e) {
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);

    }//GEN-LAST:event_JmIClientesActionPerformed

    private void JmIUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIUsuariosActionPerformed
        FrmUsuario form = new FrmUsuario();
        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);
        try {
            form.setMaximum(true);
        } catch (Exception e) {
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_JmIUsuariosActionPerformed

    private void JmIControlVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIControlVentasActionPerformed

        FrmMostrarVentas form = new FrmMostrarVentas();
        deskPricipal.add(form);

        try {
            form.setMaximum(true);
            form.setClosable(true);
            form.setIconifiable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ");
        }

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmIControlVentasActionPerformed

    private void JmIStockCriticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIStockCriticoActionPerformed
        java.util.Locale locale = new Locale("es", "CL");

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Stock minimo de los productos"));
        if (cantidad < 0) {

            JOptionPane.showMessageDialog(null, "Debe ingresar un valor mayor");
            return;
        }
        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(frmStockCritico.class.getResource("/Reportes/StockCritico.jasper"));
            Map parametro = new HashMap<String, Integer>();
            parametro.put("stock_producto", cantidad);
            parametro.put(JRParameter.REPORT_LOCALE, locale);

            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();

            // JasperPrintManager.printReport( jp, true);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }


    }//GEN-LAST:event_JmIStockCriticoActionPerformed

    private void JmIVentasPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIVentasPorFechaActionPerformed
        rptVentasFechas form = new rptVentasFechas();
        deskPricipal.add(form);

        //   form.setMaximizable(true);
        try {
            form.setMaximum(false);
            form.setClosable(true);
            form.setIconifiable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ");
        }

        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        form.toFront();
        form.setVisible(true);
        comprobar = 2;
    }//GEN-LAST:event_JmIVentasPorFechaActionPerformed

    private void JmIProdVendFEcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIProdVendFEcActionPerformed

        rptVentasFechas form = new rptVentasFechas();
        deskPricipal.add(form);

        //   form.setMaximizable(true);
        try {
            form.setMaximum(false);
            form.setClosable(true);
            form.setIconifiable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ");
        }
        this.setLocationRelativeTo(null);
        form.toFront();
        form.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);

        comprobar = 1;


    }//GEN-LAST:event_JmIProdVendFEcActionPerformed

    private void JmITotalRecaudacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmITotalRecaudacionActionPerformed
        rptTotalRecaudacion form = new rptTotalRecaudacion();
        deskPricipal.add(form);

        try {
            form.setMaximum(false);
            form.setClosable(true);
            form.setIconifiable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ");
        }
        this.setLocationRelativeTo(null);
        form.toFront();
        form.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmITotalRecaudacionActionPerformed

    private void jmIVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmIVentasActionPerformed
        abrirVenta();
    }//GEN-LAST:event_jmIVentasActionPerformed

    private void jMIAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMIAyudaMouseClicked
        JOptionPane.showMessageDialog(rootPane, "ATAJOS DE TECLADO\n"
                + "MENU\n"
                + "F1 = abrir formulario Venta\n"
                + "F3 = clientes\n"
                + "F4 = usuarios\n"
                + "F6 = producto\n"
                + "F7 = stock producto\n"
                + "F8 = Herramientas de venta\n"
                + "F10 = categorias\n"
                + "\n"
                + "INFORMES\n"
                + "Shift + 1 = Stock producto\n"
                + "Shift + 2 = Ventas por fecha\n"
                + "Shift + 3 = venta de productos por fecha\n"
                + "Shift + 5 = total recaudacion\n"
                + "\n"
                + "ATAJOS PARA FORMULARIO VENTA.\n"
                + "ALT + x = ejecuta boton iniciar\n"
                + "ALT + n = ejecuta boton Nuevo\n"
                + "ALT + c = ejecuta boton Calcular\n"
                + "ALT + A = ejecuta boton Agregar\n"
                + "\n"
                + "FOCO EN CAJAS DE TEXTO FORMULARIO VENTA.\n"
                + "ALT + u = foco en descuento\n"
                + "ALT + i = foco en Importe\n"
                + "ALT + o = foco en Cantidad Producto\n"
                + "ALT + p = foco en Codigo Producto\"\n"
                + "ALT + y = foco en Modo producto (x unidad , x mayor)"
        );
    }//GEN-LAST:event_jMIAyudaMouseClicked

    private void JmIStock1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmIStock1MouseClicked
    }//GEN-LAST:event_JmIStock1MouseClicked

    private void JmIStock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIStock1ActionPerformed
        FrmCategoria form = new FrmCategoria();
        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);

        form.setMaximizable(false);
        form.setResizable(false);

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_JmIStock1ActionPerformed

    private void JmIControlInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIControlInvActionPerformed

        FrmPrincipalMINI form = new FrmPrincipalMINI();

        this.setLocationRelativeTo(null);
        form.toFront();
        form.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);

    }//GEN-LAST:event_JmIControlInvActionPerformed

    private void JmIVentasPorCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIVentasPorCategoriasActionPerformed

        rptVentasPorCategorias form = new rptVentasPorCategorias();

        deskPricipal.add(form);

        try {
            form.setMaximum(false);
            form.setClosable(true);
            form.setIconifiable(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR ");
        }
        this.setLocationRelativeTo(null);
        form.toFront();
        form.setVisible(true);
        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmIVentasPorCategoriasActionPerformed

    private void JmIHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIHistorialActionPerformed

        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(ReportHistorial.class.getResource("/Reportes/RptHistorial.jasper"));

            JasperPrint jp = JasperFillManager.fillReport(jr, null, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();

            //  JasperPrintManager.printReport(jp, true);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }


    }//GEN-LAST:event_JmIHistorialActionPerformed

    private void JmIDatosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIDatosEmpresaActionPerformed
        FrmEmpresa form = new FrmEmpresa();

        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);

        form.setMaximizable(false);
        form.setResizable(false);

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmIDatosEmpresaActionPerformed

    private void JmIAbrirCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmIAbrirCajaActionPerformed

        FrmApertura form = new FrmApertura();

        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);

        FrmApertura.lblCodUsuario.setText(lblCod_persona.getText());
        FrmApertura.txtNombreCajero.setText(lblNombre_persona.getText());
        form.setMaximizable(false);
        form.setResizable(false);

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmIAbrirCajaActionPerformed

    private void JmICerrarCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmICerrarCajaActionPerformed

        FrmCierre form = new FrmCierre();

        deskPricipal.add(form);

        form.setClosable(true);
        form.setIconifiable(true);

        FrmCierre.lblCodUsuario.setText(lblCod_persona.getText());
        FrmCierre.txtNombreCajero.setText(lblNombre_persona.getText());
        form.setMaximizable(false);
        form.setResizable(false);

        form.toFront();
        form.setVisible(true);
        this.setLocationRelativeTo(null);

        this.setExtendedState(MAXIMIZED_BOTH);


    }//GEN-LAST:event_JmICerrarCajaActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    //  UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRMPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMPRINCIPAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem JmIAbrirCaja;
    public static javax.swing.JMenuItem JmICerrarCaja;
    public static javax.swing.JMenuItem JmIClientes;
    public static javax.swing.JMenuItem JmIControlInv;
    public static javax.swing.JMenuItem JmIControlVentas;
    public static javax.swing.JMenuItem JmIDatosEmpresa;
    javax.swing.JMenuItem JmIHistorial;
    javax.swing.JMenuItem JmIProdVendFEc;
    javax.swing.JMenuItem JmIProductos;
    javax.swing.JMenuItem JmIStock;
    javax.swing.JMenuItem JmIStock1;
    javax.swing.JMenuItem JmIStockCritico;
    javax.swing.JMenuItem JmITotalRecaudacion;
    public static javax.swing.JMenuItem JmIUsuarios;
    javax.swing.JMenuItem JmIVentasPorCategorias;
    javax.swing.JMenuItem JmIVentasPorFecha;
    public static javax.swing.JMenu JmiHerramientas;
    public static javax.swing.JMenu MenuInformes;
    public static javax.swing.JMenu MenuPersonal;
    public static javax.swing.JMenu MenuProductos;
    public static javax.swing.JDesktopPane deskPricipal;
    javax.swing.JMenu jMIAyuda;
    public static javax.swing.JMenu jMenu5;
    javax.swing.JMenuItem jMproveedores;
    public static javax.swing.JMenu jmIVenta;
    javax.swing.JMenuItem jmIVentas;
    public static javax.swing.JLabel lblAcceso;
    public static javax.swing.JLabel lblCod_persona;
    public static javax.swing.JLabel lblNombre_persona;
    public static javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
