package edu.dosw.parcial.pedido;

import edu.dosw.parcial.pedido.extras.*;

import java.util.Scanner;

public class GestorPedidos {

    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a UNIVERSITY FOOD HUB");
        System.out.println("Arma tu pedido:");

        System.out.println("Ingrese su correo:");
        String usuario = scanner.nextLine();

        PedidoBuilder builder = new PedidoBuilder();
        builder.usuario(usuario);

        boolean agregarMasExtras = true;
        while(agregarMasExtras && builder.getItems().size() < Pedido.getMaxProductos()){
            System.out.println("Elija el producto base:");
            System.out.println("1. Bandeja universitaria $8.500");
            System.out.println("2. Sandwich              $5.000");
            System.out.println("3. Jugo Natural          $2.500");
            int opcionProducto = Integer.parseInt(scanner.nextLine());

            ProductoPersonalizable producto;
            if (opcionProducto == 1){
                producto = new ProductoBase(Producto.BANDEJA_UNIVERSITARIA);
            } else if (opcionProducto == 2) {
                producto = new ProductoBase(Producto.SANDWICH);
            } else {
                producto = new ProductoBase(Producto.JUGO_NATURAL);
            }
            System.out.println("Desea proteína extra? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s")){
                producto = new ProteinaExtra(producto);
            }

            System.out.println("Desea aguacate? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s")){
                producto = new Aguacate(producto);
            }

            System.out.println("Desea pan integral? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s")){
                producto = new PanIntegral(producto);
            }

            System.out.println("Desea queso? (s/n)");
            if(scanner.nextLine().equalsIgnoreCase("s")){
                producto = new Queso(producto);
            }

            builder.agregarItem(new ItemPedido(producto));

            if (builder.getItems().size() < Pedido.getMaxProductos()){
                System.out.println("Desea agregar otro producto? (s/n)");
                agregarMasExtras = scanner.nextLine().equalsIgnoreCase("s");
            }
        }

        System.out.println("Elija su preferencia de entrega:");
        System.out.println("1. Para llevar");
        System.out.println("2. Consumo local");
        int opcionEntrega = Integer.parseInt(scanner.nextLine());
        if(opcionEntrega == 1){
            builder.entrega(PreferenciaEntrega.PARA_LLEVAR);
        } else {
            builder.entrega(PreferenciaEntrega.CONSUMO_LOCAL);
        }

        Pedido pedido = builder.confirmar();

        System.out.println(pedido.describir());
        System.out.println("Gracias por tu pedido en UNIVERSITY FOOD HUB");
    }
}
