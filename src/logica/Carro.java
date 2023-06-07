package logica;

public class Carro {
    //Variabels
    public String matricula;
    public String marca;
    public int nVehiculo;
    public String modelo;
    public String color;
    public int anio;

    public Carro(String matricula, String marca, int nVehiculo, String modelo, String color, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.nVehiculo = nVehiculo;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    public Carro() {
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public int getnVehiculo() {
        return nVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }
    
    
}
