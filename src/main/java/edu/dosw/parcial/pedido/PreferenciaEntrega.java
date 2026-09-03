package edu.dosw.parcial.pedido;

public enum PreferenciaEntrega {
    PARA_LLEVAR ("Empaque para llevar", 300),
    CONSUMO_LOCAL ("Consumo local", 0);

    private final String nombre;
    private final double precio;

    PreferenciaEntrega(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getDescripcion() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

