package Ejercicio2;

import Ejercicio2.controlador.Controlador;
import Ejercicio2.modelo.Cliente;
import Ejercicio2.modelo.Compra;

import java.sql.SQLException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws SQLException {
        Controlador controlador= new Controlador();

        //Ejercicio 1
        ArrayList<Compra> compras1= new ArrayList<Compra>();
        Compra compra1= new Compra("Chaleco", 30.00, "12345678A");
        Compra compra2= new Compra("Tableta",250.00,"12345678A");
        Compra compra3= new Compra("Queso Curado", 15.00, "12345678A");
        compras1.add(compra1);
        compras1.add(compra2);
        compras1.add(compra3);
        Cliente cliente1= new Cliente("Pedro Garcia Contreras", "12345678A",compras1);
        controlador.insertarUsuarioCompras(cliente1);

        ArrayList<Compra> compras2 = new ArrayList<Compra>();
        Compra compra4 = new Compra("Zapatos", 30.00, "12345678A");
        Compra compra5 = new Compra ("Movil", 200.0, "12345678A");
        Compra compra6 = new Compra ("Cafe en grano", 15.00, "12345678A");
        compras2.add(compra4);
        compras2.add(compra5);
        compras2.add(compra6);
        Cliente cliente2= new Cliente ("Ana Pérez Rodriguez", "23456789B", compras2);
        controlador.insertarUsuarioCompras(cliente2);

        //Ejercicio2
        System.out.prinln(controlador.getClientes());

        //Ejercicio3
        String nombre = "Pedro Garcia Contreras";
        String dni = "12345678C";
        controlador.modificarCliente(nombre,dni);

        //Ejercicio 4
        String nombre1 = "Ana Pérez Rodríguez";
        controlador.borrarCliente(nombre1);

        //Ejercicio 5
        controlador.insertarCompraCliente("Ensalada",4.00, "Pedro García Contreras");
    }
}
