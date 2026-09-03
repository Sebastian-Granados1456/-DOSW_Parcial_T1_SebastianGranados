package edu.dosw.parcial.pedido;

import edu.dosw.parcial.pedido.extras.ProductoPersonalizable;

public class ItemPedido {
    private final ProductoPersonalizable productoPersonalizado;

    public ItemPedido(ProductoPersonalizable productoPersonalizado){
        this.productoPersonalizado = productoPersonalizado;
    }

    public ProductoPersonalizable getProductoPersonalizado() {
        return productoPersonalizado;
    }

    public double getPrecio(){
        return productoPersonalizado.getPrecio();
    }

    public String getDescripcion(){
        return productoPersonalizado.getDescripcion();
    }
}
