/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Cambiar_contraseña extends javax.swing.JFrame {

    /**
     * Creates new form Cambiar_contraseña
     */
    public Cambiar_contraseña() {
        initComponents();
         TextPrompt nuevaContraseña=new TextPrompt("Ingrese una nueva contraseña", contrasena_nueva);//LA NUEVA CONTRASEÑA
          TextPrompt repetirContraseña=new TextPrompt("Ingrese de nuevo su contreseña", contrasena_repetida);//LA CONTRASEÑA REPETIDA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cambiar_contraseña = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        logo_pequeño = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        candado1 = new javax.swing.JLabel();
        barra3 = new javax.swing.JLabel();
        candado2 = new javax.swing.JLabel();
        barra4 = new javax.swing.JLabel();
        visible1 = new javax.swing.JButton();
        noVisible = new javax.swing.JButton();
        visible2 = new javax.swing.JButton();
        noVisible1 = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        contrasena_repetida = new javax.swing.JTextField();
        contrasena_nueva = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambiar_contraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Titulocambiarcontrasseña.png"))); // NOI18N
        getContentPane().add(cambiar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 380, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 40, 40));

        logo_pequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_BG.png"))); // NOI18N
        getContentPane().add(logo_pequeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 90, 70));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -3, 640, 80));

        candado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Candado.png"))); // NOI18N
        getContentPane().add(candado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 224, 20, 30));

        barra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 257, 390, 10));

        candado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Candado.png"))); // NOI18N
        getContentPane().add(candado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 309, 20, 30));

        barra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(787, 340, 390, 10));

        visible1.setForeground(new java.awt.Color(255, 255, 255));
        visible1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Visible.jpg"))); // NOI18N
        visible1.setBorder(null);
        visible1.setBorderPainted(false);
        visible1.setContentAreaFilled(false);
        visible1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visible1ActionPerformed(evt);
            }
        });
        getContentPane().add(visible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 30, 20));

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
        getContentPane().add(noVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 240, 30, 20));

        visible2.setForeground(new java.awt.Color(255, 255, 255));
        visible2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Visible.jpg"))); // NOI18N
        visible2.setBorder(null);
        visible2.setBorderPainted(false);
        visible2.setContentAreaFilled(false);
        visible2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visible2ActionPerformed(evt);
            }
        });
        getContentPane().add(visible2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 322, 30, 20));

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
        getContentPane().add(noVisible1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 322, 30, 20));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Aceptar.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Aceptarsegundo.png"))); // NOI18N
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 541, 340, 50));

        contrasena_repetida.setBorder(null);
        getContentPane().add(contrasena_repetida, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 303, 290, 40));

        contrasena_nueva.setBorder(null);
        getContentPane().add(contrasena_nueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 290, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoIzquierdo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visible1ActionPerformed
      
    }//GEN-LAST:event_visible1ActionPerformed

    private void noVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVisibleActionPerformed
     
    }//GEN-LAST:event_noVisibleActionPerformed

    private void visible2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visible2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visible2ActionPerformed

    private void noVisible1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVisible1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noVisible1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiar_contraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel barra3;
    private javax.swing.JLabel barra4;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel cambiar_contraseña;
    private javax.swing.JLabel candado1;
    private javax.swing.JLabel candado2;
    private javax.swing.JTextField contrasena_nueva;
    private javax.swing.JTextField contrasena_repetida;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo_pequeño;
    private javax.swing.JButton noVisible;
    private javax.swing.JButton noVisible1;
    private javax.swing.JButton visible1;
    private javax.swing.JButton visible2;
    // End of variables declaration//GEN-END:variables
}
