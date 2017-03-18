
package Formularios;
import Clases.Producto;
import Clases.Record;
import Clases.Cliente;
import Clases.Vendedor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaVentas extends javax.swing.JFrame {
    int li_v=0;
    double sol=0;
    double dol,dolar,soles;
    double inver=0;
    int can_li=0;
    
    
    public ConsultaVentas() {
        initComponents();
        //archivo record
        File archivo;
        FileReader fr = null;
        BufferedReader br = null;
        for (int i = 0; i < _record.size(); i++) {
            _record.remove(i);
        }
        try {
            archivo = new File("Records.txt");
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] strings = linea.split(",");
                _record.add(new Record(strings[1], strings[2], Integer.parseInt(strings[3]), Double.parseDouble(strings[4]), strings[5], strings[0]));
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
        
        //archivo libros
        File arch ;
        FileReader fr1 = null;
        BufferedReader br1 = null;
        for(int i=0;i<_productos.size();i++){
            _productos.remove(i);
        }
        try {
           arch = new File ("Productos.txt");
           if(!arch.exists()){  
              arch.createNewFile();              
           }  
           fr1 = new FileReader (arch);
           br1 = new BufferedReader(fr1);

           // Lectura del fichero
           String linea;
           while((linea=br1.readLine())!=null){
              String[] string = linea.split(",");   
                
             _productos.add(new Producto(string[0], Integer.parseInt(string[3]), string[1], Double.parseDouble(string[4]), string [2] ));
                            
           }
           
           }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
           
           try{                    
              if( null != fr1 ){   
                 fr1.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
        //archivo de clientes
        File archv ;
        FileReader fr2 = null;
        BufferedReader br2 = null;
        for(int i=0;i<_cliente.size();i++){
            _cliente.remove(i);
        }
        try {
           archv = new File ("Clientes.txt");
           if(!archv.exists()){  
              archv.createNewFile();              
           }  
           fr2 = new FileReader (archv);
           br2 = new BufferedReader(fr2);

           // Lectura del fichero
           String lin;
           while((lin=br2.readLine())!=null){
              String[] stringg = lin.split(",");   
                
             _cliente.add(new Cliente(stringg[0], stringg[1],0, stringg[2], stringg [3] ));
                            
           }
           
           }
        catch(Exception e){
           JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
           
           try{                    
              if( null != fr2 ){   
                 fr2.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
        
        DefaultTableModel table = new DefaultTableModel();
        String[] tit = {"NOMBRES", "APELLIDOS", "DIRECCION", "RUC"};
        table.setColumnIdentifiers(tit);
        this.Tablecli.setModel(table);
        for (int i = 0; i < _cliente.size(); i++) {
            Cliente M = _cliente.get(i);
            String[] stringl = {M.getNombre(),M.getApellido(),M.getDireccion(),M.getRuc()};
            table.addRow(stringl);
        }
        
        
        DefaultTableModel tabla = new DefaultTableModel();
        String[] titulos = {"CÓDIGO", "NOMBRES", "APELLIDOS", "CANT.VEN.", "INGRESOS", "FECHA VENT"};
        tabla.setColumnIdentifiers(titulos);
        this.TRecord.setModel(tabla);
        for (int i = 0; i < _record.size(); i++) {
            Record b = _record.get(i);
            String[] strings = {b.getCode(), b.getName(), b.getLast_name(), String.valueOf(b.getCant_vendida()),String.valueOf(b.getIngresos()), String.valueOf(b.getFecha_venta())};
            tabla.addRow(strings);
        }
        this.pack();
        this.setLocationRelativeTo(null);
        
        for(int i = 0; i < _record.size(); i++){
            li_v=li_v+_record.get(i).getCant_vendida();
            sol=sol+_record.get(i).getIngresos();
        }
        for(int i = 0; i < _productos.size(); i++){
            Producto p=_productos.get(i);
            inver=inver+(p.getPrecio())*(p.getStock());
            can_li=can_li+p.getStock();
        }
        soles=Math.rint(sol*100)/100;
        dol=soles/2.81;
        dolar=Math.rint(dol*100)/100; 
        JTotalDolares.setText(""+String.valueOf(dolar));
        JInversion.setText(""+String.valueOf(inver));
        JTotalSoles.setText(""+String.valueOf(soles));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TRecord = new javax.swing.JTable();
        btnRetornar1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        JDolares = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JInversion = new javax.swing.JLabel();
        JTotalDolares = new javax.swing.JLabel();
        JTotalSoles = new javax.swing.JLabel();
        btnRetornar2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablecli = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Generales - Farmacia");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TRecord.setBackground(new java.awt.Color(102, 153, 255));
        TRecord.setForeground(new java.awt.Color(255, 255, 255));
        TRecord.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TRecord);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 118, 480, 240));

        btnRetornar1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnRetornar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar1.setText("RETORNAR");
        btnRetornar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRetornar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 185, 160, 41));

        jPanel3.setPreferredSize(new java.awt.Dimension(660, 382));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal Administrador Consulta.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jLabel8.setPreferredSize(new java.awt.Dimension(660, 382));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTA DE VENTAS POR CLIENTE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(376, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("RECORD GENERAL", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setPreferredSize(new java.awt.Dimension(660, 382));

        JDolares.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal Administrador Consulta.jpg"))); // NOI18N
        JDolares.setText("jLabel9");
        JDolares.setPreferredSize(new java.awt.Dimension(660, 382));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 255));
        jLabel5.setText("INVERSIÓN EN ADQUISICIONES:");

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL VENTA EN DOLARES:");

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL VENTA EN SOLES:");

        JInversion.setBackground(new java.awt.Color(153, 153, 153));
        JInversion.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JInversion.setForeground(new java.awt.Color(255, 255, 255));
        JInversion.setText("jLabel11");
        JInversion.setBorder(new javax.swing.border.MatteBorder(null));

        JTotalDolares.setBackground(new java.awt.Color(153, 153, 153));
        JTotalDolares.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JTotalDolares.setForeground(new java.awt.Color(255, 255, 255));
        JTotalDolares.setText("jLabel10");
        JTotalDolares.setBorder(new javax.swing.border.MatteBorder(null));

        JTotalSoles.setBackground(new java.awt.Color(153, 153, 153));
        JTotalSoles.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JTotalSoles.setForeground(new java.awt.Color(255, 255, 255));
        JTotalSoles.setText("jLabel9");
        JTotalSoles.setBorder(new javax.swing.border.MatteBorder(null));

        btnRetornar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRetornar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnRetornar2.setText("RETORNAR");
        btnRetornar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JInversion, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(JTotalSoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JTotalDolares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addComponent(btnRetornar2)
                .addGap(39, 39, 39))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTotalSoles))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTotalDolares))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JInversion)
                    .addComponent(btnRetornar2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("VENTAS GENERALES", jPanel2);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tablecli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tablecli);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, 610, 230));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LISTA DE CLIENTES:");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 190, 40));

        jPanel7.setPreferredSize(new java.awt.Dimension(660, 382));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Principal Administrador Consulta.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.setPreferredSize(new java.awt.Dimension(660, 382));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("LISTA DE CLIENTES", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(665, 410));

        jLabel10.setText("jLabel10");
        jLabel10.setPreferredSize(new java.awt.Dimension(665, 410));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar1ActionPerformed
        PrincipalAdministrador admin = new PrincipalAdministrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornar1ActionPerformed

    private void btnRetornar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornar2ActionPerformed
        PrincipalAdministrador admin = new PrincipalAdministrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetornar2ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVentas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JDolares;
    private javax.swing.JLabel JInversion;
    private javax.swing.JLabel JTotalDolares;
    private javax.swing.JLabel JTotalSoles;
    private javax.swing.JTable TRecord;
    private javax.swing.JTable Tablecli;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JButton btnRetornar2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Clases.Record>_record=new ArrayList<>();
    private ArrayList<Clases.Producto>_productos=new ArrayList<>();
    private ArrayList<Clases.Cliente>_cliente=new ArrayList<>();
}
