package logica;

import java.util.ArrayList;

public class BaseDeDatos {
    //creamos arreglos de todos los tipos
    ArrayList<Guardia> guardias = new ArrayList<>();
    ArrayList<Administrativo> administrativos = new ArrayList<>();
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    ArrayList<Llegada> llegadas = new ArrayList<>();
    
    
    public void crearBD(){
        guardias.add(new Guardia("Daniel","Gutierrez","Ramirez",19,8,2004,"DaniSa19","190804","al22760562@ite.edu.mx",0));
        guardias.add(new Guardia("Saul","Martinez","Monge",19,2,2004,"saulikeapro","190204","al22760566@ite.edu.mx",1));
        
        administrativos.add(new Administrativo("Octavio","Parra","Velazques",22,5,1990,"vela8","220590","ad22760500@ite.edu.mx","Jefe de carrera","Sistemas",0));
        administrativos.add(new Administrativo("Monia","Ramirez","Martinez",10,3,1991,"Monik19","said19","ad22760501@ite.edu.mx","Codinadora","Sistemas",1));
        
        estudiantes.add(new Estudiante("Juan Perez",0,22760502,0,4,"Electromecanica"));
        estudiantes.add(new Estudiante("Danna Ramirez",1,22760603,1,5,"Electricidad"));
        estudiantes.add(new Estudiante("Miriam Castillo",2,22760504,3,8,"Ingieneria en Sistemas"));
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
////        estudiantes.add();
    }
}
