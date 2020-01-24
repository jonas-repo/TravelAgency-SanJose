/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author marcos
 */
public class GuardarCliente {
    
    
     Conexion conecta = new Conexion();
    
    
    int res =0;
    

    public int ClienteGuardar(String Nombre ,String ApellidoPa ,String ApellidoMa, String Direccion ,String Telefono , String Correo)
    {
        
              int resultado =0;
       
    Connection con = null;    
    
  
        
        
        
        String SQLL = SQLL ="INSERT INTO clientes(nombre,apellidoPa,apellidoMa,direccion,telefono,correo  ) VALUES (?,?,?,?,?,?)"; 
        
        try {
            
            con = conecta.Conectar();
                    
                 PreparedStatement psql = con.prepareStatement(SQLL);
                // psql.setString(1,id);
                 psql.setString(1,Nombre);
                 psql.setString(2,ApellidoPa);
                 psql.setString(3,ApellidoMa);
                 psql.setString(4,Direccion);
                 psql.setString(5,Telefono);
                 psql.setString(6,Correo);
                 
                 
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
