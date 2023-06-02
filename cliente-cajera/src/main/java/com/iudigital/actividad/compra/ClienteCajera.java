package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajera {

    public static void main(String[] args) {
       
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Peter", productos);
        ClienteProducto cliente2 = new ClienteProducto("Charlie", productos);
        
       long tiempoInicial = System.currentTimeMillis();
       CajeraProducto cajera1 = new CajeraProducto("Emma");
       CajeraProducto cajera2 = new CajeraProducto("Clareth");
       
       cajera1.procesarCompra(cliente1, tiempoInicial);
       cajera2.procesarCompra(cliente2, tiempoInicial);
       
    }
    
    private static void setProductos(List<Producto> productos){
        Producto producto1 = new Producto("Manzana",200,6);
        Producto producto2 = new Producto("Aguacate",10000,3);
        Producto producto3 = new Producto("Peras",5600,2);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
    
}
