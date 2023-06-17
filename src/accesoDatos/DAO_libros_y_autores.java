/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_libros_y_autores;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_libros_y_autores {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_libros_y_autores(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_libros_y_autores(Modelo_libros_y_autores modelo_libros_y_autores){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO libros_y_autores VALUES ('" +
                modelo_libros_y_autores.getCodigo_autor_lya()+ "', '" + 
                modelo_libros_y_autores.getIsbn_libro_lya() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public String/*Modelo_libros_y_autores*/ seleccionar_libros_de_autor(String codigo_autor_lya){

//        Modelo_libros_y_autores modelo_libros_y_autores = new Modelo_libros_y_autores();
        
        String lista_de_libros = "";
        
        String sql_select;
        sql_select="SELECT "
                + "isbn_libro_lya "
                + "FROM libros_y_autores WHERE codigo_autor_lya = '" + codigo_autor_lya +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               lista_de_libros = lista_de_libros + "- " + seleccion.getString(1) + "\n";/*modelo_libros_y_autores.setIsbn_libro_lya(seleccion.getString(1));*/
            }
            
            System.out.println("Seleccion exitosa");
           
            return lista_de_libros/*modelo_libros_y_autores*/;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
    public String/*Modelo_libros_y_autores*/ seleccionar_autores_de_libro(String isbn_libro_lya){

//        Modelo_libros_y_autores modelo_libros_y_autores = new Modelo_libros_y_autores();
        
        String lista_de_autores = "";
        
        String sql_select;
        sql_select="SELECT "
                + "codigo_autor_lya "
                + "FROM libros_y_autores WHERE isbn_libro_lya = '" + isbn_libro_lya +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               lista_de_autores = lista_de_autores + "- " + seleccion.getString(1) + "\n";/*modelo_libros_y_autores.setIsbn_libro_lya(seleccion.getString(1));*/
            }
            
            System.out.println("Seleccion exitosa");
           
            return lista_de_autores/*modelo_libros_y_autores*/;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
}