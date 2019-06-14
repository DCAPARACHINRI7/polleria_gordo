package interfaces;

import interfaces.Menu_Principal;
import clases.login;
import dao.TextPrompt;

import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        tf_Usuario.setBackground(new Color(255, 255, 255));
        TextPrompt usuario = new TextPrompt("Ingrese su Usuario", tf_Usuario);
        // jp_contrace.setBackground(new Color(255, 255, 255));
        TextPrompt contra = new TextPrompt("Ingrese su contraseña", tp_contra);
        TextPrompt contraP = new TextPrompt("Ingrese su contraseña", tf_contra);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        visible = new javax.swing.JButton();
        noVisible1 = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        candado = new javax.swing.JLabel();
        barra2 = new javax.swing.JLabel();
        olvidemicontraseña = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        olvidemicontraseña1 = new javax.swing.JLabel();
        tf_contra = new javax.swing.JTextField();
        tp_contra = new javax.swing.JPasswordField();
        tf_Usuario = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrarsegundo.png"))); // NOI18N
        btnCerrar.setAutoscrolls(true);
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrarsegundo.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 10, 40, 40));

        visible.setForeground(new java.awt.Color(255, 255, 255));
        visible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Visible.jpg"))); // NOI18N
        visible.setBorder(null);
        visible.setBorderPainted(false);
        visible.setContentAreaFilled(false);
        visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibleActionPerformed(evt);
            }
        });
        getContentPane().add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 377, 30, 20));

        noVisible1.setForeground(new java.awt.Color(255, 255, 255));
        noVisible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noVisible.png"))); // NOI18N
        noVisible1.setBorder(null);
        noVisible1.setBorderPainted(false);
        noVisible1.setContentAreaFilled(false);
        noVisible1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noVisible1ActionPerformed(evt);
            }
        });
        getContentPane().add(noVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 377, 30, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LogoPequeño.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(831, 30, 260, 220));

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Usuario.png"))); // NOI18N
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 300, 20, 30));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador.png"))); // NOI18N
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 325, 330, 10));

        candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Candado.png"))); // NOI18N
        getContentPane().add(candado, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 370, 20, 30));

        barra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador.png"))); // NOI18N
        getContentPane().add(barra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(808, 395, 350, 10));

        olvidemicontraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        olvidemicontraseña.setForeground(new java.awt.Color(168, 12, 17));
        olvidemicontraseña.setText("Términos y condiciones. Política de privacidad");
        olvidemicontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidemicontraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(olvidemicontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(834, 679, 290, 20));

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Ingresar.png"))); // NOI18N
        ingresar.setBorder(null);
        ingresar.setBorderPainted(false);
        ingresar.setContentAreaFilled(false);
        ingresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_IngresarSecundario.png"))); // NOI18N
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 482, 340, 50));

        olvidemicontraseña1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        olvidemicontraseña1.setForeground(new java.awt.Color(168, 12, 17));
        olvidemicontraseña1.setText("¿Olvidaste tu contraseña?");
        olvidemicontraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidemicontraseña1MouseClicked(evt);
            }
        });
        getContentPane().add(olvidemicontraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 414, 160, 20));

        tf_contra.setBorder(null);
        getContentPane().add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 270, 30));

        tp_contra.setBorder(null);
        tp_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tp_contraActionPerformed(evt);
            }
        });
        getContentPane().add(tp_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 270, 30));

        tf_Usuario.setBorder(null);
        tf_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_UsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tf_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 280, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoIzquierdo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void olvidemicontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidemicontraseñaMouseClicked
        if (tf_Usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Escriba su Usuario y luego presione este botón", "¡Importante!", WIDTH);
        } else {
            JOptionPane.showMessageDialog(this, "Se le enviará la contraseña a su correo electronico.", "¡Importante!", WIDTH);
        }
    }//GEN-LAST:event_olvidemicontraseñaMouseClicked

    private void olvidemicontraseña1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidemicontraseña1MouseClicked
        if (tf_Usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Escriba su Usuario y luego presione este botón", "¡Importante!", WIDTH);
        } else {
            JOptionPane.showMessageDialog(this, "Se le enviará la contraseña a su correo electronico.", "¡Importante!", WIDTH);
        }
    }//GEN-LAST:event_olvidemicontraseña1MouseClicked

    private void tf_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_UsuarioActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed

        login usu = new login();

        usu.setUsuario(tf_Usuario.getText());
        //usu.setPassword(tp_contra.getText());

        if (usu.login()) {
            Menu_Principal me = new Menu_Principal();
            me.setVisible(true);
        }

    }//GEN-LAST:event_ingresarActionPerformed

    private void noVisible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVisible1ActionPerformed
        tp_contra.setText(tf_contra.getText());
        tp_contra.setVisible(true);
        tf_contra.setVisible(false);
        visible.setVisible(true);
        noVisible1.setVisible(false);
    }//GEN-LAST:event_noVisible1ActionPerformed

    private void visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleActionPerformed
        tf_contra.setText(tp_contra.getText());
        tf_contra.setVisible(true);
        tp_contra.setVisible(false);
        noVisible1.setVisible(true);
        visible.setVisible(false);
    }//GEN-LAST:event_visibleActionPerformed

    private void tp_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tp_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tp_contraActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.JLabel barra2;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel candado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel logo;
    private javax.swing.JButton noVisible1;
    private javax.swing.JLabel olvidemicontraseña;
    private javax.swing.JLabel olvidemicontraseña1;
    public static javax.swing.JTextField tf_Usuario;
    private javax.swing.JTextField tf_contra;
    private javax.swing.JPasswordField tp_contra;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton visible;
    // End of variables declaration//GEN-END:variables
}
