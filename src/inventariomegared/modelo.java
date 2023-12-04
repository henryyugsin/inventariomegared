
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class modelo {
    public int id;
    public String tipo;
    public String modelo;
    public String descripcion;
    public String lote;
    
    public modelo(int id, String tipo, String modelo, String descripcion, String lote){
        this.id=id;
        this.tipo=tipo;
        this.modelo=modelo;
        this.descripcion=descripcion;
        this.lote=lote;
    }
    public void registrar(){
    try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO modelo (tipo,modelo,descripcion,lote) VALUES (?,?,?,?)");
        ps.setString(1,tipo);
        ps.setString(2,modelo);
        ps.setString(3,descripcion);
        ps.setString(4,lote);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro guardado");
        con.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    
    }
    
    public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM modelo WHERE modelo=?");
        ps.setString(1,modelo);
        rs=ps.executeQuery();
   while(rs.next()){
       id=rs.getInt("id");
       modelo=rs.getString("modelo");
       tipo=rs.getString("tipo");
       descripcion=rs.getString("descripcion");
       lote=rs.getString("lote");
   }
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void modificar(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE modelo SET tipo=?, modelo=?, descripcion=?, lote=?  WHERE id=?");
        ps.setString(1,tipo);
        ps.setString(2, modelo);
        ps.setString(3,descripcion);
        ps.setString(4,lote);
        ps.setInt(5,id);
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro modificado");
        cont.close();
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
    
    public void eliminar(){
    try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement psu = con.prepareStatement("DELETE FROM modelo WHERE id=?");
        psu.setInt(1,id);
        psu.executeUpdate();
        JOptionPane.showMessageDialog(null,"Registro eliminado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
    
}
