package Funciones;

import Datos.Dcierre;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FcajaCierre {

    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    public Integer totalRegistros; // Obtener los registros

    private String prueba2;

    
    
     public int VerificarFecha() {

        Date fec = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = " select count(cod_cierre) as contador from cierre where fecha_cierre = '"
                + dateFormat.format(fec)
                + "' and nombreCaja ='"
                + prueba2
                + "' order by cod_cierre";
        try {
            int fecha = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                fecha = rs.getInt("contador");
            }
            return fecha;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    
    
    
    public long MontoInicialCaja() {

        Date fec = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = "select  monto_apertura from apertura where fecha_apertura = '"
                + dateFormat.format(fec) + "' and nombreCaja ='" + prueba2
                + "' order by cod_apertura";

        try {
            long montoApertura = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                montoApertura = rs.getLong("monto_apertura");
            }

            return montoApertura;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public long MontoTarjeta() {

        Date fec = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = "select sum(total_venta) as total_venta from venta where fecha_venta"
                + " ='" + dateFormat.format(fec) + "' and nomCaja = '" + prueba2 + "' and metodo_pago='Tarjeta' order by metodo_pago ";

        try {
            long totalVentas = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                totalVentas = rs.getLong("total_venta");
            }

            return totalVentas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public long MontoCredito() {

        Date fec = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = "select sum(total_venta) as total_venta from venta where fecha_venta"
                + " ='" + dateFormat.format(fec) + "' and nomCaja = '" + prueba2 + "' and metodo_pago='Credito' order by metodo_pago ";

        try {
            long totalVentas = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                totalVentas = rs.getLong("total_venta");
            }

            return totalVentas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public long MontoEfectivo() {

        Date fec = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = "select sum(total_venta) as total_venta from venta where fecha_venta"
                + " ='" + dateFormat.format(fec) + "' and nomCaja = '" + prueba2 + "' and metodo_pago='Efectivo' order by metodo_pago ";

        try {
            long totalVentas = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                totalVentas = rs.getLong("total_venta");
            }

            return totalVentas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public long ventasRealizadas() {

        Date fec = new Date();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba2 = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = "select sum(total_venta) "
                + "as total_venta from venta where fecha_venta = '"
                + dateFormat.format(fec)
                + "' and nomCaja = '"
                + prueba2 + "' order by cod_venta";

        try {
            long totalVentas = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                totalVentas = rs.getLong("total_venta");
            }

            return totalVentas;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public boolean insertar(Dcierre datos) {

        sSQL = "insert into cierre "
                + "(cod_usuario_fk,"
                + "monto_cierre,"
                + "fecha_cierre,"
                + "hora_cierre,"
                + "diferencia_cierre,"
                + "nombreCaja,"
                + "efectivo,"
                + "tarjeta,"
                + "credito)"
                + "values (?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, datos.getCod_usuario_FK());
            pst.setLong(2, datos.getMonto_cierre());
            pst.setDate(3, datos.getFecha_cierre());
            pst.setTime(4, datos.getHora_cierre());
            pst.setLong(5, datos.getDiferencia_cierre());
            pst.setString(6, datos.getNomCaja());
            pst.setLong(7, datos.getEfectivo());
            pst.setLong(8, datos.getTarjeta());
            pst.setLong(9, datos.getCredito());

            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "ACA ERROR ");
            return false;
        }

    }/*CIERRE FUNCION INSERTAR*/


}
