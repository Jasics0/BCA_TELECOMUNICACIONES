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

import javax.xml.crypto.Data;

import entidades.Cliente;
import entidades.Ticket;

/**
 *
 * @author henry
 */ 
public class prueba {

    public static void main(String[] args) {
        ClienteDAO cdb = new ClienteDAO();
        try {
			System.out.println(cdb.numeroClientes());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }

}
