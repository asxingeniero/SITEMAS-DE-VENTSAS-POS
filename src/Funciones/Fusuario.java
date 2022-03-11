package Funciones;

import Controlador.FrmCliente;
import Controlador.FrmUsuario;
import Datos.Dusuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Fusuario {

    private conexion mysql = new conexion(); //Instanciando la clase conexion
    private Connection cn = mysql.conectar();
    private String sSQL = ""; //Sentencia SQL
    private String sSQL2 = "";
    public Integer totalRegistros; // Obtener los registros

    public DefaultTableModel mostrar(String buscar) {

        DefaultTableModel modelo;

        String[] titulos = {"COD", "Nombre",
            "Direccion", "Telefono", "Email", "Cedula",
            "Login", "pass", "Estado", "Acceso", "Contacto", "Celular Contacto", "Correo Contacto"};

        String[] registros = new String[13];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.cod_persona , p.nombre_persona , p.direccion,p.telefono , "
                + "p.email,p.contacto,p.cel_contacto,correo_contacto ,u.rut_usuario,u.login,u.password,u.estado ,u.acceso from "
                + " persona p inner join usuario u on p.cod_persona = u.cod_usuario "
                + " where nombre_persona like '%" + buscar + "%' order by cod_persona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {

                registros[0] = rs.getString("cod_persona");
                registros[1] = rs.getString("nombre_persona");
                registros[2] = rs.getString("direccion");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("email");
                registros[5] = rs.getString("rut_usuario");
                registros[6] = rs.getString("login");
                registros[7] = rs.getString("password");
                registros[8] = rs.getString("estado");
                registros[9] = rs.getString("acceso");
                registros[10] = rs.getString("contacto");
                registros[11] = rs.getString("cel_contacto");
                registros[12] = rs.getString("correo_contacto");
                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }

    /**
     * *Cierre Funcion Mostrar**
     */
    /**
     * Cierre Funcion Mostrar
     *
     * @param datos
     */
    public boolean insertar(Dusuario datos) {

        sSQL = "insert into persona (nombre_persona,direccion,telefono,email,contacto,cel_contacto,correo_contacto)"
                + " values (?,?,?,?,?,?,?)";

        sSQL2 = "insert into usuario (cod_usuario,rut_usuario,login,password,estado,acceso)"
                + " values ((select cod_persona from persona order by cod_persona desc limit 1)"
                + " ,?,?,?,?,?)";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, datos.getNombre_persona());
            pst.setString(2, datos.getDireccion());
            pst.setString(3, datos.getTelefono());
            pst.setString(4, datos.getEmail());

            pst.setString(5, datos.getContacto());
            pst.setString(6, datos.getCel_contacto());
            pst.setString(7, datos.getCorreo_contacto());

            pst2.setString(1, datos.getRut_usuario());
            pst2.setString(2, datos.getLogin());
            pst2.setString(3, datos.getPassword());
            pst2.setString(4, datos.getEstado());
            pst2.setString(5, datos.getAcceso());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();

            if (N != 0 || N2 != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }/*CIERRE FUNCION INSERTAR*/


    public boolean editar(Dusuario datos) {

        sSQL = "update persona set nombre_persona = ? ,direccion = ? ,"
                + "telefono = ?,email = ?,contacto = ?,cel_contacto= ?,correo_contacto = ? where cod_persona = ? ";

        sSQL2 = "update usuario set rut_usuario = ? , login = ? ,password = ? "
                + " , estado = ? , acceso = ? where cod_usuario = ? ";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setString(1, datos.getNombre_persona());
            pst.setString(2, datos.getDireccion());
            pst.setString(3, datos.getTelefono());
            pst.setString(4, datos.getEmail());
            
            pst.setString(5, datos.getContacto());
            pst.setString(6, datos.getCel_contacto());
            pst.setString(7, datos.getCorreo_contacto());
            
            
            pst.setInt(8, datos.getCod_persona());
            

      
            
            
            pst2.setString(1, datos.getRut_usuario());
            pst2.setString(2, datos.getLogin());
            pst2.setString(3, datos.getPassword());
            pst2.setString(4, datos.getEstado());
            pst2.setString(5, datos.getAcceso());

            pst2.setInt(6, datos.getCod_persona());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();

            if (N != 0 || N2 != 0) {

                return true;

            } else {

                return false;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }/*CIERRE FUNCION EDITAR*/


    public boolean eliminar(Dusuario datos) {

        sSQL = "delete from persona where cod_persona = ?";
        sSQL2 = "delete from usuario where cod_usuario = ?";
        try {

            PreparedStatement pst = cn.prepareStatement(sSQL);
            PreparedStatement pst2 = cn.prepareStatement(sSQL2);

            pst.setInt(1, datos.getCod_persona());
            pst2.setInt(1, datos.getCod_usuario());

            int N = pst.executeUpdate();
            int N2 = pst2.executeUpdate();

            if (N != 0 || N2 != 0) {

                return true;

            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    } //cierre funcion eliminar

    /**
     * ***************************************************************
     */
    public DefaultTableModel login(String login, String password) {
        DefaultTableModel modelo;

        String[] titulos = {"COD", "NOMBRE", "DIRECCION", "TELEFONO", "EMAIL", "LOGIN", "PASS", "ESTADO", "ACCESO"};

        String[] registro = new String[9];

        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select p.cod_persona , p.nombre_persona , p.direccion ,"
                + "p.telefono , p.email , u.login , u.password , u.estado ,"
                + "u.acceso from persona p inner join usuario "
                + " u on p.cod_persona = u.cod_usuario where u.login ='" + login + "' "
                + " and u.password ='" + password + "' and estado = 'Activo'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("cod_persona");
                registro[1] = rs.getString("nombre_persona");
                registro[2] = rs.getString("direccion");
                registro[3] = rs.getString("telefono");

                registro[4] = rs.getString("email");
                registro[5] = rs.getString("login");
                registro[6] = rs.getString("password");
                registro[7] = rs.getString("estado");
                registro[8] = rs.getString("acceso");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public int ContarUsuarios() {

        sSQL = "select count(*)AS cantidadUsuarios from usuario";

        try {
            int codigo_venta = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                codigo_venta = rs.getInt("cantidadUsuarios");
            }

            return codigo_venta;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }

    public int verificarLogin() {
        String login = FrmUsuario.txtLogin.getText();
        sSQL = "SELECT COUNT(login) AS login FROM usuario WHERE login = " + login;

        try {
            int loginResultante = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                loginResultante = rs.getInt("login");
            }

            return loginResultante;

        } catch (Exception e) {
            return 0;
        }

    }
}
