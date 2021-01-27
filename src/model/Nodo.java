/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ASUS
 */
public class Nodo {
    public Object dato;
    public Nodo siguiente;
    
    public Nodo(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
