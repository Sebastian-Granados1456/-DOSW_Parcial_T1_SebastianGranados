package edu.dosw.parcial.pedido;

public enum Producto {
    BANDEJA_UNIVERSITARIA ("Bandeja Universitaria", 8500),
    SANDWICH ("Sandwich", 5000),
    JUGO_NATURAL ("Jugo Natural", 2500);

    private final String nombre;
    private final double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String  getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
