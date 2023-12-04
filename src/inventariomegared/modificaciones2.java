
package inventariomegared;

import BasedeDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class modificaciones2 {
    public String cods;
    public int cantbod;
    public int canttec;
    public int cantinst;
    public int ntransf;
    public modificaciones2( String cods, int cantbod, int canttec, int cantinst, int ntransf){

        this.cods=cods;
        this.cantbod=cantbod;
        this.canttec=canttec;
        this.cantinst=cantinst;
        this.ntransf=ntransf;
    
    }
    
   
        public void modificarbobinas(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
        public void consultarbobinas(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM bobinas WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
        
     
    public void modificarspliters(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE spliters SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
    public void consultarspliters(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM spliters WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
     
    public void modificarcajas(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE cajas SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
    public void consultarcajas(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM cajas WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    public void modificarpatchcord(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE patchcord SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
    public void consultarpatchcord(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM patchcord WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
       
    public void modificarganchos(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE ganchos SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
    public void consultarganchos(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM ganchos WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void modificarotros(int cantbod1,int canttec1){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE otros SET cantbod=?, canttec=?, ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantbod1);
        ps.setInt(2,canttec1);
        ps.setString(3,cods);
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
        
    public void consultarotros(){
        try{
        Connection con =  ConexionMySQL.getConexion();
        PreparedStatement ps;
        ResultSet rs;
        ps = con.prepareStatement("SELECT * FROM otros WHERE cods=?");
        ps.setString(1,cods);
        rs=ps.executeQuery();
        
   while(rs.next()){
       cantbod=rs.getInt("cantbod");
       canttec=rs.getInt("canttec");
       cantinst=rs.getInt("cantinst");
   }      
    con.close();
        }catch(SQLException e){
    JOptionPane.showMessageDialog(null,e);
        }
    }
       
      //Modificar por instalaciones finales
    public void modificarbobinas3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarbobinas4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    
    public void modificarbobinas5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarbobinas6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE bobinas SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    
    
    
    public void modificarspliters3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE spliters SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarspliters4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE spliters SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarspliters5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE spliters SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarspliters6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE spliters SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarcajas3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE cajas SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarcajas4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE cajas SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarcajas5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE cajas SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarcajas6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE cajas SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarganchos3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE ganchos SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarganchos4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE ganchos SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarganchos5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE ganchos SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarganchos6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE ganchos SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarpatchcord3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE patchcord SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarpatchcord4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE patchcord SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarpatchcord5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE patchcord SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarpatchcord6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE patchcord SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarotros3(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE otros SET canttec=(canttec-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarotros4(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE otros SET cantbod=(cantbod-?),cantinst=(cantinst+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarotros5(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE otros SET canttec=(canttec-?),cantbod=(cantbod+?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
    public void modificarotros6(int cantmod){
    try{
        Connection cont =  ConexionMySQL.getConexion();
        PreparedStatement ps = cont.prepareStatement("UPDATE otros SET cantbod=(cantbod+?),cantinst=(cantinst-?), ntransf=(ntransf+1)  WHERE cods=?");
        ps.setInt(1,cantmod);
        ps.setInt(2,cantmod);
        ps.setString(3,cods);
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
}
