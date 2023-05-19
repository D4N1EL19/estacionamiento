package logica;

import igu.InicioSesion;
import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class EstacionaTec {

    ///////////////////////////////////////////////////////////////////////////
    //////////////////////////// OBEJTOS //////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////
    
    static EstacionaTec metodos = new EstacionaTec();
    static ArrayList<Guardia> guardias = new ArrayList<>();
    ArrayList<Administrativo> administrativos = new ArrayList<>();
    static InicioSesion pantallaInicio = new InicioSesion();
    
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        //creamos una base de datos ficticia
        guardias.add(new Guardia("Daniel","Gutierrez","Ramirez",19,8,20004,"DaniSa19","190804","al22760562@ite.edu.mx",0));
        guardias.add(new Guardia("Saul","Martinez","Monge",19,2,20004,"saulikeapro","190204","al22760566@ite.edu.mx",1));
        
        //hacemos visible la primera interfaz
        pantallaInicio.setVisible(true);
        pantallaInicio.setLocationRelativeTo(null);
    }
    
    //Verifica si la contraseña y asuario que ingresaron es un guardia
    public boolean encontrarGurdia(String usuario, String contrasenia){
        boolean guardia = false, usua = false, contra = false;
        
        for(int i=0; i<guardias.size(); i++){
            
            if(contrasenia.compareTo(guardias.get(i).getContrasenia()) == 0){
                contra = true;
            }
            
            if(usuario.compareTo(guardias.get(i).getUsuario()) == 0){
                usua = true;
            }
            
            if(contra && usua){
                guardia = true;
                break;
            }
        }
        
        return guardia;
    }
    
    //Verifica si la contraseña y asuario que ingresaron es un administrativo
    public boolean encontrarAdministrativo(String usuario, String contrasenia){
        boolean admi = false, usua = false, contra = false;
        
        for(int i=0; i<administrativos.size(); i++){
            
            if(contrasenia.compareTo(administrativos.get(i).getContrasenia()) == 0){
                contra = true;
            }
            
            if(usuario.compareTo(administrativos.get(i).getUsuario()) == 0){
                usua = true;
            }
            
            if(contra && usua){
                admi = true;
                break;
            }
        }
        
        return admi;
    }
}
