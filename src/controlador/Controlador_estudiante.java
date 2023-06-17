/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Modelo_estudiante;
//import Vistas.Vista_libro;
import accesoDatos.DAO_estudiante;

/**
 *
 * @author juanc
 */
public class Controlador_estudiante {
            
    DAO_estudiante dao_usuario;
    
    public Controlador_estudiante(){
        dao_usuario = new DAO_estudiante();
    }
    
    public void agregar_estudiante(String codigo_usuario_estudiante, String universidad_estudiante, String carrera_estudiante){
        Modelo_estudiante modelo_estudiante = new Modelo_estudiante();        

        modelo_estudiante.setCodigo_usuario_estudiante(codigo_usuario_estudiante);
        modelo_estudiante.setUniversidad_estudiante(universidad_estudiante);
        modelo_estudiante.setCarrera_estudiante(carrera_estudiante);
        
        dao_usuario.insertar_estudiante(modelo_estudiante);
    }

    public Modelo_estudiante consultar_estudiante(String codigo_usuario_estudiante){
        
        Modelo_estudiante modelo_usuario = dao_usuario.seleccionar_estudiante(codigo_usuario_estudiante);
      
        return modelo_usuario;
    }
}
