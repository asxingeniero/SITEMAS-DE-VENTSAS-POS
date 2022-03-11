package Datos;

import java.sql.Date;
import java.sql.Time;

public class Dcierre {

    private int cod_usuario_FK;
    private long monto_cierre;
    private Date fecha_cierre;
    private Time hora_cierre;
    private long diferencia_cierre;
    private String nomCaja;
    private long efectivo;
    private long tarjeta;
    private long credito;
    

    public Dcierre() {
    }

    public Dcierre(int cod_usuario_FK, long monto_cierre, Date fecha_cierre, Time hora_cierre, long diferencia_cierre, String nomCaja, long efectivo, long tarjeta, long credito) {
        this.cod_usuario_FK = cod_usuario_FK;
        this.monto_cierre = monto_cierre;
        this.fecha_cierre = fecha_cierre;
        this.hora_cierre = hora_cierre;
        this.diferencia_cierre = diferencia_cierre;
        this.nomCaja = nomCaja;
        this.efectivo = efectivo;
        this.tarjeta = tarjeta;
        this.credito = credito;
    }

    public int getCod_usuario_FK() {
        return cod_usuario_FK;
    }

    public void setCod_usuario_FK(int cod_usuario_FK) {
        this.cod_usuario_FK = cod_usuario_FK;
    }

    public long getMonto_cierre() {
        return monto_cierre;
    }

    public void setMonto_cierre(long monto_cierre) {
        this.monto_cierre = monto_cierre;
    }

    public Date getFecha_cierre() {
        return fecha_cierre;
    }

    public void setFecha_cierre(Date fecha_cierre) {
        this.fecha_cierre = fecha_cierre;
    }

    public Time getHora_cierre() {
        return hora_cierre;
    }

    public void setHora_cierre(Time hora_cierre) {
        this.hora_cierre = hora_cierre;
    }

    public long getDiferencia_cierre() {
        return diferencia_cierre;
    }

    public void setDiferencia_cierre(long diferencia_cierre) {
        this.diferencia_cierre = diferencia_cierre;
    }

    public String getNomCaja() {
        return nomCaja;
    }

    public void setNomCaja(String nomCaja) {
        this.nomCaja = nomCaja;
    }

    public long getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(long efectivo) {
        this.efectivo = efectivo;
    }

    public long getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(long tarjeta) {
        this.tarjeta = tarjeta;
    }

    public long getCredito() {
        return credito;
    }

    public void setCredito(long credito) {
        this.credito = credito;
    }

   
    
    
}
