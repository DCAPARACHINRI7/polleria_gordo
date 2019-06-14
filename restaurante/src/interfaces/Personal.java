package interfaces;


import interfaces.Menu_Principal;
import clases.TextPrompt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Personal extends javax.swing.JFrame {

    /**
     * Creates new form Personal
     */
    public Personal() {
        initComponents();
        this.setLocationRelativeTo(null);
        TextPrompt IDE = new TextPrompt("010203040506070809", tf_id);//ID
        TextPrompt nombre = new TextPrompt("Jorge Luis", tf_nombres);//nombre
        TextPrompt apellido = new TextPrompt("Carrillo Gutierrez", tf_apellido);//apellido
        TextPrompt cargo = new TextPrompt("Cocinero", tf_cargo);//CATEGORIA
        TextPrompt correo = new TextPrompt("Jorge@gmail.com", tf_correoelectronico);//PRECIO
        TextPrompt numcelular = new TextPrompt("987654321", tf_numCelular);//DESCRIPCION
        TextPrompt turno = new TextPrompt("Mañana", tf_turno);//INSUMOS
        TextPrompt sueldo = new TextPrompt("   S/. 2400.00", tf_sueldo);
        TextPrompt dialibre = new TextPrompt("Lunes y Martes", tf_dialibres);
        TextPrompt ddNacimiento = new TextPrompt(" " + "  10", dd_Nacimiento);
        TextPrompt mmNacimiento = new TextPrompt(" " + "  10", mm_Nacimiento);
        TextPrompt yyNacimiento = new TextPrompt(" " + "  2019", yy_Nacimiento);
        TextPrompt ddContrato = new TextPrompt(" " + "  10", dd_contrato);
        TextPrompt mmContrato = new TextPrompt(" " + "  10", mm_contrato);
        TextPrompt yyContrato = new TextPrompt(" " + "  2019", yy_contrato);
        TextPrompt ddFinalizacion = new TextPrompt(" " + "  10", dd_finalizacion);
        TextPrompt mmFinalizacion = new TextPrompt(" " + "  10", mm_finalizacion);
        TextPrompt yyFinalizacion = new TextPrompt(" " + "  2019", yy_finalizacion);

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
        RLSexo4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dd_finalizacion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mm_finalizacion = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        yy_finalizacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        yy_contrato = new javax.swing.JTextField();
        mm_contrato = new javax.swing.JTextField();
        dd_contrato = new javax.swing.JTextField();
        RLSexo3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dd_Nacimiento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        mm_Nacimiento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        yy_Nacimiento = new javax.swing.JTextField();
        RLSexo2 = new javax.swing.JLabel();
        numero_de_celular1 = new javax.swing.JLabel();
        apellido3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_dialibres = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_sueldo = new javax.swing.JTextField();
        apellido2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_turno = new javax.swing.JTextField();
        apellido1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_cargo = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        id = new javax.swing.JLabel();
        cliente = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correo_electronico = new javax.swing.JLabel();
        fecha_de_nacimiento = new javax.swing.JLabel();
        numero_de_celular = new javax.swing.JLabel();
        utilizado = new javax.swing.JLabel();
        ulti_vista = new javax.swing.JLabel();
        btnMinimisar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tf_numCelular = new javax.swing.JTextField();
        tf_apellido = new javax.swing.JTextField();
        tf_nombres = new javax.swing.JTextField();
        tf_ultima_vista = new javax.swing.JTextField();
        tf_id = new javax.swing.JTextField();
        tf_Fecha_de_nacimiento = new javax.swing.JTextField();
        tf_correoelectronico = new javax.swing.JTextField();
        tf_Fecha_de_registro1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RLSexo4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo4.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo4.setText("Día           Mes             Año");
        jPanel1.add(RLSexo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 144, 160, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, 40, 20));

        dd_finalizacion.setBorder(null);
        dd_finalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_finalizacionActionPerformed(evt);
            }
        });
        jPanel1.add(dd_finalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, 40, 30));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 170, 40, 20));

        mm_finalizacion.setBorder(null);
        jPanel1.add(mm_finalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, 40, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 170, 50, 20));

        yy_finalizacion.setBorder(null);
        yy_finalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yy_finalizacionActionPerformed(evt);
            }
        });
        jPanel1.add(yy_finalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 160, 50, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 40, 20));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, 40, 20));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 120, 50, 20));

        yy_contrato.setBorder(null);
        yy_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yy_contratoActionPerformed(evt);
            }
        });
        jPanel1.add(yy_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 110, 50, 30));

        mm_contrato.setBorder(null);
        jPanel1.add(mm_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 110, 40, 30));

        dd_contrato.setBorder(null);
        dd_contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_contratoActionPerformed(evt);
            }
        });
        jPanel1.add(dd_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, 40, 30));

        RLSexo3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo3.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo3.setText("Día           Mes             Año");
        jPanel1.add(RLSexo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 160, 24));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 40, 20));

        dd_Nacimiento.setBorder(null);
        dd_Nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dd_NacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(dd_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 40, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 40, 20));

        mm_Nacimiento.setBorder(null);
        jPanel1.add(mm_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 40, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 50, 20));

        yy_Nacimiento.setBorder(null);
        yy_Nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yy_NacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(yy_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 50, 30));

        RLSexo2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        RLSexo2.setForeground(new java.awt.Color(204, 0, 0));
        RLSexo2.setText("Día           Mes             Año");
        jPanel1.add(RLSexo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 160, 24));

        numero_de_celular1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero_de_celular1.setText("Sueldo:");
        jPanel1.add(numero_de_celular1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 70, 20));

        apellido3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido3.setText("Días Libres:");
        jPanel1.add(apellido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 90, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, 240, 10));

        tf_dialibres.setBorder(null);
        tf_dialibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_dialibresActionPerformed(evt);
            }
        });
        jPanel1.add(tf_dialibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 240, 220, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 230, 10));

        tf_sueldo.setBorder(null);
        tf_sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sueldoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 190, 20));

        apellido2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido2.setText("Turno:");
        jPanel1.add(apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 60, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 230, 10));

        tf_turno.setBorder(null);
        tf_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_turnoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 240, 30));

        apellido1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido1.setText("Cargo:");
        jPanel1.add(apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, 10));

        tf_cargo.setBorder(null);
        tf_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cargoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 240, 30));

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

        cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/persona_titulo.png"))); // NOI18N
        jPanel1.add(cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 17, 160, 30));

        nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nombre.setText("Nombres:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 158, 80, 20));

        apellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        apellido.setText("Apellidos:");
        jPanel1.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 208, 80, 20));

        correo_electronico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        correo_electronico.setText("Correo Electrónico:");
        jPanel1.add(correo_electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 158, 150, 20));

        fecha_de_nacimiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fecha_de_nacimiento.setText("Fecha de Nacimiento:");
        jPanel1.add(fecha_de_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 108, 170, 20));

        numero_de_celular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero_de_celular.setText("Número de celular:");
        jPanel1.add(numero_de_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 208, 150, 20));

        utilizado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        utilizado.setText("Fecha de contrato:");
        jPanel1.add(utilizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 150, 30));

        ulti_vista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ulti_vista.setText("Fecha de finalizacion:");
        jPanel1.add(ulti_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 190, 20));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 230, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 230, 10));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 230, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 230, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Separador_negro.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 230, 10));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1260, 380));

        tf_numCelular.setBorder(null);
        tf_numCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_numCelularActionPerformed(evt);
            }
        });
        jPanel1.add(tf_numCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 190, 30));

        tf_apellido.setBorder(null);
        jPanel1.add(tf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 240, 30));

        tf_nombres.setBorder(null);
        jPanel1.add(tf_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 240, 30));

        tf_ultima_vista.setBorder(null);
        tf_ultima_vista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ultima_vistaActionPerformed(evt);
            }
        });
        jPanel1.add(tf_ultima_vista, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 210, 30));

        tf_id.setBorder(null);
        jPanel1.add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 270, 30));

        tf_Fecha_de_nacimiento.setBorder(null);
        tf_Fecha_de_nacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_Fecha_de_nacimientoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Fecha_de_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 190, 30));

        tf_correoelectronico.setBorder(null);
        tf_correoelectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_correoelectronicoActionPerformed(evt);
            }
        });
        jPanel1.add(tf_correoelectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 190, 30));

        tf_Fecha_de_registro1.setBorder(null);
        tf_Fecha_de_registro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_Fecha_de_registro1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf_Fecha_de_registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 210, 30));

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

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        new Menu_Principal().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnMinimisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimisarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimisarActionPerformed

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
        //INGRESANDO EL BOTON DE CERRAR SESION
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void tf_numCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_numCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_numCelularActionPerformed

    private void tf_ultima_vistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ultima_vistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ultima_vistaActionPerformed

    private void tf_Fecha_de_nacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_Fecha_de_nacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Fecha_de_nacimientoActionPerformed

    private void tf_correoelectronicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_correoelectronicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_correoelectronicoActionPerformed

    private void tf_Fecha_de_registro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_Fecha_de_registro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_Fecha_de_registro1ActionPerformed

    private void tf_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cargoActionPerformed

    private void tf_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_turnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_turnoActionPerformed

    private void tf_sueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sueldoActionPerformed

    private void tf_dialibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_dialibresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_dialibresActionPerformed

    private void dd_NacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_NacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dd_NacimientoActionPerformed

    private void yy_NacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yy_NacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yy_NacimientoActionPerformed

    private void yy_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yy_contratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yy_contratoActionPerformed

    private void dd_contratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_contratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dd_contratoActionPerformed

    private void dd_finalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dd_finalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dd_finalizacionActionPerformed

    private void yy_finalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yy_finalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yy_finalizacionActionPerformed

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
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RLSexo2;
    private javax.swing.JLabel RLSexo3;
    private javax.swing.JLabel RLSexo4;
    private javax.swing.JLabel apellido;
    private javax.swing.JLabel apellido1;
    private javax.swing.JLabel apellido2;
    private javax.swing.JLabel apellido3;
    private javax.swing.JButton btn;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMinimisar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel cliente;
    private javax.swing.JLabel correo_electronico;
    private javax.swing.JTextField dd_Nacimiento;
    private javax.swing.JTextField dd_contrato;
    private javax.swing.JTextField dd_finalizacion;
    private javax.swing.JLabel fecha_de_nacimiento;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mm_Nacimiento;
    private javax.swing.JTextField mm_contrato;
    private javax.swing.JTextField mm_finalizacion;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numero_de_celular;
    private javax.swing.JLabel numero_de_celular1;
    private javax.swing.JTextField tf_Fecha_de_nacimiento;
    private javax.swing.JTextField tf_Fecha_de_registro1;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_cargo;
    private javax.swing.JTextField tf_correoelectronico;
    private javax.swing.JTextField tf_dialibres;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombres;
    private javax.swing.JTextField tf_numCelular;
    private javax.swing.JTextField tf_sueldo;
    private javax.swing.JTextField tf_turno;
    private javax.swing.JTextField tf_ultima_vista;
    private javax.swing.JLabel ulti_vista;
    private javax.swing.JLabel utilizado;
    private javax.swing.JTextField yy_Nacimiento;
    private javax.swing.JTextField yy_contrato;
    private javax.swing.JTextField yy_finalizacion;
    // End of variables declaration//GEN-END:variables
}
