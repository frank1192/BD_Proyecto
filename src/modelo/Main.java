
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
        
        Vista_libro_digital XD = new Vista_libro_digital();

        XD.setVisible(true);

//        VistaIniciarSesion view = new VistaIniciarSesion ();
//        ModeloIniciarSesion model = new ModeloIniciarSesion("Usuario", "Contraseña");
//        InterfaceIniciarSesionDAO daoAministrador = new IniciarSesion_DAO();
//        ControladorIniciarSesion ctrl = new ControladorIniciarSesion (view,model, daoAministrador);

//        ctrl.iniciar();

//        view.setVisible(true);

    }
    
}
    

