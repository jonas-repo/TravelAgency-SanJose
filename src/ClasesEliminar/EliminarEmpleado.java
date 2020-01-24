/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEliminar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import newpackage.Conexion;

/**
 *
 * @author marcos
 */
public class EliminarEmpleado {
    
    
        Conexion conecta = new Conexion();
    
public void EmpleadoEliminar(String id_cliente, String valor, String filtro, JTable tablacontactos){
    
 
int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");


if(JOptionPane.OK_OPTION==confirmar) { 
   
   Connection con = null;

 try { 
       con = conecta.Conectar();
        String Ssql = "DELETE FROM empleados  "
                    + "WHERE id_empleado= ?";
        
        PreparedStatement prest = con.prepareStatement(Ssql); 
         
        prest.setString(1, id_cliente);

 
        if(prest.executeUpdate()>0){
            
                JOptionPane.showMessageDialog(null, "El registro ha sido eliminado exitosamente", 
                                              "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                            
               
         }else{
            
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n"
                + "Inténtelo nuevamente.", "Error en la operación", 
                JOptionPane.ERROR_MESSAGE);

        }

   } catch(SQLException error){
       
       JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro\n Inténtelo nuevamente.\n"
                                    + "Error: "+error, "Error en la operación", JOptionPane.ERROR_MESSAGE);
        
   }finally{
   
        
        if(con!=null){
        
            try {
                     
                 con.close();
            
            } catch (SQLException error2) {
                 
                     JOptionPane.showMessageDialog(null, "Error al intentar cerrar la conexión.\n Error: "+error2, 
                                                   "Error en la operación", JOptionPane.ERROR_MESSAGE);
                 
            }
            
        }       
   
   
   }

}
}
    
}
