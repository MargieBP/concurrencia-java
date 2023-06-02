package com.iudigital.actividad.compra.thread;

import com.iudigital.actividad.compra.CajeraProducto;
import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajeraThread {
    
    public static void main(String[] args){
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Peter", productos);
        ClienteProducto cliente2 = new ClienteProducto("Charlie", productos);
        
       long tiempoInicial = System.currentTimeMillis();
       CajeraThreadProducto cajera1 = new CajeraThreadProducto("Emma", cliente1, tiempoInicial);
       CajeraThreadProducto cajera2 = new CajeraThreadProducto("Clareth", cliente2, tiempoInicial);
       
       cajera1.start();
       cajera2.start();
    
    }
    
    public static void setProductos(List<Producto> productos) {
        
        Producto p1 = new Producto("Carne molida",1000, 5 );
        Producto p2 = new Producto("Aceite",5000, 2 );
        Producto p3 = new Producto("Arroz",12000, 1 );
        
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
    
    }
}
