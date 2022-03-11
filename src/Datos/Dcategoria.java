package Datos;


public class Dcategoria {

    private int cod_categoria;
    private String nombre_categoria;
    private String descripcion_categoria;

    public Dcategoria() {
    }

    public Dcategoria(int cod_categoria, String nombre_categoria, String descripcion_categoria) {
        this.cod_categoria = cod_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }

   

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria) {
        this.descripcion_categoria = descripcion_categoria;
    }
  


}
