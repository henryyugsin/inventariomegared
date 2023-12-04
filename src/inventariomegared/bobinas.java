
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;




public class bobinas {
    public int id;
    public String codp;
    public String cods;
    public String descripcion;
    public int cantxu;
    public int unidato;
    public int lote;
    public int cantbod;
    public int canttec;
    public int cantinst;
    public int ntransf;
    
    public bobinas(int id,String codp,String cods,String descripcion,int cantxu,int unidato,int lote,int cantbod,int canttec,int cantinst,int ntransf ){
        this.id=id;
        this.codp=codp;
        this.cods=cods;
        this.descripcion=descripcion;
        this.cantxu=cantxu;
        this.unidato=unidato;
        this.lote=lote;
        this.cantbod=cantbod;
        this.canttec=canttec;
        this.cantinst=cantinst;
        this.ntransf=ntransf;
    
    }
    public void registrar(){
        
        try{
        Connection con1 =  ConexionMySQL.getConexion();
        PreparedStatement ps1 = con1.prepareStatement("INSERT INTO tgeneral (codigounico,sector,codigoprimario) VALUES (?,?,?)");
        ps1.setString(1,cods);
        ps1.setString(2,"bobinas");
        ps1.setString(3,codp);
        ps1.executeUpdate();
        con1.close();
        
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps = con.prepareStatement("INSERT INTO bobinas (codp,cods,descripcion,cantxu,unidato,lote,cantbod,canttec,cantinst,ntransf) VALUES (?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1,codp);
        ps.setString(2,cods);
        ps.setString(3,descripcion);
        ps.setInt(4,cantxu);
        ps.setInt(5,unidato);
        ps.setInt(6,lote);
        ps.setInt(7,cantbod);
        ps.setInt(8,canttec);
        ps.setInt(9,cantinst);
        ps.setInt(10,ntransf);
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
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET codp=?,descripcion=?,cantxu=?,unidato=?,lote=?,cantbod=?,canttec=?,cantinst=?,ntransf=?  WHERE cods=?");
        ps.setString(1,codp);
        ps.setString(2,descripcion);
        ps.setInt(3,cantxu);
        ps.setInt(4,unidato);
        ps.setInt(5,lote);
        ps.setInt(6,cantbod);
        ps.setInt(7,canttec);
        ps.setInt(8,cantinst);
        ps.setInt(9,ntransf);
        ps.setString(10,cods);
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
        PreparedStatement psu = con.prepareStatement("DELETE FROM bobinas WHERE cods=?");
        psu.setString(1,cods);
        int res=psu.executeUpdate();
        if (res>0){
        JOptionPane.showMessageDialog(null,"Registro eliminado");
        }else{
        JOptionPane.showMessageDialog(null,"Registro no eliminado");
        }
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Registro fallido");
        }
    }
    
    public void consultar(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM bobinas WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        int aux=0;
   while(rs.next()){
       
       id=rs.getInt("id");
       codp=rs.getString("codp");
       cods=rs.getString("cods");
       descripcion=rs.getString("descripcion");
       cantxu=rs.getInt("cantxu");
       unidato=rs.getInt("unidato");
       lote=rs.getInt("lote");
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
       ntransf=rs.getInt("ntransf");
   }
   if(codp==""){
   JOptionPane.showMessageDialog(null,"No existe datos para la busqueda");
   }else{
   
   }
         
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
}
