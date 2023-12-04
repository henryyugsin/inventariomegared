
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class mesh {
    public int id;
    public String snp;
    public String sns;
    public String modelo;
    public String lote;
    public String estado;
    public int tact;
    public int ntran;
    public mesh(int id, String snp, String sns, String modelo, String lote, String estado, int tact, int ntran){
        this.id=id;
        this.snp=snp;
        this.sns=sns;
        this.modelo=modelo;
        this.lote=lote;
        this.estado=estado;
        this.tact=tact;
        this.ntran=ntran;
    
    }
    
    public void registrar(){
        
        try{
        Connection con1 =  ConexionMySQL.getConexion();
        PreparedStatement ps1 = con1.prepareStatement("INSERT INTO tgeneral (codigounico,sector,codigoprimario) VALUES (?,?,?)");
        ps1.setString(1,sns);
        ps1.setString(2,"mesh");
        ps1.setString(3,snp);
        ps1.executeUpdate();
        con1.close();
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO mesh (snp,sns,modelo,lote,estado,tact,ntran) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1,snp);
        ps.setString(2,sns);
        ps.setString(3,modelo);
        ps.setString(4,lote);
        ps.setString(5,estado);
        ps.setInt(6,tact);
        ps.setInt(7,ntran);
        ps.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null,"Registrado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
        
        
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
        
        
        
    }
        public void modificar(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE mesh SET snp=?, modelo=?, lote=?, estado=?, tact=?, ntran=?  WHERE sns=?");
        ps.setString(1,snp);
        ps.setString(2,modelo);
        ps.setString(3,lote);
        ps.setString(4,estado);
        ps.setInt(5,tact);
        ps.setInt(6,ntran);
        ps.setString(7,sns);
        int res=ps.executeUpdate();
        if (res>0){
        JOptionPane.showMessageDialog(null,"Registro modificado");
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
       public void eliminar(){
    try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement psu = con.prepareStatement("DELETE FROM mesh WHERE sns=?");
        psu.setString(1,sns);
        psu.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro eliminado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
       
       public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM mesh WHERE sns=?");
        ps.setString(1,sns);
        rs=ps.executeQuery();
        int aux=0;
   while(rs.next()){
       
       id=rs.getInt("id");
       snp=rs.getString("snp");
       sns=rs.getString("sns");
       modelo=rs.getString("modelo");
       lote=rs.getString("lote");
       estado=rs.getString("estado");
       tact=rs.getInt("tact");
       ntran=rs.getInt("ntran");
   }
   if(snp==""){
   JOptionPane.showMessageDialog(null,"No existe datos para la busqueda");
   }else{
   
   }
         
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
