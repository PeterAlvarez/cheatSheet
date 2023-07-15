package pruebas;

public class principal {

	public static void main(String[] args) {
		Clase2 dato2 = new Clase2("Peter");
		Clase1 dato = new Clase1(dato2);
		
		System.out.println(dato.retorno());
		System.out.println(dato2.retorno2());
		
	}

}
