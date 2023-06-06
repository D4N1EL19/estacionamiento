package logica;

public class ControlCuestionarios {
    
    public static boolean campoVacio(String campo){
        boolean vacio=false;
        
        if(campo.compareTo("") == 0){
            vacio = true;
        }
        
        return vacio;
    }
    
    public static boolean campoPorDefecto(String campo, String cons){
        boolean defecto = false;
        
        if(campo.compareTo(cons) == 0){
            defecto = true;
        }
        
        return defecto;
    }
    
    public static boolean cuestionarioInisioSesion(String usuario, String contra, String consU, String consC){
        boolean vacioU = campoVacio(usuario) || campoPorDefecto(usuario, consU);
        boolean vacioC = campoVacio(contra) || campoPorDefecto(contra, consC);
        boolean llenos = false;
        
        if(!vacioC && !vacioU){
            llenos = true;
        }
        
        return llenos;
    }
    
}
