/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteBuscar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import newpackage.Conexion;
import newpackage.loginVentana;
import newpackage.ventana;


/**
 *
 * @author Jonas
 */
public class ClaseLogin {
    
    Conexion conecta = new Conexion();
    ResultSet res;
    public boolean login(String usuario, String contrasena)
    {  
       boolean log= false;
       Connection con = null;
      try{
         con = conecta.Conectar();
         String Ssql = "SELECT * FROM `usuarios` WHERE `usuario` LIKE '"+usuario+"' AND `contrasena` LIKE '"+contrasena+"'"; 
         Statement prest = con.prepareStatement(Ssql);      
         res = prest.executeQuery(Ssql);
         res.next();
         if(res.getObject(3).toString().equals(usuario) && res.getObject(4).toString().equals(contrasena) )
         {
          ventana vent = new ventana();
          vent.setVisible(true);
          log=true;
          ventana.employee = res.getObject(2).toString();
         }
         else
         {
          JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!");
         }
      }catch(Exception e)
      {
       JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta!");
      }
       return log;
    }
    
}
