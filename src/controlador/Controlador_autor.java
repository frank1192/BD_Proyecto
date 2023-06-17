/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Modelo_autor;
import accesoDatos.DAO_autor;

/**
 *
 * @author juanc
 */
public class Controlador_autor {
            
    DAO_autor dao_autor;
    
    public Controlador_autor(){
        dao_autor = new DAO_autor();
    }
    
    public void agregar_autor(String codigo_autor, String primer_nombre_autor, String segundo_nombre_autor, String primer_apellido_autor, String segundo_apellido_autor){
        Modelo_autor modelo_autor = new Modelo_autor();        

        modelo_autor.setCodigo_autor(codigo_autor);
        modelo_autor.setPrimer_nombre_autor(primer_nombre_autor);
        modelo_autor.setSegundo_nombre_autor(segundo_nombre_autor);
        modelo_autor.setPrimer_apellido_autor(primer_apellido_autor);
        modelo_autor.setSegundo_apellido_autor(segundo_apellido_autor);
        
        dao_autor.insertar_autor(modelo_autor);
    }

    public Modelo_autor consultar_autor(String codigo_autor){
        
        Modelo_autor modelo_autor = dao_autor.seleccionar_autor(codigo_autor);
      
        return modelo_autor;
    }
}
