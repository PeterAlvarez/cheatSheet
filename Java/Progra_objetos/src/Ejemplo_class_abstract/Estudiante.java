package Ejemplo_class_abstract;

public class Estudiante extends Persona {
	
	private int ru;
	
	public Estudiante(String nombre, String ci,int ru) {
		super(nombre, ci);
		this.ru=ru;
	}
	
	public int getRu() {
		return ru;
	}
	public void setRu(int ru) {
		this.ru = ru;
	}
	public String toString(){
		return "Nombre : "+this.nombre+" CI : "+this.ci+" RU :"+this.ru;
	}
}
