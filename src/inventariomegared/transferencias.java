
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class transferencias {
    public int id;
    public String pentrega;
    public String tecnico;
    public String tipo;
    public Date fecha;
     public String descripcion;
    public transferencias(int id, String pentrega, String tecnico, String tipo, Date fecha,String descripcion){
        this.id=id;
        this.pentrega=pentrega;
        this.tecnico=tecnico;
        this.tipo=tipo;
        this.fecha=fecha;
        this.descripcion=descripcion;
    
    }
    
    public int registrar(){
        int identiaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO transferencias (pentrega,tecnico,tipo,fecha,descripcion) VALUES (?,?,?,?,?)");
        ps.setString(1,pentrega);
        ps.setString(2,tecnico);
        ps.setString(3,tipo);
        ps.setDate(4, (java.sql.Date) fecha);
        ps.setString(5,descripcion);
        ps.executeUpdate();
        con.close();
        identiaux=1;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro transferencia fallido");
        } 
        return identiaux;
    }
    public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT transferencias.id FROM transferencias ORDER BY id DESC LIMIT 1");
        rs=ps.executeQuery();
   while(rs.next()){
       id=rs.getInt("id");  
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }


    
}
