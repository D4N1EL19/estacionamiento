package logica;

/**
 * @author daniel
 */

public class Administrativo extends Persona{
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// ATRIBUTOS DE LA CLASE /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    int numeroArreglo = 0, numeroAdministrativo = 0;
    String cargo = "", departamento = "";
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS CONSTRUCTORES /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public Administrativo() {
        //VACIO
    }
    
    
    //Para guardar nosotros todos los aspectos
    public Administrativo(String n, String aP, String aM, int dia, int mes, int anio, 
           String u, String contra, String correo, String cargo, String departamento, int numA) {
        //separacion del metodo
        super(n, aP, aM, dia, mes, anio, u, contra, correo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.numeroArreglo = numA;
    }

    public Administrativo(String n, String aP, String aM, int dia, int mes, int anio, String correo,
                          String cargo, String departamento, int numA) {
        //separacion del metodo
        super(n, aP, aM, dia, mes, anio, correo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.numeroArreglo = numA;
        this.numeroAdministrativo = generarNumero();
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS PARTICULARES //////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    //metodos abstractos
    @Override
    public void asignarCategoria() {
        this.setCategoria('A');
    }
    
    //generando un numero aleatorio entre 0 y 100
    @Override
    public int generarNumero(){
        int numero = 0;
        
        numero = (int)(Math.random()*100);
        
        return numero;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS SET Y GET  ////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public int getNumeroArreglo() {
        return numeroArreglo;
    }

    public void setNumeroArreglo(int numeroArreglo) {
        this.numeroArreglo = numeroArreglo;
    }

    public int getNumeroAdministrativo() {
        return numeroAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    //FALTA toString
}
