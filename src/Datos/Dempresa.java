
package Datos;
public class Dempresa {
    private int cod_empresa;
    private String nombre_empresa;
    private String rut_empresa;
    private String domicilio_empresa;
    private String actividad_empresa;
    public Dempresa() {
    }
    public Dempresa(int cod_empresa, String nombre_empresa, String rut_empresa, String domicilio_empresa, String actividad_empresa) {
        this.cod_empresa = cod_empresa;
        this.nombre_empresa = nombre_empresa;
        this.rut_empresa = rut_empresa;
        this.domicilio_empresa = domicilio_empresa;
        this.actividad_empresa = actividad_empresa;
    }
    public int getCod_empresa() {
        return cod_empresa;
    }
    public void setCod_empresa(int cod_empresa) {
        this.cod_empresa = cod_empresa;
    }
    public String getNombre_empresa() {
        return nombre_empresa;
    }
    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
    public String getRut_empresa() {
        return rut_empresa;
    }
    public void setRut_empresa(String rut_empresa) {
        this.rut_empresa = rut_empresa;
    }
    public String getDomicilio_empresa() {
        return domicilio_empresa;
    }
    public void setDomicilio_empresa(String domicilio_empresa) {
        this.domicilio_empresa = domicilio_empresa;
    }
    public String getActividad_empresa() {
        return actividad_empresa;
    }
    public void setActividad_empresa(String actividad_empresa) {
        this.actividad_empresa = actividad_empresa;
    }
}
