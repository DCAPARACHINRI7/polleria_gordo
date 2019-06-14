package interfaces;


import interfaces.Menu_Principal;
import dao.TextPrompt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Cupones extends javax.swing.JFrame {

    /**
     * Creates new form Cupones
     */
    public Cupones() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt ID = new TextPrompt("012554545484", tf_id);//ID
        TextPrompt titulo = new TextPrompt("Feliz Día de las Madres", tf_titulo);//TITULO
        TextPrompt descuento = new TextPrompt("10%", tf_descuento);//DESCUENTO
        TextPrompt stock = new TextPrompt("100", tf_stock);//STOCK
        TextPrompt fechauso = new TextPrompt("14/05/2019", tf_fecha_de_uso);//FECHA DE USO
        TextPrompt utilizado = new TextPrompt("Jorge Luis Gutierrez", tf_utilizado);//UTILIZADO
        TextPrompt valido = new TextPrompt("Todos los platillos", tf_valido);//VALIDO
        /*creacion*/
        TextPrompt ddCreacion = new TextPrompt(" " + " 10", dd_Creacion);
        TextPrompt mmCreacion = new TextPrompt(" " + " 10", mm_Creacion);
        TextPrompt yyCreacion = new TextPrompt(" " + " 2019", yy_Creacion);
        /*caducidad*/
        TextPrompt ddCaducidad = new TextPrompt(" " + " 10", dd_Caducidad);
        TextPrompt mmCaducidad = new TextPrompt(" " + " 10", mm_Caducidad);
        TextPrompt yyCaducidad = new TextPrompt(" " + " 2019", yy_Caducidad);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        RLSexo3 = new javax.swing.JLabel();
        dd_Caducidad = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        mm_Caducidad = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        yy_Caducidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dd_Creacion = new javax.swing.JTextField();
        RLSexo2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mm_Creacion = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        yy_Creacion = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        cupones = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        valido = new javax.swing.JLabel();
        fechadecreacion = new javax.swing.JLabel();
        utilizado = new javax.swing.JLabel();
        fechadeuso1 = new javax.swing.JLabel();
        fechadeuso = new javax.swing.JLabel();
        btnMinimisar = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tf_id = new javax.swing.JTextField();
        tf_titulo = new javax.swing.JTextField();
        tf_stock = new javax.swing.JTextField();
        tf_valido = new javax.swing.JTextField();
        tf_descuento = new javax.swing.JTextField();
        tf_utilizado = new javax.swing.JTextField();
        tf_fecha_de_uso = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 40, 20));

        RLSexo3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo3.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo3.setText("Día           Mes             Año");
        jPanel1.add(RLSexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 160, 24));

        dd_Caducidad.setBorder(null);
        dd_Caducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_CaducidadActionPerformed(evt);
            }
        });
        jPanel1.add(dd_Caducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 210, 40, 30));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 220, 40, 20));

        mm_Caducidad.setBorder(null);
        mm_Caducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_CaducidadActionPerformed(evt);
            }
        });
        jPanel1.add(mm_Caducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 210, 40, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 50, 20));

        yy_Caducidad.setBorder(null);
        yy_Caducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yy_CaducidadActionPerformed(evt);
            }
        });
        jPanel1.add(yy_Caducidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 210, 50, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 40, 20));

        dd_Creacion.setBorder(null);
        dd_Creacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_CreacionActionPerformed(evt);
            }
        });
        jPanel1.add(dd_Creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 40, 30));

        RLSexo2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo2.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo2.setText("Día           Mes             Año");
        jPanel1.add(RLSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 160, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 40, 20));

        mm_Creacion.setBorder(null);
        mm_Creacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mm_CreacionActionPerformed(evt);
            }
        });
        jPanel1.add(mm_Creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 40, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 50, 20));

        yy_Creacion.setBorder(null);
        yy_Creacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yy_CreacionActionPerformed(evt);
            }
        });
        jPanel1.add(yy_Creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 50, 30));

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
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 40, 40));

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 108, 30, 20));

        cupones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/titulo_cupones.png"))); // NOI18N
        jPanel1.add(cupones, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 17, 160, 30));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setText("Título:");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 158, 50, 20));

        stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stock.setText("Stock:");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 50, 20));

        descuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descuento.setText("Descuento de:");
        jPanel1.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 158, 120, 20));

        valido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valido.setText("Valido para:");
        jPanel1.add(valido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, 100, 20));

        fechadecreacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadecreacion.setText("Fecha de Creación:");
        jPanel1.add(fechadecreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 208, 150, 20));

        utilizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        utilizado.setText("Utilizado por:");
        jPanel1.add(utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 108, 110, 20));

        fechadeuso1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadeuso1.setText("Fecha de Caducidad:");
        jPanel1.add(fechadeuso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 208, 180, 20));

        fechadeuso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadeuso.setText("Fecha de uso:");
        jPanel1.add(fechadeuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 158, 110, 20));

        btnMinimisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizar.png"))); // NOI18N
        btnMinimisar.setBorder(null);
        btnMinimisar.setBorderPainted(false);
        btnMinimisar.setContentAreaFilled(false);
        btnMinimisar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizarsegundo.png"))); // NOI18N
        btnMinimisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 20, 40, 40));

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_eliminar.png"))); // NOI18N
        btn.setAutoscrolls(true);
        btn.setBorder(null);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        btn.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_eliminarsegundo.png"))); // NOI18N
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });
        jPanel1.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 200, -1, 30));

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_modificar.png"))); // NOI18N
        btnmodificar.setAutoscrolls(true);
        btnmodificar.setBorder(null);
        btnmodificar.setBorderPainted(false);
        btnmodificar.setContentAreaFilled(false);
        btnmodificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_modificarsegundo.png"))); // NOI18N
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 155, -1, 30));

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_agregar.png"))); // NOI18N
        btnagregar.setAutoscrolls(true);
        btnagregar.setBorder(null);
        btnagregar.setBorderPainted(false);
        btnagregar.setContentAreaFilled(false);
        btnagregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_agregarsegundo.png"))); // NOI18N
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1208, 103, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 230, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 230, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 230, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, 230, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Cerrar.png"))); // NOI18N
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
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 20, 40, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG_grande.png"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1260, 450));

        tf_id.setBorder(null);
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 260, 30));

        tf_titulo.setBorder(null);
        jPanel1.add(tf_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, 30));

        tf_stock.setBorder(null);
        jPanel1.add(tf_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, 30));

        tf_valido.setBorder(null);
        jPanel1.add(tf_valido, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 260, 30));

        tf_descuento.setBorder(null);
        jPanel1.add(tf_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 250, 30));

        tf_utilizado.setBorder(null);
        tf_utilizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_utilizadoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 100, 200, 30));

        tf_fecha_de_uso.setBorder(null);
        jPanel1.add(tf_fecha_de_uso, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 150, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 108, 30, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        //INGRESANDO EL BOTON DE CERRAR SESION
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void tf_utilizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_utilizadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_utilizadoActionPerformed

    private void btnMinimisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimisarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimisarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Menu_Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void dd_CreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_CreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dd_CreacionActionPerformed

    private void mm_CreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_CreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mm_CreacionActionPerformed

    private void yy_CreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yy_CreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yy_CreacionActionPerformed

    private void dd_CaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_CaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dd_CaducidadActionPerformed

    private void mm_CaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mm_CaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mm_CaducidadActionPerformed

    private void yy_CaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yy_CaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yy_CaducidadActionPerformed

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
            java.util.logging.Logger.getLogger(Cupones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cupones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cupones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cupones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cupones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RLSexo2;
    private javax.swing.JLabel RLSexo3;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel cupones;
    private javax.swing.JTextField dd_Caducidad;
    private javax.swing.JTextField dd_Creacion;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel fechadecreacion;
    private javax.swing.JLabel fechadeuso;
    private javax.swing.JLabel fechadeuso1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mm_Caducidad;
    private javax.swing.JTextField mm_Creacion;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField tf_descuento;
    private javax.swing.JTextField tf_fecha_de_uso;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_stock;
    private javax.swing.JTextField tf_titulo;
    private javax.swing.JTextField tf_utilizado;
    private javax.swing.JTextField tf_valido;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel utilizado;
    private javax.swing.JLabel valido;
    private javax.swing.JTextField yy_Caducidad;
    private javax.swing.JTextField yy_Creacion;
    // End of variables declaration//GEN-END:variables
}
