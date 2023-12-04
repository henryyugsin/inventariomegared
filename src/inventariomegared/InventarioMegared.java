
package inventariomegared;


import InterfazGrafica.IniciarSesion;
import InterfazGrafica.InterfazRegistrarUsuAdmin;


public class InventarioMegared {


    public static void main(String[] args) {
         usuarios usu =new usuarios(1,"","","");
        usu.consultarc();
        if(usu.i==0){
        InterfazRegistrarUsuAdmin iusuad=new InterfazRegistrarUsuAdmin();
        iusuad.setVisible(true);
        }else{
        IniciarSesion inises =new IniciarSesion();
        inises.setVisible(true);
        } 
        
    }
    
}
