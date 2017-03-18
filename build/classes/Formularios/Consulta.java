
package Formularios;

import Formularios.Ventas;
import Clases.Producto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Consulta extends javax.swing.JFrame {    
    private  String first;
    private String last;
    private String code;

    public Consulta(String n, String a, String c) {                        
        initComponents();
        this.pack();
        this.first=n;
        this.last=a;
        this.code=c;
        btngrup.add(rbtnRubro);
        btngrup.add(rbtnProducto);
        this.setLocationRelativeTo(null);
        
        
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
             String[][] cads=null;
             for(int i=0;i<_productos.size();i++){
                cads[i]=_productos.get(i).getProducto().split(" "); 
             }
           }
            
        catch(Exception e){
           //JOptionPane.showMessageDialog(null, "ERROR", "ERROR", JOptionPane.ERROR_MESSAGE);
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtInfo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbtnProducto = new javax.swing.JRadioButton();
        rbtnRubro = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta de Venta ");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Palabra Clave:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 37, -1, -1));
        getContentPane().add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 34, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Buscar por:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 73, -1, -1));

        rbtnProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnProducto.setSelected(true);
        rbtnProducto.setText("Producto");
        rbtnProducto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtnProducto.setContentAreaFilled(false);
        rbtnProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbtnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProductoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 97, 100, -1));

        rbtnRubro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtnRubro.setText("Rubro");
        rbtnRubro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtnRubro.setContentAreaFilled(false);
        rbtnRubro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(rbtnRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 97, 80, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 118, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 305, -1, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(622, 397));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor Consulta.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setPreferredSize(new java.awt.Dimension(622, 397));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_escoba.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCAR.JPG"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SALIR.JPG"))); // NOI18N
        btnCerrar.setText("VOLVER");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        TablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO","TITULO","AUTOR","STOCK","P/U"
            }
        ));
        jScrollPane1.setViewportView(TablaB);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Resultados de la busqueda:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(19, 19, 19)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        
            PrincipalVendedor vende = new PrincipalVendedor(getFirst(),getLast(),getCode());
            vende.setVisible(true);
            this.dispose();
       
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        DefaultTableModel tabla = new DefaultTableModel();
        
        String[] productos = {"CODIGO","PRODUCTO","RUBRO","STOCK","P/U"};
        tabla.setColumnIdentifiers(productos);    
        this.TablaB.setModel(tabla);
  
          if(rbtnRubro.isSelected()){
            
            for(int i=0;i<_productos.size();i++){
                if(txtInfo.getText().toLowerCase().equals(_productos.get(i).getRubro().toLowerCase())){
                Producto b=_productos.get(i);
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
                _temporal.add(b);
                }     
            }
          }
//            Producto b = null;
//            quicksort(_productos,0,_productos.size()-1,0);
//            b = busquedaDicotomica(_productos,txtInfo.getText().toLowerCase(),0);
//            String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
//            tabla.addRow(strings);
//            _temporal.add(b);
//
//        }
        if(rbtnProducto.isSelected()){
            for(int i=0;i<_productos.size();i++){
                Producto b=_productos.get(i);
                //String[] linea=b.getProducto().split(" ");
                if(txtInfo.getText().toLowerCase().equals(b.getProducto())){
                   // for(int j=0;j<cads[i].lenght();j++)
                    String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                    tabla.addRow(strings);
                    _temporal.add(b);
                }   
            }
//            Producto b = null;
//            quicksort(_productos,0,_productos.size()-1,1);
//            b = busquedaDicotomica(_productos,txtInfo.getText().toLowerCase(),1);
//            String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
//            tabla.addRow(strings);
//            _temporal.add(b);
        }
       
        if(!(rbtnProducto.isSelected()) && !(rbtnRubro.isSelected())){
            JOptionPane.showMessageDialog(this,"Seleccione una opcion");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbtnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnProductoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtInfo.setText(null);
        txtInfo.requestFocus();       
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta("","","").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaB;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.ButtonGroup btngrup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton rbtnProducto;
    private javax.swing.JRadioButton rbtnRubro;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Producto> _productos =new ArrayList<>();
    private ArrayList<Producto> _venta =new ArrayList<>();
    private ArrayList<Producto> _temporal = new ArrayList<>();
    
    public String getFirst() {
        return first;
    }
    public void setFirst(String first) {
        this.first = first;
    }
    public String getLast() {
        return last;
    }
    public void setLast(String last) {
        this.last = last;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    //Ordenamiento usando quicksort
    public void quicksort(ArrayList<Producto> _productos, int izq, int der, int opcion)
    {
        Producto aux;
        int i = izq;
        int j = der;
        Producto pivote = _productos.get(0);
        
        switch(opcion){
            case 0: // 0 = Autor
                while(i<j){
                    while(_productos.get(i).getProducto().compareTo(pivote.getProducto())<0 && izq < der){
                        i++;
                    }
                    while(_productos.get(j).getRubro().compareTo(pivote.getRubro())>0 && izq < der){
                        j--;
                    }
                    if(i<j){
                        aux = _productos.get(i);
                        _productos.set(i,_productos.get(j));
                        _productos.set(j,aux);
                    }
                }
                _productos.set(izq,_productos.get(j));
                _productos.set(j,pivote);
                if(izq < j-1)
                    quicksort(_productos,izq,j-1,0);
                if(j+1 < der)
                    quicksort(_productos,j+1,der,0);
            
            case 1: // 1 = Titulo
                while(i<j){
                    while(_productos.get(i).getProducto().compareTo(pivote.getProducto())<0){
                        i++;
                    }
                    while(_productos.get(j).getProducto().compareTo(pivote.getProducto())>0){
                        j--;
                    }
                    if(i<j){
                        aux = _productos.get(i);
                        _productos.set(i,_productos.get(j));
                        _productos.set(j,aux);
                    }
                }
                _productos.set(izq,_productos.get(j));
                _productos.set(j,pivote);
                if(izq < j-1)
                    quicksort(_productos,izq,j-1,0);
                if(j+1 < der)
                    quicksort(_productos,j+1,der,0);
        }
    }
    
    //Busqueda Dicotomica
    public Producto busquedaDicotomica(ArrayList<Producto> lsProducto, String cadena, int opcion){
        int inferior = 0;
        int superior = lsProducto.size();
        int medio = (inferior + superior)/2;
        boolean encontrado = false;
        while(!encontrado && inferior < superior){
            medio = (inferior + superior)/2;
            switch(opcion){
                case 0: // 0 = Autor
                    if(lsProducto.get(medio).getRubro().toLowerCase().equals(cadena)){
                        return lsProducto.get(medio);
                    }
                    else{
                        if(cadena.compareTo(lsProducto.get(medio).getRubro().toLowerCase()) < 0){
                            superior = medio - 1;
                        }
                        else{
                            inferior = medio + 1;
                        }
                    }
                case 1: // 1 = Titulo
                    if(lsProducto.get(medio).getProducto().toLowerCase().equals(cadena)){
                        return lsProducto.get(medio);
                    }
                    else{
                        if(cadena.compareTo(lsProducto.get(medio).getProducto().toLowerCase()) < 0){
                            superior = medio - 1;
                        }
                        else{
                            inferior = medio + 1;
                        }
                    }
            }
        }
        return lsProducto.get(medio);
    }
}
