/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Scanner;
import controller.Lista;
import controller.Factura;
import controller.Inventario;

/**
 *
 * @author ASUS
 */
public class Dependiente extends Persona {

    Scanner entrada = new Scanner(System.in);
    public String contraDep;
    public final String codDep;
    public Lista ventas;

    private final String dep1;
    private final String pass1;

    public Dependiente(int cedDep, String nomDep, 
      String apeDep, int edadDep, char sexDep, 
      String contraDep, String codDep) {
          
        super(cedDep, nomDep, apeDep, edadDep, sexDep);
        this.contraDep = contraDep;
        this.codDep = codDep;
        this.dep1 = "1122";
        this.pass1 = "1234";

        ventas = new Lista();
    }

    public String getDep(){
        return this.dep1;
    }
    
    public String getPass(){
        return this.pass1;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void imprimirVentas() {
        System.out.println("Venta de ");
        System.out.printf("%5s%12s%12s\n", this.codDep, this.apePer, this.nomPer);
        ventas.imprimir();
    }

    public boolean registrarFactura(Factura factura) {
        char resp;
        String codProd;
        int cantProd;
        do {
            System.out.println("Código de producto: ");
            codProd = entrada.next();
            System.out.println("Cantidad: ");
            cantProd = entrada.nextInt();
            factura.añadirProducto(codProd, cantProd);
            System.out.println("Agregar otro producto (S/N): ");
            resp = entrada.next().toUpperCase().charAt(0);
        } while (resp != 'N');
        factura.totalFactura();
        return ventas.insertar(factura);
    }

    public boolean quitarFactura(String codFac) {
        Nodo aux = ((Factura) ventas.buscar(codFac)).productosFac.primero;
        Productos auxProd = (Productos) aux.dato;
        while (aux != null) {
            Inventario.restaurarProductosInventario(auxProd.articulo.codArt, auxProd.cantidad);
            aux = aux.siguiente;
            if (aux != null) {
                auxProd = (Productos) aux.dato;
            }
        }
        return ventas.borrar(codFac);
    }

    @Override
    public boolean equals(Object codDep) {
        return (this.codDep.equals(codDep));
    }

}
