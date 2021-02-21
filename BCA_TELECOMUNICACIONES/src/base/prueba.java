/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.SQLException;

/**
 *
 * @author henry
 */
public class prueba {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Conexion xd = new Conexion();
        if (xd.obtener() != null) {
            System.out.println("SI sirve xdxd");
        } else {
            System.out.println("Sutri djjdsj");}
        
    }
    
}
