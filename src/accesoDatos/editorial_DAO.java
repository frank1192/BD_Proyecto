/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

import modelo.Modelo_editorial;
import java.sql.*;
/**
 *
 * @author Franklin Aguirre
 */
public class editorial_DAO {
    FachadaBD fachada;
    Connection conexion;
    public editorial_DAO(){
        fachada= new FachadaBD();
        conexion= fachada.getConnetion();
    }
    
    
    //como dice el nombre esta funcion es para guardar la editorial y por lo tanto hay
    public int guardar_editorial(Modelo_editorial Modelo_editorial){
        String sql_guardar;
        int numeroFilas=0;

        sql_guardar="INSERT INTO editorial  VALUES ('" +
                Modelo_editorial.getCodigo_editorial()+ "', '" + Modelo_editorial.getNombre_editorial()+  "', '" +
                Modelo_editorial.getPagina_web_editorial()+ "', '" + Modelo_editorial.getPais_de_origen_editorial()+ "')";
        try{
            
            Statement sentencia = this.conexion.createStatement();

            numeroFilas = sentencia.executeUpdate(sql_guardar);            
            System.out.println("up " + numeroFilas);
            return numeroFilas;
            
        }
        catch(SQLException e){
            System.out.println(e); 
            }
        catch(Exception e){ 
            System.out.println(e);
        }
        return -1;
    }
    
    public Modelo_editorial consultar_editorial(String codigo_editorial){
        Modelo_editorial Modelo_editorial= new Modelo_editorial();
        String sql_select;
        sql_select="SELECT codigo_editorial, nombre_editorial, pagina_web_editorial, pais_de_origen_editorial FROM  editorial WHERE codigo_editorial='" + codigo_editorial +  "'";
         try{
            
            System.out.println("consultando en la bd");
            Statement sentencia = this.conexion.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);
            
            while(tabla.next()){
                
               Modelo_editorial.setCodigo_editorial(tabla.getString(1));              
               Modelo_editorial.setNombre_editorial(tabla.getString(2));               
               Modelo_editorial.setPagina_web_editorial(tabla.getString(3));              
               Modelo_editorial.setPais_de_origen_editorial(tabla.getString(4));
              
              //System.out.println("ok");
            }
           
            return Modelo_editorial;
         }
         catch(SQLException e){ System.out.println(e); }
         catch(Exception e){ System.out.println(e); }
        return null;
    }
    
}