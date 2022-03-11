
package Datos;

import java.sql.Date;

/**
 *
 * @author oscar
 */
public class Dhistorial {
    
    private int cod_historial;
    private String cod_productoFK1;
    private int cod_usuarioFK1;
    private String descripcion;
    private String referencia;
    private int cantidad;
    private Date fecha;

    public Dhistorial() {
    }

    public Dhistorial(int cod_historial, String cod_productoFK1, int cod_usuarioFK1, String descripcion, String referencia, int cantidad, Date fecha) {
        this.cod_historial = cod_historial;
        this.cod_productoFK1 = cod_productoFK1;
        this.cod_usuarioFK1 = cod_usuarioFK1;
        this.descripcion = descripcion;
        this.referencia = referencia;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    

    public int getCod_historial() {
        return cod_historial;
    }

    public void setCod_historial(int cod_historial) {
        this.cod_historial = cod_historial;
    }

    public String getCod_productoFK1() {
        return cod_productoFK1;
    }

    public void setCod_productoFK1(String cod_productoFK1) {
        this.cod_productoFK1 = cod_productoFK1;
    }

    public int getCod_usuarioFK1() {
        return cod_usuarioFK1;
    }

    public void setCod_usuarioFK1(int cod_usuarioFK1) {
        this.cod_usuarioFK1 = cod_usuarioFK1;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
   
    
}
