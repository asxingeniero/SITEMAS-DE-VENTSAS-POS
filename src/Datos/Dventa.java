package Datos;

import java.sql.Date;

public class Dventa {

    private int cod_venta;
    private Date fecha_venta;
    private long total_venta;
    private int cod_usuarioFK;
    private int cod_clienteFK;
    private String tipo_comprobante;
    private int num_factura;
    private long pago;
    private long descuento;
    private String metodo_pago;
    private String nomCaja;
    public Dventa() {

    }

    public Dventa(int cod_venta, Date fecha_venta, long total_venta, int cod_usuarioFK, int cod_clienteFK, String tipo_comprobante, int num_factura, long pago, long descuento, String metodo_pago, String nomCaja) {
        this.cod_venta = cod_venta;
        this.fecha_venta = fecha_venta;
        this.total_venta = total_venta;
        this.cod_usuarioFK = cod_usuarioFK;
        this.cod_clienteFK = cod_clienteFK;
        this.tipo_comprobante = tipo_comprobante;
        this.num_factura = num_factura;
        this.pago = pago;
        this.descuento = descuento;
        this.metodo_pago = metodo_pago;
        this.nomCaja = nomCaja;
    }

    public int getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(int cod_venta) {
        this.cod_venta = cod_venta;
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public long getTotal_venta() {
        return total_venta;
    }

    public void setTotal_venta(long total_venta) {
        this.total_venta = total_venta;
    }

    public int getCod_usuarioFK() {
        return cod_usuarioFK;
    }

    public void setCod_usuarioFK(int cod_usuarioFK) {
        this.cod_usuarioFK = cod_usuarioFK;
    }

    public int getCod_clienteFK() {
        return cod_clienteFK;
    }

    public void setCod_clienteFK(int cod_clienteFK) {
        this.cod_clienteFK = cod_clienteFK;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public int getNum_factura() {
        return num_factura;
    }

    public void setNum_factura(int num_factura) {
        this.num_factura = num_factura;
    }

    public long getPago() {
        return pago;
    }

    public void setPago(long pago) {
        this.pago = pago;
    }

    public long getDescuento() {
        return descuento;
    }

    public void setDescuento(long descuento) {
        this.descuento = descuento;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getNomCaja() {
        return nomCaja;
    }

    public void setNomCaja(String nomCaja) {
        this.nomCaja = nomCaja;
    }

  

}
