package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;

public class CajeraProducto {
    
    private String nombre;

    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    
    public void procesarCompra(ClienteProducto cliente, long timeStamp){
        
        System.out.println("La cajera " + this.nombre
                        + " comienza a procesar la compra del cliente"
                        + cliente.getNombre() 
                        + " en el tiempo "
                        + (System.currentTimeMillis() - timeStamp) /1000
                        + " seg");
        
        int contCliente = 1;
        for (Producto producto : cliente.getProductos()){
            this.esperarXsegundos();
            System.out.println(" Procesado el producto"
                    + contCliente 
                    + " nombre producto: "
                    +  producto.getNombre()
                    + " precio producto " 
                    + producto.getPrecio()
                    + "cantidad de productos "
                    +  producto.getCantidad()
                    + " Costo total del producto"
                    + producto.getCantidad() * producto.getPrecio()
                    + " -> tiempo: "
                    + (System.currentTimeMillis() - timeStamp) /1000
                    + " seg"
            );
        }
        
        System.out.println(" La cajera " + this.nombre + " ha terminado de procesar "
                + cliente.getNombre()
                + " En el tiempo "
                + (System.currentTimeMillis() - timeStamp) /1000
                + " seg "                
                );
        
    }
    
    private void esperarXsegundos(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
