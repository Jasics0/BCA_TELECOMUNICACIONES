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

import entidades.Cliente;
import entidades.Ticket;

/**
 *
 * @author henry
 */ 
public class prueba {

    public static void main(String[] args) {

        ClienteDAO co = new ClienteDAO();

        Cliente j= new Cliente("160004108","python");

        co.editarCliente("1006858333", j);
    }

}
