/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Persona;
/**
 *
 * @author ASUS
 */
public final class Administrador extends Persona {

    private final String adminUsuario;
    private final String adminContrasena;
    
    // Administrador1: "1819", "Helder", "Barrera", 20, 'M'
    public Administrador(int cedAdm, String nomAdm, String apeAdm, int edadAdm, char sexAdm) {
        super(cedAdm, nomAdm, apeAdm, edadAdm, sexAdm);
        this.adminUsuario = "admin";
        this.adminContrasena = "1234";
    }
     
    
    public String getAdmUsuario(){
        return this.adminUsuario;
    }
    
    public String getAdmContrasena(){
        return this.adminContrasena;
    }
}
