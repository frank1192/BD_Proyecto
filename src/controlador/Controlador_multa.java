/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Modelo_multa;
import accesoDatos.DAO_multa;

/**
 *
 * @author juanc
 */
public class Controlador_multa {
            
    DAO_multa dao_libro;
    
    public Controlador_multa(){
        dao_libro = new DAO_multa();           
    }
    
    public void agregar_multa(String codigo_multa, String fecha_multa, String valor_multa, String descripcion_multa, String codigo_usuario_multa){
        Modelo_multa modelo_multa = new Modelo_multa();        

        modelo_multa.setCodigo_multa(codigo_multa);
        modelo_multa.setFecha_multa(fecha_multa);
        modelo_multa.setValor_multa(valor_multa);
        modelo_multa.setDescripcion_multa(descripcion_multa);
        modelo_multa.setCodigo_usuario_multa(codigo_usuario_multa);
        
        dao_libro.insertar_multa(modelo_multa);
    }

    public Modelo_multa consultar_multa(String codigo_multa){
        
        Modelo_multa modelo_multa = dao_libro.seleccionar_multa(codigo_multa);
      
        return modelo_multa;
    }
}
