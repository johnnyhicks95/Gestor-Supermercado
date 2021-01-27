/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ASUS
 */
public class Mensajes {

    public enum MENU {
        ENCABEZADO_MENU           ( "============= SISTEMA DE VENTAS DEL SUPERMERCADO =============" ),
        ENCABEZADO_MENU_LOGIN   ( "==== Menú de Login ====" ),
        ENCABEZADO_MENU_SALIDA    ( "==== GRACIAS POR USAR EL SISTEMA ====" ),
        OPCION                   ( "Opción: " ),
        OPCION1                   ( "1. INGRESAR AL SISTEMA" ),
        OPCION2                   ( "2. SALIR" );

        private String valor;

        private MENU( String v ) {
            valor = v;
        }
        
        public String tx(){
            return valor;
        }
    }

    public enum MENU_ADMIN {
        ENCABEZADO_MENU           ( "============= ADMINISTRADOR / INICIAR SESIÓN =============" ),
        ENCABEZADO_MENU_LOGIN   ( "==== Ingresar a la cuenta ==== (modo admin o dependiente)" ),
        ENCABEZADO_MENU_SALIDA    ( "==== GRACIAS POR USAR EL SISTEMA ====" ),
        OPCION                   ( "Opción: " ),
        OPCION1                   ( "1. INGRESAR AL SISTEMA" ),
        OPCION2                   ( "2. SALIR" ),
        USUARIO                   ( "Usuario(admin:admin || dep: 1122): " ),
        CONTRASENA                   ( "Contraseña(1234): " ),
        
        BANNER_MENU                   ( "\n============= MENU / ADMIN =============\n" ),
        MENU1                   ( "1. DEPENDIENTE" ),
        MENU2                   ( "2. CLIENTE" ),
        MENU3                   ( "3. INVENTARIO" ),
        MENU4                   ( "4. FACTURAS" ),
        MENU5                   ( "5. SALIR\n" ),
        ;

        private String valor;

        private MENU_ADMIN( String v ) {
            valor = v;
        }
        
        public String tx(){
            return valor;
        }
    }
    
    public enum INGRESAR{
        OPCION                      ("Opción: "),
        CEDULA                      ("Cédula:"),
        CEDULA_CLIENTE               ("Cédula cliente:"),
        NOMBRE                      ("Nombre: "),
        APELLIDO                    ("Apellido: "),
        SEXO                        ("Sexo(M/F): "),
        EDAD                         ("Edad: "),
        COD_DEP                     ("Código: "),
        CONTRASENA                  ("Contraseña: "),
        CANT                         ("Cantidad: "),
        FECHA                        ("Fecha: "),
        DIRECCION                   ("Dirección: "),
        TELEFONO                    ("Teléfono: "),
        ;
        private  String mensaje;
        
        private INGRESAR(String msj){
            this.mensaje=msj;
        }
        
        public String tx(){
            return this.mensaje;
        }
        
    }

    public enum PRODUCTO{
        CODIGO_PRODUCTO         ("Código de producto: "),
        ELIMINADO_PRODUCTO         ("\nAVISO: Producto eliminado correctamente\n"),
        
        PRECIO                  ("Precio(ctvs): "),
        CANTIDAD                 ("Cantidad: "),
        
        
        SIN_VENTAS              ("\nAVISO: No se ha vendido nada AÚN\n"),
        
        NUEVO_PRODUCTO              ("\n============= NUEVO PRODUCTO =============\n"),
        MODIFICAR_PRODUCTO              ("\n============= MODIFICAR PRODUCTO =============\n"),
        ELIMINAR_PRODUCTO              ("\n============= ELIMINAR PRODUCTO =============\n"),
        ;
        private  String mensaje;
        
        private PRODUCTO(String msj){
            this.mensaje=msj;
        }
        
        public String tx(){
            return this.mensaje;
        }
        
    }

    public enum CONSUMO{
        CODIGO_PRODUCTO         ("Código de producto: "),        
        
        SIN_CONSUMOS              ("\nAVISO: No existen consumos aún\n"),
        
        ;
        private  String mensaje;
        
        private CONSUMO(String msj){
            this.mensaje=msj;
        }
        
        public String tx(){
            return this.mensaje;
        }
        
    }

    public enum INVENTARIO{
        BANNER_MENU              ("\n============= MENU / ADMIN/ INVENTARIO =============\n"),        
        
        OPCION                   ( "Opción: " ),
        OPCION1                   ( "1. INGRESAR NUEVO" ),
        OPCION2                   ( "2. MODIFICAR NUEVO" ),
        OPCION3                   ( "3. ELIMINAR" ),
        OPCION4                   ( "4. LISTAR" ),
        OPCION5                   ( "5. SALIR\n" ),
        
        ;
        private  String mensaje;
        
        private INVENTARIO(String msj){
            this.mensaje=msj;
        }
        
        public String tx(){
            return this.mensaje;
        }
        
    }

    public enum NOTIF {
        NUEVO_DEPENDIENTE    ( "Datos del DEPENDIENTE registrados exitosamente" ),
        ELIMINADO_DEPENDIENTE    ( "\nAVISO: Dependiente eliminado correctamente" ),
        
        NUEVO_CLIENTE       ( "Datos del CLIENTE registrados exitosamente" ),
        DATOS_ACTUALIZADOS      ( "\nAVISO: Los datos fueron actualizados correctamente" )
        ;

        private String valor;

        private NOTIF( String v ) {
            valor = v;
        }
        
        public String tx(){
            return valor;
        }
    }

    public enum ADMIN_CLIENTES {
        BANNER_MENU                ( "\n============= MENU / ADMIN/ CLIENTE =============\n" ),
        ELIMINADO_DEPENDIENTE    ( "\nAVISO: Dependiente eliminado correctamente" ),

        OPCION                   ( "Opción: " ),
        OPCION1                   ( "1. MODIFICAR" ),
        OPCION2                   ( "2. ELIMINAR" ),
        OPCION3                   ( "3. LISTAR" ),
        OPCION4                   ( "4. SALIR\n" ),
        ;

        private String valor;

        private ADMIN_CLIENTES( String v ) {
            valor = v;
        }
        
        public String tx(){
            return valor;
        }
    }

    public enum ERROR {
        OPCION_INCORRECTA            ( "--> Opción incorrecta, intente de nuevo\n" ),
        AVISO_NO_VALIDO              ( "AVISO! Usuario inexistente o contraseña incorrecta\n" ),
        NUEVO_NODO                  ( "No hay memoria disponible para insertar una nuevo nodo." ),
        CEDULA_ERRONEA                  ( "\nAVISO: Cédula errónea o cliente inexistente\n"),
        PRODUCTO_ERRONEO                  ( "\nAVISO: Identificador erroneo o producto inexistente\n"),
        
        DEPENDIENTE_EN_USO           ( "AVISO: El código de este dependiente ya está en uso, ingrese un código válido\n" ),
        ;    
        
        private String valor;

        private ERROR( String v ) {
            valor = v;
        }
        
        public String tx(){
            return valor;
        }
    }
    
    
    
}
