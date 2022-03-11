package Datos;


public class Dproducto {

    private String cod_producto;
    private String nombre_producto;
    private String descripcion_producto;
    private String unidad_producto;
    private long precio_producto;
    private long stock_producto;
    private long precio_compra;

   
    private String ubicacion_bodega;

    public Dproducto() {
    }

    public Dproducto(String cod_producto, String nombre_producto, String descripcion_producto, String unidad_producto, long precio_producto, long stock_producto, long precio_compra, String ubicacion_bodega) {
        this.cod_producto = cod_producto;
        this.nombre_producto = nombre_producto;
        this.descripcion_producto = descripcion_producto;
        this.unidad_producto = unidad_producto;
        this.precio_producto = precio_producto;
        this.stock_producto = stock_producto;
        this.precio_compra = precio_compra;
        this.ubicacion_bodega = ubicacion_bodega;
    }

    public String getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(String cod_producto) {
        this.cod_producto = cod_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public String getUnidad_producto() {
        return unidad_producto;
    }

    public void setUnidad_producto(String unidad_producto) {
        this.unidad_producto = unidad_producto;
    }

    public long getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(long precio_producto) {
        this.precio_producto = precio_producto;
    }

    public long getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(long stock_producto) {
        this.stock_producto = stock_producto;
    }

    public long getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(long precio_compra) {
        this.precio_compra = precio_compra;
    }

    public String getUbicacion_bodega() {
        return ubicacion_bodega;
    }

    public void setUbicacion_bodega(String ubicacion_bodega) {
        this.ubicacion_bodega = ubicacion_bodega;
    }


}
