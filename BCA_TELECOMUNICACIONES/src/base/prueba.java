/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import entidades.Ticket;

/**
 *
 * @author henry
 */ 
public class prueba {

    public static void main(String[] args) {

        Ticket t;
        try {
            t = new Ticket(new Date(120, 0, 4), new Date(120, 1, 4), "1006858333", "a4", "suixd", "siusda", true, 5);
            TicketDAO a = new TicketDAO();
            a.insertarTicket(t);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
