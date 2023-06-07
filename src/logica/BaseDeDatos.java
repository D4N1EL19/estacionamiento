package logica;

import java.util.ArrayList;

public class BaseDeDatos {
    //creamos arreglos de todos los tipos
    ArrayList<Guardia> guardias = new ArrayList<>();
    ArrayList<Administrativo> administrativos = new ArrayList<>();
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public ArrayList<Llegada> llegadas = new ArrayList<>();
    ArrayList<Carro> carros = new ArrayList<>();
    
    //contadores de entradas y salidas
    int contEsta1 = 0, contEsta2 = 0, contEsta3 = 0;
    
    
    
    public void crearBD(){
        contEsta1 = 35;
        contEsta2 = 55;
        contEsta3 = 70;
        
        guardias.add(new Guardia("Daniel","Gutierrez","Ramirez",19,8,2004,"DaniSa19","190804","al22760562@ite.edu.mx",0));
        guardias.add(new Guardia("Saul","Martinez","Monge",19,2,2004,"saulikeapro","190204","al22760566@ite.edu.mx",1));
        
        administrativos.add(new Administrativo("Sinai","Cabrera","Retana",2,8,2004,"lunita02","040802","ad22760579@ite.edu.mx","Jefe de carrera","Sistemas",0));
        administrativos.add(new Administrativo("Monia","Ramirez","Martinez",10,3,1991,"Monik19","said19","ad22760501@ite.edu.mx","Codinadora","Sistemas",1));
        
        estudiantes.add(new Estudiante("Juan Perez",0,22760502,0,4,"Electromecanica"));
        estudiantes.add(new Estudiante("Danna Ramirez",1,22760503,1,5,"Electricidad"));
        estudiantes.add(new Estudiante("Miriam Castillo",2,22760504,3,8,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Rene Jimenez",3,22760505,4,2,"Mecatronica"));
        estudiantes.add(new Estudiante("Maria Martinez",4,22760506,5,4,"Electonica"));
        estudiantes.add(new Estudiante("Luis Garcia",5,22760507,6,3,"Administracion"));
        estudiantes.add(new Estudiante("Migel Delacruz",6,22760508,7,6,"Gesiton"));
        estudiantes.add(new Estudiante("Esteven Garcia",7,22760509,8,7,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Maria Perez",8,22760510,9,2,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Cristina Agilar",9,22760511,10,2,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Matias Cirus",10,22760512,11,8,"Mecatronica"));
        estudiantes.add(new Estudiante("Teddy Rosebelt",11,22760513,12,4,"Electonica"));
        estudiantes.add(new Estudiante("Winston Churchil",12,22760514,13,2,"Administracion"));
        estudiantes.add(new Estudiante("Steven Universe",13,22760515,14,1,"Gesiton"));
        estudiantes.add(new Estudiante("Juan Medina",14,22760516,15,1,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Marco Riveira",15,22760517,16,2,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Saul Ramirez",16,22760518,17,5,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Elian Cabrera",17,22760519,18,1,"Mecatronica"));
        estudiantes.add(new Estudiante("Angel Monje",18,22760520,19,3,"Electonica"));
        estudiantes.add(new Estudiante("Juan Pérez",19,22760521,20,3,"Administracion"));
        estudiantes.add(new Estudiante("María García",20,22760522,21,2,"Gesiton"));
        estudiantes.add(new Estudiante("Carlos López",21,22760523,22,3,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Ana Martínez",22,22760524,23,3,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Luis Ramírez",23,22760525,24,5,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Laura Torres",24,22760526,25,3,"Mecatronica"));
        estudiantes.add(new Estudiante("Pedro Gómez",25,22760527,26,7,"Electonica"));
        estudiantes.add(new Estudiante("Andrea Vargas",26,22760528,27,4,"Administracion"));
        estudiantes.add(new Estudiante("Jorge Silva",27,22760529,28,7,"Gesiton"));
        estudiantes.add(new Estudiante("Patricia Gutiérrez",28,22760530,29,1,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Alejandro Rodríguez",29,22760531,30,3,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Gabriela Morales",30,22760532,31,5,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Ricardo Cruz",31,22760533,32,7,"Mecatronica"));
        estudiantes.add(new Estudiante("Laura Méndez",32,22760534,33,1,"Electonica"));
        estudiantes.add(new Estudiante("Andrés Sánchez",33,22760535,34,4,"Administracion"));
        estudiantes.add(new Estudiante("Valeria Ríos",34,22760536,35,5,"Gesiton"));
        estudiantes.add(new Estudiante("Felipe Torres",35,22760537,36,4,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Mariana Silva",36,22760538,37,7,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Martín Gómez",37,22760539,38,1,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Andrea Torres",38,22760540,39,5,"Mecatronica"));
        estudiantes.add(new Estudiante("Roberto González",39,22760541,40,8,"Electonica"));
        estudiantes.add(new Estudiante("Ana Soto",40,22760542,41,7,"Administracion"));
        estudiantes.add(new Estudiante("Daniel Ramírez",41,22760543,42,4,"Gesiton"));
        estudiantes.add(new Estudiante("Carla Mendoza",42,22760544,43,1,"Ingieneria Industrial"));
        estudiantes.add(new Estudiante("Alejandro Morales",43,22760545,44,6,"Ingieneria Mecanica"));
        estudiantes.add(new Estudiante("Sofía Hernández",44,22760546,45,3,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("Diego Vargas",45,22760547,46,8,"Mecatronica"));
        estudiantes.add(new Estudiante("Valentina Castillo",46,22760548,47,7,"Electonica"));
        estudiantes.add(new Estudiante("Juan Rodríguez",47,22760549,48,5,"Administracion"));
        estudiantes.add(new Estudiante("Carolina Torres",48,22760550,49,2,"Gesiton"));
        
        carros.add(new Carro ("AGA-123","Ford",1,"Mustang","Rojo",2019));
        carros.add(new Carro ("BCD-456","Ford",2,"F-150","Negro",2020));
        carros.add(new Carro ("HJG-789","Ford",3,"Focus","Azul",2015));
        carros.add(new Carro ("KLM-012","Ford",4,"Exolorer","Gris",2012));
        carros.add(new Carro ("PQR-345","Ford",5,"Escape","Verde",2010));
        carros.add(new Carro ("VWX-678","Ford",6,"Ranger","Gris",2020));
        carros.add(new Carro ("YZA-901","Ford",7,"Edge","Blanco",2008));
        carros.add(new Carro ("BCZ-234","Ford",8,"Fiesta","Blanco",2020));
        carros.add(new Carro ("FGH-567","Ford",9,"Fusion","Negro",2021));
        carros.add(new Carro ("JKL-890","Ford",10,"Expedition","Negro",2011));
        carros.add(new Carro ("MNP-123","Nissan",11,"Sentra","Azul",2000));
        carros.add(new Carro ("RST-456","Nissan",12,"Altima","Rojo",2003));
        carros.add(new Carro ("XYZ-789","Nissan",13,"Maxima","Blanco",2004));
        carros.add(new Carro ("WXY-012","Nissan",14,"Rogue","Azul",2002));
        carros.add(new Carro ("UVZ-345","Nissan",15,"Murano","Gris",2001));
        carros.add(new Carro ("QWE-678","Nissan",16,"Pathfinder","Gris",2007));
        carros.add(new Carro ("RTY-901","Nissan",17,"Frontier","Plateado",2008));
        carros.add(new Carro ("VBN-234","Nissan",18,"Juke","Naranja",2019));
        carros.add(new Carro ("TGB-567","Nissan",19,"Versa","Amarillo",2023));
        carros.add(new Carro ("CDE-890","Nissan",20,"Qashqai","Amarillo",2010));
        carros.add(new Carro ("GHT-123","Toyota",21,"Corolla","Azul",2009));
        carros.add(new Carro ("PLK-456","Toyota",22,"Camry","Plateado",2001));
        carros.add(new Carro ("VFD-789","Toyota",23,"RAV4","Blanco",2002));
        carros.add(new Carro ("SAJ-012","Toyota",24,"Hilux","Plateado",2003));
        carros.add(new Carro ("BKM-345","Toyota",25,"Prius","Negro",2020));
        carros.add(new Carro ("QAZ-678","Toyota",26,"Tacoma","Cafe",2019));
        carros.add(new Carro ("WER-901","Toyota",27,"Yaris","Blanco",2016));
        carros.add(new Carro ("FVB-234","Toyota",28,"4Runner","Guinda ",2014));
        carros.add(new Carro ("TGH-567","Toyota",29,"Sienna","Cafe",2011));
        carros.add(new Carro ("KJN-890","Toyota",30,"Highlander","Negro",2002));
        carros.add(new Carro ("UJK-123","Mazda",31,"Mazda3","Rojo",2000));
        carros.add(new Carro ("MJK-456","Mazda",32,"mazda6","Rojo",2000));
        carros.add(new Carro ("CVB-789","Mazda",33,"CX-5","Rojo",2004));
        carros.add(new Carro ("BNM-012","Mazda",34,"CX-9","Negro",2001));
        carros.add(new Carro ("FDS-345","Mazda",35,"MX-5","Rojo",1998));
        carros.add(new Carro ("CXZ-678","Mazda",36,"CX-3","Azul",2001));
        carros.add(new Carro ("QWE-901","Mazda",37,"CX-30","Azul",2009));
        carros.add(new Carro ("TYU-234","Mazda",38,"Mazda2","Blanco",2023));
        carros.add(new Carro ("NBV-567","Mazda",39,"CX-7","Blanco",2019));
        carros.add(new Carro ("OIU-890","Mazda",40,"Mazda5","Plateado",2004));
        carros.add(new Carro ("HGF-123","Honda",41,"Civic","Amarillo",2006));
        carros.add(new Carro ("ZXC-456","Honda",42,"Accord","Amarillo",2001));
        carros.add(new Carro ("VCB-789","Honda",43,"CR-V","Rojo",2019));
        carros.add(new Carro ("JUY-012","Honda",44,"Pilot","Azul",2015));
        carros.add(new Carro ("POI-345","Honda",45,"HR-V","Plateado",2014));
        carros.add(new Carro ("LKJ-678","Honda",46,"Odyssey","Plateado",2020));
        carros.add(new Carro ("ASD-901","Honda",47,"Fit","Plateado",2012));
        carros.add(new Carro ("QWE-234","Honda",48,"CR-Z","Blanco",2015));
        carros.add(new Carro ("ZXC-567","Honda",49,"Ridgeline","Negro",2014));
        carros.add(new Carro ("QAZ-890","Honda",50,"Jazz","azul",2020));
    }

    public int getContEsta1() {
        return contEsta1;
    }

    public void setContEsta1(int contEsta1) {
        this.contEsta1 = contEsta1;
    }

    public int getContEsta2() {
        return contEsta2;
    }

    public void setContEsta2(int contEsta2) {
        this.contEsta2 = contEsta2;
    }

    public int getContEsta3() {
        return contEsta3;
    }

    public void setContEsta3(int contEsta3) {
        this.contEsta3 = contEsta3;
    }
    
    
}
