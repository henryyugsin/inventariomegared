
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HENRY
 */
public class tecnicos {
    public int id;
   public String nombre;
   public String cedula;
   int i=0;
   public tecnicos(int id, String nombre, String cedula){
       this.id=id;
       this.nombre=nombre;
       this.cedula=cedula;
   }
   public void registrar(){
    try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO usuariostecnicos (nombre,cedula) VALUES (?,?)");
        ps.setString(1,nombre);
        ps.setString(2,cedula);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro guardado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido 3");
        }
    }
   public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        //PreparedStatement psu;
        ResultSet rs;
        //ResultSet rsu;
        ps = con.prepareStatement("SELECT * FROM usuariostecnicos WHERE cedula=?");
        ps.setString(1,cedula);
        rs=ps.executeQuery();
        
   while(rs.next()){
       id=rs.getInt("id");
       nombre=rs.getString("nombre");
       cedula=rs.getString("cedula");
   }
   con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
   public void consultarc(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        PreparedStatement psu;
        ResultSet rs;
        ResultSet rsu;
        ps = con.prepareStatement("SELECT * FROM usuariostecnicos");
        rs=ps.executeQuery();
   while(rs.next()){
       i=i+1;
   }
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
   public void eliminar(){
    try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement psu = con.prepareStatement("DELETE FROM usuariostecnicos WHERE id=?");
        psu.setInt(1,id);
        psu.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro eliminado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
   
    
}
