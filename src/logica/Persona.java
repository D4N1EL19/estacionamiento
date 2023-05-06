package logica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author daniel
 */
public abstract class Persona {
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// ATRIBUTOS DE LA CLASE /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public String nombre = "", fechaNacimiento = "";
    private String contrasenia = "", correo = "", usuario = "";
    private char categoria = '\n';
    
    GregorianCalendar calendario = new GregorianCalendar();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS CONSTRUCTORES /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public Persona() {
        //vacio por defecto
    }
    
    //para guardias y administrativos de prueba 
    public Persona(String n, String aP, String aM, int dia, int mes, int anio, String u, String contra, String correo){
        this.nombre = (n + " " + aP + " " + aM).toUpperCase();
        this.usuario = u;
        this.contrasenia = contra;
        this.correo = correo;
        this.fechaNacimiento = crearFecha(anio, mes, dia);
    }
    
    //en este metodo tenemos que generar un usuario y contrasenia por defecto
    //para guardias y administrativos
    public Persona(String n, String aP, String aM, int dia, int mes, int anio, String correo){
        this.nombre = (n + " " + aP + " " + aM).toUpperCase();
        this.usuario = generarUsuario(n,anio);
        this.contrasenia = generarContra(n,aP,aM,dia,mes,anio);
        this.correo = correo;
        this.fechaNacimiento = crearFecha(anio, mes, dia);
    }
    
    
    //para alumnos
    public Persona(String n){
        this.nombre = n;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS PARTICULARES //////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    //asignar categoria es abstracto
    public abstract void asignarCategoria();
    
    public abstract int generarNumero();
    
    //metodo para crear una fecha
    public String crearFecha(int anio, int mes, int dia){
        
        calendario.set(anio, mes, dia);
        
        Date fecha = calendario.getGregorianChange();
        
        return sdf.format(fecha);
    }
    
    //generarConstrasenia
    public String generarContra(String n, String aP, String aM, int dia, int mes, int anio){
        String contrasenia = "";
        
        contrasenia = "" + n.charAt(0) + dia + aP.charAt(0) + mes + aM.charAt(0) + anio;
        contrasenia = contrasenia.toUpperCase();
        
        return contrasenia;
    }
    
    //generarUsuaio
    public String generarUsuario(String n, int anio){
        return n + anio;
    }

    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS SET Y GET /////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
    //cambiar contrasenia
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsuario() {
        return usuario;
    }
    
    //cambiar usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

}
