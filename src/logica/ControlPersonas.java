package logica;

public class ControlPersonas {
    
    //objeto de base de datos
    BaseDeDatos bd;
    
    public ControlPersonas(BaseDeDatos bd){
        this.bd = bd;
    }
    
    //metodo para encontrar guardia o administrador
    public char encontrarEmpleado(String usuario, String contra){
        char tipo = '\n';
        String u = "", c ="";
        
        for (Guardia guardia : bd.guardias) {
            u = guardia.getUsuario();
            c = guardia.getContrasenia();
            
            if((usuario.compareTo(u) == 0) && (contra.compareTo(c) == 0) ){
                tipo = 'G';
                break;
            }
        }
        
        for (Administrativo admi : bd.administrativos) {
            u = admi.getUsuario();
            c = admi.getContrasenia();
            
            if((usuario.compareTo(u) == 0) && (contra.compareTo(c) == 0) ){
                tipo = 'A';
                break;
            }
        }
        
        return tipo;
    }
    
    public Integer encontrarAlumno(long escaneo){
        Integer index = null;
        long aux = 0;
        
        for (Estudiante estudiante : bd.estudiantes) {
            aux = estudiante.numeroControl;
            
            if(aux == escaneo){
                index = estudiante.numeroArreglo;
                break;
            }
        }
        
        return index;
    }
}
