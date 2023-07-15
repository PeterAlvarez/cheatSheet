package Ejemplo_class_abstract;

public class Principal {
public static void main(String[] args) {	
	
	
	Estudiante estudiante = new Estudiante("Peter","123456",12346);
	Administrativo adm1 = new Administrativo("Israel","123456",12,5000);
	Docente docente = new Docente("Pedro","12654",3000);
	
	System.out.println(estudiante.toString());
	System.out.println(adm1.toString());
	System.out.println(docente.toString());
}
}
