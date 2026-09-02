package edu.dosw.parcial.pedido.extras;

public class Queso extends ExtraDecorator{
    public Queso(ProductoPersonalizable productoPersonalizado) {
        super(productoPersonalizado);
    }

    @Override
    public String getDescripcion() {
        return productoPersonalizado.getDescripcion() + "+ Queso";
    }

    @Override
    public double getPrecio() {
        return productoPersonalizado.getPrecio() + 800;
    }
}
