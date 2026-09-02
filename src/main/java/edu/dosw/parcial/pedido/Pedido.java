package edu.dosw.parcial.pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static final int MAX_PRODUCTOS = 5;
    private static final double PRECIO_MINIMO = 3500;

    private final String usuario;
    private final List<ItemPedido> items;
    private final PreferenciaEntrega entrega;

    public Pedido(PedidoBuilder builder) {
        this.usuario = builder.getUsuario;
        this.items = builder.getItems();
        this.entrega = builder.getEntrega;
    }

    public String getUsuario() {
        return usuario;
    }

    public List<ItemPedido> getItems() {
        return items;
    }

    public PreferenciaEntrega getEntrega(){
        return entrega;
    }

    public double calcularTotal(){
        List<Double> subtotales = new ArrayList<>();
        for(ItemPedido item : items){
            subtotales.add(item.getPrecio());
        }
        double totalProductos = subtotales.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
        return totalProductos + entrega.getPrecio();
    }

    public String describir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Descripción del pedido: \n");

        int contador = 1;
        for (ItemPedido item : items){
            sb.append("Producto #").append(contador).append(":\n");
            sb.append(item.getDescripcion()).append("\n");
            sb.append("Subtotal: $").append((long) item.getPrecio()).append("\n");
            contador++;
        }
        sb.append(entrega.getDescripcion()).append("\n");
        sb.append("TOTAL: $").append((long) calcularTotal()).append("\n");
        sb.append(calcularTotal() >= PRECIO_MINIMO ? "Estado: CONFIRMADO" : "Estado: RECHAZADO");

        return sb.toString();
    }

    public static int getMaxProductos(){
        return MAX_PRODUCTOS;
    }
}