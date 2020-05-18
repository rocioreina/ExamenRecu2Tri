package Ejercicio2.dao;

import Ejercicio2.modelo.Cliente;
import Ejercicio2.modelo.Compra;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClienteDAO {
    DbConnector conn;

    public ClienteDAO() throws SQLException {
        conn = new DbConnector();
    }

    public ArrayList<Cliente> getClientesCompras() throws SQLException {
        ArrayList<Cliente> datos = new ArrayList<>();
        ResultSet resultSet = conn.select("select * from Cliente");
        while (resultSet.next()) {
            String nombre = resultSet.getNString("nombre");
            String dni = resultSet.getNString("dni");
            datos.add(new Cliente(nombre, dni, getCompras(dni)));
        }
        return datos;
    }

    public ArrayList<Compra> getCompras(String cliente) throws SQLException {
        ArrayList<Compra> datos = new ArrayList<>();
        ResultSet resultSet = conn.select("select * from where id_cliente = " + cliente);
        while (resultSet.next()) {
            String producto = resultSet.getNString("producto");
            double precio = resultSet.getDouble("precio");
            String id_cliente = resultSet.getNString("id_cliente");
            datos.add(new Compra(producto, precio, id_cliente));
        }
        return datos;
    }

    public int insertarCliente(String nombre, String dni) throws SQLException {
        return conn.update("insert into Cliente values ('"+dni+"','"+nombre+"')");
    }

    public int insertarCompra(String producto, double precio, String id_cliente) throws SQLException {
        return conn.update("insert into Cliente values ('"+id_cliente+"','"+producto+"','"+precio+"')");
    }

    public int modificar(String nombre, String dni) throws SQLException {
        return conn.update("update Cliente set dni = '" + dni + "' where nombre = '" + nombre + "'");
    }

    public int borrar(String nombre) throws SQLException {
        return conn.update("delete from Cliente where nombre = '" + nombre + "'");
    }

    public String getClientePorNombre(String nombre) throws SQLException {
        ResultSet resultSet = conn.select("select dni from Cliente where nombre = '" + nombre + "'");
        String id = "";
        while (resultSet.next()) {
            id = resultSet.getString("dni");
        }
        return id;
    }
}
