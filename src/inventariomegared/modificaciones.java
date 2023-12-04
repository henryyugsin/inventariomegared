
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class modificaciones {

    public String pon;
    public String estado;
    public int tact;
    public int ntran;
    public modificaciones( String pon, String estado, int tact, int ntran){

        this.pon=pon;
        this.estado=estado;
        this.tact=tact;
        this.ntran=ntran;
    
    }
    
   
        public void modificaronu(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE onu SET estado=?, tact=?, ntran=(ntran+1)  WHERE pon=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        public void modificarbridge(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bridge SET estado=?, tact=?, ntran=(ntran+1)  WHERE pon=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        public void modificarrouter(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE router SET estado=?, tact=?, ntran=(ntran+1)  WHERE sn=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        public void modificarmesh(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE mesh SET estado=?, tact=?, ntran=(ntran+1)  WHERE sns=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        public void modificarantena(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE antena SET estado=?, tact=?, ntran=(ntran+1)  WHERE sn=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        public void modificarswitch(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE switc SET estado=?, tact=?, ntran=(ntran+1)  WHERE sn=?");
        ps.setString(1,estado);
        ps.setInt(2,tact);
        ps.setString(3,pon);
        int res=ps.executeUpdate();
        if (res>0){
        
        }else{
        JOptionPane.showMessageDialog(null,"Registro no modificado");
        }
        
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
        
        //Modificar ya como instalacion
        
}
