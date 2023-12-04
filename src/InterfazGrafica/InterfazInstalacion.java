
package InterfazGrafica;

import inventariomegared.consultasgenerales;
import inventariomegared.modificaciones;
import inventariomegared.modificaciones2;
import inventariomegared.tecnicos;
import inventariomegared.transferencias;
import inventariomegared.transferenciasdetalladas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfazInstalacion extends javax.swing.JFrame {
    private String dato;
    private int idusu;

    public InterfazInstalacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);
        //Diseño Grafico
        Color c1= new Color(0xCDCDC0); 
        Color c2= new Color(0xCDCDC0); 
        Color c3= new Color(0xBBC3C6); 
        this.getContentPane().setBackground(c1);
        jPanel1.setBackground(c3);
        jPanel2.setBackground(c2);
        jPanel3.setBackground(c2);
        jPanel4.setBackground(c3);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        descripciontxt = new javax.swing.JTextField();
        cedulatxt = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        codigotxt = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        clienteidtxt = new javax.swing.JTextField();
        nombreclientetxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO UNICO", "DESCRIPCION INDIVIDUAL", "DESCRIPCION PRODUCTO", "CANTIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("DATOS TECNICO");

        jLabel2.setText("CEDULA");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("ACTIVIDAD");

        jLabel5.setText("DESCRIPCION");

        descripciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripciontxtActionPerformed(evt);
            }
        });

        cedulatxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulatxtKeyPressed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INST/REV", "RUTA" }));

        jLabel9.setText("TIPO DESCUENTO");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO DIRECTO", "DIRECTO" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descripciontxt)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nombretxt)
                                    .addComponent(cedulatxt))))))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cedulatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jButton2.setText("ELIMINAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        codigotxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigotxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        txtusuario.setEditable(false);

        jButton3.setText("EMITIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setText("DATOS CLIENTE");

        jLabel7.setText("CLIENTE ID");

        jLabel8.setText("NOMBRE CLIENTE");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clienteidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreclientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(clienteidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nombreclientetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel10.setText("INSTALACIONES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(458, 458, 458)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void descripciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripciontxtActionPerformed

    private void codigotxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigotxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            String codigo =codigotxt.getText();
            consultasgenerales cgenerales=new consultasgenerales(codigo,"","","");
            cgenerales.consultar();
            String identificador = cgenerales.sector;

            DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
            Object[]vec= new Object[4];

            switch (identificador.toLowerCase()) {
                case "onu":
                if(cgenerales.consultaronu()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="ONU";
                    vec[2]="Equipo unitario ONU "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }

                break;
                case "bridge":
                if(cgenerales.consultarbridge()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="BRIDGE";
                    vec[2]="Equipo unitario BRIDGE "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }

                break;
                case "router":
                if(cgenerales.consultarrouter()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="ROUTER";
                    vec[2]="Equipo unitario ROUTER "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "mesh":
                if(cgenerales.consultarmesh()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="MESH";
                    vec[2]="Equipo unitario MESH "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "antena":
                if(cgenerales.consultarantena()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="ANTENA";
                    vec[2]="Equipo unitario ANTENA "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "switc":
                if(cgenerales.consultarswitc()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="SWITCH";
                    vec[2]="Equipo unitario SWITCH "+cgenerales.descripcion;
                    vec[3]="1";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "bobinas":
                if(cgenerales.consultarbobinas()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="BOBINAS";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "spliters":
                if(cgenerales.consultarspliters()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="SPLITERS";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "cajas":
                if(cgenerales.consultarcajas()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="CAJAS";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "ganchos":
                if(cgenerales.consultarganchos()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="GANCHOS";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "otros":
                if(cgenerales.consultarotros()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="OTROS";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;
                case "patchcord":
                if(cgenerales.consultarpatchcord()==1){
                    //Cargar a la tabla
                    modeloTabla.getRowCount();
                    modeloTabla.setRowCount(modeloTabla.getRowCount());
                    vec[0]=codigo;
                    vec[1]="PATCHCORD";
                    vec[2]=""+cgenerales.descripcion;
                    vec[3]="";
                    modeloTabla.addRow(vec);
                    codigotxt.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                }
                break;

                case "":
                JOptionPane.showMessageDialog(null,"Este producto no esta registrado");
                codigotxt.setText("");
                break;

            }

        }
    }//GEN-LAST:event_codigotxtKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        modificarinventario();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int fsel;
        try{
        fsel= jTable1.getSelectedRow();
        if(fsel==-1){
        JOptionPane.showMessageDialog(null, "Debe seleccionar el producto a Eliminar");
        }else{
            DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
            m.removeRow(fsel);
            
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se elimino el producto ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cedulatxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulatxtKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
        String cedula=cedulatxt.getText();
        tecnicos tecnico=new tecnicos(0,"",cedula);
        tecnico.consultar();
        cedulatxt.setText(tecnico.cedula);
        nombretxt.setText(tecnico.nombre);
        }
    }//GEN-LAST:event_cedulatxtKeyPressed

    public void modificarinventario(){
        //Agregar transferencia general
        String tecnico=nombretxt.getText();
        String pentrega=txtusuario.getText();
        String tipo=jComboBox1.getSelectedItem().toString();
        String descripcion=descripciontxt.getText();
        //Obtener la fecha
        java.util.Date utilDate = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        transferencias transf=new transferencias(0,pentrega,tecnico,tipo,sqlDate, descripcion);
        
        if(transf.registrar()==1){
            transf.consultar();
            int transfact=transf.id;
            //Obtener datos de toda la tabla en una matriz
    int numerodefilas=jTable1.getRowCount();
    String matriz[][]=new String[numerodefilas][4];
        for(int i = 0; i < numerodefilas; i++) {
         for(int j = 0; j < 4; j++) {
          matriz[i][j]=jTable1.getValueAt(i, j).toString();
        } 
        }
        //Registrar salida y modificar inventario por cada producto
        for(int i = 0; i < numerodefilas; i++) {
            //Registrar venta especificada
            int idaux=transfact;
            String codigounico=matriz[i][0];
            String sector=matriz[i][1];
            String descripcionproducto=matriz[i][2];
            String cantidad =matriz[i][3];
            String tecnico1=nombretxt.getText();
            String cliente=clienteidtxt.getText();
            String clienteid=nombreclientetxt.getText();
            transferenciasdetalladas transdet=new transferenciasdetalladas(0,idaux,codigounico,sector,descripcionproducto,cantidad,tecnico1,cliente,clienteid);
            transdet.registrar();
            //Modificar Inventario
          String identificador = matriz[i][1];
          switch (identificador.toLowerCase()) {
          case "onu":
              modificaciones modonu=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modonu.modificaronu();  
          break;
          case "bridge":
              modificaciones modbridge=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modbridge.modificarbridge();  
          break;
          case "router":
              modificaciones modrouter=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modrouter.modificarrouter();  
          break;
          case "mesh":
              modificaciones modmesh=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modmesh.modificarmesh();  
          break;
          case "antena":
              modificaciones modantena=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modantena.modificarantena();  
          break;
          case "switch":
              modificaciones modswitc=new modificaciones(matriz[i][0],"INSTALADO",transfact,1);
              modswitc.modificarswitch();  
          break;
          case "bobinas":
              String cond=jComboBox2.getSelectedItem().toString();
              modificaciones2 cantbob=new modificaciones2(matriz[i][0],0,0,0,0);
              int cantidadbobina=Integer.parseInt(matriz[i][3]);
              if(cond.equals("NO DIRECTO")){ 
                cantbob.modificarbobinas3(cantidadbobina);
              }else{
                  cantbob.modificarbobinas4(cantidadbobina);
              } 
          break;
          case "spliters":
              String conds=jComboBox2.getSelectedItem().toString();
              modificaciones2 cantsplites=new modificaciones2(matriz[i][0],0,0,0,0);
              int cantidadspliters=Integer.parseInt(matriz[i][3]);
              if(conds.equals("NO DIRECTO")){ 
                cantsplites.modificarspliters3(cantidadspliters);
              }else{
                  cantsplites.modificarspliters4(cantidadspliters);
              } 
          break;
          case "cajas":
              String condc=jComboBox2.getSelectedItem().toString();
              modificaciones2 cantcajas=new modificaciones2(matriz[i][0],0,0,0,0);
              int cantidadcajas=Integer.parseInt(matriz[i][3]);
              if(condc.equals("NO DIRECTO")){ 
                cantcajas.modificarcajas3(cantidadcajas);
              }else{
                  cantcajas.modificarcajas4(cantidadcajas);
              }
          break;
          case "patchcord":
              modificaciones2 cantpatchcord=new modificaciones2(matriz[i][0],0,0,0,0);
              cantpatchcord.consultarpatchcord();
              String condp=jComboBox2.getSelectedItem().toString();
              int cantidadpatchcord=Integer.parseInt(matriz[i][3]);
              if(condp.equals("NO DIRECTO")){ 
                cantpatchcord.modificarpatchcord3(cantidadpatchcord);
              }else{
                  cantpatchcord.modificarpatchcord4(cantidadpatchcord);
              }
          break;
          case "ganchos":
              String condg=jComboBox2.getSelectedItem().toString();
              modificaciones2 cantganchos=new modificaciones2(matriz[i][0],0,0,0,0);
              int cantidadganchos=Integer.parseInt(matriz[i][3]);
              if(condg.equals("NO DIRECTO")){ 
                cantganchos.modificarganchos3(cantidadganchos);
              }else{
                  cantganchos.modificarganchos4(cantidadganchos);
              }
              
          break;
          case "otros":
              String condo=jComboBox2.getSelectedItem().toString();
              modificaciones2 cantotros=new modificaciones2(matriz[i][0],0,0,0,0);
              int cantidadotros=Integer.parseInt(matriz[i][3]);
              if(condo.equals("NO DIRECTO")){ 
                cantotros.modificarotros3(cantidadotros);
              }else{
                  cantotros.modificarotros4(cantidadotros);
              }
              
          break;
          }
        }
            
        }else{
        
        }
        //Reiniciar valores
        reiniciarvalores();
        
    }
    public void reiniciarvalores(){
    //Reiniciar valores
        codigotxt.setText("");
        cedulatxt.setText("");
        nombretxt.setText("");
        descripciontxt.setText("");
        DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);
        clienteidtxt.setText("");
        nombreclientetxt.setText("");
    }
    public void setdato(int idusu, String dato){
    this.dato=dato;
    this.idusu=idusu;
    txtusuario.setText(dato);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInstalacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulatxt;
    private javax.swing.JTextField clienteidtxt;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField descripciontxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombreclientetxt;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
