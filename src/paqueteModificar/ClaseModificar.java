/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteModificar;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import newpackage.Conexion;

/**
 *
 * @author Jonas
 */
public class ClaseModificar {
    
    Conexion conecta = new Conexion();  
    ResultSet res;
    
    public void modificaCliente(String id_cliente,String nombre, String apellidoPa, String apellidoMa, String direccion, String telefono, String correo )
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `clientes` SET `nombre` = '"+nombre+"', `apellidoPa` = '"+apellidoPa+"', `apellidoMa` = '"+apellidoMa+"', `direccion` = '"+direccion+"', `telefono` = '"+telefono+"', `correo` = '"+correo+"' WHERE `clientes`.`id_cliente` = "+id_cliente+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
       }
    
    }
    
    public void modificaServicio(String id_servicio, String nombre, String descripcion, String precio )
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `servicios` SET `nombre` = '"+nombre+"', `descripcion` = '"+descripcion+"', `precio` = '"+precio+"' WHERE `servicios`.`id_servicio` = "+id_servicio+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
       }
    
    }
    
    public void modificaEmpleado(String id_empleado, String nombre, String apellidoPa, String apellidoMa, String direccion, String telefono, String fecha_nacimiento )
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `empleados` SET `nombre` = '"+nombre+"', `apellidoPa` = '"+apellidoPa+"', `apellidoMa` = '"+apellidoMa+"', `direccion` = '"+direccion+"', `telefono` = '"+telefono+"', `fecha_nacimiento` = '"+fecha_nacimiento+"' WHERE `empleados`.`id_empleado` = "+id_empleado+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
       }
    
    }
    
    public void modificaProveedor(String id_proveedor, String nombre, String telefono, String direccion, String correo)
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `proveedores` SET `nombre` = '"+nombre+"', `telefono` = '"+telefono+"', `direccion` = '"+direccion+"', `correo` = '"+correo+"' WHERE `proveedores`.`id_proveedor` = "+id_proveedor+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
       }
    
    }
    
    public void modificaCompras(String id_proveedor, String id_servicio, String folio)
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `compras` SET `id_proveedor` = '"+id_proveedor+"', `id_servicio` = '"+id_servicio+"' WHERE `compras`.`folio` = "+folio+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
       }
    
    }
    
    public void modificaVentas(String folio_venta, String id_servicio, String id_cliente)
    {
     Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = "UPDATE `venta` SET `id_servicio` = '"+id_servicio+"', `id_cliente` = '"+id_cliente+"' WHERE `venta`.`folio_venta` = "+folio_venta+";"; //se ponen los datos segun lo que se desea modificar
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         prest.executeUpdate(Ssql);// se ejecuta la actualizacion
         prest.close();
         JOptionPane.showMessageDialog(null, "Modificado exitosamente");
       }
       catch(Exception e)
       {
         
       }
    
    }
    
} 
