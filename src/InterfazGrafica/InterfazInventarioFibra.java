
package InterfazGrafica;

import BasedeDatos.ConexionMySQL;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfazInventarioFibra extends javax.swing.JFrame {

    public InterfazInventarioFibra() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
        modeloTabla.setRowCount(0);
        //Diseño Grafico
        Color c1= new Color(0xCDCDC0); 
        Color c2= new Color(0xCDCDC0); 
        Color c3= new Color(0xBBC3C6); 
        this.getContentPane().setBackground(c1);
        jPanel1.setBackground(c2);
        jPanel2.setBackground(c2);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtcodprincipal = new javax.swing.JTextField();
        txtcodsecundario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcantotal = new javax.swing.JTextField();
        txtconttot2 = new javax.swing.JTextField();
        txtcantbod = new javax.swing.JTextField();
        txtcanttec = new javax.swing.JTextField();
        txtcantinst = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("MATERIAL TIPO");

        jLabel2.setText("CODIGO PRINCIPAL");

        jLabel3.setText("CODIGO SECUNDARIO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOBINAS", "SPLITERS", "CAJAS/MANGAS", "PATCH/PIGT", "HERR/GANCH", "OTROS" }));

        jButton1.setText("CONSULTAR COD. PRI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CONSULTAR COD. SEC");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcodprincipal)
                            .addComponent(txtcodsecundario, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcodsecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "COD. PRINC", "COD. SEC", "DESCRIPCION", "CANT T", "CANT T Uni", "CANT B", "CANT T", "CANT I", "N TRANSF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("RESULTADOS");

        jLabel5.setText("CANTIDAD TOTAL (Unidades)");

        jLabel6.setText("CANTIDAD TOTAL (Uni. Basica)");

        jLabel7.setText("CANTIDAD BODEGA (Uni. Basica)");

        jLabel8.setText("CANTIDAD TECNICOS (Uni. Basica)");

        jLabel9.setText("CANTIDAD INSTALADA (Uni. Basica)");

        txtcantotal.setEditable(false);

        txtconttot2.setEditable(false);

        txtcantbod.setEditable(false);

        txtcanttec.setEditable(false);

        txtcantinst.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcantbod)
                            .addComponent(txtcanttec)
                            .addComponent(txtcantinst)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtconttot2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtcantotal, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcantotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtconttot2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcantbod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcanttec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcantinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String tipo=jComboBox1.getSelectedItem().toString();
        String codprincipal = txtcodprincipal.getText();
        String identificador="PRINCIPAL";
        
        switch (tipo.toLowerCase()) {
          case "bobinas":
              cargarTabla(codprincipal,identificador);
          break;
          case "spliters":
              cargarTabla2(codprincipal,identificador);
          break;
          case "cajas/mangas":
              cargarTabla3(codprincipal,identificador);
          break;
          case "patch/pigt":
              cargarTabla4(codprincipal,identificador);
          break;
          case "herr/ganch":
              cargarTabla5(codprincipal,identificador);
          break;
          case "otros":
              cargarTabla6(codprincipal,identificador);
          break;
    }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tipo=jComboBox1.getSelectedItem().toString();
        String codsecundario = txtcodsecundario.getText();
        String identificador="SECUNDARIO";
        
        switch (tipo.toLowerCase()) {
          case "bobinas":
              cargarTabla(codsecundario,identificador);
          break;
          case "spliters":
              cargarTabla2(codsecundario,identificador);
          break;
          case "cajas/mangas":
              cargarTabla3(codsecundario,identificador);
          break;
          case "patch/pigt":
              cargarTabla4(codsecundario,identificador);
          break;
          case "herr/ganch":
              cargarTabla5(codsecundario,identificador);
          break;
          case "otros":
              cargarTabla6(codsecundario,identificador);
          break;
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void cargarTabla(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT bobinas.codp,bobinas.cods,bobinas.descripcion,bobinas.unidato,bobinas.cantxu,bobinas.cantbod,bobinas.canttec,bobinas.cantinst,bobinas.ntransf  FROM bobinas;");
                  }else{
                    ps = con.prepareStatement("SELECT bobinas.codp,bobinas.cods,bobinas.descripcion,bobinas.unidato,bobinas.cantxu,bobinas.cantbod,bobinas.canttec,bobinas.cantinst,bobinas.ntransf  FROM bobinas where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT bobinas.codp,bobinas.cods,bobinas.descripcion,bobinas.unidato,bobinas.cantxu,bobinas.cantbod,bobinas.canttec,bobinas.cantinst,bobinas.ntransf  FROM bobinas where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("unidato")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }
    
    public void cargarTabla2(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT spliters.codp,spliters.cods,spliters.descripcion,spliters.cantxu,spliters.cantxu,spliters.cantbod,spliters.canttec,spliters.cantinst,spliters.ntransf  FROM spliters;");
                  }else{
                    ps = con.prepareStatement("SELECT spliters.codp,spliters.cods,spliters.descripcion,spliters.cantxu,spliters.cantxu,spliters.cantbod,spliters.canttec,spliters.cantinst,spliters.ntransf  FROM spliters where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT spliters.codp,spliters.cods,spliters.descripcion,spliters.cantxu,spliters.cantxu,spliters.cantbod,spliters.canttec,spliters.cantinst,spliters.ntransf  FROM spliters where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("cantxu")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }
    public void cargarTabla3(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT cajas.codp,cajas.cods,cajas.descripcion,cajas.cantxu,cajas.cantxu,cajas.cantbod,cajas.canttec,cajas.cantinst,cajas.ntransf  FROM cajas;");
                  }else{
                    ps = con.prepareStatement("SELECT cajas.codp,cajas.cods,cajas.descripcion,cajas.cantxu,cajas.cantxu,cajas.cantbod,cajas.canttec,cajas.cantinst,cajas.ntransf  FROM cajas where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT cajas.codp,cajas.cods,cajas.descripcion,cajas.cantxu,cajas.cantxu,cajas.cantbod,cajas.canttec,cajas.cantinst,cajas.ntransf  FROM cajas where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("cantxu")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }
    public void cargarTabla4(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT patchcord.codp,patchcord.cods,patchcord.descripcion,patchcord.cantxu,patchcord.cantxu,patchcord.cantbod,patchcord.canttec,patchcord.cantinst,patchcord.ntransf  FROM patchcord;");
                  }else{
                    ps = con.prepareStatement("SELECT patchcord.codp,patchcord.cods,patchcord.descripcion,patchcord.cantxu,patchcord.cantxu,patchcord.cantbod,patchcord.canttec,patchcord.cantinst,patchcord.ntransf  FROM patchcord where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT patchcord.codp,patchcord.cods,patchcord.descripcion,patchcord.cantxu,patchcord.cantxu,patchcord.cantbod,patchcord.canttec,patchcord.cantinst,patchcord.ntransf  FROM patchcord where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("cantxu")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }
    public void cargarTabla5(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT ganchos.codp,ganchos.cods,ganchos.descripcion,ganchos.cantxu,ganchos.cantxu,ganchos.cantbod,ganchos.canttec,ganchos.cantinst,ganchos.ntransf  FROM ganchos;");
                  }else{
                    ps = con.prepareStatement("SELECT ganchos.codp,ganchos.cods,ganchos.descripcion,ganchos.cantxu,ganchos.cantxu,ganchos.cantbod,ganchos.canttec,ganchos.cantinst,ganchos.ntransf  FROM ganchos where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT ganchos.codp,ganchos.cods,ganchos.descripcion,ganchos.cantxu,ganchos.cantxu,ganchos.cantbod,ganchos.canttec,ganchos.cantinst,ganchos.ntransf  FROM ganchos where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("cantxu")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }

    public void cargarTabla6(String codigo, String identificador){
    int contador1=0;
    int contador2=0;
    int contador3=0;
    int contador4=0;
    int contador5=0;
    String codigo1=codigo;
    String identificador1=identificador;
    DefaultTableModel modeloTabla= (DefaultTableModel) jTable1.getModel();
    modeloTabla.setRowCount(0);
    PreparedStatement ps = null;
    ResultSet rs;
    ResultSetMetaData rsmd;
    int columnas;
    try{
    Connection con =  ConexionMySQL.getConexion();
    
    if(identificador1.equals("PRINCIPAL")){
                  if(codigo1.isEmpty()){
                    ps = con.prepareStatement("SELECT otros.codp,otros.cods,otros.descripcion,otros.cantxu,otros.cantxu,otros.cantbod,otros.canttec,otros.cantinst,otros.ntransf  FROM otros;");
                  }else{
                    ps = con.prepareStatement("SELECT otros.codp,otros.cods,otros.descripcion,otros.cantxu,otros.cantxu,otros.cantbod,otros.canttec,otros.cantinst,otros.ntransf  FROM otros where codp= '"+codigo1+"' ;");
                  }
              }else{
                    ps = con.prepareStatement("SELECT otros.codp,otros.cods,otros.descripcion,otros.cantxu,otros.cantxu,otros.cantbod,otros.canttec,otros.cantinst,otros.ntransf  FROM otros where cods= '"+codigo1+"' ;");
              }
    
   rs=ps.executeQuery();
   rsmd=(ResultSetMetaData) rs.getMetaData();
   columnas=rsmd.getColumnCount();
   while(rs.next()){
   Object[] fila = new Object[columnas];
   for (int indice=0;indice<columnas;indice++){
   fila[indice]=rs.getObject(indice+1);
   }
   contador1=rs.getInt("cantxu")+contador1;
   contador2=rs.getInt("cantxu")+contador2;
   contador3=rs.getInt("cantbod")+contador3;
   contador4=rs.getInt("canttec")+contador4;
   contador5=rs.getInt("cantinst")+contador5;
   modeloTabla.addRow(fila);
   }
    }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
    }
    txtcantotal.setText(""+contador1);
    txtconttot2.setText(""+contador2);
    txtcantbod.setText(""+contador3);
    txtcanttec.setText(""+contador4);
    txtcantinst.setText(""+contador5);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazInventarioFibra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcantbod;
    private javax.swing.JTextField txtcantinst;
    private javax.swing.JTextField txtcantotal;
    private javax.swing.JTextField txtcanttec;
    private javax.swing.JTextField txtcodprincipal;
    private javax.swing.JTextField txtcodsecundario;
    private javax.swing.JTextField txtconttot2;
    // End of variables declaration//GEN-END:variables
}
