/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package accesoDatos;

import modelo.Modelo_prestamo_de_libro;
import java.sql.*;

/**
 *
 * @author juanc
 */
public class DAO_prestamo_de_libro {
    
    FachadaBD fachada;
    Connection conexion;

    public DAO_prestamo_de_libro(){
        fachada = new FachadaBD();
        conexion = fachada.getConnetion();
    }
        
    public void insertar_prestamo_de_libro(Modelo_prestamo_de_libro modelo_prestamo_de_libro){

        int numeroFilas=0;
        
        String sql_guardar;
        sql_guardar="INSERT INTO prestamo_de_libro (codigo_usuario_prestamo, identificacion_empleado_prestamo, isbn_libro_ejemplar_prestamo,numero_ejemplar_prestamo, fecha_de_realizacion_prestamo, descripcion_prestamo, fecha_de_devolucion_prestamo)\n VALUES ('" +
//                modelo_prestamo_de_libro.getNumero_consecutivo_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getCodigo_usuario_prestamo() + "', '" + 
                modelo_prestamo_de_libro.getIdentificacion_empleado_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getIsbn_libro_ejemplar_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getNumero_ejemplar_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getFecha_de_realizacion_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getDescripcion_prestamo()+ "', '" + 
                modelo_prestamo_de_libro.getFecha_de_devolucion_prestamo() + "')";
        
        try{
            Statement sentencia = this.conexion.createStatement();
            numeroFilas = sentencia.executeUpdate(sql_guardar);
            
            System.out.println("Insersion exitosa"); 
        }
        catch(SQLException e){ System.out.println("Insersion fallida"); System.out.println(e);}
        catch(Exception e){ System.out.println("Insersion fallida"); System.out.println(e);}
        
    }
    
    public Modelo_prestamo_de_libro seleccionar_prestamo_de_libro(String numero_consecutivo_prestamo){

        Modelo_prestamo_de_libro modelo_prestamo_de_libro= new Modelo_prestamo_de_libro();
        
        String sql_select;
        sql_select="SELECT "
                + "numero_consecutivo_prestamo, "
                + "codigo_usuario_prestamo, "
                + "identificacion_empleado_prestamo, "
                + "isbn_libro_ejemplar_prestamo, "
                + "numero_ejemplar_prestamo, "
                + "fecha_de_realizacion_prestamo, "
                + "descripcion_prestamo, "
                + "fecha_de_devolucion_prestamo "
                + "FROM prestamo_de_libro WHERE numero_consecutivo_prestamo = '" + numero_consecutivo_prestamo +  "'";
        
        try{

            Statement sentencia = this.conexion.createStatement();
            ResultSet seleccion = sentencia.executeQuery(sql_select);
            
            while (seleccion.next()){
               modelo_prestamo_de_libro.setNumero_consecutivo_prestamo(seleccion.getString(1));
               modelo_prestamo_de_libro.setCodigo_usuario_prestamo(seleccion.getString(2));
               modelo_prestamo_de_libro.setIdentificacion_empleado_prestamo(seleccion.getString(3));
               modelo_prestamo_de_libro.setIsbn_libro_ejemplar_prestamo(seleccion.getString(4));
               modelo_prestamo_de_libro.setNumero_ejemplar_prestamo(seleccion.getString(5));
               modelo_prestamo_de_libro.setFecha_de_realizacion_prestamo(seleccion.getString(6));
               modelo_prestamo_de_libro.setDescripcion_prestamo(seleccion.getString(7));
               modelo_prestamo_de_libro.setFecha_de_devolucion_prestamo(seleccion.getString(8));
            }
            
            System.out.println("Seleccion exitosa");
           
            return modelo_prestamo_de_libro;
        }
        catch(SQLException e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        catch(Exception e){ System.out.println("Seleccion fallida"); System.out.println(e); return null;}
        
    }
    
    
}
