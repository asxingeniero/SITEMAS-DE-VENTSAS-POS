
package Datos;


public class Dproveedor extends Dpersona{

    private int cod_proveedor ;
    private String rut_proveedor;

    public Dproveedor() {
    }

    public Dproveedor(int cod_proveedor, String rut_proveedor) {
        this.cod_proveedor = cod_proveedor;
        this.rut_proveedor = rut_proveedor;
    }

    public int getCod_proveedor() {
        return cod_proveedor;
    }

    public void setCod_proveedor(int cod_proveedor) {
        this.cod_proveedor = cod_proveedor;
    }

    public String getRut_proveedor() {
        return rut_proveedor;
    }

    public void setRut_proveedor(String rut_proveedor) {
        this.rut_proveedor = rut_proveedor;
    }
    
    
}

