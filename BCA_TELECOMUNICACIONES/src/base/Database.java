/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.HeadlessException;
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
            con = DriverManager.getConnection("jdbc:mysql://bswikqc7uizozxoxxsj1-mysql.services.clever-cloud.com:3306/bswikqc7uizozxoxxsj1?user=uojiler96szbrk3r&password=eONTL4V7iqHdz9xblwEg&useUnicode=true&characterEncoding=UTF-8&autoReconnect=true&failOverReadOnly=false&maxReconnects=10");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }

    public ResultSet consulta(String Consulta) {
        ResultSet rs = null;
        try {
            PreparedStatement ps = con.prepareStatement(Consulta);
            rs = ps.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: No se encontraron los datos solicitados.");
        }
        return rs;
    }

    public void insertar(String Consulta) {
        try {
            Statement ps = con.createStatement();
            ps.executeUpdate(Consulta);
            JOptionPane.showMessageDialog(null, "Los datos se guardaron correctamente.");

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: Revisa los datos ingresados e intenta nuevamente.");
        }
    }

    public void cerrarConexion() throws SQLException {
        con.close();
    }

}
