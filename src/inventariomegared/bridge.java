
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class bridge {
    
    public int id;
    public String sn;
    public String pon;
    public String modelo;
    public String lote;
    public String estado;
    public int tact;
    public int ntran;
    public bridge(int id, String sn, String pon, String modelo, String lote, String estado, int tact, int ntran){
        this.id=id;
        this.sn=sn;
        this.pon=pon;
        this.modelo=modelo;
        this.lote=lote;
        this.estado=estado;
        this.tact=tact;
        this.ntran=ntran;
    
    }
    
    public void registrar(){
        if (consultar2()==1){
        
        }else{
            
        
       try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO tgeneral (codigounico,sector,codigoprimario) VALUES (?,?,?)");
        ps.setString(1,pon);
        ps.setString(2,"bridge");
        ps.setString(3,sn);
        ps.executeUpdate();
        con.close();
        try{
        Connection con1 =  ConexionMySQL.getConexion();
        PreparedStatement ps1 = con1.prepareStatement("INSERT INTO bridge (sn,pon,modelo,lote,estado,tact,ntran) VALUES (?,?,?,?,?,?,?)");
        ps1.setString(1,sn);
        ps1.setString(2,pon);
        ps1.setString(3,modelo);
        ps1.setString(4,lote);
        ps1.setString(5,estado);
        ps1.setInt(6,tact);
        ps1.setInt(7,ntran);
        ps1.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null,"Registrado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
        }
    }
        public void modificar(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bridge SET pon=?, modelo=?, lote=?, estado=?, tact=?, ntran=?  WHERE sn=?");
        ps.setString(1,pon);
        ps.setString(2,modelo);
        ps.setString(3,lote);
        ps.setString(4,estado);
        ps.setInt(5,tact);
        ps.setInt(6,ntran);
        ps.setString(7,sn);
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
        PreparedStatement psu = con.prepareStatement("DELETE FROM bridge WHERE id=?");
        psu.setInt(1,id);
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
        ps = con.prepareStatement("SELECT * FROM bridge WHERE pon=?");
        ps.setString(1,pon);
        rs=ps.executeQuery();
        int aux=0;
   while(rs.next()){
       
       id=rs.getInt("id");
       sn=rs.getString("sn");
       pon=rs.getString("pon");
       modelo=rs.getString("modelo");
       lote=rs.getString("lote");
       estado=rs.getString("estado");
       tact=rs.getInt("tact");
       ntran=rs.getInt("ntran");
   }
   if(sn==""){
   JOptionPane.showMessageDialog(null,"No existe datos para la busqueda");
   }else{
   
   }
         
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
       
       
        public int consultar2(){
     
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM bridge WHERE sn=?");
        ps.setString(1,sn);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
   }
   if(iaux==1){
   JOptionPane.showMessageDialog(null,"Este producto ya esta registrado");
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
    
}
    
