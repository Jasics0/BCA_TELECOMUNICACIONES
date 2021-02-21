/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.Cliente;

/**
 *
 * @author henry
 */
public class prueba {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Cliente jaja= new Cliente("123","Yasbleidy");

        ClienteDAO c= new ClienteDAO();


        ResultSet cliente_consulta= c.consultarClientes(jaja.getCedula());
        cliente_consulta.next();
        System.out.println("Se encontró este gai:"+cliente_consulta.getString(2));
        cliente_consulta= c.consultarClientes();
        System.out.println("CLIENTES EN LA TABLA: ");
        while(cliente_consulta.next()){
            System.out.println("Cedula: "+cliente_consulta.getString(1)+" Nombre: "+cliente_consulta.getString(2));
        }
    }

}
