package ejem_1;

public class Principal {
	public static void main(String[] args) {
		Cola1 c = new Cola1();
		Cola1 aux = new Cola1();
		
		c.llenar(3);
		c.mostrar();
		aux.vaciar(c);
		System.out.println("cola aux");
		aux.mostrar();
		
	}
}
