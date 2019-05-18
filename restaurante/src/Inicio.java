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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        candado = new javax.swing.JLabel();
        barra2 = new javax.swing.JLabel();
        visible = new javax.swing.JButton();
        noVisible = new javax.swing.JButton();
        olvidemicontraseña = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        regustrar = new javax.swing.JButton();
        olvidemicontraseña1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 375, 30, 20));

        noVisible.setForeground(new java.awt.Color(255, 255, 255));
        noVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/noVisible.png"))); // NOI18N
        noVisible.setBorder(null);
        noVisible.setBorderPainted(false);
        noVisible.setContentAreaFilled(false);
        noVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noVisibleActionPerformed(evt);
            }
        });
        getContentPane().add(noVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 375, 30, 20));

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
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 482, 340, 50));

        regustrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Registrarse.png"))); // NOI18N
        regustrar.setBorder(null);
        regustrar.setBorderPainted(false);
        regustrar.setContentAreaFilled(false);
        regustrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_RegistrarseSecundario.png"))); // NOI18N
        getContentPane().add(regustrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 560, 340, 50));

        olvidemicontraseña1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        olvidemicontraseña1.setForeground(new java.awt.Color(168, 12, 17));
        olvidemicontraseña1.setText("¿Olvidaste tu contraseña?");
        olvidemicontraseña1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidemicontraseña1MouseClicked(evt);
            }
        });
        getContentPane().add(olvidemicontraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 414, 160, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoIzquierdo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void noVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVisibleActionPerformed
        noVisible.setVisible(false);
        visible.setVisible(true);
    }//GEN-LAST:event_noVisibleActionPerformed

    private void olvidemicontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidemicontraseñaMouseClicked
        
        
        /*A qui se colocara a donde se quiere mandar*/
    }//GEN-LAST:event_olvidemicontraseñaMouseClicked

    private void visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleActionPerformed
       visible.setVisible(false);
       noVisible.setVisible(true);
    }//GEN-LAST:event_visibleActionPerformed

    private void olvidemicontraseña1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidemicontraseña1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_olvidemicontraseña1MouseClicked

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
    private javax.swing.JLabel candado;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel logo;
    private javax.swing.JButton noVisible;
    private javax.swing.JLabel olvidemicontraseña;
    private javax.swing.JLabel olvidemicontraseña1;
    private javax.swing.JButton regustrar;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton visible;
    // End of variables declaration//GEN-END:variables
}
