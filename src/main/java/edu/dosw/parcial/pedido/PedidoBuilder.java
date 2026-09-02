package edu.dosw.parcial.pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoBuilder {
    private static final int MAX_PRODUCTOS = 5;

    private String usuario;
    private final List<ItemPedido> items = new ArrayList<>();
    private PreferenciaEntrega entrega;

    public PedidoBuilder usuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public PedidoBuilder agregarItem(ItemPedido item){
        if(items.size() >= MAX_PRODUCTOS){
            throw new IllegalStateException("Un pedido no puede contener más de " + MAX_PRODUCTOS + "productos.");
        }
        items.add(item);
        return this;
    }

    public PedidoBuilder entrega(PreferenciaEntrega entrega){
        this.entrega = entrega;
        return this;
    }

    public String getUsuario() {
        return usuario;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public PreferenciaEntrega getEntrega() {
        return entrega;
    }

    public Pedido confirmar(){
        if(usuario == null || items.isEmpty() || entrega == null){
            throw new IllegalStateException("Usuario, al menos un producto y una entrega son obligatorios.");
        }
        return new Pedido(this);
    }
}
