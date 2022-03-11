package Funciones;

import Datos.Dapertura;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class FcajaApertura {

    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    public Integer totalRegistros; // Obtener los registros

    private String prueba;

    // Inserta los datos en la tabla apertura
    public boolean insertar(Dapertura datos) {

        sSQL = "insert into apertura "
                + "(cod_usuario_fk,monto_apertura,fecha_apertura,hora_apertura,nombreCaja) "
                + "values (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCod_usuario_FK());
            pst.setLong(2, datos.getMonto_apertura());
            pst.setDate(3, datos.getFecha_apertura());
            pst.setTime(4, datos.getHora_apertura());
            pst.setString(5, datos.getNombreCaja());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    // Busca en la Tabla de la BD si ya hay una apertura de caja.
    public int VerificarFecha() {

        Date fec = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            InetAddress addr = InetAddress.getLocalHost();
            String hostname = addr.getHostName();
            prueba = hostname;

        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
        }

        sSQL = " select count(cod_apertura) as contador from apertura where fecha_apertura = '"
                + dateFormat.format(fec)
                + "' and nombreCaja ='"
                + prueba
                + "' order by cod_apertura";
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

}
