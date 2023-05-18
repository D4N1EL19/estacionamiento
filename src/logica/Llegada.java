package logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author daniel
 */

public final class Llegada {
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////// ATRIBUTOS DE LA CLASE ///////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    Calendar calendario = new GregorianCalendar();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
    
    String fecha = "", hora = "";
    int numeroPersona = 0;
    
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////// METODOS CONSTRUCTORES ///////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public Llegada(){
        //vacio por defecto
    }
    
    //para crear personas falsas
    public Llegada(String fecha, String hora, int num){
        this.fecha = fecha;
        this.hora = fecha;
        this.numeroPersona=num;
    }
    
    //para agrefar oficialmente
    public Llegada(int num){
        this.fecha = obtenerFecha();
        
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// METODOS PARTICULARES //////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    //metodo para obtener la hora del sistema
    public String obtenerFecha(){
        calendario.setTime(new Date());
        
        return sdf.format(calendario.getTime());
    }
}
