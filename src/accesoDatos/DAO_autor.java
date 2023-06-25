/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_autor;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_autor {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_autor(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_autor(Modelo_autor modelo_autor){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO autor VALUES ('" +
                modelo_autor.getCodigo_autor()+ "', '" + 
                modelo_autor.getPrimer_nombre_autor() + "', '" + 
                modelo_autor.getSegundo_nombre_autor()+ "', '" + 
                modelo_autor.getPrimer_apellido_autor()+ "', '" + 
                modelo_autor.getSegundo_apellido_autor() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public Modelo_autor seleccionar_autor(String codigo_autor){

        Modelo_autor modelo_autor= new Modelo_autor();
        
        String sql_select;
        sql_select="SELECT "
                + "codigo_autor, "
                + "primer_nombre_autor, "
                + "segundo_nombre_autor, "
                + "primer_apellido_autor, "
                + "segundo_apellido_autor "
                + "FROM autor WHERE codigo_autor = '" + codigo_autor +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               modelo_autor.setCodigo_autor(seleccion.getString(1));
               modelo_autor.setPrimer_nombre_autor(seleccion.getString(2));
               modelo_autor.setSegundo_nombre_autor(seleccion.getString(3));
               modelo_autor.setPrimer_apellido_autor(seleccion.getString(4));
               modelo_autor.setSegundo_apellido_autor(seleccion.getString(5));
            }
            
            System.out.println("Seleccion exitosa");
           
            return modelo_autor;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    public void eliminar_autor(String codigo_autor) {
    String sql_eliminar = "DELETE FROM autor WHERE codigo_autor = '" + codigo_autor + "'";
    
    try {
        Statement sentencia = this.conexion.createStatement();
        int numeroFilas = sentencia.executeUpdate(sql_eliminar);
        
        if (numeroFilas > 0) {
            System.out.println("Eliminación exitosa");
        } else {
            System.out.println("No se encontró el autor con el código especificado");
        }
    } catch (SQLException e) {
        System.out.println("Eliminación fallida");
        System.out.println(e);
    } catch (Exception e) {
        System.out.println("Eliminación fallida");
        System.out.println(e);
        }
    }

    
}
