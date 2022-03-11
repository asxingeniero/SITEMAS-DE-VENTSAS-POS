package Controlador;

import Datos.Dcierre;
import Funciones.FcajaApertura;
import Funciones.FcajaCierre;
import Funciones.conexion;
import Reportes.ReportCaja;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public final class FrmCierre extends javax.swing.JInternalFrame {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    public FrmCierre() {
        initComponents();

        btnImprimirReporte.setEnabled(false);
        txtDiferencia.requestFocus();
        FcajaCierre funcion = new FcajaCierre();

        txtMontoDeVentas.setText(String.valueOf(funcion.ventasRealizadas()));
        txtMontoDeApertura.setText(String.valueOf(funcion.MontoInicialCaja()));

        txtMontoCierreEfectivo.setText(String.valueOf(funcion.MontoEfectivo()));
        txtMontoCredito.setText(String.valueOf(funcion.MontoCredito()));
        txtMontoCierreTarjeta.setText(String.valueOf(funcion.MontoTarjeta()));

        long montoDeVentas = 0;
        long montoCaja = 0;
        long montoFinal = 0;

        montoDeVentas = Long.parseLong(txtMontoDeVentas.getText());
        montoCaja = Long.parseLong(txtMontoDeApertura.getText());
        montoFinal = montoDeVentas + montoCaja;
        txtMontoFinal.setText(String.valueOf(montoFinal));

        txtMontoDeApertura.setEditable(false);
        txtMontoDeVentas.setEditable(false);
        txtMontoFinal.setEditable(false);
        Calendar c2 = new GregorianCalendar();
        dcFecha_cierre.setCalendar(c2);
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm:ss");
        txtHoraApertura.setText(formateador.format(ahora));
        txtHoraApertura.setVisible(false);
        lblCodUsuario.setVisible(false);
        txtNombreCajero.setEditable(false);
        txtHoraApertura.setEditable(false);
        dcFecha_cierre.setEnabled(false);

        if (funcion.VerificarFecha() > 0) {

            JOptionPane.showMessageDialog(null, "La caja ya se Cerro el dia de hoy.");
            btnGCalculo.setEnabled(false);
            btnImprimirReporte.setEnabled(true);
        } else {
            btnGCalculo.setEnabled(true);

        }

        FcajaApertura funcion2 = new FcajaApertura();
        if (funcion2.VerificarFecha() == 0) {
            JOptionPane.showMessageDialog(null, "Primero debe Abrir caja");
            btnGCalculo.setEnabled(false);
            btnImprimirReporte.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtMontoCierreEfectivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreCajero = new javax.swing.JTextField();
        dcFecha_cierre = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMontoCierreTarjeta = new javax.swing.JTextField();
        txtMontoCredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMontoFinal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMontoDeVentas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMontoDeApertura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiferencia = new javax.swing.JTextField();
        txtDineroFisico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnImprimirReporte = new javax.swing.JButton();
        btnGCalculo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblCodUsuario = new javax.swing.JLabel();
        txtHoraApertura = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(36, 33, 33));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(36, 33, 33));

        jPanel3.setBackground(new java.awt.Color(36, 33, 33));

        txtMontoCierreEfectivo.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoCierreEfectivo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMontoCierreEfectivo.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoCierreEfectivo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoCierreEfectivo.setText("0");
        txtMontoCierreEfectivo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoCierreEfectivo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoCierreEfectivo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoCierreEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoCierreEfectivoActionPerformed(evt);
            }
        });
        txtMontoCierreEfectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoCierreEfectivoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(207, 207, 207));
        jLabel3.setText("Efectivo  :");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(207, 207, 207));
        jLabel2.setText("Cajero :");

        txtNombreCajero.setBackground(new java.awt.Color(36, 33, 33));
        txtNombreCajero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtNombreCajero.setForeground(new java.awt.Color(207, 207, 207));
        txtNombreCajero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtNombreCajero.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombreCajero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNombreCajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCajeroActionPerformed(evt);
            }
        });
        txtNombreCajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCajeroKeyTyped(evt);
            }
        });

        dcFecha_cierre.setBackground(new java.awt.Color(36, 33, 33));
        dcFecha_cierre.setForeground(new java.awt.Color(207, 207, 207));
        dcFecha_cierre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(207, 207, 207));
        jLabel5.setText("Fecha :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(207, 207, 207));
        jLabel6.setText("Tarjetas  :");

        txtMontoCierreTarjeta.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoCierreTarjeta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMontoCierreTarjeta.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoCierreTarjeta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoCierreTarjeta.setText("0");
        txtMontoCierreTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoCierreTarjeta.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoCierreTarjeta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoCierreTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoCierreTarjetaActionPerformed(evt);
            }
        });
        txtMontoCierreTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoCierreTarjetaKeyTyped(evt);
            }
        });

        txtMontoCredito.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoCredito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMontoCredito.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoCredito.setText("0");
        txtMontoCredito.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoCredito.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoCredito.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoCreditoActionPerformed(evt);
            }
        });
        txtMontoCredito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoCreditoKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(207, 207, 207));
        jLabel7.setText("Credito  :");

        txtMontoFinal.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoFinal.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtMontoFinal.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoFinal.setText("0");
        txtMontoFinal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoFinal.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoFinal.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoFinalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(207, 207, 207));
        jLabel8.setText("total Ventas  :");

        txtMontoDeVentas.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoDeVentas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtMontoDeVentas.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoDeVentas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoDeVentas.setText("0");
        txtMontoDeVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoDeVentas.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoDeVentas.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoDeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoDeVentasActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(207, 207, 207));
        jLabel9.setText("Total Caja :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(207, 207, 207));
        jLabel11.setText("Saldo  Caja  :");

        txtMontoDeApertura.setBackground(new java.awt.Color(36, 33, 33));
        txtMontoDeApertura.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtMontoDeApertura.setForeground(new java.awt.Color(207, 207, 207));
        txtMontoDeApertura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMontoDeApertura.setText("0");
        txtMontoDeApertura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtMontoDeApertura.setCaretColor(new java.awt.Color(255, 255, 255));
        txtMontoDeApertura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMontoDeApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoDeAperturaActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(245, 245, 245));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(207, 207, 207));
        jLabel12.setText("DINERO FISICO EN CAJA ");

        txtDiferencia.setBackground(new java.awt.Color(36, 33, 33));
        txtDiferencia.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtDiferencia.setForeground(new java.awt.Color(207, 207, 207));
        txtDiferencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiferencia.setText("0");
        txtDiferencia.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtDiferencia.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDiferencia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDiferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiferenciaActionPerformed(evt);
            }
        });

        txtDineroFisico.setBackground(new java.awt.Color(36, 33, 33));
        txtDineroFisico.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtDineroFisico.setForeground(new java.awt.Color(207, 207, 207));
        txtDineroFisico.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDineroFisico.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtDineroFisico.setCaretColor(new java.awt.Color(255, 255, 255));
        txtDineroFisico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDineroFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDineroFisicoActionPerformed(evt);
            }
        });
        txtDineroFisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDineroFisicoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(207, 207, 207));
        jLabel13.setText("Diferencia  :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreCajero)
                    .addComponent(dcFecha_cierre, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMontoCierreEfectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(txtMontoCierreTarjeta)
                    .addComponent(txtMontoCredito))
                .addGap(37, 37, 37))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDiferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(txtMontoFinal)
                    .addComponent(txtMontoDeVentas)
                    .addComponent(txtMontoDeApertura))
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(238, 238, 238))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(173, 173, 173)
                    .addComponent(txtDineroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMontoCierreEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dcFecha_cierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtMontoCierreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMontoDeApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addComponent(txtMontoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoDeVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(377, Short.MAX_VALUE)
                    .addComponent(txtDineroFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );

        jPanel4.setBackground(new java.awt.Color(36, 33, 33));

        btnImprimirReporte.setBackground(new java.awt.Color(36, 33, 33));
        btnImprimirReporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnImprimirReporte.setForeground(new java.awt.Color(224, 224, 224));
        btnImprimirReporte.setText("imprimir Comprobante");
        btnImprimirReporte.setToolTipText("");
        btnImprimirReporte.setFocusable(false);
        btnImprimirReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirReporteActionPerformed(evt);
            }
        });

        btnGCalculo.setBackground(new java.awt.Color(36, 33, 33));
        btnGCalculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGCalculo.setForeground(new java.awt.Color(224, 224, 224));
        btnGCalculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesForm/guardar.png"))); // NOI18N
        btnGCalculo.setToolTipText("");
        btnGCalculo.setFocusable(false);
        btnGCalculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGCalculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(btnGCalculo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnImprimirReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnImprimirReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(207, 207, 207));
        jLabel4.setText("Cierre de Caja ");

        lblCodUsuario.setForeground(new java.awt.Color(255, 51, 51));
        lblCodUsuario.setText("jLabel1");

        txtHoraApertura.setBackground(new java.awt.Color(36, 33, 33));
        txtHoraApertura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtHoraApertura.setForeground(new java.awt.Color(207, 207, 207));
        txtHoraApertura.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(207, 207, 207)));
        txtHoraApertura.setCaretColor(new java.awt.Color(255, 255, 255));
        txtHoraApertura.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoraApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraAperturaActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(245, 245, 245));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(207, 207, 207));
        jLabel10.setText("Montos en el Sistema");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblCodUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(96, 96, 96))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblCodUsuario)
                    .addComponent(txtHoraApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void btnImprimirReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirReporteActionPerformed
        java.util.Locale locale = new Locale("es", "CL");
        
        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(ReportCaja.class.getResource("/Reportes/RptCierreCaja.jasper"));
            Map parametro = new HashMap<String, java.sql.Date>();
            
            
            parametro.put("fecha_cierre", dcFecha_cierre.getDate());
            parametro.put( JRParameter.REPORT_LOCALE, locale );

            JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.show();

            //  JasperPrintManager.printReport(jp, true);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error" + e);
        }

    }//GEN-LAST:event_btnImprimirReporteActionPerformed

    private void txtNombreCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCajeroActionPerformed

    }//GEN-LAST:event_txtNombreCajeroActionPerformed

    private void txtMontoCierreEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoCierreEfectivoActionPerformed
        txtMontoCierreEfectivo.transferFocus();
    }//GEN-LAST:event_txtMontoCierreEfectivoActionPerformed

    private void txtNombreCajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCajeroKeyTyped
        /*char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(null, "Ingrese solo letras");
        }*/
    }//GEN-LAST:event_txtNombreCajeroKeyTyped

    private void txtHoraAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraAperturaActionPerformed

    private void txtMontoCierreTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoCierreTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoCierreTarjetaActionPerformed

    private void txtMontoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoCreditoActionPerformed

    private void txtMontoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoFinalActionPerformed

    private void txtMontoDeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoDeVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoDeVentasActionPerformed

    private void btnGCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGCalculoActionPerformed
        //   DecimalFormat formateador = new DecimalFormat("0.00");
        FcajaCierre funcion = new FcajaCierre();

        if (funcion.VerificarFecha() > 0) {

            JOptionPane.showMessageDialog(null, "La caja ya se Cerro el dia de hoy.");

            btnGCalculo.setEnabled(false);
            btnImprimirReporte.setEnabled(true);
            return;
        } else {
            btnGCalculo.setEnabled(true);

        }

        if (txtMontoCierreEfectivo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor.");
            txtMontoCierreEfectivo.requestFocus();
            return;
        }
        if (txtMontoCierreTarjeta.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor.");
            txtMontoCierreTarjeta.requestFocus();
            return;
        }
        if (txtMontoCredito.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor.");
            txtMontoCredito.requestFocus();
            return;
        }
        if (txtDineroFisico.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un valor.");
            txtDineroFisico.requestFocus();
            return;
        }
        long DineroFisico = Long.parseLong(txtDineroFisico.getText());
        long DineroTotal = Long.parseLong(txtMontoFinal.getText());
        long MontoDiferencia = DineroTotal - DineroFisico;

        txtDiferencia.setText(String.valueOf(MontoDiferencia));

        //FcajaCierre funcion = new FcajaCierre();
        Dcierre datos = new Dcierre();

        datos.setCod_usuario_FK(Integer.parseInt(lblCodUsuario.getText()));
        datos.setMonto_cierre(DineroFisico);

        Calendar cal;
        int d, m, a;
        cal = dcFecha_cierre.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        datos.setFecha_cierre(new java.sql.Date(a, m, d));

        datos.setHora_cierre(Time.valueOf(txtHoraApertura.getText()));
        datos.setDiferencia_cierre(Long.parseLong(txtDiferencia.getText()));
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            datos.setNomCaja(hostname);

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        datos.setEfectivo(Long.parseLong(txtMontoCierreEfectivo.getText()));
        datos.setTarjeta(Long.parseLong(txtMontoCierreTarjeta.getText()));
        datos.setCredito(Long.parseLong(txtMontoCredito.getText()));

        if (funcion.insertar(datos)) {
            JOptionPane.showMessageDialog(null, "Cierre de caja registrado");

            btnImprimirReporte.setEnabled(true);
            btnImprimirReporte.requestFocus();
        } else {

            JOptionPane.showMessageDialog(null, "Cierre de caja No registrado");

        }

    }//GEN-LAST:event_btnGCalculoActionPerformed

    private void txtMontoCierreEfectivoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoCierreEfectivoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoCierreEfectivoKeyTyped

    private void txtMontoCierreTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoCierreTarjetaKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoCierreTarjetaKeyTyped

    private void txtMontoCreditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoCreditoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoCreditoKeyTyped

    private void txtMontoDeAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoDeAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoDeAperturaActionPerformed

    private void txtDiferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiferenciaActionPerformed

    private void txtDineroFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDineroFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDineroFisicoActionPerformed

    private void txtDineroFisicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDineroFisicoKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != evt.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDineroFisicoKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmCierre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGCalculo;
    private javax.swing.JButton btnImprimirReporte;
    public com.toedter.calendar.JDateChooser dcFecha_cierre;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel lblCodUsuario;
    private javax.swing.JTextField txtDiferencia;
    private javax.swing.JTextField txtDineroFisico;
    private javax.swing.JTextField txtHoraApertura;
    private javax.swing.JTextField txtMontoCierreEfectivo;
    private javax.swing.JTextField txtMontoCierreTarjeta;
    private javax.swing.JTextField txtMontoCredito;
    private javax.swing.JTextField txtMontoDeApertura;
    private javax.swing.JTextField txtMontoDeVentas;
    private javax.swing.JTextField txtMontoFinal;
    public static javax.swing.JTextField txtNombreCajero;
    // End of variables declaration//GEN-END:variables

}
