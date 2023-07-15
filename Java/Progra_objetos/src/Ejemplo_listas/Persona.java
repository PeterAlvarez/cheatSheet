package Ejemplo_listas;

public class Persona {

	private String nombre;
	private String apellido;

	public Persona(String nombre ){
		this.nombre=nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}