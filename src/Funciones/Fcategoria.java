package Funciones;

import Datos.Dcategoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fcategoria {

    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    public Integer totalRegistros; // Obtener los registros
 
    
    
    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"codigo", "Nombre","descripcion"};

        String[] registros = new String[3];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from categoria where nombre_categoria like '%" + buscar + "%' order by cod_categoria desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
         

            while (rs.next()) {

                registros[0] = rs.getString("cod_categoria");
                registros[1] = rs.getString("nombre_categoria");
                registros[2] = rs.getString("descripcion_categoria");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            
             cn.close();
            return modelo;             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Dcategoria datos) {

        sSQL = "insert into categoria (nombre_categoria,descripcion_categoria) values (?,?)";

        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, datos.getNombre_categoria());
            pst.setString(2, datos.getDescripcion_categoria());


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

    }/*CIERRE FUNCION INSERTAR*/


    public boolean editar(Dcategoria datos) {

        sSQL = "update categoria set nombre_categoria = ?,descripcion_categoria = ? where cod_categoria = ? ";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setString(1, datos.getNombre_categoria());
            pst.setString(2, datos.getDescripcion_categoria());
            pst.setInt(3, datos.getCod_categoria());

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
    }/*CIERRE FUNCION EDITAR*/


    public boolean eliminar(Dcategoria datos) {

        sSQL = "delete from categoria where cod_categoria = ?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setInt(1, datos.getCod_categoria());

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
    
}
