package Formularios;

import Clases.Vendedor;
import java.awt.Frame;

import java.awt.LayoutManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ListadoVendedores extends javax.swing.JFrame {

    @Override
    public void setLayout(LayoutManager lm) {
        super.setLayout(lm); //To change body of generated methods, choose Tools | Templates.
    }

    public ListadoVendedores() {        
        initComponents();    
        this.pack();
        this.setLocationRelativeTo(null);
        btnGuardar.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtDni.setEnabled(false);
        txtSalario.setEnabled(false);
        btnGenerar.setEnabled(false);
        txtContraseña.setEnabled(false);
        JLnombre.setEnabled(false);
        JLapellido.setEnabled(false);
        JLdni.setEnabled(false);
        JLsalario.setEnabled(false);
        JLcodigo.setEnabled(false);
        JLcontraseña.setEnabled(false);

        //abre el archivo
        File archivo;
        FileReader fr = null;
        BufferedReader br = null;
        for (int i = 0; i < _vendedor.size(); i++) {
            _vendedor.remove(i);
        }
        try {
            archivo = new File("Vendedores.txt");
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] strings = linea.split(",");

                _vendedor.add(new Vendedor(strings[0], strings[1], Integer.parseInt(strings[2]), Double.parseDouble(strings[3]), strings[4], strings[5], strings[6]));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MostrarFrame = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablaVendedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRetornar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Modificar_Listado = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaModificar = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnRetorn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Nuevos_Datos = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldContra = new javax.swing.JTextField();
        jTextFieldSalario = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRetornar2 = new javax.swing.JButton();
        JLcodigo = new javax.swing.JLabel();
        JLnombre = new javax.swing.JLabel();
        JLapellido = new javax.swing.JLabel();
        JLdni = new javax.swing.JLabel();
        JLsalario = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnGenerar = new javax.swing.JButton();
        JLcontraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        tbtnNuevo = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuMenu = new javax.swing.JMenu();
        Editar = new javax.swing.JMenuItem();

        MostrarFrame.setTitle("Listado");
        MostrarFrame.setMinimumSize(new java.awt.Dimension(657, 352));
        MostrarFrame.setResizable(false);
        MostrarFrame.setType(java.awt.Window.Type.UTILITY);
        MostrarFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                MostrarFrameWindowClosing(evt);
            }
        });
        MostrarFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTablaVendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null,null},
                {null, null, null, null,null,null,null},
                {null, null, null, null,null,null,null},
                {null, null, null, null,null,null,null}
            },
            new String [] {
                "CÓDIGO", "NOMBRES", "APELLIDOS", "DNI","CONTRASEÑA","SALARIO"
            }
        ));
        jScrollPane1.setViewportView(JTablaVendedor);

        MostrarFrame.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 60, 619, 226));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Vendedores:");
        MostrarFrame.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 25, -1, -1));

        btnRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar1.setText("RETORNAR");
        btnRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar1ActionPerformed(evt);
            }
        });
        MostrarFrame.getContentPane().add(btnRetornar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 304, 132, 37));

        jPanel3.setMinimumSize(new java.awt.Dimension(657, 352));
        jPanel3.setPreferredSize(new java.awt.Dimension(657, 352));

        jLabel7.setText("jLabel7");
        jLabel7.setMinimumSize(new java.awt.Dimension(657, 352));
        jLabel7.setPreferredSize(new java.awt.Dimension(657, 352));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        MostrarFrame.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Modificar_Listado.setTitle("Modificacion");
        Modificar_Listado.setMinimumSize(new java.awt.Dimension(750, 300));
        Modificar_Listado.setResizable(false);
        Modificar_Listado.setType(java.awt.Window.Type.UTILITY);
        Modificar_Listado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaModificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null},
                {null, null, null, null,null,null,null,null}
            },
            new String [] {
                "CÓDIGO", "NOMBRES", "APELLIDOS", "DNI","CONTRASEÑA","SALARIO","FECHA DE CONTRATO"
            }
        ));
        jScrollPane2.setViewportView(TablaModificar);

        Modificar_Listado.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 740, 193));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ELIMINAR.JPG"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        Modificar_Listado.getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 257, 140, 44));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MODIFICAR.JPG"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        Modificar_Listado.getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 257, 138, 44));

        btnRetorn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetorn.setText("RETORNAR");
        btnRetorn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornActionPerformed(evt);
            }
        });
        Modificar_Listado.getContentPane().add(btnRetorn, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 257, 139, 44));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PANEL DE MODIFICACION:");
        Modificar_Listado.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel4.setPreferredSize(new java.awt.Dimension(760, 316));

        jLabel9.setText("jLabel9");
        jLabel9.setPreferredSize(new java.awt.Dimension(760, 316));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Modificar_Listado.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Nuevos_Datos.setTitle("Modificar");
        Nuevos_Datos.setMinimumSize(new java.awt.Dimension(350, 200));
        Nuevos_Datos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nueva Contraseña: ");
        Nuevos_Datos.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 41, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nuevo Salario:");
        Nuevos_Datos.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 72, -1, -1));

        jTextFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraActionPerformed(evt);
            }
        });
        Nuevos_Datos.getContentPane().add(jTextFieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 38, 138, -1));
        Nuevos_Datos.getContentPane().add(jTextFieldSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 69, 138, -1));

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        Nuevos_Datos.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 107, 149, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Datos:");
        Nuevos_Datos.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(365, 159));

        jLabel10.setText("jLabel10");
        jLabel10.setPreferredSize(new java.awt.Dimension(365, 159));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Nuevos_Datos.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de vendedores");
        setMinimumSize(new java.awt.Dimension(300, 300));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 136, 619, 10));

        btnRetornar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetornar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar2.setText("RETORNAR");
        btnRetornar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetornar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 63, 137, 43));

        JLcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLcodigo.setText("CODIGO:");
        jPanel2.add(JLcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 236, 100, 30));

        JLnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLnombre.setText("NOMBRES:");
        jPanel2.add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 147, 120, 30));

        JLapellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLapellido.setText("APELLIDOS:");
        jPanel2.add(JLapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 186, 130, 30));

        JLdni.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLdni.setText("DNI:");
        jPanel2.add(JLdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 221, 60, 30));

        JLsalario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLsalario.setText("SALARIO:");
        jPanel2.add(JLsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 259, 110, 30));
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 241, 140, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 152, 178, -1));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 188, 178, -1));

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 226, 123, -1));
        jPanel2.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 264, 123, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDAR.JPG"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 345, 140, 43));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setText("MODIFICAR UN REGISTRO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 23, -1, -1));

        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 178, 140, 40));

        JLcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLcontraseña.setText("CONTRASEÑA:");
        jPanel2.add(JLcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, 30));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 289, 140, 20));

        btnVer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCAR.JPG"))); // NOI18N
        btnVer.setText("VENDEDORES");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        jPanel2.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 63, 140, 43));

        tbtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tbtnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SELECCIONAR.JPG"))); // NOI18N
        tbtnNuevo.setText("NUEVO");
        tbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(tbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, 110, 43));

        jPanel1.setPreferredSize(new java.awt.Dimension(654, 424));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Administrador Listado Vendedores.jpg"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(654, 424));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Editar.setText("Editar Usuario");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        MenuMenu.add(Editar);

        jMenuBar1.add(MenuMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!(txtCodigo.getText().isEmpty() || txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtDni.getText().isEmpty() || txtSalario.getText().isEmpty() || txtContraseña.getText().isEmpty())) {
            String Nombre = txtNombres.getText();
            String Apellido = txtApellidos.getText();
            String Dni = txtDni.getText();
            String Salario = txtSalario.getText();
            int dni = Integer.parseInt(Dni);
            String Codigo = txtCodigo.getText();
            String pass = txtContraseña.getText();
            try {
                double salario = Double.parseDouble(Salario);
                if (salario > 0) {
                    Date day = new Date();

                    DateFormat date = DateFormat.getDateInstance();
                    String fecha = date.format(day);
                    Vendedor v = new Vendedor(Nombre, Apellido, dni, salario, Codigo, pass, fecha);
                    _vendedor.add(v);
                    
                    File f = new File("Vendedores.txt");
                    if (f.exists()) {
                        f.delete();

                        try {
                            f.createNewFile();

                        } catch (IOException ex) {
                            Logger.getLogger(ListadoVendedores.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }

                    try {
                        try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "utf-8"))) {

                            for (Vendedor c : _vendedor) {
                                Fescribe.append(c.toString());
                                Fescribe.append("\r\n");
                            }
                            JOptionPane.showMessageDialog(this, "Guardado con Exito");
                        }
                    } catch (Exception ex) {
                        //Captura un posible error le imprime en pantalla   
                        JOptionPane.showMessageDialog(rootPane, "Error al Guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    txtCodigo.setText(null);
                    txtApellidos.setText(null);
                    txtNombres.setText(null);
                    txtContraseña.setText(null);
                    txtDni.setText(null);
                    txtSalario.setText(null);
                    btnVer.setEnabled(true);
                    btnGuardar.setEnabled(false);
                    txtCodigo.setEnabled(false);
                    txtNombres.setEnabled(false);
                    txtApellidos.setEnabled(false);
                    txtDni.setEnabled(false);
                    txtSalario.setEnabled(false);
                    btnGenerar.setEnabled(false);
                    txtContraseña.setEnabled(false);
                    JLnombre.setEnabled(false);
                    JLapellido.setEnabled(false);
                    JLdni.setEnabled(false);
                    JLsalario.setEnabled(false);
                    JLcodigo.setEnabled(false);
                    JLcontraseña.setEnabled(false);
                    btnRetornar2.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al ingresar el Salario", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERROR en el codigo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falta llenar campos", "ERROR ", JOptionPane.ERROR_MESSAGE);
        }
        
        


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

        String nom = txtNombres.getText();
        String ape = txtApellidos.getText();
        String dni = txtDni.getText();
        String nuevocod = "";
        String contra;
        double xxx = 0;
        int n;
        if (!(txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtDni.getText().isEmpty())) {
            
            txtCodigo.setEnabled(true);
            txtContraseña.setEnabled(true);
            JLcodigo.setEnabled(true);
            JLcontraseña.setEnabled(true);

            nuevocod = nuevocod + nom.charAt(0) + nom.charAt(1) + ape.charAt(0) + ape.charAt(1) + ape.charAt(2) + dni.charAt(0) + dni.charAt(1) + dni.charAt(2);
            txtCodigo.setText(nuevocod);
            for (int i = 0; i <= 5; i++) {
                xxx = xxx + (Math.floor(Math.random() * 9 + 1)) * (Math.pow(10, i));
                n = (int) xxx;
                contra = String.valueOf(n);
                txtContraseña.setText(contra);
                btnGuardar.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Falta llenar campos del nombre ,apellido y contraseña", "ERROR ", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CÓDIGO", "NOMBRES", "APELLIDOS", "DNI", "CONTRASEÑA", "SALARIO", "FECHA CONT"};
        tabla.setColumnIdentifiers(titulos);
        this.JTablaVendedor.setModel(tabla);
        for (int i = 0; i < _vendedor.size(); i++) {
            Vendedor b = _vendedor.get(i);
            String[] strings = {b.getUsuario(), b.getNombre(), b.getApellido(), String.valueOf(b.getDni()), b.getClave(), String.valueOf(b.getSalario()), String.valueOf(b.getFecha_contrato())};

            tabla.addRow(strings);

            MostrarFrame.setVisible(true);
            MostrarFrame.pack();
            MostrarFrame.setLocationRelativeTo(null);
            JTablaVendedor.setVisible(true);

        }
    }//GEN-LAST:event_btnVerActionPerformed

    private void btnRetornar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar2ActionPerformed
        PrincipalAdministrador ert = new PrincipalAdministrador();
        ert.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetornar2ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        Modificar_Listado.setVisible(true);
        Modificar_Listado.pack();        
        Modificar_Listado.setLocationRelativeTo(null);

        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CÓDIGO", "NOMBRES", "APELLIDOS", "DNI", "CONTRASEÑA", "SALARIO", "FECHA CONT"};
        tabla.setColumnIdentifiers(titulos);
        this.TablaModificar.setModel(tabla);
        for (int i = 0; i < _vendedor.size(); i++) {
            Vendedor b = _vendedor.get(i);
            String[] strings = {b.getUsuario(), b.getNombre(), b.getApellido(), String.valueOf(b.getDni()), b.getClave(), String.valueOf(b.getSalario()), String.valueOf(b.getFecha_contrato())};

            tabla.addRow(strings);
        }
        this.setVisible(false);
    }//GEN-LAST:event_EditarActionPerformed

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar1ActionPerformed
       // ListadoVendedores a = new ListadoVendedores();
       // a.pack();
        //a.setVisible(true);
       // this.dispose();
        MostrarFrame.setVisible(false);
    }//GEN-LAST:event_btnRetornar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (TablaModificar.getSelectedRow() != -1) {
            try {
                DefaultTableModel tablita = (DefaultTableModel) TablaModificar.getModel();
                System.out.println(TablaModificar.getSelectedRow());
                _vendedor.remove(TablaModificar.getSelectedRow());
                JOptionPane.showMessageDialog(rootPane, "Eliminado", "El registro a ha sido eliminado", JOptionPane.INFORMATION_MESSAGE);
                tablita.removeRow(TablaModificar.getSelectedRow());
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTextFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraActionPerformed
    }//GEN-LAST:event_jTextFieldContraActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        Nuevos_Datos.dispose();
        String nuevaxxx = jTextFieldContra.getText();
        String nuevosal = jTextFieldSalario.getText();
        double sal = Double.parseDouble(nuevosal);
        int indice = TablaModificar.getSelectedRow();
        try {
            DefaultTableModel tablita = (DefaultTableModel) TablaModificar.getModel();
            System.out.println(TablaModificar.getSelectedRow());
            _vendedor.get(indice).setClave(nuevaxxx);
            _vendedor.get(indice).setSalario(sal);
            TablaModificar.setValueAt(sal, indice, 5);
            TablaModificar.setValueAt(nuevaxxx, indice, 4);

        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        Nuevos_Datos.setLocationRelativeTo(null);
        if (TablaModificar.getSelectedRow() != -1) {
            Nuevos_Datos.setVisible(true);
            Nuevos_Datos.pack();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRetornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornActionPerformed
        File f = new File("Vendedores.txt");

        if (f.exists()) {
            f.delete();

            try {
                f.createNewFile();

            } catch (IOException ex) {
                Logger.getLogger(ListadoVendedores.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "utf-8"))) {

                for (Vendedor c : _vendedor) {
                    Fescribe.append(c.toString());
                    Fescribe.append("\r\n");
                }

            }
        } catch (Exception ex) {
        }

        ListadoVendedores b = new ListadoVendedores();
        b.setVisible(true);
        Modificar_Listado.setVisible(false);
        this.setVisible(false);

    }//GEN-LAST:event_btnRetornActionPerformed

    private void tbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnNuevoActionPerformed
        if(tbtnNuevo.isSelected()){
            btnVer.setEnabled(false);
            btnRetornar2.setEnabled(false);
            txtNombres.setEnabled(true);
            txtApellidos.setEnabled(true);
            txtDni.setEnabled(true);
            txtSalario.setEnabled(true);
            btnGenerar.setEnabled(true);
            JLnombre.setEnabled(true);
            JLapellido.setEnabled(true);
            JLdni.setEnabled(true);
            JLsalario.setEnabled(true);            
        }
        else{
            txtCodigo.setText(null);
            txtApellidos.setText(null);
            txtNombres.setText(null);
            txtContraseña.setText(null);
            txtDni.setText(null);
            txtSalario.setText(null);
            btnVer.setEnabled(true);
            btnGuardar.setEnabled(false);
            txtCodigo.setEnabled(false);
            txtNombres.setEnabled(false);
            txtApellidos.setEnabled(false);
            txtDni.setEnabled(false);
            txtSalario.setEnabled(false);
            btnGenerar.setEnabled(false);
            txtContraseña.setEnabled(false);
            JLnombre.setEnabled(false);
            JLapellido.setEnabled(false);
            JLdni.setEnabled(false);
            JLsalario.setEnabled(false);
            JLcodigo.setEnabled(false);
            JLcontraseña.setEnabled(false);
            btnRetornar2.setEnabled(true);
            
        }
    }//GEN-LAST:event_tbtnNuevoActionPerformed

    private void MostrarFrameWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_MostrarFrameWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_MostrarFrameWindowClosing

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
            java.util.logging.Logger.getLogger(ListadoVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoVendedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoVendedores().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Editar;
    private javax.swing.JLabel JLapellido;
    private javax.swing.JLabel JLcodigo;
    private javax.swing.JLabel JLcontraseña;
    private javax.swing.JLabel JLdni;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLsalario;
    private javax.swing.JTable JTablaVendedor;
    private javax.swing.JMenu MenuMenu;
    private javax.swing.JFrame Modificar_Listado;
    private javax.swing.JFrame MostrarFrame;
    private javax.swing.JFrame Nuevos_Datos;
    private javax.swing.JTable TablaModificar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRetorn;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JButton btnRetornar2;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldContra;
    private javax.swing.JTextField jTextFieldSalario;
    private javax.swing.JToggleButton tbtnNuevo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Vendedor> _vendedor = new ArrayList<>();
}
