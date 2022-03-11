package Funciones;

import Controlador.FrmVentaDetalle;
import Datos.Ddetalle_venta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fdetalle_venta {

    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public Integer totalRegistros;

    public DefaultTableModel mostrar(String cod_venta) {

        DefaultTableModel modelo;
        String[] titulos
                = {"Codigo detalle", "CODIGO", "NOMBRE ",
                    "PRECIO", "CANTIDAD",
                    "Cod Venta", "STOCK", "SUB TOTAL"};
        String[] registros = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "SELECT cod_detalle ,cod_productoFK,"
                + "(SELECT nombre_producto FROM producto WHERE cod_productoFK = cod_producto)AS productoNom, "
                + " precio_producto ,cantidad_detalle, cod_ventaFK ,"
                + "(SELECT stock_producto FROM producto WHERE cod_productoFK=cod_producto)As "
                + "stock ,  subtotal FROM detalle_venta WHERE cod_ventaFK = '" + cod_venta + "' ORDER BY cod_detalle ASC ";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_detalle");
                registros[1] = rs.getString("cod_productoFK");
                registros[2] = rs.getString("productoNom");
                registros[3] = rs.getString("precio_producto");
                registros[4] = rs.getString("cantidad_detalle");
                registros[5] = rs.getString("cod_ventaFK");
                registros[6] = rs.getString("stock");
                registros[7] = rs.getString("subtotal");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar(Ddetalle_venta datos) {

        sSQL = "insert into detalle_venta (cantidad_detalle , cod_productoFK,precio_producto"
                + ", cod_ventaFk ,subtotal,subPrecioCompra,precio_compra) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCantidad_detalle());
            pst.setString(2, datos.getCod_productoFK());
            pst.setLong(3, datos.getPrecio_producto());
            pst.setInt(4, datos.getCod_ventaFK());
            pst.setLong(5, datos.getSubtotal());
            pst.setLong(6, datos.getSubPrecioCompra());
            pst.setLong(7, datos.getPrecio_compra());

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

    public boolean eliminar(Ddetalle_venta datos) {

        sSQL = "delete from detalle_venta where cod_detalle = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCod_detalle());
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

    public String selecProd() {
//        long codigo = Long.parseLong(FrmVentaDetalle.txtCod_producto.getText());
          String codigo = (FrmVentaDetalle.txtCod_producto.getText());
        sSQL = "SELECT cod_producto FROM producto WHERE cod_producto = '" + codigo + "'";
        try {
            String cod = "";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                cod = rs.getString("cod_producto");
            }
            return cod;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "";
        }
    }//cierre funcion */

    public String SelectNombre() {
        String codigo = (FrmVentaDetalle.txtCod_producto.getText());
        sSQL = "SELECT nombre_producto FROM producto WHERE cod_producto = '" + codigo + "'";
        try {
            String nombre = "";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                nombre = rs.getString("nombre_producto");
            }
            return nombre;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "";
        }
    }//cierre funcion */

    public int selecStock() {
        String codigo = (FrmVentaDetalle.txtCod_producto.getText());
        sSQL = "SELECT stock_producto FROM producto WHERE cod_producto = '" + codigo + "'";
        try {
            int stock = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                stock = rs.getInt("stock_producto");
            }
            return stock;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion */

    public long selectPrecio() {
        String codigo = (FrmVentaDetalle.txtCod_producto.getText());
        sSQL = "SELECT precio_producto FROM producto WHERE cod_producto = '" + codigo + "'";
        try {
            long precio_producto = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                precio_producto = rs.getLong("precio_producto");
            }
       
            return precio_producto;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public long selectPrecioCompra() {
        String codigo = (FrmVentaDetalle.txtCod_producto.getText());
        sSQL = "SELECT precio_compra FROM producto WHERE cod_producto = '" + codigo + "'";
        try {
            long precio_productoCompra = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                precio_productoCompra = rs.getLong("precio_compra");
            }
            return precio_productoCompra;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }//cierre funcion

    public boolean insertarDetalle(Ddetalle_venta datos) {

        sSQL = "INSERT INTO detalle_venta (cantidad_detalle , cod_productoFK,precio_producto,"
                + "cod_ventaFk ,subtotal,subPrecioCompra,precio_compra) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, datos.getCantidad_detalle());
            pst.setString(2, datos.getCod_productoFK());
            pst.setLong(3, datos.getPrecio_producto());
            pst.setInt(4, datos.getCod_ventaFK());
            pst.setLong(5, datos.getSubtotal());
            pst.setLong(6, datos.getSubPrecioCompra());
            pst.setLong(7, datos.getPrecio_compra());
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El codigo ingresado no esta en el sistema");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }//cierre funcion

}
