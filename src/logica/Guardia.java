package logica;

/*
 * @author daniel
 */

public class Guardia extends Persona{
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// ATRIBUTOS DE LA CLASE /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    private long numeroGuardia = 0;
    private int numeroArreglo = 0;
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS constructores /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public Guardia() {
        //vacio por defecto
    }
    
    //para generar nostoros todos los aspectos
    public Guardia(String n, String aP, String aM, int dia, int mes, int anio, 
                   String u, String contra, String correo, int numA) {
        //separecion del metodo
        super(n, aP, aM, dia, mes, anio, u, contra, correo);
        this.numeroArreglo = numA;
        this.numeroGuardia = generarNumero();
        asignarCategoria(); 
    }
    
    //ESTE ES EL PRINCIPAL
    public Guardia(String n, String aP, String aM, int dia, int mes, int anio, String correo, int numA) {
        super(n, aP, aM, dia, mes, anio, correo);
        this.numeroArreglo = numA;
        this.numeroGuardia = generarNumero();
        asignarCategoria(); 
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS PARTICULARES //////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    //abstraccion
    @Override
    public void asignarCategoria() {
        this.setCategoria('G');
    }
    
    //generando numero aleatorio entre 0 y 10 000
    @Override
    public int generarNumero(){
        int numero = 0;
        
        numero = (int)(Math.random()*1000);
        
        return numero;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS SET Y GET  ////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public long getNumeroGuardia() {
        return numeroGuardia;
    }

    public void setNumeroGuardia(long numeroGuardia) {
        this.numeroGuardia = numeroGuardia;
    }

    public int getNumeroArreglo() {
        return numeroArreglo;
    }

    public void setNumeroArreglo(int numeroArreglo) {
        this.numeroArreglo = numeroArreglo;
    }
    
    //FALTA ToString
}
