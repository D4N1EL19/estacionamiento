package logica;

public class Estudiante extends Persona{
    
 
    public int numeroArreglo = 0, semestre = 0, numeroVehiulo = 0;
    public String carrera = "";
    long numeroControl = 0;
    
    
    public Estudiante() {
        //vacio
    }

    public Estudiante(String n, int numA, long numC, int numV, int sem, String carrera) {
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
