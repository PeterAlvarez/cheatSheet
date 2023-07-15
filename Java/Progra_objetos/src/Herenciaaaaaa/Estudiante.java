package Herenciaaaaaa;

public class Estudiante extends Persona{

	private int ru;
	
	// construc
	
	public Estudiante( String nombre , int ci , int ru){
		super( nombre , ci );//super=constructor del padre;
		this.ru = ru;
	}
	
	public int getRu(){
		return ru;
	}

	public void setRu(int ru){
		this.ru = ru;
	}

	public String toString(){
		return "Nombre : "+nombre+" CI :"+ci+" RU : "+ru;
	}	
}
