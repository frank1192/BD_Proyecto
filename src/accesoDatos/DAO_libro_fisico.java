/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_libro_fisico;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_libro_fisico {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_libro_fisico(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_libro_fisico(Modelo_libro_fisico modelo_libro_fisico){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO libro_fisico VALUES ('" +
                modelo_libro_fisico.getIsbn_libro_ejemplar()+ "', '" + 
                modelo_libro_fisico.getNumero_ejemplar() + "', '" + 
                modelo_libro_fisico.getSala_ejemplar()+ "', '" + 
                modelo_libro_fisico.getPasillo_ejemplar()+ "', '" + 
                modelo_libro_fisico.getEstante_ejemplar()+ "', '" + 
                modelo_libro_fisico.getCajon_ejemplar() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public Modelo_libro_fisico seleccionar_libro_fisico(String isbn_libro_ejemplar){

        Modelo_libro_fisico modelo_libro_fisico= new Modelo_libro_fisico();
        
        String sql_select;
        sql_select="SELECT "
                + "isbn_libro_ejemplar, "
                + "numero_ejemplar, "
                + "sala_ejemplar, "
                + "pasillo_ejemplar, "
                + "estante_ejemplar, "
                + "cajon_ejemplar "
                + "FROM libro_fisico WHERE isbn_libro_ejemplar ='" + isbn_libro_ejemplar +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               modelo_libro_fisico.setIsbn_libro_ejemplar(seleccion.getString(1));
               modelo_libro_fisico.setNumero_ejemplar(seleccion.getString(2));
               modelo_libro_fisico.setSala_ejemplar(seleccion.getString(3));
               modelo_libro_fisico.setPasillo_ejemplar(seleccion.getString(4));
               modelo_libro_fisico.setEstante_ejemplar(seleccion.getString(5));
               modelo_libro_fisico.setCajon_ejemplar(seleccion.getString(6));
            }
            
            System.out.println("Seleccion exitosa");
           
            return modelo_libro_fisico;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
}
