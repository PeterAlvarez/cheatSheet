package Mi_primera_lista;

public class Principal {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.insertarFinal("1");		
		lista.insertarFinal("2");		
		lista.insertarFinal("3");		
		lista.insertarFinal("4");		
		lista.insertarFinal("5");		
		lista.insertarFinal("6");		
		lista.insertarFinal("7");		
		lista.insertarInicio("0");
		lista.insertar("pres", 2);
		System.out.println(lista.obtener(123));
		System.out.println(lista.toString());
		lista.modificar(9, "x");
		System.out.println(lista.toString());
		
		
		
	}
}