/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos
 */
public class Conexion {
    
    public String bd ="agencia";
    public String url= "jdbc:mysql://localhost/"+bd;
    public String usuario ="root";
    public String contra = "";
   
    
    public Connection Conectar()
         
            
    {
      
        Connection conec = null;
        
        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            
            conec = DriverManager.getConnection(this.url,this.usuario,this.contra);
            
        } catch (Exception ex) {
            
            JOptionPane.showMessageDialog(null,ex);
        }
        
        return conec;
        
        
        
        
        
        
         
    }
     

    
}
