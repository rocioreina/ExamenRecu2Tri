package Ejercicio2.modelo;

public class Compra {
    String producto;
    double precio;
    String id_cliente; //pensaba usar el DNI de Cliente como id, ya que este no se repetira

    public Compra(String producto, double precio, String id_cliente) {
        this.producto = producto;
        this.precio = precio;
        this.id_cliente = id_cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "producto='" + producto + '\'' +
                ", precio=" + precio +
                ", id_cliente='" + id_cliente + '\'' +
                '}';
    }
}
