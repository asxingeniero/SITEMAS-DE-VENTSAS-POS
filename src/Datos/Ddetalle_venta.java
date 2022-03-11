
package Datos;


public class Ddetalle_venta {

    private int cod_detalle;
    private int cantidad_detalle;
    private long precio_producto ;
    private String cod_productoFK; 
    private int cod_ventaFK;
    private long subtotal;
    private long subPrecioCompra;
    private long precio_compra;

    public Ddetalle_venta() {
    }

    public Ddetalle_venta(int cod_detalle, int cantidad_detalle, long precio_producto, String cod_productoFK, int cod_ventaFK, long subtotal, long subPrecioCompra, long precio_compra) {
        this.cod_detalle = cod_detalle;
        this.cantidad_detalle = cantidad_detalle;
        this.precio_producto = precio_producto;
        this.cod_productoFK = cod_productoFK;
        this.cod_ventaFK = cod_ventaFK;
        this.subtotal = subtotal;
        this.subPrecioCompra = subPrecioCompra;
        this.precio_compra = precio_compra;
    }

    public int getCod_detalle() {
        return cod_detalle;
    }

    public void setCod_detalle(int cod_detalle) {
        this.cod_detalle = cod_detalle;
    }

    public int getCantidad_detalle() {
        return cantidad_detalle;
    }

    public void setCantidad_detalle(int cantidad_detalle) {
        this.cantidad_detalle = cantidad_detalle;
    }

    public long getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(long precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getCod_productoFK() {
        return cod_productoFK;
    }

    public void setCod_productoFK(String cod_productoFK) {
        this.cod_productoFK = cod_productoFK;
    }

    public int getCod_ventaFK() {
        return cod_ventaFK;
    }

    public void setCod_ventaFK(int cod_ventaFK) {
        this.cod_ventaFK = cod_ventaFK;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public long getSubPrecioCompra() {
        return subPrecioCompra;
    }

    public void setSubPrecioCompra(long subPrecioCompra) {
        this.subPrecioCompra = subPrecioCompra;
    }

    public long getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(long precio_compra) {
        this.precio_compra = precio_compra;
    }

    
    
}
