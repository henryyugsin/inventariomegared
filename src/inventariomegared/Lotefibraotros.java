
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Lotefibraotros {
     public int id;
    public String proveedor;
    public Date fecha;
    public String nfactura;
    public String descripcion;
    public String modelo;
    
    public Lotefibraotros(int id, String proveedor, Date fecha, String nfactura, String descripcion,String modelo){
        this.id=id;
        this.proveedor=proveedor;
        this.fecha=fecha;
        this.nfactura=nfactura;
        this.descripcion=descripcion;
        this.modelo=modelo;
    }
    public void registrar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO lotefibraotros (proveedor,fecha,nfac,descripcion,modelo) VALUES (?,?,?,?,?)");
        ps.setString(1,proveedor);
        ps.setDate(2, (java.sql.Date) fecha);
        ps.setString(3,nfactura);
        ps.setString(4,descripcion);
        ps.setString(5,modelo);
        ps.executeUpdate();
        con.close();
        JOptionPane.showMessageDialog(null,"Registrado");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
    
    public void modificar(){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE lotefibraotros SET proveedor=?, fecha=?, nfac=?, descripcion=?, modelo=?  WHERE id=?");
        ps.setString(1,proveedor);
        ps.setDate(2, (java.sql.Date) fecha);
        ps.setString(3,nfactura);
        ps.setString(4,descripcion);
        ps.setString(5,modelo);
        ps.setInt(6,id);
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
        PreparedStatement psu = con.prepareStatement("DELETE FROM lotefibraotros WHERE id=?");
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
        ps = con.prepareStatement("SELECT * FROM lotefibraotros WHERE id=?");
        ps.setInt(1,id);
        rs=ps.executeQuery();
   while(rs.next()){
       id=rs.getInt("id");
       proveedor=rs.getString("proveedor");
       nfactura=rs.getString("nfac");
       descripcion=rs.getString("descripcion");
       modelo=rs.getString("modelo");
   }
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
