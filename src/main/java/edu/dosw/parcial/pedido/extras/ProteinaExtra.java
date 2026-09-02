package edu.dosw.parcial.pedido.extras;

public class ProteinaExtra extends ExtraDecorator{
    public ProteinaExtra(ProductoPersonalizable productoPersonalizado) {
        super(productoPersonalizado);
    }

    @Override
    public String getDescripcion() {
        return productoPersonalizado.getDescripcion() + "Proteína extra";
    }

    @Override
    public double getPrecio() {
        return productoPersonalizado.getPrecio() + 2000;
    }
}
