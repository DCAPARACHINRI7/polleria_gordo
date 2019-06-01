/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Verificación_del_correo extends javax.swing.JFrame {

    /**
     * Creates new form Verificación_del_correo
     */
    public Verificación_del_correo() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt verificacion_correo=new TextPrompt("Ingrese su correo electronico", tf_verificacion_de_correo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        logo_pequeño = new javax.swing.JLabel();
        verificaciondelcorreo = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        textcentral = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        barra7 = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        tf_verificacion_de_correo = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, 40));

        logo_pequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_BG.png"))); // NOI18N
        getContentPane().add(logo_pequeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 4, 90, 70));

        verificaciondelcorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verificaciondelcorreo.png"))); // NOI18N
        getContentPane().add(verificaciondelcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 19, 380, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -3, 640, 80));

        textcentral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Descripción.png"))); // NOI18N
        getContentPane().add(textcentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 168, 350, 120));

        correo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Correo.png"))); // NOI18N
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 370, 30, 30));

        barra7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 393, 410, 10));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Siguiente.png"))); // NOI18N
        btnSiguiente.setBorder(null);
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_siguientesegundo.png"))); // NOI18N
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 541, 340, 50));

        tf_verificacion_de_correo.setBorder(null);
        getContentPane().add(tf_verificacion_de_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 370, 330, 30));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoIzquierdo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(Verificación_del_correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verificación_del_correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verificación_del_correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verificación_del_correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verificación_del_correo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel barra7;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo_pequeño;
    private javax.swing.JLabel textcentral;
    private javax.swing.JTextField tf_verificacion_de_correo;
    private javax.swing.JLabel verificaciondelcorreo;
    // End of variables declaration//GEN-END:variables
}
