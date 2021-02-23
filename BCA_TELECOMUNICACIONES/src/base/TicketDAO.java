package base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import entidades.Ticket;

import java.util.Date;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TicketDAO extends Database {

    public void insertarTicket(Ticket ticket) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        insertar("INSERT INTO Tickets VALUES('" + ticket.getCodigo() + "','" + df.format(ticket.getFecha_inicial())
                + "',null,'" + ticket.getCedula_cliente() + "','" + ticket.getTipo() + "','"
                + ticket.getNotas_problema() + "',null," + 1 + "," + ticket.getCalidad_servicio() + ");");
    }

    public Ticket consultarTickets(String codigo) throws SQLException {

        ResultSet rs = consulta("SELECT * FROM Tickets WHERE(codigo_ticket='" + codigo + "');");
        rs.next();
        try {
            Ticket t = new Ticket(rs.getDate(2), rs.getDate(3), rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getBoolean(8), rs.getInt(9));
            t.setCodigo(rs.getString(1));
            return t;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: No se encontraron los datos solicitados.");
            return null;
        }
    }

    public void editarTicket(String codigo, Ticket ticket) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        int estado = (ticket.getEstado()) ? 1 : 0;
        insertar("UPDATE Tickets SET fecha_inicial='" + df.format(ticket.getFecha_inicial()) + "',fecha_final='"
                + df.format(ticket.getFecha_final()) + "',cedula_cliente='" + ticket.getCedula_cliente() + "',tipo='"
                + ticket.getTipo() + "',notas_problema='" + ticket.getNotas_problema() + "', notas_solucion='"
                + ticket.getNotas_solucion() + "',estado=" + estado + ", calidad_servicio="
                + ticket.getCalidad_servicio() + " WHERE(codigo_ticket='" + codigo + "');");

    }

    public ResultSet consultarTickets() {
        return consulta("SELECT codigo_ticket,cedula_cliente,fecha_inicial,tipo,estado FROM Tickets;");
    }

    public ResultSet consultarTicketsActivos() {
        return consulta("SELECT codigo_ticket,cedula_cliente,fecha_inicial,tipo,estado FROM Tickets WHERE(estado=1);");
    }

    public int contarTicketsEntreFechas(String tipo, Date fecha_inicial, Date fecha_final) throws SQLException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        ResultSet num = consulta(
                "SELECT COUNT(codigo_ticket) FROM Tickets WHERE tipo ='" + tipo + "'" + " AND fecha_inicial BETWEEN '"
                        + df.format(fecha_inicial) + "' AND '" + df.format(fecha_final) + "';");
        num.next();
        return num.getInt(1);
    }

    public int contarTicketsEntreFechas(Date fecha_inicial,Date fecha_final) throws SQLException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        ResultSet num = consulta("SELECT COUNT(codigo_ticket) FROM Tickets WHERE  fecha_inicial BETWEEN '"
                + df.format(fecha_inicial) + "' AND '" + df.format(fecha_final) + "';");
        num.next();
        return num.getInt(1);
    }

    public int numeroTickets() throws SQLException {
        ResultSet num = consulta("SELECT COUNT(codigo_ticket) FROM Tickets;");
        num.next();
        return num.getInt(1);
    }

}
