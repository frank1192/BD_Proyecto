/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Modelo_area_de_conocimiento;
//import Vistas.Vista_area_de_conocimiento;
import accesoDatos.area_de_conocimiento_DAO;


/**
 *
 * @author juanc
 */
public class Controlador_area_de_conocimiento {
            
    area_de_conocimiento_DAO area_de_conocimiento_dao;
    
    public Controlador_area_de_conocimiento(){
        area_de_conocimiento_dao = new area_de_conocimiento_DAO();           
    }
    
    public void agregar_area_de_conocimiento(String  codigo_area_de_conocimiento, String nombre_area_de_conocimiento, String descripcion_area_de_conocimiento, String codigo_area_padre){
        Modelo_area_de_conocimiento modelo_area_de_conocimiento = new Modelo_area_de_conocimiento();        

        modelo_area_de_conocimiento.setCodigo_area_de_conocimiento(codigo_area_de_conocimiento);
        modelo_area_de_conocimiento.setNombre_area_de_conocimiento(nombre_area_de_conocimiento);
        modelo_area_de_conocimiento.setDescripcion_area_de_conocimiento(descripcion_area_de_conocimiento);
        modelo_area_de_conocimiento.setCodigo_area_padre(codigo_area_padre);
        
        area_de_conocimiento_dao.insertar_area_de_conocimiento(modelo_area_de_conocimiento);
        
        System.out.println("Se agrego una nueva area de conocimiento");
    }

    public Modelo_area_de_conocimiento consultar_area_de_conocimiento(String codigo_area_de_conocimiento){
        
        Modelo_area_de_conocimiento modelo_area_de_conocimiento = area_de_conocimiento_dao.seleccionar_area_de_conocimiento(codigo_area_de_conocimiento);
      
        return modelo_area_de_conocimiento;
    }
}
