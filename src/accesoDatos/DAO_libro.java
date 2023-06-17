/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_libro;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_libro {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_libro(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_libro(Modelo_libro modelo_libro){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO libro VALUES ('" +
                modelo_libro.getIsbn_libro()+ "', '" + 
                modelo_libro.getTitulo_libro() + "', '" + 
                modelo_libro.getAnyo_de_publicacion_libro()+ "', '" + 
                modelo_libro.getIdioma_libro()+ "', '" + 
                modelo_libro.getNumero_de_paginas_libro()+ "', '" + 
                modelo_libro.getCodigo_area_de_conocimiento_libro()+ "', '" + 
                modelo_libro.getCodigo_editorial_libro() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public Modelo_libro seleccionar_libro(String isbn_libro){

        Modelo_libro modelo_libro= new Modelo_libro();
        
        String sql_select;
        sql_select="SELECT "
                + "isbn_libro, "
                + "titulo_libro, "
                + "anyo_de_publicacion_libro, "
                + "idioma_libro, "
                + "numero_de_paginas_libro, "
                + "codigo_area_de_conocimiento_libro, "
                + "codigo_editorial_libro "
                + "FROM libro WHERE isbn_libro = '" + isbn_libro +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               modelo_libro.setIsbn_libro(seleccion.getString(1));
               modelo_libro.setTitulo_libro(seleccion.getString(2));
               modelo_libro.setAnyo_de_publicacion_libro(seleccion.getString(3));
               modelo_libro.setIdioma_libro(seleccion.getString(4));
               modelo_libro.setNumero_de_paginas_libro(seleccion.getString(5));
               modelo_libro.setCodigo_area_de_conocimiento_libro(seleccion.getString(6));
               modelo_libro.setCodigo_editorial_libro(seleccion.getString(7));
            }
            
            System.out.println("Seleccion exitosa");
           
            return modelo_libro;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
}
