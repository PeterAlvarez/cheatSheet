package Herencia;

public class Princial {
	public static void main(String[] args) {
		Persona persona = new Persona("pedro","1231");
		Estudiante persona2 = new Estudiante("Alex","10025234",96203);
		
		
		persona.setnombre("Israel");
		persona.setci("10025234");
		
		
		System.out.println(persona.toString());
		System.out.println(persona2.toString());
		
	}
}
