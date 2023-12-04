
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class consultasgenerales {
    public String codigounico;
    public String sector;
    public String codigoaux;
    public String descripcion;
    public consultasgenerales( String codigounico, String sector, String codigoaux, String descripcion){
        this.codigounico=codigounico;
        this.sector=sector;
        this.codigoaux=codigoaux;
        this.descripcion=descripcion;
    }
    
    
     public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM tgeneral WHERE codigounico=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       codigounico=rs.getString("codigounico");
       codigoaux=rs.getString("codigoprimario");
       sector=rs.getString("sector");
   }
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
     
     public int consultaronu(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM onu WHERE pon=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarbridge(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM bridge WHERE pon=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarrouter(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM router WHERE sn=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarmesh(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM mesh WHERE sns=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarantena(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM antena WHERE sn=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarswitc(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM switc WHERE sn=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("modelo");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     
     public int consultarbobinas(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM bobinas WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarspliters(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM spliters WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarcajas(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM cajas WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     public int consultarganchos(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM ganchos WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     
     public int consultarotros(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM otros WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
     public int consultarpatchcord(){
       int iaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM patchcord WHERE cods=?");
        ps.setString(1,codigounico);
        rs=ps.executeQuery();
   while(rs.next()){
       iaux=1;
       descripcion=rs.getString("descripcion");
   }
   if(iaux==1){
   
   }else{
   
   }   
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
        return iaux;
    }
}
