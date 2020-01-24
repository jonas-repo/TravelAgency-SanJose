/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author marcos
 */
public class GuardarEmpleado {
     Conexion conecta = new Conexion();
    
    
    int res =0;
    

    public int EmpleadoGuardar(String Nombre ,String ApellidoPa ,String ApellidoMa, String Direccion ,String Telefono , String Fecha_nacimiento)
    {
        
              int resultado =0;
       
    Connection con = null;    
    
  
        
        
        
        String SQLL = SQLL ="INSERT INTO empleados(nombre,apellidoPa,apellidoMa,direccion,telefono,fecha_nacimiento  ) VALUES (?,?,?,?,?,?)"; 
       
       
     
        try {
            
            con = conecta.Conectar();
                    
                 PreparedStatement psql = con.prepareStatement(SQLL);
                // psql.setString(1,id);
                 psql.setString(1,Nombre);
                 psql.setString(2,ApellidoPa);
                 psql.setString(3,ApellidoMa);
                 psql.setString(4,Direccion);
                 psql.setString(5,Telefono);
                 psql.setString(6,Fecha_nacimiento);
             
                 
                 res = psql.executeUpdate();
                 psql.close(); //liberar los recursos usados
            
        } catch (Exception e) {
            
            javax.swing.JOptionPane.showMessageDialog(null, "error "+e);
            
        
        }finally{
            
            try {
                if (con!=null)
                {
                    con.close();
                    
                }
            } catch (Exception ex) {
                
                javax.swing.JOptionPane.showMessageDialog(null, "cerrar conexion "+ex);
            }
            }
        
            return res;
        
    }
     
    
}
