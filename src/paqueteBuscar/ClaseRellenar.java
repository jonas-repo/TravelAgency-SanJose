/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteBuscar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import newpackage.Conexion;

/**
 *
 * @author Jonas
 */
public class ClaseRellenar {
     Conexion conecta = new Conexion();   //objeto para realizar conexion
     ResultSet res;
     public void llenarP(JComboBox caja, String tabla, String columna)
     {
      Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = " SELECT * FROM "+tabla+""; 
         Statement prest = con.prepareStatement(Ssql);        
         res = prest.executeQuery(Ssql); 
         while(res.next()) //mientras haya elementos 
         {
          caja.addItem(res.getObject(columna)); //insertar items en la caja seleccionada
         }
         prest.close();
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, e);
       }
     }
    
     
    
}
