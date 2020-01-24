
package newpackage;

import javax.swing.JOptionPane;
import paqueteBuscar.ClaseLogin;

/**
 *
 * @author luis-MsterRacePapu
 */
public class loginVentana extends javax.swing.JFrame {

    
    public loginVentana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNombre_usuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jB_Entrar = new javax.swing.JButton();
        jB_SalirLog = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 230, 230));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        getContentPane().add(jTNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 140, -1));
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 140, -1));

        jB_Entrar.setBackground(new java.awt.Color(0, 153, 0));
        jB_Entrar.setForeground(new java.awt.Color(255, 255, 255));
        jB_Entrar.setText("Entrar");
        jB_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jB_Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jB_SalirLog.setBackground(new java.awt.Color(153, 0, 51));
        jB_SalirLog.setForeground(new java.awt.Color(255, 255, 255));
        jB_SalirLog.setText("salir");
        jB_SalirLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_SalirLogActionPerformed(evt);
            }
        });
        getContentPane().add(jB_SalirLog, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_logg.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 312, 442));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_SalirLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_SalirLogActionPerformed
       int opc = JOptionPane.showConfirmDialog(null, "Seguro que deseas salir?", "Mensaje", 2);
       if(opc==0)
       {
        System.exit(0);
       }
           
    }//GEN-LAST:event_jB_SalirLogActionPerformed

    private void jB_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_EntrarActionPerformed
        ClaseLogin log = new ClaseLogin();
        if(log.login(jTNombre_usuario.getText(), jPassword.getText()))
        {
         
         this.setVisible(false);
         
        }  
            
        
    }//GEN-LAST:event_jB_EntrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(loginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginVentana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Entrar;
    private javax.swing.JButton jB_SalirLog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTNombre_usuario;
    // End of variables declaration//GEN-END:variables
}
