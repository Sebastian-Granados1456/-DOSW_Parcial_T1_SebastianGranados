package edu.dosw.parcial.pedido.extras;

public abstract class ExtraDecorator implements ProductoPersonalizable{
    protected final ProductoPersonalizable productoPersonalizado;
    protected ExtraDecorator(ProductoPersonalizable productoPersonalizado){
        this.productoPersonalizado = productoPersonalizado;
    }
}
