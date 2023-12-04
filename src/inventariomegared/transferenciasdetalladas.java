
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;


public class transferenciasdetalladas {
    public int id;
    public int idaux;
    public String codigounico;
    public String sector;
    public String descripcionp;
    public String cantidad;
    public String tecnico;
    public String cliente;
    public String clienteid;
    public transferenciasdetalladas(int id,int idaux, String codigounico, String sector, String descripcionp, String cantidad,String tecnico, String cliente, String clienteid){
        this.id=id;
        this.idaux=idaux;
        this.codigounico=codigounico;
        this.sector=sector;
        this.descripcionp=descripcionp;
        this.cantidad=cantidad;
        this.tecnico=tecnico;
        this.cliente=cliente;
        this.clienteid=clienteid;
    
    }
    
    public int registrar(){
        int identiaux=0;
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO transferenciasdetallada (idaux,codigounico,sector,descripcionp,cantidad,tecnico,cliente,clienteid) VALUES (?,?,?,?,?,?,?,?)");
        ps.setInt(1,idaux);
        ps.setString(2,codigounico);
        ps.setString(3,sector);
        ps.setString(4,descripcionp);
        ps.setString(5,cantidad);
        ps.setString(6,tecnico);
        ps.setString(7,cliente);
        ps.setString(8,clienteid);
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
