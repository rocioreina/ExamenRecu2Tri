package Ejercicio2.controlador;

import Ejercicio2.dao.ClienteDAO;
import Ejercicio2.modelo.Cliente;
import Ejercicio2.modelo.Compra;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controlador {
    private ClienteDAO clienteDAO;
    private ArrayList<Cliente> clientes;

    public Controlador() throws SQLException {
        clienteDAO = new ClienteDAO();
        clientes = clienteDAO.getClientesCompras();
    }

        public void insertarUsuarioCompras(Cliente cliente) throws SQLException {
            String nombre = cliente.getNombre();
            String dni = cliente.getDni();
            clienteDAO.insertarCliente(nombre, dni);
            for (Compra compra : cliente.getCompras()) {
                clienteDAO.insertarCompra(compra.getProducto(), compra.getPrecio(), dni);
            }
        }
            public ArrayList<Cliente> getClientes() {
                return clientes;
            }

            public void modificarCliente(String nombre, String dni) throws SQLException {
                clienteDAO.modificar(nombre,dni);
            }

            public void borrarCliente(String nombre) throws SQLException {
                clienteDAO.borrar(nombre);
            }

            public void insertarCompraCliente(String producto, double precio, String cliente) throws SQLException {
                clienteDAO.insertarCompra(producto,precio,getClienteID(cliente));
            }

            public String getClienteID(String nombre) throws SQLException {
                return clienteDAO.getClientePorNombre(nombre);
            }

        }


