package logica;

import igu.InicioSesion;

/**
 *
 * @author daniel
 */
public class EstacionaTec {

    //variables globales
    static InicioSesion pantallaInicio = new InicioSesion();
    static String usuario = "", contrasenia = "";
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //hacemos visible la primera interfaz
        pantallaInicio.setVisible(true);
        pantallaInicio.setLocationRelativeTo(null);

    }
    
    //metodos set
    public static void setUsuario(String usuario) {
        EstacionaTec.usuario = usuario;
    }

    public static void setContrasenia(String contrasenia) {
        EstacionaTec.contrasenia = contrasenia;
    }
    
}
