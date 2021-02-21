/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Retr0
 */
public class Database {

    static Connection con = null;

    public Database() {
        conexion();
    }

    private static void conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10393822?user=sql10393822&password=Tu6iB9qjQb&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public ResultSet consulta(String Consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(Consulta);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        return rs;
    }

    public void insertar(String Consulta) {
        try {
            Statement ps = con.createStatement();
            ps.executeUpdate(Consulta);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public void cerrarConexion() throws SQLException {
        con.close();
    }

    

}