package view;

import java.util.Scanner;
import model.*;
import controller.*;

public class MenuSistema {
    
    Supermercado supermercado;
    private Dependiente auxDep;
    Scanner entrada = new Scanner(System.in);

    // menú del sistema
    public void ingresoGestor() {
        int opcion;
        do {
            System.out.println("============= SISTEMA DE VENTAS DEL supermercado =============\n");
            System.out.println("1.-INGRESAR AL SISTEMA");
            System.out.println("2.-SALIR\n");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresoSistema();
                    break;
                default:
                    System.out.println("\n============= GRACIAS POR USAR EL SISTEMA =============\n");
            }
        } while (opcion != 2);
    }

    // M ingresar al sistema
    public void ingresoSistema() {
        System.out.println("\n============= INICIAR SESIÓN =============\n");
        System.out.print("Usuario: ");
        String usuario = entrada.next();
        System.out.print("Contraseña: ");
        String contra = entrada.next();
        if (supermercado.administrador.getAdmUsuario().equals(usuario)
                && supermercado.administrador.getAdmContrasena().equals(contra)) {
            // metodo para el menu- importar desde gestor aqui
            //opcionesAdmin();
        } else {
            auxDep = (Dependiente) supermercado.buscarDependiente(usuario);
            if (auxDep != null && auxDep.contraDep.equals(contra)) {
                System.out.println("Bienvenido " + auxDep.nomPer + " " + auxDep.apePer);
                // metodo para el menu- importar desde gestor aqui
                // opcionesDependiente();
            } else {
                System.out.println("\nAVISO: Usuario inexistente o contraseña incorrecta\n");
            }
        }
    }

    

}
