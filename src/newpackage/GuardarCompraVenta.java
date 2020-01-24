/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonas
 */
public class GuardarCompraVenta {
    Conexion conecta = new Conexion();   //objeto para realizar conexion
     ResultSet res;
     Calendar c2 = new GregorianCalendar();
     String dia = Integer.toString(c2.get(Calendar.DATE));
     String mes = Integer.toString(c2.get(Calendar.MONTH)+1);
     String annio = Integer.toString(c2.get(Calendar.YEAR));
     String fecha = dia+"-"+mes+"-"+annio;
     
     public void insertarCompra(String id_empleado, String id_proveedor, String id_servicio)
     {
      Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "INSERT INTO `compras` (`fecha`, `id_empleado`, `id_proveedor`, `id_servicio`) VALUES ('"+fecha+"', '"+id_empleado+"', '"+id_proveedor+"', '"+id_servicio+"')"; 
         Statement prest = con.prepareStatement(Ssql);        
         prest.executeUpdate(Ssql); 
         prest.close();
         JOptionPane.showMessageDialog(null, "GUARDADO!");
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Por favor no dejes campos sin llenar");
       }
     }
     
     public void borrarCompra(String folio)
     {
      Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "DELETE FROM compras WHERE folio = "+folio+""; 
         Statement prest = con.prepareStatement(Ssql);        
         prest.executeUpdate(Ssql); 
         prest.close();
         JOptionPane.showMessageDialog(null, "Borrado exitosamente");
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Por favor selecciona la informacion para ser borrada");
       }
     }
     
     public void insertarVenta(String id_servicio, String id_cliente, String id_empleado)
     {
      Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "INSERT INTO `venta` (`fecha`, `id_servicio`, `id_cliente`, `id_empleado`) VALUES ('"+fecha+"', '"+id_servicio+"', '"+id_cliente+"', '"+id_empleado+"');"; 
         Statement prest = con.prepareStatement(Ssql);        
         prest.executeUpdate(Ssql); 
         prest.close();
         JOptionPane.showMessageDialog(null, "GUARDADO!");
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Por favor no dejes campos sin llenar");
       }
     }
     
      public void borrarVenta(String folio_venta)
     {
      Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "DELETE FROM venta WHERE folio_venta = "+folio_venta+""; 
         Statement prest = con.prepareStatement(Ssql);        
         prest.executeUpdate(Ssql); 
         prest.close();
         JOptionPane.showMessageDialog(null, "Borrado exitosamente");
        }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Por favor selecciona la informacion para ser borrada");
       }
     }
     
     
}
