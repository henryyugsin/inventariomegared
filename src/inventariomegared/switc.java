
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class switc {
    public int id;
    public String sn;
    public String modelo;
    public String lote;
    public String estado;
    public int tact;
    public int ntran;
    public switc(int id, String sn, String modelo, String lote, String estado, int tact, int ntran){
        this.id=id;
        this.sn=sn;
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
        ps1.setString(1,sn);
        ps1.setString(2,"switc");
        ps1.setString(3,sn);
        ps1.executeUpdate();
        con1.close();
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO switc (sn,modelo,lote,estado,tact,ntran) VALUES (?,?,?,?,?,?)");
        ps.setString(1,sn);
        ps.setString(2,modelo);
        ps.setString(3,lote);
        ps.setString(4,estado);
        ps.setInt(5,tact);
        ps.setInt(6,ntran);
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
        PreparedStatement ps = cont.prepareStatement("UPDATE switc SET modelo=?, lote=?, estado=?, tact=?, ntran=?  WHERE sn=?");
        ps.setString(1,modelo);
        ps.setString(2,lote);
        ps.setString(3,estado);
        ps.setInt(4,tact);
        ps.setInt(5,ntran);
        ps.setString(6,sn);
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
        PreparedStatement psu = con.prepareStatement("DELETE FROM switc WHERE sn=?");
        psu.setString(1,sn);
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
        ps = con.prepareStatement("SELECT * FROM switc WHERE sn=?");
        ps.setString(1,sn);
        rs=ps.executeQuery();
   while(rs.next()){
       
       id=rs.getInt("id");
       sn=rs.getString("sn");
       modelo=rs.getString("modelo");
       lote=rs.getString("lote");
       estado=rs.getString("estado");
       tact=rs.getInt("tact");
       ntran=rs.getInt("ntran");
   }
   if(modelo==""){
   JOptionPane.showMessageDialog(null,"No existe datos para la busqueda");
   }else{
   
   }
         
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
