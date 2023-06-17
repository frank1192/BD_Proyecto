/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controlador;

import modelo.Modelo_libro_fisico;
//import Vistas.Vista_libro_fisico;
import accesoDatos.DAO_libro_fisico;

/**
 *
 * @author juanc
 */
public class Controlador_libro_fisico {
            
    DAO_libro_fisico dao_libro_fisico;
    
    public Controlador_libro_fisico(){
        dao_libro_fisico = new DAO_libro_fisico();           
    }
    
    public void agregar_libro_fisico(String isbn_libro_ejemplar, String numero_ejemplar, String sala_ejemplar, String pasillo_ejemplar, String estante_ejemplar, String cajon_ejemplar){
        Modelo_libro_fisico modelo_libro = new Modelo_libro_fisico();

        modelo_libro.setIsbn_libro_ejemplar(isbn_libro_ejemplar);
        modelo_libro.setNumero_ejemplar(numero_ejemplar);
        modelo_libro.setSala_ejemplar(sala_ejemplar);
        modelo_libro.setPasillo_ejemplar(pasillo_ejemplar);
        modelo_libro.setEstante_ejemplar(estante_ejemplar);
        modelo_libro.setCajon_ejemplar(cajon_ejemplar);
        
        dao_libro_fisico.insertar_libro_fisico(modelo_libro);
    }

    public Modelo_libro_fisico consultar_libro_fisico(String isbn_libro_ejemplar){
        
        Modelo_libro_fisico modelo_libro = dao_libro_fisico.seleccionar_libro_fisico(isbn_libro_ejemplar);
      
        return modelo_libro;
    }
}
