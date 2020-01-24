/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteBuscar;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jonas
 */
public class ClaseSeleccionar {
    
    public String[] selecciona(JTable tabla)
    {
     String[] datos = new String[tabla.getColumnCount()];
   
     
        for (int i = 0; i < datos.length; i++) 
        {
            datos[i]=tabla.getValueAt(tabla.getSelectedRow(),i).toString();
        }
    
        return datos;
    }
    
}
