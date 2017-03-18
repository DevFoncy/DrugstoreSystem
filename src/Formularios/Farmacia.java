
package Formularios;


import Clases.Producto;
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
public class Farmacia extends javax.swing.JFrame {
    
    @Override
    public void setLayout(LayoutManager lm) {
        super.setLayout(lm); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    
    int op;
    
    public Farmacia(){
        initComponents();
        this.pack();        
        this.setLocationRelativeTo(null);
        Jcodig.setEnabled(false);
        Jcant.setEnabled(false);
        Jpre.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCod.setEnabled(false);
        
        //archivo libros
        File archivo ;
        FileReader fr = null;
        BufferedReader br = null;
        for(int i=0;i<_productos.size();i++){
            _productos.remove(i);
        }
        try {
           archivo = new File ("Productos.txt");
           if(!archivo.exists()){  
              archivo.createNewFile();              
           }  
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           // Lectura del fichero
           String linea;
           while((linea=br.readLine())!=null){
              String[] strings = linea.split(",");   
                
             _productos.add(new Producto(strings[0], Integer.parseInt(strings[3]), strings[1], Double.parseDouble(strings[4]), strings [2] ));
                            
           }
           
           }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
           
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Buscarproducto = new javax.swing.JFrame();
        JRubro = new javax.swing.JLabel();
        JProducto = new javax.swing.JLabel();
        txtBusRubro = new javax.swing.JTextField();
        txtBusProducto = new javax.swing.JTextField();
        btnAcept = new javax.swing.JButton();
        boxBus = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        Jcodig = new javax.swing.JLabel();
        Jproducto = new javax.swing.JLabel();
        Jrubro = new javax.swing.JLabel();
        Jcant = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtRubro = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnRetornar = new javax.swing.JButton();
        Jpre = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnVerif = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRetornar1 = new javax.swing.JButton();
        btnConsu = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProducto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnEli = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        Buscarproducto.setTitle("Busqueda");
        Buscarproducto.setMinimumSize(new java.awt.Dimension(340, 220));
        Buscarproducto.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JRubro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JRubro.setForeground(new java.awt.Color(255, 255, 255));
        JRubro.setText("PRODUCTO:");
        Buscarproducto.getContentPane().add(JRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 30, -1, -1));

        JProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JProducto.setForeground(new java.awt.Color(255, 255, 255));
        JProducto.setText("RUBRO:");
        Buscarproducto.getContentPane().add(JProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 68, -1, -1));
        Buscarproducto.getContentPane().add(txtBusRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 30, 164, -1));

        txtBusProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusProductoActionPerformed(evt);
            }
        });
        Buscarproducto.getContentPane().add(txtBusProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 68, 164, -1));

        btnAcept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnAcept.setText("Aceptar");
        btnAcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptActionPerformed(evt);
            }
        });
        Buscarproducto.getContentPane().add(btnAcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 119, 120, 36));

        boxBus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rubro", "Producto", "Rubro y Producto"}));
        boxBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBusActionPerformed(evt);
            }
        });
        Buscarproducto.getContentPane().add(boxBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 119, 110, 36));

        jPanel6.setPreferredSize(new java.awt.Dimension(340, 190));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/wallpaper-download-free-0-quan-31584.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(340, 190));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Buscarproducto.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Generales - Farmacia");
        setMinimumSize(new java.awt.Dimension(860, 390));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(890, 390));

        jLabel4.setPreferredSize(new java.awt.Dimension(890, 390));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jcodig.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jcodig.setText("CODIGO");
        jPanel2.add(Jcodig, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 138, 60, -1));

        Jproducto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jproducto.setText("PRODUCTO");
        jPanel2.add(Jproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 62, -1, -1));

        Jrubro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jrubro.setText("RUBRO");
        jPanel2.add(Jrubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 100, -1, -1));

        Jcant.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jcant.setText("CANTIDAD");
        jPanel2.add(Jcant, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 185, 80, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("INGRESAR PRODUCTO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 26, -1, -1));
        jPanel2.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 137, 98, -1));

        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 61, 131, -1));
        jPanel2.add(txtRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 99, 131, -1));
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 184, 59, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INSERTAR.JPG"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 262, -1, 50));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_escoba.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 262, -1, 50));

        btnRetornar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar.setText("RETORNAR");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 261, 123, 50));

        Jpre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Jpre.setText("PRECIO");
        jPanel2.add(Jpre, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 186, -1, -1));
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 184, 87, -1));

        btnVerif.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVerif.setText("VERIFICAR");
        btnVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifActionPerformed(evt);
            }
        });
        jPanel2.add(btnVerif, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 61, 124, 44));

        jPanel3.setPreferredSize(new java.awt.Dimension(869, 362));
        jPanel3.setRequestFocusEnabled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal Administrador Farmacia.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(869, 362));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("TRANSACCIONES", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRetornar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar1.setText("RETORNAR");
        btnRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetornar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 156, 150, 40));

        btnConsu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCAR.JPG"))); // NOI18N
        btnConsu.setText("BUSCAR");
        btnConsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 209, 150, 40));

        btnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 99, 150, 40));

        TablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "PRODUCTO", "RUBRO", "STOCK", "P/U"
            }
        ));
        jScrollPane1.setViewportView(TablaProducto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 117, 641, 182));

        jPanel4.setPreferredSize(new java.awt.Dimension(869, 362));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal Administrador Farmacia.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setPreferredSize(new java.awt.Dimension(869, 362));

        btnEli.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ELIMINAR.JPG"))); // NOI18N
        btnEli.setText("ELIMINAR");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("TOTAL GENERAL DE PRODUCTOS:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(684, Short.MAX_VALUE)
                .addComponent(btnEli, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btnEli)
                .addGap(63, 63, 63))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("INVENTARIO", jPanel1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar1ActionPerformed
        PrincipalAdministrador a = new PrincipalAdministrador();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetornar1ActionPerformed

    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        PrincipalAdministrador a = new PrincipalAdministrador();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!(txtCod.getText().isEmpty() || txtRubro.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtProducto.getText().isEmpty() )){
                String Producto   = txtProducto.getText();
                String Rubro    = txtRubro.getText();
                String Codigo   = txtCod.getText();                
                String Cantidad = txtCantidad.getText();
                String Precio   =txtPrecio.getText();
                int c;
                boolean p=false;
              try{
                double precio= Double.parseDouble(Precio);
                int cant=Integer.parseInt(Cantidad);
                if(precio>0 && cant>0){
                    for(int i=0;i<_productos.size();i++){
                      if(txtProducto.getText().equals(_productos.get(i).getProducto()) && txtRubro.getText().equals(_productos.get(i).getRubro())&& txtPrecio.getText().equals(String.valueOf(_productos.get(i).getPrecio())) && txtCod.getText().equals(String.valueOf(_productos.get(i).getCodigo()))){
                         c=i;
                         _productos.get(c).setStock(_productos.get(i).getStock()+cant);
                         
                         p=true;
                      }
                    }
                    if(!p){
                        Producto v=new Producto(Codigo, cant, Producto, precio, Rubro);
                          _productos.add(v);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar el Precio", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                
            }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "ERROR en el cantidad","ERROR",JOptionPane.ERROR_MESSAGE);
                }  
            
           File f = new File("Productos.txt");
        
            if(f.exists()){
                f.delete();

                try {
                    f.createNewFile();

                } catch (IOException ex) {
                    Logger.getLogger(Farmacia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {  
                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f,true), "utf-8"))) {

                    for(Producto l : _productos){
                        Fescribe.append(l.toString());
                        Fescribe.append("\r\n");
                    }               
                    JOptionPane.showMessageDialog(this, "Guardado con Exito");
                }
            } catch (Exception ex) {  
               //Captura un posible error le imprime en pantalla   
                JOptionPane.showMessageDialog(rootPane, "Error al Guardar","ERROR",JOptionPane.ERROR_MESSAGE);            
            }  
              
        }else{
            JOptionPane.showMessageDialog(rootPane, "Falta llenar campos", "ERROR ", JOptionPane.ERROR_MESSAGE);
        }   
     
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
                DefaultTableModel tabla = new DefaultTableModel();
                String[] titulos = {"CODIGO", "PRODUCTO", "RUBRO", "STOCK", "P/U"};
                tabla.setColumnIdentifiers(titulos);    
                this.TablaProducto.setModel(tabla);
                for(int i=0;i<_productos.size();i++){
                Producto b=_productos.get(i);
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
                }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsuActionPerformed
            Buscarproducto.setLocationRelativeTo(null);
            Buscarproducto.setVisible(true);
            JProducto.setEnabled(false);
            JRubro.setEnabled(false);
            txtBusRubro.setEnabled(false);
            txtBusProducto.setEnabled(false);
            btnAcept.setEnabled(false);
    }//GEN-LAST:event_btnConsuActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRubro.setText(null);
        txtCantidad.setText(null);
        txtCod.setText(null);
        txtPrecio.setText(null);
        txtProducto.setText(null);
        Jcodig.setEnabled(false);
        Jcant.setEnabled(false);
        Jpre.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtCod.setEnabled(false);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifActionPerformed
        boolean m=false;
        if(!(txtProducto.getText().isEmpty()||txtRubro.getText().isEmpty())){
           
            for(int i=0;i<_productos.size();i++){
                if(txtProducto.getText().equals(_productos.get(i).getProducto()) && txtRubro.getText().equals(_productos.get(i).getRubro())){
                    txtCod.setText(_productos.get(i).getCodigo());
                    txtPrecio.setText(String.valueOf(_productos.get(i).getPrecio()));
                    m=true;  
                    }
                }

                if(!m){
                    Jcodig.setEnabled(true);
                    Jcant.setEnabled(true);
                    Jpre.setEnabled(true);
                    txtCantidad.setEnabled(true);
                    txtPrecio.setEnabled(true);
                    txtCod.setEnabled(true);
                    JOptionPane.showMessageDialog(this,"Ingrese Datos nuevos");
                }else{
                    Jcant.setEnabled(true);
                    txtCantidad.setEnabled(true);
                    JOptionPane.showMessageDialog(this,"Producto ya registrado, Ingresar solo la cantidad");
                }
            
        }else{
            JOptionPane.showMessageDialog(rootPane,"Falta Ingresar Producto o Rubro","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVerifActionPerformed

    private void btnAceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptActionPerformed
        Buscarproducto.setVisible(false);
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CODIGO", "PRODUCTO", "RUBRO", "STOCK", "P/U"};
        tabla.setColumnIdentifiers(titulos);    
        this.TablaProducto.setModel(tabla);
        if(op==2){
          for(int i=0;i<_productos.size();i++){
            if(txtBusRubro.getText().toLowerCase().equals(_productos.get(i).getProducto().toLowerCase()) && txtBusProducto.getText().toLowerCase().equals(_productos.get(i).getRubro().toLowerCase())){
                Producto b=_productos.get(i);
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
            } 
          }
        }       
        else{
            for(int i=0;i<_productos.size();i++){
            if(txtBusRubro.getText().toLowerCase().equals(_productos.get(i).getProducto().toLowerCase()) || txtBusProducto.getText().toLowerCase().equals(_productos.get(i).getRubro().toLowerCase())){
                Producto b=_productos.get(i);
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
                }     
            }
        }
        
        txtBusProducto.setText(null);
        txtBusRubro.setText(null);
    }//GEN-LAST:event_btnAceptActionPerformed

    private void boxBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBusActionPerformed
        op=boxBus.getSelectedIndex();
        switch(op){
            case 0:
                JProducto.setEnabled(true);
                txtBusProducto.setEnabled(true);
                btnAcept.setEnabled(true);
                break;
            case 1:
                JRubro.setEnabled(true);
                txtBusRubro.setEnabled(true);
                btnAcept.setEnabled(true);
                break;
            case 2:
                JProducto.setEnabled(true);
                JRubro.setEnabled(true);
                txtBusRubro.setEnabled(true);
                txtBusProducto.setEnabled(true);
                btnAcept.setEnabled(true);
                break;
        }  
    }//GEN-LAST:event_boxBusActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        if (TablaProducto.getSelectedRow() != -1) {
            try {
                DefaultTableModel tablita = (DefaultTableModel) TablaProducto.getModel();
                System.out.println(TablaProducto.getSelectedRow());
                _productos.remove(TablaProducto.getSelectedRow());
                JOptionPane.showMessageDialog(rootPane, "Eliminado", "El registro a ha sido eliminado", JOptionPane.INFORMATION_MESSAGE);
                tablita.removeRow(TablaProducto.getSelectedRow());
            } catch (ArrayIndexOutOfBoundsException e) {
            }
        }
    }//GEN-LAST:event_btnEliActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void txtBusProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusProductoActionPerformed
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
                new Farmacia().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Buscarproducto;
    private javax.swing.JLabel JProducto;
    private javax.swing.JLabel JRubro;
    private javax.swing.JLabel Jcant;
    private javax.swing.JLabel Jcodig;
    private javax.swing.JLabel Jpre;
    private javax.swing.JLabel Jproducto;
    private javax.swing.JLabel Jrubro;
    private javax.swing.JTable TablaProducto;
    private javax.swing.JComboBox boxBus;
    private javax.swing.JButton btnAcept;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsu;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JButton btnVerif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtBusProducto;
    private javax.swing.JTextField txtBusRubro;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtRubro;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Producto> _productos =new ArrayList<>();
}