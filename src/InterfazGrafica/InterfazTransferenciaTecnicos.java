
package InterfazGrafica;

import BasedeDatos.ConexionMySQL;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import inventariomegared.bridge;
import inventariomegared.consultasgenerales;
import inventariomegared.modificaciones;
import inventariomegared.modificaciones2;
import inventariomegared.onu;
import inventariomegared.tecnicos;
import inventariomegared.transferencias;
import inventariomegared.transferenciasdetalladas;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfazTransferenciaTecnicos extends javax.swing.JFrame {
    private String dato;
    private int idusu;

    public InterfazTransferenciaTecnicos() {
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        codigotxt = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nombretxt))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cedulatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(descripciontxt))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE))
        );

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
                .addGap(18, 18, 18)
                .addComponent(codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
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
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
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
            String cliente="NA";
            String clienteid="NA";
            transferenciasdetalladas transdet=new transferenciasdetalladas(0,idaux,codigounico,sector,descripcionproducto,cantidad,tecnico1,cliente,clienteid);
            transdet.registrar();
            //Modificar Inventario
          String identificador = matriz[i][1];
          switch (identificador.toLowerCase()) {
          case "onu":
              modificaciones modonu=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modonu.modificaronu();  
          break;
          case "bridge":
              modificaciones modbridge=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modbridge.modificarbridge();  
          break;
          case "router":
              modificaciones modrouter=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modrouter.modificarrouter();  
          break;
          case "mesh":
              modificaciones modmesh=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modmesh.modificarmesh();  
          break;
          case "antena":
              modificaciones modantena=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modantena.modificarantena();  
          break;
          case "switch":
              modificaciones modswitc=new modificaciones(matriz[i][0],"TECNICO",transfact,1);
              modswitc.modificarswitch();  
          break;
          case "bobinas":
              modificaciones2 cantbob=new modificaciones2(matriz[i][0],0,0,0,0);
              cantbob.consultarbobinas();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadbobina=Integer.parseInt(matriz[i][3]);
              int cantidadbobinabodaux=0;
              int cantidadbobinatecaux=0;
              cantidadbobinabodaux=cantbob.cantbod-cantidadbobina;
              cantidadbobinatecaux=cantbob.canttec+cantidadbobina;
                cantbob.modificarbobinas(cantidadbobinabodaux,cantidadbobinatecaux);
          break;
          case "spliters":
              modificaciones2 cantsplites=new modificaciones2(matriz[i][0],0,0,0,0);
              cantsplites.consultarspliters();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadcantsplites=Integer.parseInt(matriz[i][3]);
              int cantidadcantsplitesbodaux=0;
              int cantidadcantsplitestecaux=0;
              cantidadcantsplitesbodaux=cantsplites.cantbod-cantidadcantsplites;
              cantidadcantsplitestecaux=cantsplites.canttec+cantidadcantsplites;
                cantsplites.modificarspliters(cantidadcantsplitesbodaux,cantidadcantsplitestecaux);
          break;
          case "cajas":
              modificaciones2 cantcajas=new modificaciones2(matriz[i][0],0,0,0,0);
              cantcajas.consultarcajas();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadcantcajas=Integer.parseInt(matriz[i][3]);
              int cantidadcantcajasbodaux=0;
              int cantidadcantcajastecaux=0;
              cantidadcantcajasbodaux=cantcajas.cantbod-cantidadcantcajas;
              cantidadcantcajastecaux=cantcajas.canttec+cantidadcantcajas;
                cantcajas.modificarcajas(cantidadcantcajasbodaux,cantidadcantcajastecaux);
          break;
          case "patchcord":
              modificaciones2 cantpatchcord=new modificaciones2(matriz[i][0],0,0,0,0);
              cantpatchcord.consultarpatchcord();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadpatchcord=Integer.parseInt(matriz[i][3]);
              int cantidadpatchcordbodaux=0;
              int cantidadpatchcordtecaux=0;
              cantidadpatchcordbodaux=cantpatchcord.cantbod-cantidadpatchcord;
              cantidadpatchcordtecaux=cantpatchcord.canttec+cantidadpatchcord;
                cantpatchcord.modificarpatchcord(cantidadpatchcordbodaux,cantidadpatchcordtecaux);
          break;
          case "ganchos":
              modificaciones2 cantganchos=new modificaciones2(matriz[i][0],0,0,0,0);
              cantganchos.consultarganchos();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadganchos=Integer.parseInt(matriz[i][3]);
              int cantidadganchosbodaux=0;
              int cantidadganchostecaux=0;
              cantidadganchosbodaux=cantganchos.cantbod-cantidadganchos;
              cantidadganchostecaux=cantganchos.canttec+cantidadganchos;
                cantganchos.modificarganchos(cantidadganchosbodaux,cantidadganchostecaux);
          break;
          case "otros":
              modificaciones2 cantotros=new modificaciones2(matriz[i][0],0,0,0,0);
              cantotros.consultarotros();
              //Cambiar valores de bodega y entrega a los tecnicos
              int cantidadotros=Integer.parseInt(matriz[i][3]);
              int cantidadcantotrosbodaux=0;
              int cantidadcantotrostecaux=0;
              cantidadcantotrosbodaux=cantotros.cantbod-cantidadotros;
              cantidadcantotrostecaux=cantotros.canttec+cantidadotros;
                cantotros.modificarotros(cantidadcantotrosbodaux,cantidadcantotrostecaux);
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
    }
    public void setdato(int idusu, String dato){
    this.dato=dato;
    this.idusu=idusu;
    txtusuario.setText(dato);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTransferenciaTecnicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulatxt;
    private javax.swing.JTextField codigotxt;
    private javax.swing.JTextField descripciontxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
