
package newpackage;

import ClasesEliminar.BorrarServicio;
import ClasesEliminar.EliminarCliente;
import ClasesEliminar.EliminarEmpleado;
import ClasesEliminar.EliminarProveedor;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import paqueteBuscar.ClaseBusqueda;
import paqueteBuscar.ClaseRellenar;
import paqueteBuscar.ClaseSeleccionar;
import paqueteModificar.ClaseModificar;

/**
 *
 * @author luis-MsterRacePapu
 */
public class ventana extends javax.swing.JFrame {
    
GuardarCliente guardarClien = new GuardarCliente();
GuardarProveedores guardarPro = new GuardarProveedores();
    GuardarEmpleado guardarEmp = new GuardarEmpleado();
   EliminarCliente eliminarClien = new EliminarCliente();
   GuardarServicio guardarServ = new GuardarServicio();
    EliminarEmpleado eliminarEmp = new EliminarEmpleado();
    EliminarProveedor eliminarPro = new EliminarProveedor();
    BorrarServicio eliminarSer = new BorrarServicio();
    ClaseModificar mod = new ClaseModificar();
    ClaseRellenar re = new ClaseRellenar();
   public static String employee ;
    
      
    String id ="";
    public ventana() {
        initComponents();
        ImageIcon fondo = new ImageIcon("src/imagenes/background.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLbackground.getWidth(), jLbackground.getHeight(), Image.SCALE_DEFAULT));
        jLbackground.setIcon(icono);
        this.repaint();
        this.setSize(1238, 630);
        
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane_principal = new javax.swing.JTabbedPane();
        jPanel_clientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTNombreCliente = new javax.swing.JTextField();
        jTApellidoP_Clietne = new javax.swing.JTextField();
        jTApellidoM_cliente = new javax.swing.JTextField();
        jTDireccionCliente = new javax.swing.JTextField();
        jTTelefono_cliente = new javax.swing.JTextField();
        jTCorreo_Cliente = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTab_clientes = new javax.swing.JTable();
        jB_alta_clientes = new javax.swing.JButton();
        jB_buscar_cliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jT_Id_cliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox_BuscarClientes = new javax.swing.JComboBox<>();
        jB_editar_cliente = new javax.swing.JButton();
        jB_Borrar_cliente = new javax.swing.JButton();
        jT_dato_cliente = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        selec1 = new javax.swing.JButton();
        limpia1 = new javax.swing.JButton();
        jPanel_servicios = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTADescripcion_servicio = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jTNombre_servicio = new javax.swing.JTextField();
        jTPrecio_Servicio = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jT_ID_servicio = new javax.swing.JTextField();
        jB_alta_servicio = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_servicios = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jComboBox_Servicios = new javax.swing.JComboBox<>();
        jB_Buscar_servicio = new javax.swing.JButton();
        jB_Modificar_servicio = new javax.swing.JButton();
        jB_Borrar_servicio = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_descripcion_busqueda = new javax.swing.JTextArea();
        jLabel46 = new javax.swing.JLabel();
        jT_Dato_servicio = new javax.swing.JTextField();
        select2 = new javax.swing.JButton();
        limpia2 = new javax.swing.JButton();
        jPanel_Consultas = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jComboBox_buscar_compra = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_compras = new javax.swing.JTable();
        jB_Buscar_compra = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_venta = new javax.swing.JTable();
        jB_Buscar_venta = new javax.swing.JButton();
        jComboBox_buscar_venta = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jT_Empleado_compra = new javax.swing.JTextField();
        jT_Fecha_compra = new javax.swing.JTextField();
        jT_Folio_compra = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jT_empleado_venta = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTFecha_venta = new javax.swing.JTextField();
        jT_Folio_venta = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jT_dato_compra = new javax.swing.JTextField();
        jT_dato_venta = new javax.swing.JTextField();
        alta_compra = new javax.swing.JButton();
        alta_venta = new javax.swing.JButton();
        jCombo_ProveCompras = new javax.swing.JComboBox<>();
        jComboProveServicio = new javax.swing.JComboBox<>();
        jComboVentasCliente = new javax.swing.JComboBox<>();
        jComboVentasServicio = new javax.swing.JComboBox<>();
        select5 = new javax.swing.JButton();
        borrarCompra = new javax.swing.JButton();
        limpia_compras = new javax.swing.JButton();
        jboton_modifica_compras = new javax.swing.JButton();
        select6 = new javax.swing.JButton();
        jBoton_borraVenta = new javax.swing.JButton();
        jBoton_modificarVentas = new javax.swing.JButton();
        limpia_ventas = new javax.swing.JButton();
        jPanel_Empleados = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jT_Telefono_empleado = new javax.swing.JTextField();
        jT_DireccionEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jT_ApellidoM_empleado = new javax.swing.JTextField();
        jT_ApellidoP_empleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jT_NombreEmpleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jT_Fecha_nac = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jT_ID_empleado = new javax.swing.JTextField();
        jB_alta_empleado = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_Empleados = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        jButton_Buscar_empleado = new javax.swing.JButton();
        jB_modificar_empleado = new javax.swing.JButton();
        jB_Borrar_empleado = new javax.swing.JButton();
        jT_dato_empleado = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jComboBox_empleados = new javax.swing.JComboBox<>();
        select3 = new javax.swing.JButton();
        limpiar3 = new javax.swing.JButton();
        jPanel_proveedores = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jT_ID_proveedor = new javax.swing.JTextField();
        jT_Nombre_proveedor = new javax.swing.JTextField();
        jT_Telefono_proveedor = new javax.swing.JTextField();
        jT_direccion_proveedor = new javax.swing.JTextField();
        jT_Correo_proveedor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jComboBox_Proveedor = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable_Proveedores = new javax.swing.JTable();
        jB_Modifcar_proveedor = new javax.swing.JButton();
        jB_borrar_proveedor = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jT_dato_proveedores = new javax.swing.JTextField();
        jB_buscar_proveedor = new javax.swing.JButton();
        select4 = new javax.swing.JButton();
        limpiar4 = new javax.swing.JButton();
        jLbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de datos. San José");
        setPreferredSize(new java.awt.Dimension(1220, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Dirección:");

        jLabel5.setText("Teléfono:");

        jLabel6.setText("Correo electrónico:");

        jTab_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO PATERNO", "APELLIDO MATERNO", "DIRECCIÓN", "TELÉFONO", "CORREO"
            }
        ));
        jScrollPane2.setViewportView(jTab_clientes);

        jB_alta_clientes.setText("Alta");
        jB_alta_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_alta_clientesActionPerformed(evt);
            }
        });

        jB_buscar_cliente.setText("Buscar");
        jB_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscar_clienteActionPerformed(evt);
            }
        });

        jLabel7.setText("ID:");

        jT_Id_cliente.setEditable(false);

        jLabel18.setText("Buscar por:");

        jComboBox_BuscarClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Apellido paterno", "Apellido materno", "Dirección", "Teléfono", "Correo electrónico", " " }));

        jB_editar_cliente.setText("Modificar");
        jB_editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_editar_clienteActionPerformed(evt);
            }
        });

        jB_Borrar_cliente.setText("Borrar");
        jB_Borrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Borrar_clienteActionPerformed(evt);
            }
        });

        jLabel45.setText("Dato:");

        selec1.setText("Seleccionar");
        selec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec1ActionPerformed(evt);
            }
        });

        limpia1.setText("Limpiar");
        limpia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_clientesLayout = new javax.swing.GroupLayout(jPanel_clientes);
        jPanel_clientes.setLayout(jPanel_clientesLayout);
        jPanel_clientesLayout.setHorizontalGroup(
            jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(jT_Id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(17, 17, 17)
                                .addComponent(jTTelefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(4, 4, 4)
                                .addComponent(jTCorreo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_clientesLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jB_alta_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(limpia1)
                                .addGap(32, 32, 32)))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(12, 12, 12)
                                .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jLabel18))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTApellidoP_Clietne, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTApellidoM_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel45)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox_BuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_dato_cliente))
                        .addGap(22, 22, 22)
                        .addComponent(jB_buscar_cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selec1)
                        .addGap(247, 247, 247)
                        .addComponent(jB_editar_cliente)
                        .addGap(12, 12, 12)
                        .addComponent(jB_Borrar_cliente)))
                .addGap(37, 37, 37))
        );
        jPanel_clientesLayout.setVerticalGroup(
            jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(jT_Id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel1))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel18))
                            .addComponent(jComboBox_BuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel3))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTApellidoP_Clietne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jTApellidoM_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jB_buscar_cliente)
                                    .addComponent(selec1)))
                            .addComponent(jB_editar_cliente)
                            .addComponent(jB_Borrar_cliente))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel4))
                                    .addComponent(jTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel5))
                                    .addComponent(jTTelefono_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel6))
                                    .addComponent(jTCorreo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(limpia1)
                                    .addComponent(jB_alta_clientes)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_clientesLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jT_dato_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))))
                .addGap(45, 45, 45))
        );

        jTabbedPane_principal.addTab("Clientes", jPanel_clientes);

        jLabel15.setText("Nombre:");

        jLabel16.setText("Descripcion:");

        jTADescripcion_servicio.setColumns(20);
        jTADescripcion_servicio.setRows(5);
        jScrollPane1.setViewportView(jTADescripcion_servicio);

        jLabel17.setText("Precio:");

        jLabel19.setText("ID:");

        jT_ID_servicio.setEditable(false);

        jB_alta_servicio.setText("Aceptar");
        jB_alta_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_alta_servicioActionPerformed(evt);
            }
        });

        jTable_servicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Precio"
            }
        ));
        jScrollPane3.setViewportView(jTable_servicios);

        jLabel20.setText("Buscar por:");

        jComboBox_Servicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Descripcion", "Precio" }));

        jB_Buscar_servicio.setText("Buscar");
        jB_Buscar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Buscar_servicioActionPerformed(evt);
            }
        });

        jB_Modificar_servicio.setText("Modificar");
        jB_Modificar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modificar_servicioActionPerformed(evt);
            }
        });

        jB_Borrar_servicio.setText("Borrar");
        jB_Borrar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Borrar_servicioActionPerformed(evt);
            }
        });

        jTextArea_descripcion_busqueda.setColumns(20);
        jTextArea_descripcion_busqueda.setRows(5);
        jTextArea_descripcion_busqueda.setText("Descripción\n");
        jScrollPane4.setViewportView(jTextArea_descripcion_busqueda);

        jLabel46.setText("Dato:");

        select2.setText("Seleccionar");
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        limpia2.setText("Limpiar");
        limpia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpia2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_serviciosLayout = new javax.swing.GroupLayout(jPanel_servicios);
        jPanel_servicios.setLayout(jPanel_serviciosLayout);
        jPanel_serviciosLayout.setHorizontalGroup(
            jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_serviciosLayout.createSequentialGroup()
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addComponent(jTPrecio_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jB_alta_servicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limpia2))
                            .addComponent(jTNombre_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_ID_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_serviciosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_Borrar_servicio)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jComboBox_Servicios, 0, 114, Short.MAX_VALUE)
                                            .addComponent(jT_Dato_servicio))
                                        .addGap(0, 1, Short.MAX_VALUE))
                                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jB_Modificar_servicio)))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_serviciosLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select2)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Buscar_servicio)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_serviciosLayout.setVerticalGroup(
            jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(jT_ID_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(jTNombre_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel46)
                                    .addComponent(jT_Dato_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_Servicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))))
                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jB_Borrar_servicio))
                            .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel17)
                                                .addComponent(jTPrecio_Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jB_alta_servicio)
                                                .addComponent(limpia2))))
                                    .addGroup(jPanel_serviciosLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel_serviciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jB_Buscar_servicio)
                                            .addComponent(select2))
                                        .addGap(47, 47, 47)
                                        .addComponent(jB_Modificar_servicio)))
                                .addGap(0, 17, Short.MAX_VALUE)))))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane_principal.addTab("Servicios", jPanel_servicios);

        jPanel_Consultas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setText("Compras");
        jPanel_Consultas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel22.setText("Buscar por:");
        jPanel_Consultas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 239, -1, -1));

        jComboBox_buscar_compra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Folio", "Fecha", "Empleado", "Proveedor", "Servicio" }));
        jPanel_Consultas.add(jComboBox_buscar_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 240, 94, -1));

        jTable_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Empleado", "Proveedor", "Servicio"
            }
        ));
        jScrollPane5.setViewportView(jTable_compras);

        jPanel_Consultas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 169, 487, 64));

        jB_Buscar_compra.setText("Consultar");
        jB_Buscar_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Buscar_compraActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(jB_Buscar_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 239, 87, -1));

        jTable_venta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Fecha", "Servicio", "Cliente", "Empleado"
            }
        ));
        jScrollPane6.setViewportView(jTable_venta);

        jPanel_Consultas.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 164, 498, 64));

        jB_Buscar_venta.setText("Consultar");
        jB_Buscar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Buscar_ventaActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(jB_Buscar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1048, 234, -1, -1));

        jComboBox_buscar_venta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Folio", "Fecha", "Servicio", "Cliente", "Empleado", " " }));
        jPanel_Consultas.add(jComboBox_buscar_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 235, 94, -1));

        jLabel23.setText("Buscar por:");
        jPanel_Consultas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 234, -1, -1));

        jLabel24.setText("Ventas");
        jPanel_Consultas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 11, -1, -1));

        jLabel25.setText("Folio:");
        jPanel_Consultas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 34, -1, -1));

        jLabel26.setText("Fecha:");
        jPanel_Consultas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 60, -1, -1));

        jLabel28.setText("Proveedor:");
        jPanel_Consultas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 86, -1, -1));

        jLabel29.setText("Empleado:");
        jPanel_Consultas.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 112, -1, -1));

        jLabel30.setText("Servicio:");
        jPanel_Consultas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 139, -1, -1));

        jT_Empleado_compra.setEditable(false);
        jPanel_Consultas.add(jT_Empleado_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 109, 169, -1));

        jT_Fecha_compra.setEnabled(false);
        jPanel_Consultas.add(jT_Fecha_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 57, 87, -1));

        jT_Folio_compra.setEditable(false);
        jPanel_Consultas.add(jT_Folio_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 31, 88, -1));

        jLabel31.setText("Servicio:");
        jPanel_Consultas.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 139, -1, -1));

        jLabel32.setText("Empleado:");
        jPanel_Consultas.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 112, -1, -1));

        jT_empleado_venta.setEditable(false);
        jPanel_Consultas.add(jT_empleado_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 109, 169, -1));

        jLabel33.setText("Cliente:");
        jPanel_Consultas.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 86, -1, -1));

        jLabel34.setText("Fecha:");
        jPanel_Consultas.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 60, -1, -1));

        jTFecha_venta.setEnabled(false);
        jPanel_Consultas.add(jTFecha_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 57, 87, -1));

        jT_Folio_venta.setEditable(false);
        jPanel_Consultas.add(jT_Folio_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 31, 88, -1));

        jLabel36.setText("Folio:");
        jPanel_Consultas.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 34, -1, -1));
        jPanel_Consultas.add(jT_dato_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 240, 211, -1));
        jPanel_Consultas.add(jT_dato_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 235, 193, -1));

        alta_compra.setText("Alta");
        alta_compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_compraActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(alta_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 135, 80, -1));

        alta_venta.setText("Alta");
        alta_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alta_ventaActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(alta_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 70, -1));

        jCombo_ProveCompras.setMaximumRowCount(10000);
        jCombo_ProveCompras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jCombo_ProveComprasFocusGained(evt);
            }
        });
        jPanel_Consultas.add(jCombo_ProveCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 83, 169, -1));

        jComboProveServicio.setMaximumRowCount(10000);
        jComboProveServicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboProveServicioFocusGained(evt);
            }
        });
        jPanel_Consultas.add(jComboProveServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 136, 169, -1));

        jComboVentasCliente.setMaximumRowCount(10000);
        jComboVentasCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboVentasClienteFocusGained(evt);
            }
        });
        jPanel_Consultas.add(jComboVentasCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 83, 169, -1));

        jComboVentasServicio.setMaximumRowCount(10000);
        jComboVentasServicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboVentasServicioFocusGained(evt);
            }
        });
        jPanel_Consultas.add(jComboVentasServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 136, 169, -1));

        select5.setText("Seleccionar");
        select5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select5ActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(select5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 135, -1, -1));

        borrarCompra.setText("Borrar");
        borrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarCompraActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(borrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, -1));

        limpia_compras.setText("Limpiar");
        limpia_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpia_comprasActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(limpia_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jboton_modifica_compras.setText("Modificar");
        jboton_modifica_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboton_modifica_comprasActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(jboton_modifica_compras, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        select6.setText("Seleccionar");
        select6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select6ActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(select6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 130, -1, -1));

        jBoton_borraVenta.setText("Borrar");
        jBoton_borraVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton_borraVentaActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(jBoton_borraVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 90, -1));

        jBoton_modificarVentas.setText("Modificar");
        jBoton_modificarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoton_modificarVentasActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(jBoton_modificarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        limpia_ventas.setText("Limpiar");
        limpia_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpia_ventasActionPerformed(evt);
            }
        });
        jPanel_Consultas.add(limpia_ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        jTabbedPane_principal.addTab("Compras/Ventas", jPanel_Consultas);

        jLabel8.setText("Teléfono:");

        jLabel9.setText("Dirección:");

        jLabel10.setText("Apellido Materno:");

        jLabel11.setText("Apellido paterno:");

        jLabel12.setText("Nombre:");

        jLabel13.setText("Fecha nacimiento:");

        jLabel37.setText("ID:");

        jT_ID_empleado.setEditable(false);

        jB_alta_empleado.setText("Alta");
        jB_alta_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_alta_empleadoActionPerformed(evt);
            }
        });

        jTable_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Dirección", "Teléfono", "Fecha nacimiento"
            }
        ));
        jScrollPane7.setViewportView(jTable_Empleados);

        jLabel38.setText("Buscar por:");

        jButton_Buscar_empleado.setText("Buscar");
        jButton_Buscar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Buscar_empleadoActionPerformed(evt);
            }
        });

        jB_modificar_empleado.setText("Modificar");
        jB_modificar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modificar_empleadoActionPerformed(evt);
            }
        });

        jB_Borrar_empleado.setText("Borrar");
        jB_Borrar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Borrar_empleadoActionPerformed(evt);
            }
        });

        jLabel47.setText("Dato:");

        jComboBox_empleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "NOMBRE", "APELLINO PATERNO", "APELLIDO MATERNO", "DIRECCION", "TELEFONO", "FECHA NACIMIENTO" }));

        select3.setText("Seleccionar");
        select3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select3ActionPerformed(evt);
            }
        });

        limpiar3.setText("Limpiar");
        limpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_EmpleadosLayout = new javax.swing.GroupLayout(jPanel_Empleados);
        jPanel_Empleados.setLayout(jPanel_EmpleadosLayout);
        jPanel_EmpleadosLayout.setHorizontalGroup(
            jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jB_alta_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiar3))
                    .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jT_ApellidoP_empleado)
                                .addComponent(jT_ApellidoM_empleado)))
                        .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jT_DireccionEmpleado)
                                .addComponent(jT_Telefono_empleado)))
                        .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(10, 10, 10)
                            .addComponent(jT_Fecha_nac, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                        .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel37)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jT_NombreEmpleado)
                                .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                                    .addComponent(jT_ID_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(92, 92, 92)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                        .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(3, 3, 3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_EmpleadosLayout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jT_dato_empleado)
                            .addComponent(jComboBox_empleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(jButton_Buscar_empleado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select3)
                        .addGap(87, 87, 87)
                        .addComponent(jB_modificar_empleado)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Borrar_empleado)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel_EmpleadosLayout.setVerticalGroup(
            jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jT_ID_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jT_NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(jComboBox_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jT_ApellidoP_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Buscar_empleado)
                    .addComponent(jT_dato_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(select3)
                    .addComponent(jB_modificar_empleado)
                    .addComponent(jB_Borrar_empleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jT_ApellidoM_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_EmpleadosLayout.createSequentialGroup()
                        .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jT_DireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jT_Telefono_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jT_Fecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB_alta_empleado)
                    .addComponent(limpiar3))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jTabbedPane_principal.addTab("Empleados", jPanel_Empleados);

        jLabel39.setText("ID:");

        jLabel40.setText("Nombre:");

        jLabel41.setText("Teléfono:");

        jLabel42.setText("Dirección:");

        jLabel43.setText("Correo electronico:");

        jT_ID_proveedor.setEditable(false);

        jButton1.setText("Alta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel44.setText("Buscar por:");

        jComboBox_Proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "Teléfono", "Dirección", "Correo electrónico" }));

        jTable_Proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Teléfono", "Dirección", "Correo electrónico"
            }
        ));
        jScrollPane8.setViewportView(jTable_Proveedores);

        jB_Modifcar_proveedor.setText("Modificar");
        jB_Modifcar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_Modifcar_proveedorActionPerformed(evt);
            }
        });

        jB_borrar_proveedor.setText("Borrar");
        jB_borrar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_borrar_proveedorActionPerformed(evt);
            }
        });

        jLabel48.setText("Dato:");

        jB_buscar_proveedor.setText("Buscar");
        jB_buscar_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_buscar_proveedorActionPerformed(evt);
            }
        });

        select4.setText("Seleccionar");
        select4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select4ActionPerformed(evt);
            }
        });

        limpiar4.setText("Limpiar");
        limpiar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_proveedoresLayout = new javax.swing.GroupLayout(jPanel_proveedores);
        jPanel_proveedores.setLayout(jPanel_proveedoresLayout);
        jPanel_proveedoresLayout.setHorizontalGroup(
            jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel39)
                                        .addComponent(jLabel40)
                                        .addComponent(jLabel41))
                                    .addComponent(jLabel42))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jT_Telefono_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jT_ID_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jT_Nombre_proveedor)
                                        .addComponent(jT_direccion_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(limpiar4))
                                    .addComponent(jT_Correo_proveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))))
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_dato_proveedores))
                                .addGap(18, 18, 18)
                                .addComponent(jB_buscar_proveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(select4))
                            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                        .addComponent(jB_Modifcar_proveedor)
                        .addGap(26, 26, 26)
                        .addComponent(jB_borrar_proveedor)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel_proveedoresLayout.setVerticalGroup(
            jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jT_ID_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(jComboBox_Proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jT_Nombre_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jT_dato_proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_buscar_proveedor)
                    .addComponent(select4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(jT_Telefono_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jT_direccion_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_proveedoresLayout.createSequentialGroup()
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Modifcar_proveedor)
                            .addComponent(jB_borrar_proveedor))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_proveedoresLayout.createSequentialGroup()
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jT_Correo_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_proveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(limpiar4)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane_principal.addTab("Proveedores", jPanel_proveedores);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1220, 330));
        getContentPane().add(jLbackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_alta_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_alta_clientesActionPerformed
       int bn = 0;

       guardarClien.ClienteGuardar( jTNombreCliente.getText(), jTApellidoP_Clietne.getText(),jTApellidoM_cliente.getText() , jTDireccionCliente.getText() ,jTTelefono_cliente.getText() , jTCorreo_Cliente.getText());
       
        if(bn>0){//jtcombobox.getSelecItem();

            javax.swing.JOptionPane.showMessageDialog(null, "DATO NO GUARDADO",
                "operacion Fallida",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }else{

            javax.swing.JOptionPane.showMessageDialog(null, "GUARDADO",
                "operacion Realizada",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jB_alta_clientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int bn = 0;

       guardarPro.proveedorGuardar(jT_Nombre_proveedor.getText(), jT_Telefono_proveedor.getText(),jT_direccion_proveedor.getText(),jT_Correo_proveedor.getText());
       
        if(bn>0){

            javax.swing.JOptionPane.showMessageDialog(null, "DATO NO GUARDADO",
                "Operacion Fallida",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }else{

            javax.swing.JOptionPane.showMessageDialog(null, "GUARDADO",
                "Operacion realizada",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jB_alta_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_alta_empleadoActionPerformed
int bn = 0;

       guardarEmp.EmpleadoGuardar(jT_NombreEmpleado.getText(),jT_ApellidoP_empleado.getText(),jT_ApellidoM_empleado.getText(),jT_DireccionEmpleado.getText(),jT_Telefono_empleado.getText(),jT_Fecha_nac.getText());
       
        if(bn>0){

            javax.swing.JOptionPane.showMessageDialog(null, " DATO NO GUARDADO",
                "operacion Fallida",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }else{

            javax.swing.JOptionPane.showMessageDialog(null, "Guardado",
                "operacion Realizada",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }      
    }//GEN-LAST:event_jB_alta_empleadoActionPerformed

    private void jB_Borrar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Borrar_empleadoActionPerformed
          if(id.isEmpty()){
       
       javax.swing.JOptionPane.showMessageDialog(null, "No hay datos para eliminar.\n"
       + "Por favor, seleccione un registro de la tabla.", "Error en la operación", javax.swing.JOptionPane.ERROR_MESSAGE);
       
   }else{


         eliminarEmp.EmpleadoEliminar(id,jT_dato_empleado.getText(),jComboBox_empleados.getSelectedItem().toString(),jTable_Empleados);
   } 
    }//GEN-LAST:event_jB_Borrar_empleadoActionPerformed

    private void jB_alta_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_alta_servicioActionPerformed
       int bn = 0;

       guardarServ.ServicioGuardar(jTNombre_servicio.getText(), jTADescripcion_servicio.getText(),jTPrecio_Servicio.getText());
       
        if(bn>0){

            javax.swing.JOptionPane.showMessageDialog(null, "DATO NO GUARDADO",
                "Operacion Fallida",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }else{

            javax.swing.JOptionPane.showMessageDialog(null, "GUARDADO",
                "Operacion realizada",javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jB_alta_servicioActionPerformed
    }
    private void jB_Borrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Borrar_clienteActionPerformed
        if(id.isEmpty()){
       
       javax.swing.JOptionPane.showMessageDialog(null, "No hay datos para eliminar.\n"
       + "Por favor, seleccione un registro de la tabla.", "Error en la operación", javax.swing.JOptionPane.ERROR_MESSAGE);
       
   }else{


         eliminarClien.ClienteEliminar(id,jT_dato_cliente.getText(),jComboBox_BuscarClientes.getSelectedItem().toString(),jTab_clientes);
   } 
    }//GEN-LAST:event_jB_Borrar_clienteActionPerformed

    private void jB_borrar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_borrar_proveedorActionPerformed
      if(id.isEmpty()){
       
       javax.swing.JOptionPane.showMessageDialog(null, "No hay datos para eliminar.\n"
       + "Por favor, seleccione un registro de la tabla.", "Error en la operación", javax.swing.JOptionPane.ERROR_MESSAGE);
       
   }else{


         eliminarPro.ProveedorEliminar(id,jT_dato_proveedores.getText(),jComboBox_Proveedor.getSelectedItem().toString(),jTable_Proveedores);
   } 
    }//GEN-LAST:event_jB_borrar_proveedorActionPerformed

    private void jB_Borrar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Borrar_servicioActionPerformed
         if(id.isEmpty()){
       
       javax.swing.JOptionPane.showMessageDialog(null, "No hay datos para eliminar.\n"
       + "Por favor, seleccione un registro de la tabla.", "Error en la operación", javax.swing.JOptionPane.ERROR_MESSAGE);
       
   }else{


        eliminarSer.ServicioEliminar(id,jT_Dato_servicio.getText(),jComboBox_Servicios.getSelectedItem().toString(),jTable_servicios);
   } 
    }//GEN-LAST:event_jB_Borrar_servicioActionPerformed

    private void jB_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscar_clienteActionPerformed
      ClaseBusqueda busca = new ClaseBusqueda(jT_dato_cliente.getText(), "clientes", jComboBox_BuscarClientes, jTab_clientes);
      busca.opcTabla();
    }//GEN-LAST:event_jB_buscar_clienteActionPerformed

    private void jB_Buscar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Buscar_servicioActionPerformed
      ClaseBusqueda busca = new ClaseBusqueda(jT_Dato_servicio.getText(), "servicios", jComboBox_Servicios, jTable_servicios);
      busca.opcTabla();
    }//GEN-LAST:event_jB_Buscar_servicioActionPerformed

    private void jButton_Buscar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Buscar_empleadoActionPerformed
      ClaseBusqueda busca = new ClaseBusqueda(jT_dato_empleado.getText(), "empleados", jComboBox_empleados, jTable_Empleados);
      busca.opcTabla(); 
    }//GEN-LAST:event_jButton_Buscar_empleadoActionPerformed

    private void jB_buscar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_buscar_proveedorActionPerformed
      ClaseBusqueda busca = new ClaseBusqueda(jT_dato_proveedores.getText(), "proveedores", jComboBox_Proveedor, jTable_Proveedores);
      busca.opcTabla(); 
    }//GEN-LAST:event_jB_buscar_proveedorActionPerformed

    private void jB_Buscar_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Buscar_compraActionPerformed
      ClaseBusqueda busca = new ClaseBusqueda(jT_dato_compra.getText(), "compras", jComboBox_buscar_compra, jTable_compras);
      busca.opcTabla(); 
    }//GEN-LAST:event_jB_Buscar_compraActionPerformed

    private void selec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec1ActionPerformed
      try{
      String[] datos = new  String[7];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTab_clientes);
      jT_Id_cliente.setText(datos[0]);
      jTNombreCliente.setText(datos[1]);
      jTApellidoM_cliente.setText(datos[2]);
      jTApellidoP_Clietne.setText(datos[3]);
      jTDireccionCliente.setText(datos[4]);
      jTTelefono_cliente.setText(datos[5]);
      jTCorreo_Cliente.setText(datos[6]);
      }catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
      }
       
    }//GEN-LAST:event_selec1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
     try{
      String[] datos = new  String[4];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTable_servicios);
      jT_ID_servicio.setText(datos[0]);
      jTNombre_servicio.setText(datos[1]);
      jTADescripcion_servicio.setText(datos[2]);
      jTPrecio_Servicio.setText(datos[3]);
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
     }
    }//GEN-LAST:event_select2ActionPerformed

    private void select3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select3ActionPerformed
      try{
      String[] datos = new  String[7];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTable_Empleados);
      jT_ID_empleado.setText(datos[0]);
      jT_NombreEmpleado.setText(datos[1]);
      jT_ApellidoP_empleado.setText(datos[2]);
      jT_ApellidoM_empleado.setText(datos[3]);
      jT_DireccionEmpleado.setText(datos[4]);
      jT_Telefono_empleado.setText(datos[5]);
      jT_Fecha_nac.setText(datos[6]);
      }catch(Exception e)
      {
        JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
      }
    }//GEN-LAST:event_select3ActionPerformed

    private void select4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select4ActionPerformed
      try{
      String[] datos = new  String[5];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTable_Proveedores);
      jT_ID_proveedor.setText(datos[0]);
      jT_Nombre_proveedor.setText(datos[1]);
      jT_Telefono_proveedor.setText(datos[2]);
      jT_direccion_proveedor.setText(datos[3]);
      jT_Correo_proveedor.setText(datos[4]);
      }catch(Exception e)
      {
       JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
      }
    }//GEN-LAST:event_select4ActionPerformed

    private void limpia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpia1ActionPerformed
      jT_Id_cliente.setText("");
      jTNombreCliente.setText("");
      jTApellidoM_cliente.setText("");
      jTApellidoP_Clietne.setText("");
      jTDireccionCliente.setText("");
      jTTelefono_cliente.setText("");
      jTCorreo_Cliente.setText("");
    }//GEN-LAST:event_limpia1ActionPerformed

    private void limpia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpia2ActionPerformed
       jT_ID_servicio.setText("");
      jTNombre_servicio.setText("");
      jTADescripcion_servicio.setText("");
      jTPrecio_Servicio.setText("");
    }//GEN-LAST:event_limpia2ActionPerformed

    private void limpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar3ActionPerformed
      jT_ID_empleado.setText("");
      jT_NombreEmpleado.setText("");
      jT_ApellidoP_empleado.setText("");
      jT_ApellidoM_empleado.setText("");
      jT_DireccionEmpleado.setText("");
      jT_Telefono_empleado.setText("");
      jT_Fecha_nac.setText("");
    }//GEN-LAST:event_limpiar3ActionPerformed

    private void limpiar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar4ActionPerformed
      jT_ID_proveedor.setText("");
      jT_Nombre_proveedor.setText("");
      jT_Telefono_proveedor.setText("");
      jT_direccion_proveedor.setText("");
      jT_Correo_proveedor.setText(""); 
    }//GEN-LAST:event_limpiar4ActionPerformed

    private void jB_editar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_editar_clienteActionPerformed
       mod.modificaCliente(jT_Id_cliente.getText(),jTNombreCliente.getText(), jTApellidoP_Clietne.getText(), jTApellidoM_cliente.getText(),jTDireccionCliente.getText(),jTTelefono_cliente.getText(), jTCorreo_Cliente.getText());
       ClaseBusqueda busca = new ClaseBusqueda("", "clientes", jComboBox_BuscarClientes, jTab_clientes);
       busca.opcTabla();
    }//GEN-LAST:event_jB_editar_clienteActionPerformed

    private void jB_Modificar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modificar_servicioActionPerformed
       mod.modificaServicio(jT_ID_servicio.getText(),jTNombre_servicio.getText(),jTADescripcion_servicio.getText(),jTPrecio_Servicio.getText());
       ClaseBusqueda busca = new ClaseBusqueda("", "servicios", jComboBox_Servicios, jTable_servicios);
       busca.opcTabla();
    }//GEN-LAST:event_jB_Modificar_servicioActionPerformed

    private void jB_modificar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_modificar_empleadoActionPerformed
       mod.modificaEmpleado(jT_ID_empleado.getText(), jT_NombreEmpleado.getText(), jT_ApellidoP_empleado.getText(), jT_ApellidoM_empleado.getText(), jT_DireccionEmpleado.getText(),jT_Telefono_empleado.getText(),jT_Fecha_nac.getText());
       ClaseBusqueda busca = new ClaseBusqueda("", "empleados", jComboBox_empleados, jTable_Empleados);
       busca.opcTabla();
    }//GEN-LAST:event_jB_modificar_empleadoActionPerformed

    private void jB_Modifcar_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Modifcar_proveedorActionPerformed
      mod.modificaProveedor(jT_ID_proveedor.getText(),jT_Nombre_proveedor.getText(), jT_Telefono_proveedor.getText(),jT_direccion_proveedor.getText(),jT_Correo_proveedor.getText());
      ClaseBusqueda busca = new ClaseBusqueda("", "proveedores", jComboBox_Proveedor, jTable_Proveedores);
      busca.opcTabla();     
    }//GEN-LAST:event_jB_Modifcar_proveedorActionPerformed

    private void jCombo_ProveComprasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCombo_ProveComprasFocusGained
      jCombo_ProveCompras.removeAllItems();
      re.llenarP(jCombo_ProveCompras,"proveedores","id_proveedor");
    }//GEN-LAST:event_jCombo_ProveComprasFocusGained

    private void jComboProveServicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboProveServicioFocusGained
      jComboProveServicio.removeAllItems();
      re.llenarP(jComboProveServicio,"servicios","id_servicio");
    }//GEN-LAST:event_jComboProveServicioFocusGained

    private void jComboVentasClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboVentasClienteFocusGained
      jComboVentasCliente.removeAllItems();
      re.llenarP(jComboVentasCliente,"clientes","id_cliente");
    }//GEN-LAST:event_jComboVentasClienteFocusGained

    private void jComboVentasServicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboVentasServicioFocusGained
      jComboVentasServicio.removeAllItems();
      re.llenarP(jComboVentasServicio,"servicios","id_servicio");
    }//GEN-LAST:event_jComboVentasServicioFocusGained

    private void alta_compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_compraActionPerformed
       GuardarCompraVenta comp = new GuardarCompraVenta();
       comp.insertarCompra(employee,jCombo_ProveCompras.getSelectedItem().toString(),jComboProveServicio.getSelectedItem().toString());
    }//GEN-LAST:event_alta_compraActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        try{
      String[] datos = new  String[5];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTable_compras);
      jT_Folio_compra.setText(datos[0]);
      jT_Fecha_compra.setText(datos[1]);
      jCombo_ProveCompras.removeAllItems();
      jCombo_ProveCompras.addItem(datos[3]);
      jT_Empleado_compra.setText(datos[2]);
      jComboProveServicio.removeAllItems();
      jComboProveServicio.addItem(datos[4]);
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
     } 
    }//GEN-LAST:event_select5ActionPerformed

    private void borrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarCompraActionPerformed
     
      int opc = JOptionPane.showConfirmDialog(null, "Seguro que deseas borrar este registro?", "Mensaje", 2);
      if(opc==0)
      {
       GuardarCompraVenta borra = new GuardarCompraVenta();
       borra.borrarCompra(jT_Folio_compra.getText());
       ClaseBusqueda busca = new ClaseBusqueda("", "compras", jComboBox_buscar_compra, jTable_compras);
       busca.opcTabla();
      }  
    
    }//GEN-LAST:event_borrarCompraActionPerformed

    private void limpia_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpia_comprasActionPerformed
      jT_Folio_compra.setText("");
      jT_Fecha_compra.setText("");
      jCombo_ProveCompras.removeAllItems();
      jT_Empleado_compra.setText("");
      jComboProveServicio.removeAllItems();
    }//GEN-LAST:event_limpia_comprasActionPerformed

    private void jboton_modifica_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboton_modifica_comprasActionPerformed
     try{
     mod.modificaCompras(jCombo_ProveCompras.getSelectedItem().toString(), jComboProveServicio.getSelectedItem().toString(), jT_Folio_compra.getText());
     ClaseBusqueda busca = new ClaseBusqueda("", "compras", jComboBox_buscar_compra, jTable_compras);
     busca.opcTabla();
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
     }
    }//GEN-LAST:event_jboton_modifica_comprasActionPerformed

    private void alta_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alta_ventaActionPerformed
     GuardarCompraVenta venta = new GuardarCompraVenta();
     venta.insertarVenta(jComboVentasServicio.getSelectedItem().toString(), jComboVentasCliente.getSelectedItem().toString(), employee);
    }//GEN-LAST:event_alta_ventaActionPerformed

    private void jB_Buscar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_Buscar_ventaActionPerformed
     ClaseBusqueda busca = new ClaseBusqueda(jT_dato_venta.getText(), "venta", jComboBox_buscar_venta, jTable_venta);
     busca.opcTabla();
    }//GEN-LAST:event_jB_Buscar_ventaActionPerformed

    private void select6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select6ActionPerformed
       try{
      String[] datos = new  String[5];
      ClaseSeleccionar ob = new ClaseSeleccionar();
      datos=ob.selecciona(jTable_venta);
      jT_Folio_venta.setText(datos[0]);
      jTFecha_venta.setText(datos[1]);
      jComboVentasCliente.removeAllItems();
      jComboVentasCliente.addItem(datos[3]);
      jT_empleado_venta.setText(datos[4]);
      jComboVentasServicio.removeAllItems();
      jComboVentasServicio.addItem(datos[2]);
     }catch(Exception e)
     {
      JOptionPane.showMessageDialog(null, "Porfavor selecciona un renglon de la tabla");
     } 
    }//GEN-LAST:event_select6ActionPerformed

    private void jBoton_borraVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton_borraVentaActionPerformed
      int opc = JOptionPane.showConfirmDialog(null, "Seguro que deseas borrar este registro?", "Mensaje", 2);
      if(opc==0)
      {
      GuardarCompraVenta borra = new GuardarCompraVenta();
      borra.borrarVenta( jT_Folio_venta.getText());
      ClaseBusqueda busca = new ClaseBusqueda("", "venta", jComboBox_buscar_venta, jTable_venta);
      busca.opcTabla(); 
      }
    }//GEN-LAST:event_jBoton_borraVentaActionPerformed

    private void limpia_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpia_ventasActionPerformed
      jT_Folio_venta.setText("");
      jTFecha_venta.setText("");
      jComboVentasCliente.removeAllItems();
      jT_empleado_venta.setText("");
      jComboVentasServicio.removeAllItems();
    }//GEN-LAST:event_limpia_ventasActionPerformed

    private void jBoton_modificarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoton_modificarVentasActionPerformed
     try{
     mod.modificaVentas(jT_Folio_venta.getText(), jComboVentasServicio.getSelectedItem().toString() , jComboVentasCliente.getSelectedItem().toString());
     ClaseBusqueda busca = new ClaseBusqueda("", "venta", jComboBox_buscar_venta, jTable_venta);
     busca.opcTabla();
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, "Porfavor no dejes espacios en blanco");
     }
    }//GEN-LAST:event_jBoton_modificarVentasActionPerformed

    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta_compra;
    private javax.swing.JButton alta_venta;
    private javax.swing.JButton borrarCompra;
    private javax.swing.JButton jB_Borrar_cliente;
    private javax.swing.JButton jB_Borrar_empleado;
    private javax.swing.JButton jB_Borrar_servicio;
    private javax.swing.JButton jB_Buscar_compra;
    private javax.swing.JButton jB_Buscar_servicio;
    private javax.swing.JButton jB_Buscar_venta;
    private javax.swing.JButton jB_Modifcar_proveedor;
    private javax.swing.JButton jB_Modificar_servicio;
    private javax.swing.JButton jB_alta_clientes;
    private javax.swing.JButton jB_alta_empleado;
    private javax.swing.JButton jB_alta_servicio;
    private javax.swing.JButton jB_borrar_proveedor;
    private javax.swing.JButton jB_buscar_cliente;
    private javax.swing.JButton jB_buscar_proveedor;
    private javax.swing.JButton jB_editar_cliente;
    private javax.swing.JButton jB_modificar_empleado;
    private javax.swing.JButton jBoton_borraVenta;
    private javax.swing.JButton jBoton_modificarVentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Buscar_empleado;
    private javax.swing.JComboBox<String> jComboBox_BuscarClientes;
    private javax.swing.JComboBox<String> jComboBox_Proveedor;
    private javax.swing.JComboBox<String> jComboBox_Servicios;
    private javax.swing.JComboBox<String> jComboBox_buscar_compra;
    private javax.swing.JComboBox<String> jComboBox_buscar_venta;
    private javax.swing.JComboBox<String> jComboBox_empleados;
    private javax.swing.JComboBox<String> jComboProveServicio;
    private javax.swing.JComboBox<String> jComboVentasCliente;
    private javax.swing.JComboBox<String> jComboVentasServicio;
    private javax.swing.JComboBox<String> jCombo_ProveCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbackground;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Consultas;
    private javax.swing.JPanel jPanel_Empleados;
    private javax.swing.JPanel jPanel_clientes;
    private javax.swing.JPanel jPanel_proveedores;
    private javax.swing.JPanel jPanel_servicios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    public static javax.swing.JTextArea jTADescripcion_servicio;
    public static javax.swing.JTextField jTApellidoM_cliente;
    public static javax.swing.JTextField jTApellidoP_Clietne;
    public static javax.swing.JTextField jTCorreo_Cliente;
    public static javax.swing.JTextField jTDireccionCliente;
    private javax.swing.JTextField jTFecha_venta;
    public static javax.swing.JTextField jTNombreCliente;
    public static javax.swing.JTextField jTNombre_servicio;
    public static javax.swing.JTextField jTPrecio_Servicio;
    public static javax.swing.JTextField jTTelefono_cliente;
    private javax.swing.JTextField jT_ApellidoM_empleado;
    private javax.swing.JTextField jT_ApellidoP_empleado;
    public static javax.swing.JTextField jT_Correo_proveedor;
    private javax.swing.JTextField jT_Dato_servicio;
    private javax.swing.JTextField jT_DireccionEmpleado;
    private javax.swing.JTextField jT_Empleado_compra;
    private javax.swing.JTextField jT_Fecha_compra;
    private javax.swing.JTextField jT_Fecha_nac;
    private javax.swing.JTextField jT_Folio_compra;
    private javax.swing.JTextField jT_Folio_venta;
    private javax.swing.JTextField jT_ID_empleado;
    private javax.swing.JTextField jT_ID_proveedor;
    private javax.swing.JTextField jT_ID_servicio;
    public static javax.swing.JTextField jT_Id_cliente;
    private javax.swing.JTextField jT_NombreEmpleado;
    public static javax.swing.JTextField jT_Nombre_proveedor;
    private javax.swing.JTextField jT_Telefono_empleado;
    public static javax.swing.JTextField jT_Telefono_proveedor;
    private javax.swing.JTextField jT_dato_cliente;
    private javax.swing.JTextField jT_dato_compra;
    public static javax.swing.JTextField jT_dato_empleado;
    private javax.swing.JTextField jT_dato_proveedores;
    private javax.swing.JTextField jT_dato_venta;
    public static javax.swing.JTextField jT_direccion_proveedor;
    private javax.swing.JTextField jT_empleado_venta;
    private javax.swing.JTable jTab_clientes;
    private javax.swing.JTabbedPane jTabbedPane_principal;
    private javax.swing.JTable jTable_Empleados;
    private javax.swing.JTable jTable_Proveedores;
    private javax.swing.JTable jTable_compras;
    private javax.swing.JTable jTable_servicios;
    private javax.swing.JTable jTable_venta;
    private javax.swing.JTextArea jTextArea_descripcion_busqueda;
    private javax.swing.JButton jboton_modifica_compras;
    private javax.swing.JButton limpia1;
    private javax.swing.JButton limpia2;
    private javax.swing.JButton limpia_compras;
    private javax.swing.JButton limpia_ventas;
    private javax.swing.JButton limpiar3;
    private javax.swing.JButton limpiar4;
    private javax.swing.JButton selec1;
    private javax.swing.JButton select2;
    private javax.swing.JButton select3;
    private javax.swing.JButton select4;
    private javax.swing.JButton select5;
    private javax.swing.JButton select6;
    // End of variables declaration//GEN-END:variables
}
