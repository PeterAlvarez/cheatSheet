package Ejemplo_listas;

import java.util.LinkedList;

import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
	
	Scanner S = new Scanner(System.in);
	
	LinkedList<Persona> personas = new LinkedList<>();
	
	Persona per1 = new Persona("Peter");
	Persona per2 = new Persona("Alberto");
	Persona per3 = new Persona("Alex");
	
	String cad=S.nextLine();
	boolean aux = false;
	
	personas.add(per1);
	personas.add(per2);
	personas.add(per3);
	
	for( Persona x : personas ){
		if(cad.equals(x.getNombre())){
			aux=true;
		}
	}

	if( aux ) {
		System.out.println("existe");
	}else{
		System.out.println("no existe");
	}
	S.close();
}
}
