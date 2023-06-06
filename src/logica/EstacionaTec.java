package logica;

import igu.InicioSesion;

public class EstacionaTec {

    static BaseDeDatos bd = new BaseDeDatos();

    public static void main(String[] args) {
        
        //creamos la base de datos
        bd.crearBD();
        
        //hacemos visible la primera interfaz
        InicioSesion pantallaInicio = new InicioSesion(bd);
        pantallaInicio.setVisible(true);
        pantallaInicio.setLocationRelativeTo(null);
    }
}
