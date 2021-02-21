package base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import entidades.Ticket;

public class TicketDAO extends Database{
    
    public void insertarTicket(Ticket ticket){
        SimpleDateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        insertar("INSERT INTO Tickets VALUES('"+ticket.getCodigo()+"','"+df.format(ticket.getFecha_inicial())+"','"+df.format(ticket.getFecha_final())+"','"+ticket.getCedula_cliente()+"','"+ticket.getTipo()+"','"+ticket.getNotas_problema()+"','"+ticket.getNotas_solucion()+"',"+1+","+ticket.getCalidad_servicio()+");");
    }

    
    public ResultSet consultarTickets(String codigo) {
        return consulta("SELECT * FROM Tickets WHERE(codigo_ticket='" + codigo + "');");
    }

    public ResultSet consultarTickets() {
        return consulta("SELECT * FROM Tickets;");
    }

    public ResultSet consultarTicketsActivos() {
        return consulta("SELECT * FROM Tickets WHERE(estado=1);");
    }


    public int numeroTickets() throws SQLException {
        ResultSet num=consulta("SELECT COUNT(*) FROM Tickets;");
        num.next();
        return num.getInt(1);
    }


}
