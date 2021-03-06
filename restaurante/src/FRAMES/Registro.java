package FRAMES;

import clases.login;
import dao.TextPrompt;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    login log = new login();
    //Registro_de_usuario reg = new Registro_de_usuario();
    //Inicio inic = new Inicio();

    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);

        TextPrompt usuario = new TextPrompt("Ingrese su Nombre de Usuario", tf_usuario);
        TextPrompt nombre = new TextPrompt("Ingrese su Nombre", tf_nombre);
        TextPrompt apellido = new TextPrompt("Ingrese su Apellido", tf_apellido);
        TextPrompt correo = new TextPrompt("Ingrese su Correo Electronico", tf_correo);
        TextPrompt contra = new TextPrompt("Ingrese su contraseña", tp_contra);
        TextPrompt numCelular = new TextPrompt("Ingrese su Numero de Celular", tf_num_celular);
        TextPrompt dia = new TextPrompt(" " + "  10", dd);
        TextPrompt mes = new TextPrompt(" " + "  05", mm);
        TextPrompt ano = new TextPrompt(" " + "  2019", yy);

    }

    private void OcultarContraseña() {
        noVisible.setVisible(false);
        visible.setVisible(true);

        tp_contra.setVisible(true);
        tf_contra.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        logo_pequeño = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        candado = new javax.swing.JLabel();
        visible = new javax.swing.JButton();
        noVisible = new javax.swing.JButton();
        candado1 = new javax.swing.JLabel();
        barra3 = new javax.swing.JLabel();
        candado2 = new javax.swing.JLabel();
        barra4 = new javax.swing.JLabel();
        cumpleaños = new javax.swing.JLabel();
        barra8 = new javax.swing.JLabel();
        barra9 = new javax.swing.JLabel();
        barra10 = new javax.swing.JLabel();
        barra5 = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        barra6 = new javax.swing.JLabel();
        correo1 = new javax.swing.JLabel();
        barra7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        olvidemicontraseña = new javax.swing.JLabel();
        tf_num_celular = new javax.swing.JTextField();
        tf_correo = new javax.swing.JTextField();
        mm = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        tp_contra = new javax.swing.JPasswordField();
        tf_contra = new javax.swing.JTextField();
        yy = new javax.swing.JTextField();
        dd = new javax.swing.JTextField();
        RLSexo2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 40, 40));

        titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Titulo.png"))); // NOI18N
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 19, 330, -1));

        logo_pequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Logo_BG.png"))); // NOI18N
        getContentPane().add(logo_pequeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 4, 90, 70));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -3, 640, 80));

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Usuario.png"))); // NOI18N
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 126, 20, 30));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 150, 370, 10));

        candado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Profile.png"))); // NOI18N
        getContentPane().add(candado, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 310, 30, -1));

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
        getContentPane().add(visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 186, 30, 20));

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
        getContentPane().add(noVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(1112, 186, 30, 20));

        candado1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Candado.png"))); // NOI18N
        getContentPane().add(candado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 180, 20, 30));

        barra3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 204, 390, 10));

        candado2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Profile.png"))); // NOI18N
        getContentPane().add(candado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 253, 30, -1));

        barra4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 272, 400, 10));

        cumpleaños.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Cumpleaños.png"))); // NOI18N
        getContentPane().add(cumpleaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 370, 20, 30));

        barra8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 40, 10));

        barra9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 390, 40, 10));

        barra10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 390, 50, 10));

        barra5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 330, 410, 10));

        celular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Celular.png"))); // NOI18N
        getContentPane().add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 490, 20, 30));

        barra6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 515, 390, 10));

        correo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/IMG_Correo.png"))); // NOI18N
        getContentPane().add(correo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 430, 30, 30));

        barra7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_grande.png"))); // NOI18N
        getContentPane().add(barra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 452, 410, 10));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Aceptar.png"))); // NOI18N
        btnAceptar.setBorder(null);
        btnAceptar.setBorderPainted(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Aceptarsegundo.png"))); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(795, 624, 340, 50));

        olvidemicontraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        olvidemicontraseña.setForeground(new java.awt.Color(168, 12, 17));
        olvidemicontraseña.setText("Acepta los términos y condiciones");
        olvidemicontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidemicontraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(olvidemicontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 574, 280, 20));

        tf_num_celular.setBorder(null);
        tf_num_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_num_celularActionPerformed(evt);
            }
        });
        getContentPane().add(tf_num_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 330, 30));

        tf_correo.setBorder(null);
        tf_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_correoActionPerformed(evt);
            }
        });
        getContentPane().add(tf_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 430, 340, 30));

        mm.setBorder(null);
        getContentPane().add(mm, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 40, 30));

        tf_apellido.setBorder(null);
        getContentPane().add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 330, 30));

        tf_nombre.setBorder(null);
        getContentPane().add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 320, 30));

        tf_usuario.setBorder(null);
        getContentPane().add(tf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 340, 30));

        tp_contra.setBorder(null);
        tp_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tp_contraActionPerformed(evt);
            }
        });
        getContentPane().add(tp_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 184, 290, 20));

        tf_contra.setBorder(null);
        getContentPane().add(tf_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 290, 30));

        yy.setBorder(null);
        yy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yyActionPerformed(evt);
            }
        });
        getContentPane().add(yy, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 50, 30));

        dd.setBorder(null);
        dd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddActionPerformed(evt);
            }
        });
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 40, 30));

        RLSexo2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo2.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo2.setText("Día           Mes             Año");
        getContentPane().add(RLSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 160, 24));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FondoIzquierdo.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        //retrocediendo a jframe de INICIO
        this.setVisible(false);
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleActionPerformed
        tp_contra.setVisible(false);
        tf_contra.setVisible(true);
        tf_contra.setText(tp_contra.getText());
        visible.setVisible(false);
        noVisible.setVisible(true);
    }//GEN-LAST:event_visibleActionPerformed

    private void noVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noVisibleActionPerformed
        tf_contra.setVisible(false);
        tp_contra.setVisible(true);
        tp_contra.setText(tf_contra.getText());
        visible.setVisible(true);
        noVisible.setVisible(false);
    }//GEN-LAST:event_noVisibleActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Inicio inic = new Inicio();
        Registro reg = new Registro();
        if (tf_usuario.getText().equals("") || tf_nombre.getText().equals("") || tf_apellido.getText().equals("") || tp_contra.getPassword().equals("") || dd.getText().equals("") || mm.getText().equals("") || yy.getText().equals("") || tf_num_celular.getText().equals("") || tf_correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los datos");
        } else {

            String mensaje = "";

            if (log.existeUsuario(tf_usuario.getText()) == 0) {

                if (log.esEmail(tf_correo.getText())) {

                    int d = Integer.parseInt(dd.getText());
                    int m = Integer.parseInt(mm.getText());
                    int y = Integer.parseInt(yy.getText());
                    if (d > 0 && d <= 31) {
                        if (m > 1 && m <= 12) {
                            if (y > 999 && y <= 2018) {
                                String fecha = new String(y + "-" + m + "-" + d);
                                String pas_encr = clases.ENCRIPTACION.Encriptar(tp_contra.getText(), 2);
                                log.setUsuario(tf_usuario.getText());
                                log.setNombre(tf_nombre.getText());
                                log.setApellido(tf_apellido.getText());
                                log.setFecha_nac(fecha);
                                log.setSexo(mensaje);
                                log.setCorreo(tf_correo.getText());
                                log.setPassword(pas_encr);
                                //log.setIdtipo(1);

                                if (log.registrar()) {
                                    JOptionPane.showMessageDialog(null, "Registro Guardado");
                                    reg.setVisible(false);
                                    inic.setVisible(true);
                                    LIMPIAR();

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al Guardar");
                                    LIMPIAR();
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "INGRESAR CORRECTAMENTE EL AÑO");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "INGRESAR CORRECTAMENTE EL MES");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "INGRESAR CORRECTAMENTE EL DIA");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "El email es incorrecto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario ya existe");
                LIMPIAR();
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void olvidemicontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidemicontraseñaMouseClicked
       
    }//GEN-LAST:event_olvidemicontraseñaMouseClicked

    private void tf_num_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_num_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_num_celularActionPerformed

    private void tf_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoActionPerformed

    private void yyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yyActionPerformed

    private void ddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ddActionPerformed

    private void tp_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tp_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tp_contraActionPerformed
    private void LIMPIAR() {
        tf_usuario.setText("");
        tf_nombre.setText("");
        tf_apellido.setText("");
        dd.setText("");
        mm.setText("");
        yy.setText("");
        tf_correo.setText("");
        //RPContraseña.setText("");
        tp_contra.setText("");

    }

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel RLSexo2;
    private javax.swing.JLabel barra;
    private javax.swing.JLabel barra10;
    private javax.swing.JLabel barra3;
    private javax.swing.JLabel barra4;
    private javax.swing.JLabel barra5;
    private javax.swing.JLabel barra6;
    private javax.swing.JLabel barra7;
    private javax.swing.JLabel barra8;
    private javax.swing.JLabel barra9;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel candado;
    private javax.swing.JLabel candado1;
    private javax.swing.JLabel candado2;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel correo1;
    private javax.swing.JLabel cumpleaños;
    private javax.swing.JTextField dd;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel logo_pequeño;
    private javax.swing.JTextField mm;
    private javax.swing.JButton noVisible;
    private javax.swing.JLabel olvidemicontraseña;
    public static javax.swing.JTextField tf_apellido;
    public static javax.swing.JTextField tf_contra;
    public static javax.swing.JTextField tf_correo;
    public static javax.swing.JTextField tf_nombre;
    public static javax.swing.JTextField tf_num_celular;
    public static javax.swing.JTextField tf_usuario;
    private javax.swing.JLabel titulo;
    public static javax.swing.JPasswordField tp_contra;
    private javax.swing.JLabel usuario;
    private javax.swing.JButton visible;
    private javax.swing.JTextField yy;
    // End of variables declaration//GEN-END:variables
}
