package examen;

import java.util.Stack;
import java.awt.font.FontRenderContext;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Principal {
	
	public static void main(String[] args) {
		
		Queue<Persona> queue = new LinkedList<Persona>();
		Stack<Persona> pila = new Stack<Persona>();
		
		Persona p1 = new Persona("Hugo","Arenas","Vaca");
		Persona p2 = new Persona("Cosme","Aduviri","Vaca");
		
		
		pila.push(p1);
		pila.push(p2);
		for (Persona persona : pila) {
			queue.add(persona);
		}
		
	    System.out.println( queue ); 
		
	}
}
