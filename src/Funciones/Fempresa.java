package Funciones;

import Controlador.FrmEmpresa;
import Datos.Dempresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fempresa {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();

    private String sSQL = "";
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos
                = {"Codigo", "Nombre ",
                    "rut", "domicilio  ",
                    "actividad "};

        String[] registros = new String[5];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from datos_empresa where nombre_empresa like '%" + buscar + "%' order by cod_empresa desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
           
            
            while (rs.next()) {

                registros[0] = rs.getString("cod_empresa");
                registros[1] = rs.getString("nombre_empresa");
                registros[2] = rs.getString("rut_empresa");
                registros[3] = rs.getString("domicilio_empresa");
                registros[4] = rs.getString("actividad_empresa");

                totalRegistros = totalRegistros + 1;
               
                modelo.addRow(registros);
            }

            return modelo;
            
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
        
    }

    public boolean insertar(Dempresa datos) {

        sSQL = "insert into datos_empresa (nombre_empresa,rut_empresa,domicilio_empresa,actividad_empresa) values (?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, datos.getNombre_empresa());
            pst.setString(2, datos.getRut_empresa());
            pst.setString(3, datos.getDomicilio_empresa());
            pst.setString(4, datos.getActividad_empresa());

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

    }//cierre funcion

    public boolean editar(Dempresa datos) {

        sSQL = "update datos_empresa set nombre_empresa = ? , rut_empresa = ?  , domicilio_empresa = ? , actividad_empresa = ?  where cod_empresa = ? ";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, datos.getNombre_empresa());
            pst.setString(2, datos.getRut_empresa());
            pst.setString(3, datos.getDomicilio_empresa());
            pst.setString(4, datos.getActividad_empresa());
            pst.setInt(5, datos.getCod_empresa());

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

    }//cierre funcion

   
}
