package entidades;

import java.sql.SQLException;
import java.util.Date;

import base.TicketDAO;

public class Ticket {
    private String codigo;
    private Date fecha_inicial;
    private Date fecha_final;
    private String cedula_cliente;
    private String tipo;
    private String notas_problema;
    private String notas_solucion;
    private boolean estado;
    private int calidad_servicio;

    public Ticket(Date fecha_inicial, Date fecha_final, String cedula_cliente, String tipo, String notas_problema,
            String notas_solucion, boolean estado, int calidad_servicio) throws SQLException {
        TicketDAO to = new TicketDAO();
        this.codigo = "T" + to.numeroTickets();
        this.fecha_inicial = fecha_inicial;
        this.fecha_final = fecha_final;
        this.cedula_cliente = cedula_cliente;
        this.tipo = tipo;
        this.notas_problema = notas_problema;
        this.notas_solucion = notas_solucion;
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

    public String getNotas_solucion() {
        return this.notas_solucion;
    }

    public void setNotas_solucion(String notas_solucion) {
        this.notas_solucion = notas_solucion;
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

    @Override
    public String toString() {
        return "Ticket{" + "codigo=" + codigo + ", fecha_inicial=" + fecha_inicial + ", fecha_final=" + fecha_final + ", cedula_cliente=" + cedula_cliente + ", tipo=" + tipo + ", notas_problema=" + notas_problema + ", notas_solucion=" + notas_solucion + ", estado=" + estado + ", calidad_servicio=" + calidad_servicio + '}';
    }
    
    
}
