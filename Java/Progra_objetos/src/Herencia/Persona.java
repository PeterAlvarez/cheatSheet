package Herencia;

public class Persona {

	protected String nombre , ci;
	
	public Persona( String nombre , String ci ){
		this.nombre = nombre;
		this.ci = ci;
	}
	
	
	
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public String getnombre(){
		return nombre;
	}
	public void setci(String ci){
		this.ci=ci;
	}
	public String getci(){
		return ci;
	}
	
	public String toString(){
		return "NOMBRE "+this.nombre+" ci : "+this.ci;
	}
	
}
