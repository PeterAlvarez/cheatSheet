package Ejemplo_class_abstract;

public abstract class Persona{

	protected String nombre;
	protected String ci;
	
	
	public Persona(String nombre,String ci){
		this.nombre=nombre;
		this.ci = ci;	
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCi() {
		return ci;
	}
	
	public void setCi(String ci) {
		this.ci = ci;
	}
		
	public abstract String toString();
	
}
