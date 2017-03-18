
package Formularios;
import Clases.Vendedor;
import Clases.Cliente;
import Clases.Producto;
import Clases.Record;
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
import java.util.Calendar; 
import java.lang.Math;
import java.text.DateFormat;
import java.util.Date;

public class Ventas extends javax.swing.JFrame {

    private  String first;
    private String last;
    private String code;
    double tot,toot; 
    java.util.Calendar calendario; 
    int dia, mes, año, hora, minutos, segundos; 
    
    public Ventas(String n, String a, String c) {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        buttonGroup1.add(rbtnrubro);
        buttonGroup1.add(rbtnproducto);
        reloj();
        this.first=n;
        this.last=a;
        this.code=c;
        this.setLocationRelativeTo(null);  
        this.setSize(800, 555);
        Jnomb.setText(" "+getFirst()+" "+getLast()); 
        interna.setVisible(false);        
        
        //archivo productos
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
        
        File arc ;
        FileReader fr2 = null;
        BufferedReader br2 = null;
        for(int i=0;i<_record.size();i++){
            _record.remove(i);
        }
        try {
           arc = new File ("Records.txt");
           if(!arc.exists()){  
              arc.createNewFile();              
           }  
           fr2 = new FileReader (arc);
           br2 = new BufferedReader(fr2);

           // Lectura del fichero
           String linea;
           while((linea=br2.readLine())!=null){
              String[] strin = linea.split(",");   
                
                 _record.add(new Record(strin[1], strin[2], Integer.parseInt(strin[3]), Double.parseDouble(strin[4]), strin[5],strin [0] ));
                            
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
    }
    
    private void reloj() { 
        calendario = new java.util.GregorianCalendar(); 
        segundos = calendario.get(Calendar.SECOND); 
        javax.swing.Timer timer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() { 
            @ Override 
            public void actionPerformed(java.awt.event.ActionEvent ae) { 
                java.util.Date actual = new java.util.Date(); 
                calendario.setTime(actual); 
                dia = calendario.get(Calendar.DAY_OF_MONTH); 
                mes = (calendario.get(Calendar.MONTH) + 1); 
                año = calendario.get(Calendar.YEAR); 
                hora = calendario.get(Calendar.HOUR_OF_DAY); 
                minutos = calendario.get(Calendar.MINUTE); 
                segundos = calendario.get(Calendar.SECOND); 
                String hour = String.format("%02d : %02d : %02d", hora, minutos, segundos); 
                String date = String.format("%02d / %02d / %02d", dia, mes, año); 
                JFech.setText(date+"  "+" - "+"  "+hour); 
            } 
        }); 
    timer.start(); 
    } 
    
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        rbtnproducto = new javax.swing.JRadioButton();
        btnlim = new javax.swing.JButton();
        btnbus = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        btnagr = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaBus = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        rbtnrubro = new javax.swing.JRadioButton();
        btnclos = new javax.swing.JButton();
        txtinfo = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jnomb = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEjecutar = new javax.swing.JTable();
        Sub = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnAniadir = new javax.swing.JButton();
        JSubto = new javax.swing.JLabel();
        txtIgv = new javax.swing.JLabel();
        JTot = new javax.swing.JLabel();
        btnEjecutar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        JFech = new javax.swing.JLabel();
        interna = new javax.swing.JInternalFrame();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnCan = new javax.swing.JButton();
        btnTerminar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JVuelto = new javax.swing.JLabel();
        txtMontoRec = new javax.swing.JTextField();
        Jmon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        JSubto1 = new javax.swing.JLabel();
        txtIgv1 = new javax.swing.JLabel();
        JTot1 = new javax.swing.JLabel();

        jFrame1.setTitle("Consulta");
        jFrame1.setMinimumSize(new java.awt.Dimension(622, 420));
        jFrame1.setResizable(false);
        jFrame1.setType(java.awt.Window.Type.UTILITY);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("PALABRA CLAVE:");
        jFrame1.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 36, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("BUSCAR POR:");
        jFrame1.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 71, -1, -1));

        rbtnproducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtnproducto.setText("PRODUCTO");
        rbtnproducto.setContentAreaFilled(false);
        jFrame1.getContentPane().add(rbtnproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 86, -1, -1));

        btnlim.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnlim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono_escoba.png"))); // NOI18N
        btnlim.setText("LIMPIAR");
        btnlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnlim, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 33, 142, 52));

        btnbus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BUSCAR.JPG"))); // NOI18N
        btnbus.setText("BUSCAR");
        btnbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbusActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnbus, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 111, 142, 46));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("RESULTADOS DE LA BUSQUEDA:");
        jFrame1.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 143, -1, -1));

        btnagr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnagr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnagr.setText("AGREGAR A LISTA DE COMPRA");
        btnagr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagrActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnagr, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 323, 252, -1));

        TablaBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO","PRODUCTO","RUBRO","STOCK","P/U"
            }
        ));
        jScrollPane2.setViewportView(TablaBus);

        jFrame1.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 175, 516, 118));

        jPanel2.setPreferredSize(new java.awt.Dimension(633, 394));

        jLabel13.setPreferredSize(new java.awt.Dimension(633, 394));

        rbtnrubro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbtnrubro.setText("RUBRO");
        rbtnrubro.setContentAreaFilled(false);

        btnclos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ANTERIOR.JPG"))); // NOI18N
        btnclos.setText("RETORNAR");
        btnclos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(rbtnrubro))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(txtinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(rbtnrubro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(btnclos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transacción de venta - Farmacia");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("FARMACIA - FACTURA                                                                              RUC: 10476772053");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 763, 24));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 101, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("RUC:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 182, 40, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DIRECCIÓN:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("APELLIDOS:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 130, 70, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 153, 240, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("NOMBRES:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 104, -1, -1));

        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        getContentPane().add(txtRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 186, 130, 20));

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 127, 240, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("VENDEDOR:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, -1, -1));
        getContentPane().add(Jnomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 66, 314, 24));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("CLIENTE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 101, -1, -1));

        TablaEjecutar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PRODUCTO", "RUBRO", "CANT.", "PRECIO","COST.COMPR"
            }
        ));
        jScrollPane1.setViewportView(TablaEjecutar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 217, 600, 180));

        Sub.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Sub.setText("SUB-TOTAL");
        getContentPane().add(Sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 415, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("IGV");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 435, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("TOTAL");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 455, -1, -1));

        btnAniadir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INSERTAR.JPG"))); // NOI18N
        btnAniadir.setText("AÑADIR");
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });
        getContentPane().add(btnAniadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 139, 132, -1));

        JSubto.setText(" ");
        getContentPane().add(JSubto, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 415, 184, -1));

        txtIgv.setText(" ");
        getContentPane().add(txtIgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 435, 184, -1));

        JTot.setText(" ");
        getContentPane().add(JTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 455, 184, -1));

        btnEjecutar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnEjecutar.setText("EJECUTAR VENTA");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 415, 211, -1));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCELAR2.JPG"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 415, 142, 49));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("FECHA:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        JFech.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JFech.setText("CONTENDRA LA FECHA DEL SISTEMA");
        getContentPane().add(JFech, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 46, -1, -1));

        interna.setPreferredSize(new java.awt.Dimension(753, 200));
        interna.setVisible(true);

        jLabel14.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel14.setText("EJECUTAR VENTA:");

        jLabel15.setText("DEVOLUCIÓN:");

        jLabel16.setText("MONTO RECIBIDO:");

        jLabel17.setText("MONTO A PAGAR:");

        btnCan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CANCELAR2.JPG"))); // NOI18N
        btnCan.setText("CANCELAR");
        btnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCanActionPerformed(evt);
            }
        });

        btnTerminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok2.JPG"))); // NOI18N
        btnTerminar.setText("TERMINAR");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        btnImprimir.setForeground(new java.awt.Color(0, 0, 204));
        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GUARDARIMP.JPG"))); // NOI18N
        btnImprimir.setText("IMPRIMIR FACTURA");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CALCULADORA.JPG"))); // NOI18N
        jButton1.setText("VUELTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JVuelto.setText(" ");

        Jmon.setText(" ");

        javax.swing.GroupLayout internaLayout = new javax.swing.GroupLayout(interna.getContentPane());
        interna.getContentPane().setLayout(internaLayout);
        internaLayout.setHorizontalGroup(
            internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internaLayout.createSequentialGroup()
                        .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addGap(31, 31, 31)
                        .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMontoRec, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(Jmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JVuelto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnTerminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(internaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(btnImprimir)
                        .addGap(55, 55, 55))))
        );
        internaLayout.setVerticalGroup(
            internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(Jmon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtMontoRec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(btnTerminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(internaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(JVuelto))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(interna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 487, 753, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(780, 700));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor Ventas.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(780, 700));
        jLabel3.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        JSubto1.setText(" ");
        getContentPane().add(JSubto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 415, 184, -1));

        txtIgv1.setText(" ");
        getContentPane().add(txtIgv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 435, 184, -1));

        JTot1.setText(" ");
        getContentPane().add(JTot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 455, 184, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        PrincipalVendedor vende = new PrincipalVendedor(getFirst(),getLast(),getCode());
        vende.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        interna.setVisible(true);
        this.setSize(800, 450);
        this.pack();
        Jmon.setText(""+String.valueOf(tot));
        
                     
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCanActionPerformed
        interna.setVisible(false);
        this.setSize(800, 575);
        
    }//GEN-LAST:event_btnCanActionPerformed

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
        int canti=0;
        double pre=0,ing;
        String nombreem = txtNombres.getText();
        String apellidoem = txtApellidos.getText();
        String direccionem = txtDireccion.getText();
        String rucem = txtRuc.getText();
        for (int i = 0; i < _venta.size(); i++) {
            Producto n=_venta.get(i);
            canti=canti+n.getStock();
            pre=pre+n.getPrecio()*n.getStock();
        }
         
        if(canti!=0){
            PrincipalVendedor vende = new PrincipalVendedor(getFirst(),getLast(),getCode());
            JOptionPane.showMessageDialog(this,"Venta relizada con EXITO !!! ");
            
            Cliente x=new Cliente(nombreem,apellidoem,0,direccionem,rucem);
        _cliente.add(x);
        File file1 = new File("Clientes.txt");
        
            if(file1.exists()){
                file1.delete();

                try {
                    file1.createNewFile();

                } catch (IOException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            try {  
                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file1,true), "utf-8"))) {

                    for(Cliente cl : _cliente){
                        Fescribe.append(cl.toString());
                        Fescribe.append("\r\n");
                    }               
                    //JOptionPane.showMessageDialog(this, "Guardado con Exito");
                }
            } catch (Exception ex) {  
               //Captura un posible error le imprime en pantalla   
                JOptionPane.showMessageDialog(rootPane, "Error al Guardar","ERROR",JOptionPane.ERROR_MESSAGE);            
            }
        
        
        
        ing=pre*1.18;
        String name=getFirst();
        String lastname=getLast();
        String cod=getCode();
        Date dai = new Date();
        DateFormat date = DateFormat.getDateInstance();
        String fech = date.format(dai);
        Record m =new Record(name,lastname,canti,ing,fech,cod);
        _record.add(m);
        
        File f = new File("Records.txt");
            if (f.exists()) {
                f.delete();
                try {
                    f.createNewFile();
                }catch (IOException ex) {
                    Logger.getLogger(ListadoVendedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try{
                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "utf-8"))) {
                    for (Record c : _record) {
                        Fescribe.append(c.toString());
                        Fescribe.append("\r\n");
                    }                    
                }
            }catch (Exception ex) {
                //Captura un posible error le imprime en pantalla   
                JOptionPane.showMessageDialog(rootPane, "Error al Guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            } 
            
            File fiw = new File("Productos.txt");
            if (fiw.exists()) {
                fiw.delete();
                try {
                    fiw.createNewFile();
                }catch (IOException ex) {
                    Logger.getLogger(ListadoVendedores.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try{
                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fiw, true), "utf-8"))) {
                    for (Producto w : _productos) {
                        Fescribe.append(w.toString());
                        Fescribe.append("\r\n");
                    }                   
                }
            }catch (Exception ex) {
                //Captura un posible error le imprime en pantalla   
                JOptionPane.showMessageDialog(rootPane, "Error al Guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        File ll=new File("Ventas.txt");
        if(ll.exists()){
            ll.delete();
        }
            this.dispose();
            vende.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"No se ha seleccionado ningun producto");                     
        }    
        
                
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        JOptionPane.showMessageDialog(this, "Imprimiendo");
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        jFrame1.setVisible(true);
        jFrame1.pack();
        jFrame1.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void btnagrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagrActionPerformed
        boolean p=false;
        
            String cad;
            int  indice=TablaBus.getSelectedRow();
            String code=TablaBus.getValueAt(indice, 0).toString();
            String producto=TablaBus.getValueAt(indice, 1).toString();
            String rubro=TablaBus.getValueAt(indice, 2).toString();
            int q;
            double price=Double.parseDouble(TablaBus.getValueAt(indice,4).toString());
            int cantidad=Integer.parseInt(TablaBus.getValueAt(indice, 3).toString());
            if(indice>=0){
               cad=JOptionPane.showInputDialog("Ingrese la cantidad a comprar");
              if(!(cad.isEmpty())) {
                 try{
                      int c=Integer.parseInt(cad);
                      if(c<=cantidad){
                         for(int i=0;i<_venta.size();i++){
                             if(_venta.get(i).getProducto().equals(rubro) && _venta.get(i).getRubro().equals(producto)&& _venta.get(i).getCodigo().equals(code) ){
                                 q=i;
                                 _venta.get(q).setStock(_venta.get(i).getStock()+c);
                                 p=true;
                             }
                         }
                       if(!p){
                                 Producto x=new Producto(code,c,producto,price,rubro);
                                 _venta.add(x);
                             }
                       for(int i=0;i<_productos.size();i++){
                             if(_productos.get(i).getProducto().equals(producto) && _productos.get(i).getProducto().equals(producto) ){
                                 _productos.get(i).setStock(_productos.get(i).getStock()-c);
                                }
                            }
                            File f = new File("Ventas.txt");

                            if (f.exists()) {
                                f.delete();

                                try {
                                    f.createNewFile();
                                } catch (IOException ex) {
                                    Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);

                                }
                            }

                            try {
                                try (BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f, true), "utf-8"))) {

                                    for (Clases.Producto l : _venta) {
                                        Fescribe.append(l.toString());
                                        Fescribe.append("\r\n");
                                    }
                                    JOptionPane.showMessageDialog(null, "Agregado");
                                }
                            } catch (Exception ex) {
                                //Captura un posible error le imprime en pantalla   
                                JOptionPane.showMessageDialog(rootPane, "Error al Guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
                            }
                       }else{
                        JOptionPane.showMessageDialog(this,"El stock es insuficiente, ingrese otra cantidad");
                       }
                 }catch(NumberFormatException e){
                   JOptionPane.showMessageDialog(rootPane,"Error al Ingresar", "ERROR ", JOptionPane.ERROR_MESSAGE);  
                 }   
              }else{
                  JOptionPane.showMessageDialog(this,"Ingrese una cantidad porfavor", "ERROR ", JOptionPane.ERROR_MESSAGE);
              }
               
            }else{
                JOptionPane.showMessageDialog(this,"Porfavor, seleccione un producto");
            }
        
    }//GEN-LAST:event_btnagrActionPerformed

    private void btnbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbusActionPerformed
        DefaultTableModel tabla = new DefaultTableModel();
        
        String[] productos = {"CODIGO","PRODUCTO","RUBRO","STOCK","P/U"};
        tabla.setColumnIdentifiers(productos);    
        this.TablaBus.setModel(tabla);
         
        if(rbtnrubro.isSelected()){
            for(int i=0;i<_productos.size();i++){
                if(txtinfo.getText().toLowerCase().equals(_productos.get(i).getRubro().toLowerCase())){
                Producto b=_productos.get(i);
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
                _temporal.add(b);
                }     
            }
        }
        if(rbtnproducto.isSelected()){
            for(int i=0;i<_productos.size();i++){
                Producto b=_productos.get(i);
                String[] linea=b.getProducto().split(" ");
                if(txtinfo.getText().equals(linea[0])){ 
                String[]strings={b.getCodigo(),b.getProducto(),b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio())};
                tabla.addRow(strings);
                _temporal.add(b);
                }   
            }
        }
        if(!(rbtnproducto.isSelected()) && !(rbtnrubro.isSelected())){
            JOptionPane.showMessageDialog(null,"Seleccione una opcion");
        }
        
    }//GEN-LAST:event_btnbusActionPerformed

    private void btnlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimActionPerformed
        txtinfo.setText(null);
    }//GEN-LAST:event_btnlimActionPerformed

    private void btnclosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclosActionPerformed
        jFrame1.setVisible(false);
        jFrame1.setVisible(false);
        double t=0;
        double igv,d,m;
        DefaultTableModel tabla = new DefaultTableModel();
        String[] productos = {"PRODUCTO", "RUBRO", "CANTIDAD", "PRECIO","COST.COMPR"};
        tabla.setColumnIdentifiers(productos);
        this.TablaEjecutar.setModel(tabla);
        for (int i = 0; i < _venta.size(); i++) {
            Producto b = _venta.get(i);
            String[] strings = {b.getProducto(), b.getRubro(),String.valueOf(b.getStock()),String.valueOf(b.getPrecio()), String.valueOf(b.getPrecio()*b.getStock())};
            t=b.getStock()*b.getPrecio()+t;
            tabla.addRow(strings);
        }
        m=Math.rint(t*100)/100;
        tot=t*1.18;
        d=t*0.18;
        igv=Math.rint(d*100)/100;
        toot=Math.rint(tot*100)/100;
        JSubto.setText(""+String.valueOf(m));
        txtIgv.setText(String.valueOf(igv));
        JTot.setText(""+String.valueOf(toot));
        
    }//GEN-LAST:event_btnclosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double vuelto,v;
        double entrega= Integer.parseInt(txtMontoRec.getText());
        v=entrega-toot;
        vuelto=Math.rint(v*100)/100;
        JVuelto.setText(""+String.valueOf(vuelto));
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas("", "", "").setVisible(true);
            }
        });
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JFech;
    private javax.swing.JLabel JSubto;
    private javax.swing.JLabel JSubto1;
    private javax.swing.JLabel JTot;
    private javax.swing.JLabel JTot1;
    private javax.swing.JLabel JVuelto;
    private javax.swing.JLabel Jmon;
    private javax.swing.JLabel Jnomb;
    private javax.swing.JLabel Sub;
    private javax.swing.JTable TablaBus;
    private javax.swing.JTable TablaEjecutar;
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton btnCan;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JButton btnagr;
    private javax.swing.JButton btnbus;
    private javax.swing.JButton btnclos;
    private javax.swing.JButton btnlim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JInternalFrame interna;
    private javax.swing.JButton jButton1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbtnproducto;
    private javax.swing.JRadioButton rbtnrubro;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JLabel txtIgv;
    private javax.swing.JLabel txtIgv1;
    private javax.swing.JTextField txtMontoRec;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtinfo;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Producto> _productos =new ArrayList<>();
    private ArrayList<Producto> _venta =new ArrayList<>();
    private ArrayList<Producto> _temporal = new ArrayList<>();
    private ArrayList<Record>_record=new ArrayList<>();
    private ArrayList<Cliente>_cliente=new ArrayList<>();
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
}
