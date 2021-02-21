package base;

import java.sql.ResultSet;

import entidades.Cliente;

public class ClienteDAO extends Database{
    
    public void insertarCliente(String cedula){
        insertar("INSERT INTO Clientes VALUES('"+cedula+"','"+cliente.getNombre()+"');");
    }

    public ResultSet consultarClientes(String cedula){
        return consulta("SELECT * FROM Clientes WHERE(cedula='"+cedula+"');");
    }

    public ResultSet consultarClientes(){
        return consulta("SELECT * FROM Clientes");
    }
}
