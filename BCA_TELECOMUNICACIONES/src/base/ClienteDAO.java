package base;

import java.sql.ResultSet;

import entidades.Cliente;

public class ClienteDAO extends Database{
    
    public void insertarCliente(Cliente cliente){
        insertar("INSERT INTO Clientes VALUES('"+cliente.getCedula()+"','"+cliente.getNombre()+"');");
    }

    public ResultSet consultarClientes(String cedula){
        return consulta("SELECT * FROM Clientes WHERE(cedula='"+cedula+"');");
    }

    public ResultSet consultarClientes(){
        return consulta("SELECT * FROM Clientes");
    }
}
