package edu.dosw.parcial.pedido.extras;

public class Aguacate extends ExtraDecorator{
    public Aguacate(ProductoPersonalizable productoPersonalizado) {
        super(productoPersonalizado);
    }

    @Override
    public String getDescripcion() {
        return productoPersonalizado.getDescripcion() + " + Aguacate";
    }

    @Override
    public double getPrecio() {
        return productoPersonalizado.getPrecio() + 1500;
    }
}
