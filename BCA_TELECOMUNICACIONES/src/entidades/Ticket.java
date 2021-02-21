package entidades;

import java.util.Date;

public class Ticket {
    private String codigo;
    private Date fecha_inicial;
    private Date fecha_final;
    private String cedula_cliente;
    private String tipo;
    private String notas_problema;
    private String notas_solucin;
    private boolean estado;
    private int calidad_servicio;


    public Ticket(String codigo, Date fecha_inicial, Date fecha_final, String cedula_cliente, String tipo, String notas_problema, String notas_solucin, boolean estado, int calidad_servicio) {
        this.codigo = codigo;
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.cedula_cliente = cedula_cliente;
        this.tipo = tipo;
        this.notas_problema = notas_problema;
        this.notas_solucin = notas_solucin;
        this.estado = estado;
        this.calidad_servicio = calidad_servicio;
    }


    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha_inicial() {
        return this.fecha_inicial;
    }

    public void setFecha_inicial(Date fecha_inicial) {
        this.fecha_inicial = fecha_inicial;
    }

    public Date getFecha_final() {
        return this.fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public String getCedula_cliente() {
        return this.cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNotas_problema() {
        return this.notas_problema;
    }

    public void setNotas_problema(String notas_problema) {
        this.notas_problema = notas_problema;
    }

    public String getNotas_solucin() {
        return this.notas_solucin;
    }

    public void setNotas_solucin(String notas_solucin) {
        this.notas_solucin = notas_solucin;
    }

    public boolean isEstado() {
        return this.estado;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCalidad_servicio() {
        return this.calidad_servicio;
    }

    public void setCalidad_servicio(int calidad_servicio) {
        this.calidad_servicio = calidad_servicio;
    }
}
