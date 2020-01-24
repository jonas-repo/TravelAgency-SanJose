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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import newpackage.Conexion;

/**
 *
 * @author Jonas
 */
public class ClaseBusqueda {
      Conexion conecta = new Conexion();   //objeto para realizar conexion
      String dato, columna, tabla;
      int opcion; //opcion que eligio el usuario en combobox
      JComboBox caja;
      JTable tablaDatos;
      ArrayList<String> columnas = new ArrayList<String>(); //lista de columnas que pondremos en las tablas de la interfaz
      ResultSet res;
      
      public ClaseBusqueda(String dato,String tabla, JComboBox caja, JTable tablaDatos)
      {
       this.dato = dato;  //obtenemos dato del cuadro de texto
       this.tabla = tabla; //tabla de la base de datos que se quiere saber
       this.caja = caja;  // cajas de combobox
       this.tablaDatos = tablaDatos; //tabla de la interfaz
      }
    
      
      public void buscarPor()  //busqueda general 
      {
        Connection con = null;
       try{
         con = conecta.Conectar();
         String Ssql = " SELECT * FROM `"+tabla+"` WHERE `"+columna+"` LIKE '%"+dato+"%'"; //se ponen los datos segun lo que se desea buscar, esta sentencia busca todo lo que coincida con caracteres o cadenas
         Statement prest = con.prepareStatement(Ssql);         //se escribe la sentencia
         res = prest.executeQuery(Ssql);    // ejecutamos la instruccion y guardamos el resultado de la busqueda en objeto res
      
       }
       catch(Exception e)
       {
         JOptionPane.showMessageDialog(null, e);
       }
      }
     
     public void llenarTabla() throws ClassNotFoundException, SQLException // se llena la tabla que nosotros pusimos en el constructor
     {
        DefaultTableModel modelo = new DefaultTableModel();
        tablaDatos.setModel(modelo);
        // Creamos las columnas con el ciclo.
         for (int i = 0; i < columnas.size(); i++) //una vez que columnas ya tiene cargados los datos solo se agregan a la tabla de la interfaz
         {
          modelo.addColumn(columnas.get(i));
         }
        
        // Bucle para cada resultado en la consulta
         Object[] objetos = new Object[columnas.size()];
         while (res.next())
         {
           for (int i = 0; i < objetos.length; i++)
           {
           objetos[i]=res.getObject(i+1); // agregamos a un objeto los resultados obtenidos por la consulta, osea cada dato de columna por renglon
           }
           modelo.addRow(objetos);// del objeto que tiene cada dato por renglon de la base de datos agregamos todos los datos obtenidos a la tabla
         }   
 }   
     
     public void tipoBusquedaCliente() // se hace una comprobacion de que selecciono el usuario en el combobox y con eso se realizara la busqueda con columna
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "id_cliente";
              break;
          case 1:
              columna = "nombre";
              break;
          case 2:
              columna = "apellidoPa";
              break;
          case 3:
              columna = "apellidoMa";
              break;
          case 4:
              columna = "direccion";
              break;
          case 5:
              columna = "telefono";
              break;
          case 6:
              columna = "correo";
              break;  
      }
      buscarPor(); // se realiza la busqueda
     }
     
     public void tipoBusquedaServicios()// se escoje la parte de la columna que se va a buscar en la base de datos
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "id_servicio";
              break;
          case 1:
              columna = "nombre";
              break;
          case 2:
              columna = "descripcion";
              break;
          case 3:
              columna = "precio";
              break;
        
      }
      buscarPor();
     }
     
     public void tipoBusquedaCompras()// se escoje la parte de la columna que se va a buscar en la base de datos
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "folio";
              break;
          case 1:
              columna = "fecha";
              break;
          case 2:
              columna = "id_empleado";
              break;
          case 3:
              columna = "id_proveedor";
              break;
          case 4:
              columna = "id_servicio";
              break;
       }
      buscarPor();
     }
     
     public void tipoBusquedaEmpleados()// se escoje la parte de la columna que se va a buscar en la base de datos
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "id_empleado";
              break;
          case 1:
              columna = "nombre";
              break;
          case 2:
              columna = "apellidoPa";
              break;
          case 3:
              columna = "apellidoMa";
              break;
          case 4:
              columna = "direccion";
              break;
          case 5:
              columna = "telefono";
              break;  
          case 6:
              columna = "fecha_nacimiento";
              break;
      }
      buscarPor();
     }
  
     public void tipoBusquedaProveedores()// se escoje la parte de la columna que se va a buscar en la base de datos
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "id_proveedor";
              break;
          case 1:
              columna = "nombre";
              break;
          case 2:
              columna = "telefono";
              break;
          case 3:
              columna = "direccion";
              break;
          case 4:
              columna = "correo";
              break;
      }
      buscarPor();
     }
     
      public void tipoBusquedaVentas()// se escoje la parte de la columna que se va a buscar en la base de datos
     {
      opcion = caja.getSelectedIndex();
      switch(opcion)
      {
          case 0:
              columna = "folio_venta";
              break;
          case 1:
              columna = "fecha";
              break;
          case 2:
              columna = "id_servicio";
              break;
          case 3:
              columna = "id_cliente";
              break;
          case 4:
              columna = "id_empleado";
              break;
       }
      buscarPor();
     }
     
     
     
     public void llenarClientes() // se llena el arreglo con los nombres para cada columna
     {
      columnas.add("ID");
      columnas.add("NOMBRE");
      columnas.add("APELLIDO PATERNO");
      columnas.add("APELLIDO MATERNO");
      columnas.add("DIRECCION");
      columnas.add("TELEFONO");
      columnas.add("CORREO");
      }
     public void llenarServicios()// se llena el arreglo con los nombres para cada columna
     {
      columnas.add("ID");
      columnas.add("NOMBRE");
      columnas.add("DESCRIPCION");
      columnas.add("PRECIO");
     }
     public void llenarCompras()// se llena el arreglo con los nombres para cada columna
     {
      columnas.add("FOLIO");
      columnas.add("FECHA");
      columnas.add("EMPLEADO");
      columnas.add("PROVEEDOR");
      columnas.add("SERVICIO");
     }
     public void llenarEmpleados()// se llena el arreglo con los nombres para cada columna
     {
      columnas.add("ID");
      columnas.add("NOMBRE");
      columnas.add("APELLIDO PATERNO");
      columnas.add("APELLIDO MATERNO");
      columnas.add("DIRECCION");
      columnas.add("TELEFONO");
      columnas.add("FECHA NACIMIENTO");
     }
     public void llenarProveedores()// se llena el arreglo con los nombres para cada columna
     {
      columnas.add("ID");
      columnas.add("NOMBRE");
      columnas.add("TELEFONO");
      columnas.add("DIRECCION");
      columnas.add("CORREO");
     }
     public void llenarVenta()
     {
      columnas.add("FOLIO");
      columnas.add("FECHA");
      columnas.add("SERVICIO");
      columnas.add("CLIENTE");
      columnas.add("EMPLEADO");
     }
     
     
     public void opcTabla() // se comprueba en que tabla de la base de datos buscaremos la informacion
     {
    
      switch(tabla)
      {
          case "clientes": // en caso de que sea clientes la tabla de la base de datos que buscaremos
              llenarClientes();
              tipoBusquedaCliente();
            
          break; 
         
          case "compras":
              llenarCompras();
              tipoBusquedaCompras();
              
          break;
          
          case "empleados":
              llenarEmpleados();
              tipoBusquedaEmpleados();
                    
          break;

          case "proveedores":
              llenarProveedores();
              tipoBusquedaProveedores();
              
          break;
          
          case "servicios":
              llenarServicios();
              tipoBusquedaServicios();
             
          break;
          case "venta":
              llenarVenta();
              tipoBusquedaVentas();
          break;
       }
          try {
              llenarTabla();                  //*******************************************al final de todo ya que todo se marco correcto se llena la tabla de la interfaz
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(ClaseBusqueda.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(ClaseBusqueda.class.getName()).log(Level.SEVERE, null, ex);
          }
     }
      
     
}
