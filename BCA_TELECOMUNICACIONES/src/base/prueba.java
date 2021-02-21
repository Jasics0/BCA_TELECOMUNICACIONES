/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author henry
 */
public class prueba {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database xd = new Database();
        if (xd != null) {
            System.out.println("SI sirve xdxd");
        } else {
            System.out.println("Sutri djjdsj");
        }
        ResultSet rs=xd.consulta("SELECT * FROM sql10393822.Clientes;");
        while (rs.next()) {
            System.out.print("Cedula: "+rs.getString(1)+" ");
            System.out.println("Nombre: "+rs.getString(2));
        }
    }

}
