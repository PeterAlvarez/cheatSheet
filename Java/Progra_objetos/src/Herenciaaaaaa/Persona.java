package Herenciaaaaaa;

public class Persona {

	protected String nombre;
	protected int ci;
	
	public Persona(String  nombre, int ci) {
		this.nombre = nombre;
		this.ci = ci;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCi() {
		return ci;
	}

	public void setCi(int ci) {
		this.ci = ci;
	}


	public String toString() {
		return "Persona [nombre=" + nombre + ", ci=" + ci + "]";
	}	
	
}
