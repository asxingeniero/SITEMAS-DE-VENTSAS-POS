package Funciones;
import Datos.Dhistorial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fhistorial {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    private String sSQL = "";

    public DefaultTableModel Mostrar(String id) {

        DefaultTableModel modelo;
        String[] titulos = {"FECHA", "NOMBRE", "DESCRIPCION", "CANTIDAD","REFERENCIA"};

        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select h.fecha , p.nombre_persona ,h.descripcion,h.cantidad,h.referencia from historial h inner join persona p on p.cod_persona = h.cod_usuarioFK1 where h.cod_productoFK1 = '"+id+"' order by cod_historial DESC";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
                        
                while (rs.next()) {

                registros[0] = rs.getString("fecha");
                registros[1] = rs.getString("nombre_persona");
                registros[2] = rs.getString("descripcion");
                registros[3] = rs.getString("cantidad");
                registros[4] = rs.getString("referencia");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public boolean insertar(Dhistorial datos) {
        sSQL = "insert into historial (cod_productoFK1,cod_usuarioFK1,descripcion,referencia,cantidad,fecha) values (?,?,?,?,?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, datos.getCod_productoFK1());
            pst.setInt(2, datos.getCod_usuarioFK1());
            pst.setString(3, datos.getDescripcion());
            pst.setString(4, datos.getReferencia());
            pst.setInt(5, datos.getCantidad());
            pst.setDate(6, datos.getFecha());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }

    }

}
