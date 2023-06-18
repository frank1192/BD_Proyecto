/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_descarga_de_libro;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_descarga_de_libro {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_descarga_de_libro(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_descarga_de_libro(Modelo_descarga_de_libro modelo_descarga_de_libro){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO descarga_de_libro VALUES ('" +
                modelo_descarga_de_libro.getIp_descarga()+ "', '" + 
                modelo_descarga_de_libro.getCodigo_usuario_descarga() + "', '" + 
                modelo_descarga_de_libro.getIsbn_libro_digital_descarga()+ "', '" + 
                modelo_descarga_de_libro.getFecha_descarga()+ "', '" + 
                modelo_descarga_de_libro.getHora_deacarga() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public Modelo_descarga_de_libro seleccionar_descarga_de_libro(String ip_descarga){

        Modelo_descarga_de_libro modelo_descarga_de_libro= new Modelo_descarga_de_libro();
        
        String sql_select;
        sql_select="SELECT "
                + "ip_descarga, "
                + "codigo_usuario_descarga, "
                + "isbn_libro_digital_descarga, "
                + "fecha_descarga, "
                + "hora_deacarga "
                + "FROM descarga_de_libro WHERE ip_descarga = '" + ip_descarga +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               modelo_descarga_de_libro.setIp_descarga(seleccion.getString(1));
               modelo_descarga_de_libro.setCodigo_usuario_descarga(seleccion.getString(2));
               modelo_descarga_de_libro.setIsbn_libro_digital_descarga(seleccion.getString(3));
               modelo_descarga_de_libro.setFecha_descarga(seleccion.getString(4));
               modelo_descarga_de_libro.setHora_deacarga(seleccion.getString(5));
            }
            
            System.out.println("Seleccion exitosa");
           
            return modelo_descarga_de_libro;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
}
