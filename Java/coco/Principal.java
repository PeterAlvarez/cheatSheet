import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void VerificarCovid (boolean covid, int valor) throws ExcepcionPersonalizada {
        if (covid==true) {
            throw new ExcepcionPersonalizada("Estudiante "+valor +" Tiene covid");
        }
    }

    public static void main(String[] args){
        Estudiante e1 = new Estudiante("Pedro", "Loayza", "Lozano", false);
        Estudiante e2 = new Estudiante("Luis", "Erazo", "Rios", true);
        Estudiante e3 = new Estudiante("Santos", "Yana", "Gutierrez", false);
        Estudiante e4 = new Estudiante("Coco", "Arenas", "Vaca", true);

        ArrayList<Estudiante> Estudiantes = new ArrayList<Estudiante>();
    
        Estudiantes.add(e1);
        Estudiantes.add(e2);
        Estudiantes.add(e3);
        Estudiantes.add(e4); 
        Estudiantes.add(e1);
        Estudiante e12;
		Estudiantes.add(e12);


        for (int i=0 ; i <Estudiantes.size() ; i++ ) {
            try {
                VerificarCovid(Estudiantes.get(i).getCovid(), i);
            } catch (ExcepcionPersonalizada e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
