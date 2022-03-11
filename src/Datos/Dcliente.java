 
package Datos;

 
public class Dcliente extends Dpersona{

    private int cod_cliente;
    private String rut_cliente;

    public Dcliente() {
    }

    public Dcliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getRut_cliente() {
        return rut_cliente;
    }

    public void setRut_cliente(String rut_cliente) {
        this.rut_cliente = rut_cliente;
    }
    
}
