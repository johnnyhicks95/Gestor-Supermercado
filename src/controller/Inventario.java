/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Productos;

/**
 *
 * @author ASUS
 */
public class Inventario {
    
    public static Lista productos;
    
    public Inventario() {
        productos = new Lista();
    }

    public boolean registrarProductos(Productos producto) {
        return productos.insertar(producto);
    }

    public void listaProductos() {
        productos.imprimir();
    }

    public static boolean quitarProductosInventario(String codArt, int cantArt) {
        Productos auxProducto = (Productos) productos.buscar(codArt);
        if ((auxProducto != null && auxProducto.cantidad != 0) && auxProducto.cantidad >= cantArt) {
            auxProducto.cantidad = auxProducto.cantidad - cantArt;
            return true;
        }
        System.out.println("No hay productos en el inventario");
        return false;
    }
    
    public static boolean restaurarProductosInventario(String codArt,int cantArt){
        Productos auxProducto = (Productos) productos.buscar(codArt);
        if ( auxProducto!=null ) {
            auxProducto.cantidad = auxProducto.cantidad + cantArt;
            return true;
        }
        return false;
    }

   
    
}
