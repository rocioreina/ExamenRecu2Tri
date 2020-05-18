package Ejercicio2.dao;

import Ejercicio2.modelo.Cliente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    DbConnector conn;

    public ClienteDAO() throws SQLException {
        conn= new DbConnector();
    }

    public ArrayList<Cliente>getClientesCompras() throws SQLException{
        ArrayList<Cliente> datos = new ArrayList<>();
        ResultSet resultSet = conn.select("select * from Cliente");
    }
}
