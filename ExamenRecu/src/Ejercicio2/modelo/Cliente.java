package Ejercicio2.modelo;

import java.util.ArrayList;

public class Cliente {
    String nombre, dni;
    ArrayList<Compra> compras;

    public Cliente(String nombre, String dni, ArrayList<Compra> compras) {
        this.nombre = nombre;
        this.dni = dni;
        this.compras = compras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", compras=" + compras +
                '}';
    }
}
