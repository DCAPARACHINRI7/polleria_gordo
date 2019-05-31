
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Almacen extends javax.swing.JFrame {

    /**
     * Creates new form Almacen
     */
    public Almacen() {
        initComponents();
        //tf_id.setBackground(new Color(255,255,255));
        TextPrompt id = new TextPrompt("010203040506070809", tf_id);//ID
        //tf_Producto.setBackground(new Color(255,255,255));
        TextPrompt producto = new TextPrompt("Fideos", tf_Producto);//PRODUCTO
        TextPrompt categoria = new TextPrompt("Pastas", tf_Categoria);//CATEGORIA
        TextPrompt proveedor = new TextPrompt("Molitalia", tf_Proveedor);//PROVEEDOR
        TextPrompt celular = new TextPrompt("986543210", tf_Celular);//CELULAR
        TextPrompt correo = new TextPrompt("Molitalia@gmail.com", tf_CorreoElectronico);//CORREO ELECTRONICO
        TextPrompt precio = new TextPrompt("S/.1204", tf_Precio);//PRECIO
        TextPrompt calidad = new TextPrompt("1250", tf_Cantidad);//CANTIDAD
        TextPrompt medida = new TextPrompt("5 Kg.", tf_Unidad_de_medida);//UNIDAD DE MEDIDA
        this.setLocationRelativeTo(null);//CENTRANDO EL JFRAME
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
        btnRegresar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        cupones = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        stock = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        valido = new javax.swing.JLabel();
        fechadecreacion = new javax.swing.JLabel();
        utilizado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fechadeuso1 = new javax.swing.JLabel();
        fechadeuso = new javax.swing.JLabel();
        btnMinimisar = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tf_Unidad_de_medida = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_Cantidad = new javax.swing.JTextField();
        tf_Precio = new javax.swing.JTextField();
        tf_CorreoElectronico = new javax.swing.JTextField();
        tf_Celular = new javax.swing.JTextField();
        tf_Proveedor = new javax.swing.JTextField();
        tf_Producto = new javax.swing.JTextField();
        tf_Categoria = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Back.png"))); // NOI18N
        btnRegresar.setBorder(null);
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn_Backsegundo.png"))); // NOI18N
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 20, 40, 40));

        id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 108, 30, 20));

        cupones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/almacen.png"))); // NOI18N
        jPanel1.add(cupones, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 17, -1, 30));

        titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titulo.setText("Producto:");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 158, 80, 20));

        stock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        stock.setText("Categoria:");
        jPanel1.add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 90, 30));

        descuento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        descuento.setText("Celular:");
        jPanel1.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 158, 60, 20));

        valido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        valido.setText("Proveedor:");
        jPanel1.add(valido, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, 90, 20));

        fechadecreacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadecreacion.setText("Correo Electrónico:");
        jPanel1.add(fechadecreacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 208, 150, 20));

        utilizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        utilizado.setText("Precio:");
        jPanel1.add(utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 108, 60, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, 230, 10));

        fechadeuso1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadeuso1.setText("Unidad de Medida:");
        jPanel1.add(fechadeuso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 208, 160, 20));

        fechadeuso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fechadeuso.setText("Cantidad:");
        jPanel1.add(fechadeuso, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 158, 80, 20));

        btnMinimisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizar.png"))); // NOI18N
        btnMinimisar.setBorder(null);
        btnMinimisar.setBorderPainted(false);
        btnMinimisar.setContentAreaFilled(false);
        btnMinimisar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Btn_Minimizarsegundo.png"))); // NOI18N
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1260, 450));

        tf_Unidad_de_medida.setBorder(null);
        tf_Unidad_de_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_Unidad_de_medidaActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Unidad_de_medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 230, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 230, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 230, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 10));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 10));

        tf_Cantidad.setBorder(null);
        tf_Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CantidadActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, 210, 30));

        tf_Precio.setBorder(null);
        tf_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PrecioActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 210, 30));

        tf_CorreoElectronico.setBorder(null);
        tf_CorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CorreoElectronicoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_CorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 210, 30));

        tf_Celular.setBorder(null);
        tf_Celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CelularActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 210, 30));

        tf_Proveedor.setBorder(null);
        tf_Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 210, 30));

        tf_Producto.setBorder(null);
        tf_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ProductoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 210, 30));

        tf_Categoria.setBorder(null);
        tf_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 202, 210, 30));

        tf_id.setBorder(null);
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed

    private void tf_ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ProveedorActionPerformed

    private void tf_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_PrecioActionPerformed

    private void tf_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ProductoActionPerformed

    private void tf_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CategoriaActionPerformed

    private void tf_CelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CelularActionPerformed

    private void tf_CorreoElectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CorreoElectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CorreoElectronicoActionPerformed

    private void tf_Unidad_de_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_Unidad_de_medidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Unidad_de_medidaActionPerformed

    private void tf_CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CantidadActionPerformed

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
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel cupones;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel fechadecreacion;
    private javax.swing.JLabel fechadeuso;
    private javax.swing.JLabel fechadeuso1;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel stock;
    private javax.swing.JTextField tf_Cantidad;
    private javax.swing.JTextField tf_Categoria;
    private javax.swing.JTextField tf_Celular;
    private javax.swing.JTextField tf_CorreoElectronico;
    private javax.swing.JTextField tf_Precio;
    private javax.swing.JTextField tf_Producto;
    private javax.swing.JTextField tf_Proveedor;
    private javax.swing.JTextField tf_Unidad_de_medida;
    private javax.swing.JTextField tf_id;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel utilizado;
    private javax.swing.JLabel valido;
    // End of variables declaration//GEN-END:variables
}
