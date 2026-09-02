package edu.dosw.parcial.pedido.extras;

import edu.dosw.parcial.pedido.Producto;

public class ProductoBase implements ProductoPersonalizable{

    private final Producto producto;

    public ProductoBase(Producto producto){
        this.producto = producto;
    }

    @Override
    public String getDescripcion() {
        return producto.getNombre();
    }

    @Override
    public double getPrecio() {
        return producto.getPrecio();
    }
}