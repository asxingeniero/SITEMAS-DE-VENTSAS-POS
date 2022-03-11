package FuncionesMINI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fproducto {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";

    public DefaultTableModel mostrarProdSistema() {

        DefaultTableModel modelo;

        String[] titulos
                = {"Codigo", "Nombre ",
                    "Descripcion", "Unidad  ",
                    "Precio Venta", "Stock","Precio Compra"};

        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from productostock order by cod_producto asc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_producto");
                registros[1] = rs.getString("nombre_producto");
                registros[2] = rs.getString("descripcion_producto");
                registros[3] = rs.getString("unidad_producto");
                registros[4] = rs.getString("precio_producto");
                registros[5] = rs.getString("stock_producto");
                registros[6] = rs.getString("precio_compra");
                 
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public DefaultTableModel mostrarProdscan() {

        DefaultTableModel modelo;

        String[] titulos
                = {"Codigo", "Nombre ",
                    "Cantidad"};

        String[] registros = new String[3];
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from productoescaneado order by cod_producto asc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_producto");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("cantidad");

                 
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    
    
    public boolean eliminar() {
        sSQL = "delete from productostock";
   
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            int N = pst.executeUpdate();
            if (N != 0 ) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }//cierre funcion

public boolean eliminar2() {
       
        sSQL = "delete from productoescaneado";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
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


