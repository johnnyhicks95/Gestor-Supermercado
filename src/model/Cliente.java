/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import controller.Lista;
import controller.Factura;

/**
 *
 * @author ASUS
 */
public class Cliente extends Persona{
    // public String telfCli;
    public String dirCli;
    public Lista facturas;
    
    public Cliente(int cedCli,String nomCli,String apeCli,
      int edad,char sexCli, String dirCli){
        super(cedCli,nomCli,apeCli,edad,sexCli);
        this.dirCli=dirCli;
        facturas=new Lista();
    }
    
    @Override
    public String toString() {
        return super.toString()+"   "+this.dirCli+"     ";
    }
    
    public boolean guardarFactura(Factura factura){
        return facturas.insertar(factura);
    }
    
    
    
    
}
