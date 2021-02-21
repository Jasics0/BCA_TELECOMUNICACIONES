package base;

import java.sql.ResultSet;

import entidades.Cliente;

public class ClienteDAO extends Database{
    
    public void insertarCliente(String cedula){
        insertar("INSERT INTO Clientes VALUES('"+cedula+"','"+cliente.getNombre()+"');");
    }

    public ResultSet consultarClientes(Cliente cliente){
        return consulta("SELECT * FROM Clientes WHERE(cedula='"+cliente.getCedula()+"');");
    }

    public ResultSet consultarClientes(){
        return consulta("SELECT * FROM Clientes");
    }
}
