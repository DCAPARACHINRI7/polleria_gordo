/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
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

        jPanel2 = new javax.swing.JPanel();
        btnHerramienta = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMinimisar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        barra = new javax.swing.JLabel();
        btnRegresar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHerramienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Configurar.png"))); // NOI18N
        btnHerramienta.setBorder(null);
        btnHerramienta.setBorderPainted(false);
        btnHerramienta.setContentAreaFilled(false);
        btnHerramienta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Configurarsegundo.png"))); // NOI18N
        jPanel2.add(btnHerramienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 40, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrarsegundo.png"))); // NOI18N
        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 40, 40));

        btnMinimisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizar.png"))); // NOI18N
        btnMinimisar.setBorder(null);
        btnMinimisar.setBorderPainted(false);
        btnMinimisar.setContentAreaFilled(false);
        btnMinimisar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizarsegundo.png"))); // NOI18N
        jPanel2.add(btnMinimisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 40, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_SalirBG.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Salirsegundo.png"))); // NOI18N
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG_grande.png"))); // NOI18N
        jPanel2.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 58));

        btnRegresar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar4.setBorder(null);
        btnRegresar4.setBorderPainted(false);
        btnRegresar4.setContentAreaFilled(false);
        btnRegresar4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        jPanel2.add(btnRegresar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnHerramienta;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRegresar4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
