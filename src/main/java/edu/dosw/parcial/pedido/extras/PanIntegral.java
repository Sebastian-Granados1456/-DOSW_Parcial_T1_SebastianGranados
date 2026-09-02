package edu.dosw.parcial.pedido.extras;

public class PanIntegral extends ExtraDecorator{
    public PanIntegral(ProductoPersonalizable productoPersonalizado) {
        super(productoPersonalizado);
    }

    @Override
    public String getDescripcion() {
        return productoPersonalizado.getDescripcion() + " + Pan Integral";
    }

    @Override
    public double getPrecio() {
        return productoPersonalizado.getPrecio() + 500;
    }
}
