package logica;

/**
 * @author daniel
 */

public class Estudiante extends Persona{
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// ATRIBUTOS DE LA CLASE /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    public int numeroArreglo = 0, numeroControl = 0, semestre = 0, numeroVehiulo = 0;
    public String carrera = "";
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS CONSTRUCTORES /////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    public Estudiante() {
        //vacio
    }

    public Estudiante(String n, int numA, int numC, int numV, int sem, String carrera) {
        super(n);
        this.carrera = carrera;
        this.numeroArreglo = numA;
        this.numeroControl = numC;
        this.numeroVehiulo = numV;
        this.semestre = sem;
    }    
    
    ////////////////////////////////////////////////////////////////////////////
    //////////////////////// METODOS PARTICULARES //////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //Metodos abstractos
    @Override
    public void asignarCategoria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int generarNumero() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
