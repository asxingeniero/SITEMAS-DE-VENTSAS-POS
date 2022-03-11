
package Datos;


public class Dusuario extends Dpersona {
    
    
    private int cod_usuario ;
    private String rut_usuario;
    private String login;
    private String password;
    private String estado;
    private String acceso;
    
    public Dusuario() {
        
    }

    public Dusuario(int cod_usuario, String rut_usuario, String login, String password, String estado,String acceso) {
        this.cod_usuario = cod_usuario;
        this.rut_usuario = rut_usuario;
        this.login = login;
        this.password = password;
        this.estado = estado;
        this.acceso= acceso;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getRut_usuario() {
        return rut_usuario;
    }

    public void setRut_usuario(String rut_usuario) {
        this.rut_usuario = rut_usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }
    
}
