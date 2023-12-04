
package BasedeDatos;

import inventariomegared.InventarioMegared;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySQL {
    public static Connection getConexion(){
        Connection cone = null;
        String user ="root";
        String password="admin";
        String url = "jdbc:mysql://localhost:3306/inventariogm";
    try {  
        cone = DriverManager.getConnection(url,user,password);
        return cone;
    }catch(SQLException e){
       Logger.getLogger(InventarioMegared.class.getName()).log(Level.SEVERE, null, e);
    }
        return null; 
    }  
    
}
