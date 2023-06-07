package logica;

import java.util.GregorianCalendar;

public final class Llegada {

    public GregorianCalendar fecha = new GregorianCalendar();
    public int numeroDeEstudiante=0;
    public char tipo = '\n';
    
    public Llegada(GregorianCalendar calendario, int numA, char tipo){
        this.fecha = calendario;
        this.numeroDeEstudiante = numA;
        this.tipo = tipo;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getNumeroDeEstudiante() {
        return numeroDeEstudiante;
    }

    public void setNumeroDeEstudiante(int numeroDeEstudiante) {
        this.numeroDeEstudiante = numeroDeEstudiante;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
    
    
}
