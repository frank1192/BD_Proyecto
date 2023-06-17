
package modelo;

import Vistas.*;
import accesoDatos.IniciarSesion_DAO;
import accesoDatos.InterfaceIniciarSesionDAO;
import controlador.ControladorIniciarSesion;



public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Vista_area_de_conocimiento XD = new Vista_area_de_conocimiento();
        
//        Vista_editorial XD = new Vista_editorial();
        
//        Vista_libro XD = new Vista_libro();
        
//        Vista_libro_fisico XD = new Vista_libro_fisico();
        
//        Vista_libro_digital XD = new Vista_libro_digital();

        Vista_autor XD = new Vista_autor();

        XD.setVisible(true);


//        String cadena = "- Hola\n- Mundo\n- Ejemplo\n- ZD\n- FF";
//        int inicio = cadena.indexOf("- ") + 2;
//        int fin = cadena.indexOf("\n", inicio);
//
//        while (inicio != -1 && fin != -1) {
//            String palabra = cadena.substring(inicio, fin);
//            System.out.println(palabra);
//
//            inicio = cadena.indexOf("- ", fin) + 2;
//            fin = cadena.indexOf("\n", inicio);
//        }
//
//        // Imprimir la última palabra
//        if (inicio != -1) {
//            String ultimaPalabra = cadena.substring(inicio);
//            System.out.println(ultimaPalabra);
//        }


//        VistaIniciarSesion view = new VistaIniciarSesion ();
//        ModeloIniciarSesion model = new ModeloIniciarSesion("Usuario", "Contraseña");
//        InterfaceIniciarSesionDAO daoAministrador = new IniciarSesion_DAO();
//        ControladorIniciarSesion ctrl = new ControladorIniciarSesion (view,model, daoAministrador);

//        ctrl.iniciar();

//        view.setVisible(true);

    }
    
}
    

