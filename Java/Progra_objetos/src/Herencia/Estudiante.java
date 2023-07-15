package Herencia;

public class Estudiante extends Persona{

	int ru;
	
	public Estudiante( String nombre , String ci , int ru ){
		super(nombre , ci);
		this.ci = ci;
	}
	
	public void setestudiante(int ru){
		this.ru = ru;
	}
	
	public int getru(){
		return ru;
	}
	
	public String toString(){
		return "NOMBRE : "+this.nombre+" ci :"+this.ci+"RU :"+this.ru; 	
	}
}
